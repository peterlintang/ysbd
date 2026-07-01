package org.jsoup.parser;

 enum HtmlTreeBuilderState$20
{
  HtmlTreeBuilderState$20()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (HtmlTreeBuilderState.access$100(paramToken)) {
      paramHtmlTreeBuilder.insert(paramToken.asCharacter());
    }
    do
    {
      for (;;)
      {
        return true;
        if (paramToken.isComment())
        {
          paramHtmlTreeBuilder.insert(paramToken.asComment());
        }
        else
        {
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
          paramHtmlTreeBuilder.transition(AfterAfterFrameset);
        }
      }
      if ((paramToken.isStartTag()) && (paramToken.asStartTag().name().equals("noframes"))) {
        return paramHtmlTreeBuilder.process(paramToken, InHead);
      }
    } while (paramToken.isEOF());
    paramHtmlTreeBuilder.error(this);
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$20.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */