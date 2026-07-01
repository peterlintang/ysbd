package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

 enum HtmlTreeBuilderState$17
{
  HtmlTreeBuilderState$17()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    boolean bool = false;
    if (paramToken.isStartTag()) {
      if (StringUtil.in(paramToken.asStartTag().name(), new String[] { "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th" }))
      {
        paramHtmlTreeBuilder.error(this);
        paramHtmlTreeBuilder.process(new Token.EndTag("select"));
        bool = paramHtmlTreeBuilder.process(paramToken);
      }
    }
    do
    {
      return bool;
      if (!paramToken.isEndTag()) {
        break;
      }
      if (!StringUtil.in(paramToken.asEndTag().name(), new String[] { "caption", "table", "tbody", "tfoot", "thead", "tr", "td", "th" })) {
        break;
      }
      paramHtmlTreeBuilder.error(this);
    } while (!paramHtmlTreeBuilder.inTableScope(paramToken.asEndTag().name()));
    paramHtmlTreeBuilder.process(new Token.EndTag("select"));
    return paramHtmlTreeBuilder.process(paramToken);
    return paramHtmlTreeBuilder.process(paramToken, InSelect);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$17.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */