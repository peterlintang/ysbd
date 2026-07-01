package org.jsoup.parser;

 enum HtmlTreeBuilderState$21
{
  HtmlTreeBuilderState$21()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (paramToken.isComment()) {
      paramHtmlTreeBuilder.insert(paramToken.asComment());
    }
    do
    {
      return true;
      if ((paramToken.isDoctype()) || (HtmlTreeBuilderState.access$100(paramToken)) || ((paramToken.isStartTag()) && (paramToken.asStartTag().name().equals("html")))) {
        return paramHtmlTreeBuilder.process(paramToken, InBody);
      }
    } while (paramToken.isEOF());
    paramHtmlTreeBuilder.error(this);
    paramHtmlTreeBuilder.transition(InBody);
    return paramHtmlTreeBuilder.process(paramToken);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */