package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$6
{
  HtmlTreeBuilderState$6()
  {
    super(paramString, paramInt, null);
  }
  
  private boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    paramHtmlTreeBuilder.process(new Token.StartTag("body"));
    paramHtmlTreeBuilder.framesetOk(true);
    return paramHtmlTreeBuilder.process(paramToken);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    if (HtmlTreeBuilderState.access$100(paramToken)) {
      paramHtmlTreeBuilder.insert(paramToken.asCharacter());
    }
    for (;;)
    {
      return true;
      if (paramToken.isComment())
      {
        paramHtmlTreeBuilder.insert(paramToken.asComment());
      }
      else if (paramToken.isDoctype())
      {
        paramHtmlTreeBuilder.error(this);
      }
      else if (paramToken.isStartTag())
      {
        Object localObject = paramToken.asStartTag();
        String str = ((Token.StartTag)localObject).name();
        if (str.equals("html")) {
          return paramHtmlTreeBuilder.process(paramToken, InBody);
        }
        if (str.equals("body"))
        {
          paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
          paramHtmlTreeBuilder.framesetOk(false);
          paramHtmlTreeBuilder.transition(InBody);
        }
        else if (str.equals("frameset"))
        {
          paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
          paramHtmlTreeBuilder.transition(InFrameset);
        }
        else if (StringUtil.in(str, new String[] { "base", "basefont", "bgsound", "link", "meta", "noframes", "script", "style", "title" }))
        {
          paramHtmlTreeBuilder.error(this);
          localObject = paramHtmlTreeBuilder.getHeadElement();
          paramHtmlTreeBuilder.push((Element)localObject);
          paramHtmlTreeBuilder.process(paramToken, InHead);
          paramHtmlTreeBuilder.removeFromStack((Element)localObject);
        }
        else
        {
          if (str.equals("head"))
          {
            paramHtmlTreeBuilder.error(this);
            return false;
          }
          anythingElse(paramToken, paramHtmlTreeBuilder);
        }
      }
      else if (paramToken.isEndTag())
      {
        if (StringUtil.in(paramToken.asEndTag().name(), new String[] { "body", "html" }))
        {
          anythingElse(paramToken, paramHtmlTreeBuilder);
        }
        else
        {
          paramHtmlTreeBuilder.error(this);
          return false;
        }
      }
      else
      {
        anythingElse(paramToken, paramHtmlTreeBuilder);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */