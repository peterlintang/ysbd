package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

 enum HtmlTreeBuilderState$3
{
  HtmlTreeBuilderState$3()
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
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    if ((paramToken.isStartTag()) && (paramToken.asStartTag().name().equals("html"))) {
      return InBody.process(paramToken, paramHtmlTreeBuilder);
    }
    if ((paramToken.isStartTag()) && (paramToken.asStartTag().name().equals("head")))
    {
      paramHtmlTreeBuilder.setHeadElement(paramHtmlTreeBuilder.insert(paramToken.asStartTag()));
      paramHtmlTreeBuilder.transition(InHead);
      return true;
    }
    if (paramToken.isEndTag()) {
      if (StringUtil.in(paramToken.asEndTag().name(), new String[] { "head", "body", "html", "br" }))
      {
        paramHtmlTreeBuilder.process(new Token.StartTag("head"));
        return paramHtmlTreeBuilder.process(paramToken);
      }
    }
    if (paramToken.isEndTag())
    {
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    paramHtmlTreeBuilder.process(new Token.StartTag("head"));
    return paramHtmlTreeBuilder.process(paramToken);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */