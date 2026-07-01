package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$15
{
  HtmlTreeBuilderState$15()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    return paramHtmlTreeBuilder.process(paramToken, InBody);
  }
  
  private void closeCell(HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (paramHtmlTreeBuilder.inTableScope("td"))
    {
      paramHtmlTreeBuilder.process(new Token.EndTag("td"));
      return;
    }
    paramHtmlTreeBuilder.process(new Token.EndTag("th"));
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (paramToken.isEndTag())
    {
      String str = paramToken.asEndTag().name();
      if (StringUtil.in(str, new String[] { "td", "th" }))
      {
        if (!paramHtmlTreeBuilder.inTableScope(str))
        {
          paramHtmlTreeBuilder.error(this);
          paramHtmlTreeBuilder.transition(InRow);
          return false;
        }
        paramHtmlTreeBuilder.generateImpliedEndTags();
        if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
          paramHtmlTreeBuilder.error(this);
        }
        paramHtmlTreeBuilder.popStackToClose(str);
        paramHtmlTreeBuilder.clearFormattingElementsToLastMarker();
        paramHtmlTreeBuilder.transition(InRow);
        return true;
      }
      if (StringUtil.in(str, new String[] { "body", "caption", "col", "colgroup", "html" }))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      if (StringUtil.in(str, new String[] { "table", "tbody", "tfoot", "thead", "tr" }))
      {
        if (!paramHtmlTreeBuilder.inTableScope(str))
        {
          paramHtmlTreeBuilder.error(this);
          return false;
        }
        closeCell(paramHtmlTreeBuilder);
        return paramHtmlTreeBuilder.process(paramToken);
      }
      return anythingElse(paramToken, paramHtmlTreeBuilder);
    }
    if (paramToken.isStartTag()) {
      if (StringUtil.in(paramToken.asStartTag().name(), new String[] { "caption", "col", "colgroup", "tbody", "td", "tfoot", "th", "thead", "tr" }))
      {
        if ((!paramHtmlTreeBuilder.inTableScope("td")) && (!paramHtmlTreeBuilder.inTableScope("th")))
        {
          paramHtmlTreeBuilder.error(this);
          return false;
        }
        closeCell(paramHtmlTreeBuilder);
        return paramHtmlTreeBuilder.process(paramToken);
      }
    }
    return anythingElse(paramToken, paramHtmlTreeBuilder);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */