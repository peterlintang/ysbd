package org.jsoup.parser;

import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$19
{
  HtmlTreeBuilderState$19()
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
          if (paramToken.isStartTag())
          {
            paramToken = paramToken.asStartTag();
            String str = paramToken.name();
            if (str.equals("html")) {
              return paramHtmlTreeBuilder.process(paramToken, InBody);
            }
            if (str.equals("frameset"))
            {
              paramHtmlTreeBuilder.insert(paramToken);
            }
            else if (str.equals("frame"))
            {
              paramHtmlTreeBuilder.insertEmpty(paramToken);
            }
            else
            {
              if (str.equals("noframes")) {
                return paramHtmlTreeBuilder.process(paramToken, InHead);
              }
              paramHtmlTreeBuilder.error(this);
              return false;
            }
          }
          else
          {
            if ((!paramToken.isEndTag()) || (!paramToken.asEndTag().name().equals("frameset"))) {
              break;
            }
            if (paramHtmlTreeBuilder.currentElement().nodeName().equals("html"))
            {
              paramHtmlTreeBuilder.error(this);
              return false;
            }
            paramHtmlTreeBuilder.pop();
            if ((!paramHtmlTreeBuilder.isFragmentParsing()) && (!paramHtmlTreeBuilder.currentElement().nodeName().equals("frameset"))) {
              paramHtmlTreeBuilder.transition(AfterFrameset);
            }
          }
        }
      }
      if (!paramToken.isEOF()) {
        break;
      }
    } while (paramHtmlTreeBuilder.currentElement().nodeName().equals("html"));
    paramHtmlTreeBuilder.error(this);
    return true;
    paramHtmlTreeBuilder.error(this);
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$19.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */