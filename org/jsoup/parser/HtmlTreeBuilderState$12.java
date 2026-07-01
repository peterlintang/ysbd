package org.jsoup.parser;

import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$12
{
  HtmlTreeBuilderState$12()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, TreeBuilder paramTreeBuilder)
  {
    if (paramTreeBuilder.process(new Token.EndTag("colgroup"))) {
      return paramTreeBuilder.process(paramToken);
    }
    return true;
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (HtmlTreeBuilderState.access$100(paramToken)) {
      paramHtmlTreeBuilder.insert(paramToken.asCharacter());
    }
    do
    {
      return true;
      switch (HtmlTreeBuilderState.24.$SwitchMap$org$jsoup$parser$Token$TokenType[paramToken.type.ordinal()])
      {
      case 5: 
      default: 
        return anythingElse(paramToken, paramHtmlTreeBuilder);
      case 1: 
        paramHtmlTreeBuilder.insert(paramToken.asComment());
        return true;
      case 2: 
        paramHtmlTreeBuilder.error(this);
        return true;
      case 3: 
        Token.StartTag localStartTag = paramToken.asStartTag();
        String str = localStartTag.name();
        if (str.equals("html")) {
          return paramHtmlTreeBuilder.process(paramToken, InBody);
        }
        if (str.equals("col"))
        {
          paramHtmlTreeBuilder.insertEmpty(localStartTag);
          return true;
        }
        return anythingElse(paramToken, paramHtmlTreeBuilder);
      case 4: 
        if (paramToken.asEndTag().name().equals("colgroup"))
        {
          if (paramHtmlTreeBuilder.currentElement().nodeName().equals("html"))
          {
            paramHtmlTreeBuilder.error(this);
            return false;
          }
          paramHtmlTreeBuilder.pop();
          paramHtmlTreeBuilder.transition(InTable);
          return true;
        }
        return anythingElse(paramToken, paramHtmlTreeBuilder);
      }
    } while (paramHtmlTreeBuilder.currentElement().nodeName().equals("html"));
    return anythingElse(paramToken, paramHtmlTreeBuilder);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */