package org.jsoup.parser;

import org.jsoup.helper.StringUtil;

 enum HtmlTreeBuilderState$14
{
  HtmlTreeBuilderState$14()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    return paramHtmlTreeBuilder.process(paramToken, InTable);
  }
  
  private boolean handleMissingTr(Token paramToken, TreeBuilder paramTreeBuilder)
  {
    if (paramTreeBuilder.process(new Token.EndTag("tr"))) {
      return paramTreeBuilder.process(paramToken);
    }
    return false;
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    Object localObject;
    String str;
    if (paramToken.isStartTag())
    {
      localObject = paramToken.asStartTag();
      str = ((Token.StartTag)localObject).name();
      if (StringUtil.in(str, new String[] { "th", "td" }))
      {
        paramHtmlTreeBuilder.clearStackToTableRowContext();
        paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
        paramHtmlTreeBuilder.transition(InCell);
        paramHtmlTreeBuilder.insertMarkerToFormattingElements();
      }
    }
    for (;;)
    {
      return true;
      if (StringUtil.in(str, new String[] { "caption", "col", "colgroup", "tbody", "tfoot", "thead", "tr" })) {
        return handleMissingTr(paramToken, paramHtmlTreeBuilder);
      }
      return anythingElse(paramToken, paramHtmlTreeBuilder);
      if (!paramToken.isEndTag()) {
        break label323;
      }
      localObject = paramToken.asEndTag().name();
      if (!((String)localObject).equals("tr")) {
        break;
      }
      if (!paramHtmlTreeBuilder.inTableScope((String)localObject))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      paramHtmlTreeBuilder.clearStackToTableRowContext();
      paramHtmlTreeBuilder.pop();
      paramHtmlTreeBuilder.transition(InTableBody);
    }
    if (((String)localObject).equals("table")) {
      return handleMissingTr(paramToken, paramHtmlTreeBuilder);
    }
    if (StringUtil.in((String)localObject, new String[] { "tbody", "tfoot", "thead" }))
    {
      if (!paramHtmlTreeBuilder.inTableScope((String)localObject))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      paramHtmlTreeBuilder.process(new Token.EndTag("tr"));
      return paramHtmlTreeBuilder.process(paramToken);
    }
    if (StringUtil.in((String)localObject, new String[] { "body", "caption", "col", "colgroup", "html", "td", "th" }))
    {
      paramHtmlTreeBuilder.error(this);
      return false;
    }
    return anythingElse(paramToken, paramHtmlTreeBuilder);
    label323:
    return anythingElse(paramToken, paramHtmlTreeBuilder);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */