package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$11
{
  HtmlTreeBuilderState$11()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if ((paramToken.isEndTag()) && (paramToken.asEndTag().name().equals("caption")))
    {
      if (!paramHtmlTreeBuilder.inTableScope(paramToken.asEndTag().name()))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      paramHtmlTreeBuilder.generateImpliedEndTags();
      if (!paramHtmlTreeBuilder.currentElement().nodeName().equals("caption")) {
        paramHtmlTreeBuilder.error(this);
      }
      paramHtmlTreeBuilder.popStackToClose("caption");
      paramHtmlTreeBuilder.clearFormattingElementsToLastMarker();
      paramHtmlTreeBuilder.transition(InTable);
    }
    do
    {
      return true;
      if (paramToken.isStartTag())
      {
        if (StringUtil.in(paramToken.asStartTag().name(), new String[] { "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr" })) {}
      }
      else {
        if ((!paramToken.isEndTag()) || (!paramToken.asEndTag().name().equals("table"))) {
          break;
        }
      }
      paramHtmlTreeBuilder.error(this);
    } while (!paramHtmlTreeBuilder.process(new Token.EndTag("caption")));
    return paramHtmlTreeBuilder.process(paramToken);
    if (paramToken.isEndTag()) {
      if (StringUtil.in(paramToken.asEndTag().name(), new String[] { "body", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr" }))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
    }
    return paramHtmlTreeBuilder.process(paramToken, InBody);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */