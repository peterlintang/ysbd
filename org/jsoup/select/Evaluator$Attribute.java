package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$Attribute
  extends Evaluator
{
  private String key;
  
  public Evaluator$Attribute(String paramString)
  {
    this.key = paramString;
  }
  
  public final boolean matches(Element paramElement1, Element paramElement2)
  {
    return paramElement2.hasAttr(this.key);
  }
  
  public final String toString()
  {
    return String.format("[%s]", new Object[] { this.key });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$Attribute.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */