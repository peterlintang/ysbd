package org.jsoup.parser;

import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$9
{
  HtmlTreeBuilderState$9()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean anythingElse(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    paramHtmlTreeBuilder.error(this);
    if (StringUtil.in(paramHtmlTreeBuilder.currentElement().nodeName(), new String[] { "table", "tbody", "tfoot", "thead", "tr" }))
    {
      paramHtmlTreeBuilder.setFosterInserts(true);
      boolean bool = paramHtmlTreeBuilder.process(paramToken, InBody);
      paramHtmlTreeBuilder.setFosterInserts(false);
      return bool;
    }
    return paramHtmlTreeBuilder.process(paramToken, InBody);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    boolean bool = true;
    if (paramToken.isCharacter())
    {
      paramHtmlTreeBuilder.newPendingTableCharacters();
      paramHtmlTreeBuilder.markInsertionMode();
      paramHtmlTreeBuilder.transition(InTableText);
      bool = paramHtmlTreeBuilder.process(paramToken);
    }
    label577:
    do
    {
      return bool;
      if (paramToken.isComment())
      {
        paramHtmlTreeBuilder.insert(paramToken.asComment());
        return true;
      }
      if (paramToken.isDoctype())
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      Object localObject;
      String str;
      if (paramToken.isStartTag())
      {
        localObject = paramToken.asStartTag();
        str = ((Token.StartTag)localObject).name();
        if (str.equals("caption"))
        {
          paramHtmlTreeBuilder.clearStackToTableContext();
          paramHtmlTreeBuilder.insertMarkerToFormattingElements();
          paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
          paramHtmlTreeBuilder.transition(InCaption);
        }
      }
      do
      {
        for (;;)
        {
          return anythingElse(paramToken, paramHtmlTreeBuilder);
          if (str.equals("colgroup"))
          {
            paramHtmlTreeBuilder.clearStackToTableContext();
            paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
            paramHtmlTreeBuilder.transition(InColumnGroup);
          }
          else
          {
            if (str.equals("col"))
            {
              paramHtmlTreeBuilder.process(new Token.StartTag("colgroup"));
              return paramHtmlTreeBuilder.process(paramToken);
            }
            if (StringUtil.in(str, new String[] { "tbody", "tfoot", "thead" }))
            {
              paramHtmlTreeBuilder.clearStackToTableContext();
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject);
              paramHtmlTreeBuilder.transition(InTableBody);
            }
            else
            {
              if (StringUtil.in(str, new String[] { "td", "th", "tr" }))
              {
                paramHtmlTreeBuilder.process(new Token.StartTag("tbody"));
                return paramHtmlTreeBuilder.process(paramToken);
              }
              if (str.equals("table"))
              {
                paramHtmlTreeBuilder.error(this);
                if (paramHtmlTreeBuilder.process(new Token.EndTag("table"))) {
                  return paramHtmlTreeBuilder.process(paramToken);
                }
              }
              else
              {
                if (StringUtil.in(str, new String[] { "style", "script" })) {
                  return paramHtmlTreeBuilder.process(paramToken, InHead);
                }
                if (str.equals("input"))
                {
                  if (!((Token.StartTag)localObject).attributes.get("type").equalsIgnoreCase("hidden")) {
                    return anythingElse(paramToken, paramHtmlTreeBuilder);
                  }
                  paramHtmlTreeBuilder.insertEmpty((Token.StartTag)localObject);
                }
                else if (str.equals("form"))
                {
                  paramHtmlTreeBuilder.error(this);
                  if (paramHtmlTreeBuilder.getFormElement() != null) {
                    return false;
                  }
                  paramHtmlTreeBuilder.setFormElement(paramHtmlTreeBuilder.insertEmpty((Token.StartTag)localObject));
                }
                else
                {
                  return anythingElse(paramToken, paramHtmlTreeBuilder);
                  if (!paramToken.isEndTag()) {
                    break label577;
                  }
                  localObject = paramToken.asEndTag().name();
                  if (!((String)localObject).equals("table")) {
                    break;
                  }
                  if (!paramHtmlTreeBuilder.inTableScope((String)localObject))
                  {
                    paramHtmlTreeBuilder.error(this);
                    return false;
                  }
                  paramHtmlTreeBuilder.popStackToClose("table");
                  paramHtmlTreeBuilder.resetInsertionMode();
                }
              }
            }
          }
        }
        if (StringUtil.in((String)localObject, new String[] { "body", "caption", "col", "colgroup", "html", "tbody", "td", "tfoot", "th", "thead", "tr" }))
        {
          paramHtmlTreeBuilder.error(this);
          return false;
        }
        return anythingElse(paramToken, paramHtmlTreeBuilder);
      } while (!paramToken.isEOF());
    } while (!paramHtmlTreeBuilder.currentElement().nodeName().equals("html"));
    paramHtmlTreeBuilder.error(this);
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */