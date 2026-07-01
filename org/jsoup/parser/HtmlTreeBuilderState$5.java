package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

 enum HtmlTreeBuilderState$5
{
  HtmlTreeBuilderState$5()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    paramHtmlTreeBuilder.error(this);
    paramHtmlTreeBuilder.process(new Token.EndTag("noscript"));
    return paramHtmlTreeBuilder.process(paramToken);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (paramToken.isDoctype()) {
      paramHtmlTreeBuilder.error(this);
    }
    for (;;)
    {
      return true;
      if ((paramToken.isStartTag()) && (paramToken.asStartTag().name().equals("html"))) {
        return paramHtmlTreeBuilder.process(paramToken, InBody);
      }
      if ((!paramToken.isEndTag()) || (!paramToken.asEndTag().name().equals("noscript"))) {
        break;
      }
      paramHtmlTreeBuilder.pop();
      paramHtmlTreeBuilder.transition(InHead);
    }
    if ((!HtmlTreeBuilderState.access$100(paramToken)) && (!paramToken.isComment()))
    {
      if (paramToken.isStartTag()) {
        if (!StringUtil.in(paramToken.asStartTag().name(), new String[] { "basefont", "bgsound", "link", "meta", "noframes", "style" })) {}
      }
    }
    else {
      return paramHtmlTreeBuilder.process(paramToken, InHead);
    }
    if ((paramToken.isEndTag()) && (paramToken.asEndTag().name().equals("br"))) {
      return anythingElse(paramToken, paramHtmlTreeBuilder);
    }
    if (paramToken.isStartTag())
    {
      if (StringUtil.in(paramToken.asStartTag().name(), new String[] { "head", "noscript" })) {}
    }
    else {
      if (!paramToken.isEndTag()) {
        break label237;
      }
    }
    paramHtmlTreeBuilder.error(this);
    return false;
    label237:
    return anythingElse(paramToken, paramHtmlTreeBuilder);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */