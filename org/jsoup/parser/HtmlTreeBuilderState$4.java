package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$4
{
  HtmlTreeBuilderState$4()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, TreeBuilder paramTreeBuilder)
  {
    paramTreeBuilder.process(new Token.EndTag("head"));
    return paramTreeBuilder.process(paramToken);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (HtmlTreeBuilderState.access$100(paramToken)) {
      paramHtmlTreeBuilder.insert(paramToken.asCharacter());
    }
    Token.StartTag localStartTag;
    do
    {
      return true;
      switch (HtmlTreeBuilderState.24.$SwitchMap$org$jsoup$parser$Token$TokenType[paramToken.type.ordinal()])
      {
      default: 
        return anythingElse(paramToken, paramHtmlTreeBuilder);
      case 1: 
        paramHtmlTreeBuilder.insert(paramToken.asComment());
        return true;
      case 2: 
        paramHtmlTreeBuilder.error(this);
        return false;
      case 3: 
        localStartTag = paramToken.asStartTag();
        str = localStartTag.name();
        if (str.equals("html")) {
          return InBody.process(paramToken, paramHtmlTreeBuilder);
        }
        if (!StringUtil.in(str, new String[] { "base", "basefont", "bgsound", "command", "link" })) {
          break label182;
        }
        paramToken = paramHtmlTreeBuilder.insertEmpty(localStartTag);
      }
    } while ((!str.equals("base")) || (!paramToken.hasAttr("href")));
    paramHtmlTreeBuilder.maybeSetBaseUri(paramToken);
    return true;
    label182:
    if (str.equals("meta"))
    {
      paramHtmlTreeBuilder.insertEmpty(localStartTag);
      return true;
    }
    if (str.equals("title"))
    {
      HtmlTreeBuilderState.access$200(localStartTag, paramHtmlTreeBuilder);
      return true;
    }
    if (StringUtil.in(str, new String[] { "noframes", "style" }))
    {
      HtmlTreeBuilderState.access$300(localStartTag, paramHtmlTreeBuilder);
      return true;
    }
    if (str.equals("noscript"))
    {
      paramHtmlTreeBuilder.insert(localStartTag);
      paramHtmlTreeBuilder.transition(InHeadNoscript);
      return true;
    }
    if (str.equals("script"))
    {
      paramHtmlTreeBuilder.insert(localStartTag);
      paramHtmlTreeBuilder.tokeniser.transition(TokeniserState.ScriptData);
      paramHtmlTreeBuilder.markInsertionMode();
      paramHtmlTreeBuilder.transition(Text);
      return true;
    }
    if (str.equals("head"))
    {
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    return anythingElse(paramToken, paramHtmlTreeBuilder);
    String str = paramToken.asEndTag().name();
    if (str.equals("head"))
    {
      paramHtmlTreeBuilder.pop();
      paramHtmlTreeBuilder.transition(AfterHead);
      return true;
    }
    if (StringUtil.in(str, new String[] { "body", "html", "br" })) {
      return anythingElse(paramToken, paramHtmlTreeBuilder);
    }
    paramHtmlTreeBuilder.error(this);
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */