package org.jsoup.parser;

 enum HtmlTreeBuilderState$8
{
  HtmlTreeBuilderState$8()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (paramToken.isCharacter()) {
      paramHtmlTreeBuilder.insert(paramToken.asCharacter());
    }
    for (;;)
    {
      return true;
      if (paramToken.isEOF())
      {
        paramHtmlTreeBuilder.error(this);
        paramHtmlTreeBuilder.pop();
        paramHtmlTreeBuilder.transition(paramHtmlTreeBuilder.originalState());
        return paramHtmlTreeBuilder.process(paramToken);
      }
      if (paramToken.isEndTag())
      {
        paramHtmlTreeBuilder.pop();
        paramHtmlTreeBuilder.transition(paramHtmlTreeBuilder.originalState());
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */