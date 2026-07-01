package org.jsoup.parser;

import java.util.Iterator;
import java.util.List;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Element;

 enum HtmlTreeBuilderState$10
{
  HtmlTreeBuilderState$10()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    Iterator localIterator;
    switch (HtmlTreeBuilderState.24.$SwitchMap$org$jsoup$parser$Token$TokenType[paramToken.type.ordinal()])
    {
    default: 
      if (paramHtmlTreeBuilder.getPendingTableCharacters().size() > 0) {
        localIterator = paramHtmlTreeBuilder.getPendingTableCharacters().iterator();
      }
      break;
    case 5: 
      while (localIterator.hasNext())
      {
        Token.Character localCharacter = (Token.Character)localIterator.next();
        if (!HtmlTreeBuilderState.access$100(localCharacter))
        {
          paramHtmlTreeBuilder.error(this);
          if (StringUtil.in(paramHtmlTreeBuilder.currentElement().nodeName(), new String[] { "table", "tbody", "tfoot", "thead", "tr" }))
          {
            paramHtmlTreeBuilder.setFosterInserts(true);
            paramHtmlTreeBuilder.process(localCharacter, InBody);
            paramHtmlTreeBuilder.setFosterInserts(false);
            continue;
            paramToken = paramToken.asCharacter();
            if (paramToken.getData().equals(HtmlTreeBuilderState.access$400()))
            {
              paramHtmlTreeBuilder.error(this);
              return false;
            }
            paramHtmlTreeBuilder.getPendingTableCharacters().add(paramToken);
            return true;
          }
          else
          {
            paramHtmlTreeBuilder.process(localCharacter, InBody);
          }
        }
        else
        {
          paramHtmlTreeBuilder.insert(localCharacter);
        }
      }
      paramHtmlTreeBuilder.newPendingTableCharacters();
    }
    paramHtmlTreeBuilder.transition(paramHtmlTreeBuilder.originalState());
    return paramHtmlTreeBuilder.process(paramToken);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */