package org.jsoup.parser;

 enum HtmlTreeBuilderState$18
{
  HtmlTreeBuilderState$18()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (HtmlTreeBuilderState.access$100(paramToken)) {
      return paramHtmlTreeBuilder.process(paramToken, InBody);
    }
    if (paramToken.isComment()) {
      paramHtmlTreeBuilder.insert(paramToken.asComment());
    }
    do
    {
      for (;;)
      {
        return true;
        if (paramToken.isDoctype())
        {
          paramHtmlTreeBuilder.error(this);
          return false;
        }
        if ((paramToken.isStartTag()) && (paramToken.asStartTag().name().equals("html"))) {
          return paramHtmlTreeBuilder.process(paramToken, InBody);
        }
        if ((!paramToken.isEndTag()) || (!paramToken.asEndTag().name().equals("html"))) {
          break;
        }
        if (paramHtmlTreeBuilder.isFragmentParsing())
        {
          paramHtmlTreeBuilder.error(this);
          return false;
        }
        paramHtmlTreeBuilder.transition(AfterAfterBody);
      }
    } while (paramToken.isEOF());
    paramHtmlTreeBuilder.error(this);
    paramHtmlTreeBuilder.transition(InBody);
    return paramHtmlTreeBuilder.process(paramToken);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$18.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */