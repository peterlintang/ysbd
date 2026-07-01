package org.jsoup.safety;

import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.Validate;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Tag;

public class Cleaner
{
  private Whitelist whitelist;
  
  public Cleaner(Whitelist paramWhitelist)
  {
    Validate.notNull(paramWhitelist);
    this.whitelist = paramWhitelist;
  }
  
  private int copySafeNodes(Element paramElement1, Element paramElement2)
  {
    paramElement1 = paramElement1.childNodes().iterator();
    int i = 0;
    while (paramElement1.hasNext())
    {
      Object localObject = (Node)paramElement1.next();
      if ((localObject instanceof Element))
      {
        localObject = (Element)localObject;
        if (this.whitelist.isSafeTag(((Element)localObject).tagName()))
        {
          Cleaner.ElementMeta localElementMeta = createSafeElement((Element)localObject);
          Element localElement = localElementMeta.el;
          paramElement2.appendChild(localElement);
          int j = localElementMeta.numAttribsDiscarded;
          i = copySafeNodes((Element)localObject, localElement) + (j + i);
        }
        else
        {
          i = copySafeNodes((Element)localObject, paramElement2) + (i + 1);
        }
      }
      else if ((localObject instanceof TextNode))
      {
        paramElement2.appendChild(new TextNode(((TextNode)localObject).getWholeText(), ((Node)localObject).baseUri()));
      }
    }
    return i;
  }
  
  private Cleaner.ElementMeta createSafeElement(Element paramElement)
  {
    String str = paramElement.tagName();
    Attributes localAttributes = new Attributes();
    Element localElement = new Element(Tag.valueOf(str), paramElement.baseUri(), localAttributes);
    Iterator localIterator = paramElement.attributes().iterator();
    int i = 0;
    while (localIterator.hasNext())
    {
      Attribute localAttribute = (Attribute)localIterator.next();
      if (this.whitelist.isSafeAttribute(str, paramElement, localAttribute)) {
        localAttributes.put(localAttribute);
      } else {
        i += 1;
      }
    }
    localAttributes.addAll(this.whitelist.getEnforcedAttributes(str));
    return new Cleaner.ElementMeta(localElement, i);
  }
  
  public Document clean(Document paramDocument)
  {
    Validate.notNull(paramDocument);
    Document localDocument = Document.createShell(paramDocument.baseUri());
    if (paramDocument.body() != null) {
      copySafeNodes(paramDocument.body(), localDocument.body());
    }
    return localDocument;
  }
  
  public boolean isValid(Document paramDocument)
  {
    Validate.notNull(paramDocument);
    Document localDocument = Document.createShell(paramDocument.baseUri());
    return copySafeNodes(paramDocument.body(), localDocument.body()) == 0;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\safety\Cleaner.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */