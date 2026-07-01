package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$16
{
  HtmlTreeBuilderState$16()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    paramHtmlTreeBuilder.error(this);
    return false;
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    boolean bool = false;
    switch (HtmlTreeBuilderState.24.$SwitchMap$org$jsoup$parser$Token$TokenType[paramToken.type.ordinal()])
    {
    default: 
      bool = anythingElse(paramToken, paramHtmlTreeBuilder);
      return bool;
    case 5: 
      paramToken = paramToken.asCharacter();
      if (paramToken.getData().equals(HtmlTreeBuilderState.access$400()))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      paramHtmlTreeBuilder.insert(paramToken);
    }
    for (;;)
    {
      return true;
      paramHtmlTreeBuilder.insert(paramToken.asComment());
      continue;
      paramHtmlTreeBuilder.error(this);
      return false;
      Object localObject = paramToken.asStartTag();
      String str = ((Token.StartTag)localObject).name();
      if (str.equals("html")) {
        return paramHtmlTreeBuilder.process((Token)localObject, InBody);
      }
      if (str.equals("option"))
      {
        paramHtmlTreeBuilder.process(new Token.EndTag("option"));
        paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
      }
      else
      {
        if (str.equals("optgroup"))
        {
          if (paramHtmlTreeBuilder.currentElement().nodeName().equals("option")) {
            paramHtmlTreeBuilder.process(new Token.EndTag("option"));
          }
          for (;;)
          {
            paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
            break;
            if (paramHtmlTreeBuilder.currentElement().nodeName().equals("optgroup")) {
              paramHtmlTreeBuilder.process(new Token.EndTag("optgroup"));
            }
          }
        }
        if (str.equals("select"))
        {
          paramHtmlTreeBuilder.error(this);
          return paramHtmlTreeBuilder.process(new Token.EndTag("select"));
        }
        if (StringUtil.in(str, new String[] { "input", "keygen", "textarea" }))
        {
          paramHtmlTreeBuilder.error(this);
          if (!paramHtmlTreeBuilder.inSelectScope("select")) {
            break;
          }
          paramHtmlTreeBuilder.process(new Token.EndTag("select"));
          return paramHtmlTreeBuilder.process((Token)localObject);
        }
        if (str.equals("script")) {
          return paramHtmlTreeBuilder.process(paramToken, InHead);
        }
        return anythingElse(paramToken, paramHtmlTreeBuilder);
        localObject = paramToken.asEndTag().name();
        if (((String)localObject).equals("optgroup"))
        {
          if ((paramHtmlTreeBuilder.currentElement().nodeName().equals("option")) && (paramHtmlTreeBuilder.aboveOnStack(paramHtmlTreeBuilder.currentElement()) != null) && (paramHtmlTreeBuilder.aboveOnStack(paramHtmlTreeBuilder.currentElement()).nodeName().equals("optgroup"))) {
            paramHtmlTreeBuilder.process(new Token.EndTag("option"));
          }
          if (paramHtmlTreeBuilder.currentElement().nodeName().equals("optgroup")) {
            paramHtmlTreeBuilder.pop();
          } else {
            paramHtmlTreeBuilder.error(this);
          }
        }
        else if (((String)localObject).equals("option"))
        {
          if (paramHtmlTreeBuilder.currentElement().nodeName().equals("option")) {
            paramHtmlTreeBuilder.pop();
          } else {
            paramHtmlTreeBuilder.error(this);
          }
        }
        else if (((String)localObject).equals("select"))
        {
          if (!paramHtmlTreeBuilder.inSelectScope((String)localObject))
          {
            paramHtmlTreeBuilder.error(this);
            return false;
          }
          paramHtmlTreeBuilder.popStackToClose((String)localObject);
          paramHtmlTreeBuilder.resetInsertionMode();
        }
        else
        {
          return anythingElse(paramToken, paramHtmlTreeBuilder);
          if (!paramHtmlTreeBuilder.currentElement().nodeName().equals("html")) {
            paramHtmlTreeBuilder.error(this);
          }
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */