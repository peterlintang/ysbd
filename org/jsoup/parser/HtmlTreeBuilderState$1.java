package org.jsoup.parser;

import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.QuirksMode;
import org.jsoup.nodes.DocumentType;

 enum HtmlTreeBuilderState$1
{
  HtmlTreeBuilderState$1()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (HtmlTreeBuilderState.access$100(paramToken)) {
      return true;
    }
    if (paramToken.isComment())
    {
      paramHtmlTreeBuilder.insert(paramToken.asComment());
      return true;
    }
    if (paramToken.isDoctype())
    {
      paramToken = paramToken.asDoctype();
      DocumentType localDocumentType = new DocumentType(paramToken.getName(), paramToken.getPublicIdentifier(), paramToken.getSystemIdentifier(), paramHtmlTreeBuilder.getBaseUri());
      paramHtmlTreeBuilder.getDocument().appendChild(localDocumentType);
      if (paramToken.isForceQuirks()) {
        paramHtmlTreeBuilder.getDocument().quirksMode(Document.QuirksMode.quirks);
      }
      paramHtmlTreeBuilder.transition(BeforeHtml);
      return true;
    }
    paramHtmlTreeBuilder.transition(BeforeHtml);
    return paramHtmlTreeBuilder.process(paramToken);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */