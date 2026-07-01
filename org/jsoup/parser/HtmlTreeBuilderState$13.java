package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$13
{
  HtmlTreeBuilderState$13()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    return paramHtmlTreeBuilder.process(paramToken, InTable);
  }
  
  private boolean exitTableBody(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if ((!paramHtmlTreeBuilder.inTableScope("tbody")) && (!paramHtmlTreeBuilder.inTableScope("thead")) && (!paramHtmlTreeBuilder.inScope("tfoot")))
    {
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    paramHtmlTreeBuilder.clearStackToTableBodyContext();
    paramHtmlTreeBuilder.process(new Token.EndTag(paramHtmlTreeBuilder.currentElement().nodeName()));
    return paramHtmlTreeBuilder.process(paramToken);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    Object localObject;
    String str;
    switch (HtmlTreeBuilderState.24.$SwitchMap$org$jsoup$parser$Token$TokenType[paramToken.type.ordinal()])
    {
    default: 
      return anythingElse(paramToken, paramHtmlTreeBuilder);
    case 3: 
      localObject = paramToken.asStartTag();
      str = ((Token.StartTag)localObject).name();
      if (str.equals("tr"))
      {
        paramHtmlTreeBuilder.clearStackToTableBodyContext();
        paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
        paramHtmlTreeBuilder.transition(InRow);
      }
      break;
    }
    for (;;)
    {
      return true;
      if (StringUtil.in(str, new String[] { "th", "td" }))
      {
        paramHtmlTreeBuilder.error(this);
        paramHtmlTreeBuilder.process(new Token.StartTag("tr"));
        return paramHtmlTreeBuilder.process((Token)localObject);
      }
      if (StringUtil.in(str, new String[] { "caption", "col", "colgroup", "tbody", "tfoot", "thead" })) {
        return exitTableBody(paramToken, paramHtmlTreeBuilder);
      }
      return anythingElse(paramToken, paramHtmlTreeBuilder);
      localObject = paramToken.asEndTag().name();
      if (!StringUtil.in((String)localObject, new String[] { "tbody", "tfoot", "thead" })) {
        break;
      }
      if (!paramHtmlTreeBuilder.inTableScope((String)localObject))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      paramHtmlTreeBuilder.clearStackToTableBodyContext();
      paramHtmlTreeBuilder.pop();
      paramHtmlTreeBuilder.transition(InTable);
    }
    if (((String)localObject).equals("table")) {
      return exitTableBody(paramToken, paramHtmlTreeBuilder);
    }
    if (StringUtil.in((String)localObject, new String[] { "body", "caption", "col", "colgroup", "html", "td", "th", "tr" }))
    {
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    return anythingElse(paramToken, paramHtmlTreeBuilder);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */