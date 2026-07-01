package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

 enum HtmlTreeBuilderState$2
{
  HtmlTreeBuilderState$2()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    paramHtmlTreeBuilder.insert("html");
    paramHtmlTreeBuilder.transition(BeforeHead);
    return paramHtmlTreeBuilder.process(paramToken);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (paramToken.isDoctype())
    {
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    if (paramToken.isComment()) {
      paramHtmlTreeBuilder.insert(paramToken.asComment());
    }
    for (;;)
    {
      return true;
      if (HtmlTreeBuilderState.access$100(paramToken)) {
        return true;
      }
      if ((!paramToken.isStartTag()) || (!paramToken.asStartTag().name().equals("html"))) {
        break;
      }
      paramHtmlTreeBuilder.insert(paramToken.asStartTag());
      paramHtmlTreeBuilder.transition(BeforeHead);
    }
    if (paramToken.isEndTag()) {
      if (StringUtil.in(paramToken.asEndTag().name(), new String[] { "head", "body", "html", "br" })) {
        return anythingElse(paramToken, paramHtmlTreeBuilder);
      }
    }
    if (paramToken.isEndTag())
    {
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    return anythingElse(paramToken, paramHtmlTreeBuilder);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */