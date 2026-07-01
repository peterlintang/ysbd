package org.jsoup.parser;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.helper.StringUtil;
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Document.QuirksMode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;

 enum HtmlTreeBuilderState$7
{
  HtmlTreeBuilderState$7()
  {
    super(paramString, paramInt, null);
  }
  
  final boolean anyOtherEndTag(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    paramToken = paramToken.asEndTag().name();
    Iterator localIterator = paramHtmlTreeBuilder.getStack().descendingIterator();
    Element localElement;
    do
    {
      if (localIterator.hasNext())
      {
        localElement = (Element)localIterator.next();
        if (localElement.nodeName().equals(paramToken))
        {
          paramHtmlTreeBuilder.generateImpliedEndTags(paramToken);
          if (!paramToken.equals(paramHtmlTreeBuilder.currentElement().nodeName())) {
            paramHtmlTreeBuilder.error(this);
          }
          paramHtmlTreeBuilder.popStackToClose(paramToken);
        }
      }
      else
      {
        return true;
      }
    } while (!paramHtmlTreeBuilder.isSpecial(localElement));
    paramHtmlTreeBuilder.error(this);
    return false;
  }
  
  final boolean process(Token paramToken, HtmlTreeBuilder paramHtmlTreeBuilder)
  {
    switch (HtmlTreeBuilderState.24.$SwitchMap$org$jsoup$parser$Token$TokenType[paramToken.type.ordinal()])
    {
    }
    Object localObject1;
    Object localObject2;
    int i;
    label1104:
    label1144:
    label1285:
    label1325:
    String str;
    for (;;)
    {
      return true;
      paramToken = paramToken.asCharacter();
      if (paramToken.getData().equals(HtmlTreeBuilderState.access$400()))
      {
        paramHtmlTreeBuilder.error(this);
        return false;
      }
      if (HtmlTreeBuilderState.access$100(paramToken))
      {
        paramHtmlTreeBuilder.reconstructFormattingElements();
        paramHtmlTreeBuilder.insert(paramToken);
      }
      else
      {
        paramHtmlTreeBuilder.reconstructFormattingElements();
        paramHtmlTreeBuilder.insert(paramToken);
        paramHtmlTreeBuilder.framesetOk(false);
        continue;
        paramHtmlTreeBuilder.insert(paramToken.asComment());
        continue;
        paramHtmlTreeBuilder.error(this);
        return false;
        localObject1 = paramToken.asStartTag();
        localObject2 = ((Token.StartTag)localObject1).name();
        if (((String)localObject2).equals("html"))
        {
          paramHtmlTreeBuilder.error(this);
          paramToken = (Element)paramHtmlTreeBuilder.getStack().getFirst();
          paramHtmlTreeBuilder = ((Token.StartTag)localObject1).getAttributes().iterator();
          while (paramHtmlTreeBuilder.hasNext())
          {
            localObject1 = (Attribute)paramHtmlTreeBuilder.next();
            if (!paramToken.hasAttr(((Attribute)localObject1).getKey())) {
              paramToken.attributes().put((Attribute)localObject1);
            }
          }
        }
        if (StringUtil.in((String)localObject2, new String[] { "base", "basefont", "bgsound", "command", "link", "meta", "noframes", "script", "style", "title" })) {
          return paramHtmlTreeBuilder.process(paramToken, InHead);
        }
        if (((String)localObject2).equals("body"))
        {
          paramHtmlTreeBuilder.error(this);
          paramToken = paramHtmlTreeBuilder.getStack();
          if ((paramToken.size() == 1) || ((paramToken.size() > 2) && (!((Element)paramToken.get(1)).nodeName().equals("body")))) {
            return false;
          }
          paramHtmlTreeBuilder.framesetOk(false);
          paramToken = (Element)paramToken.get(1);
          paramHtmlTreeBuilder = ((Token.StartTag)localObject1).getAttributes().iterator();
          while (paramHtmlTreeBuilder.hasNext())
          {
            localObject1 = (Attribute)paramHtmlTreeBuilder.next();
            if (!paramToken.hasAttr(((Attribute)localObject1).getKey())) {
              paramToken.attributes().put((Attribute)localObject1);
            }
          }
        }
        if (((String)localObject2).equals("frameset"))
        {
          paramHtmlTreeBuilder.error(this);
          paramToken = paramHtmlTreeBuilder.getStack();
          if ((paramToken.size() == 1) || ((paramToken.size() > 2) && (!((Element)paramToken.get(1)).nodeName().equals("body")))) {
            return false;
          }
          if (!paramHtmlTreeBuilder.framesetOk()) {
            return false;
          }
          localObject2 = (Element)paramToken.get(1);
          if (((Element)localObject2).parent() != null) {
            ((Element)localObject2).remove();
          }
          while (paramToken.size() > 1) {
            paramToken.removeLast();
          }
          paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
          paramHtmlTreeBuilder.transition(InFrameset);
        }
        else if (StringUtil.in((String)localObject2, new String[] { "address", "article", "aside", "blockquote", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "menu", "nav", "ol", "p", "section", "summary", "ul" }))
        {
          if (paramHtmlTreeBuilder.inButtonScope("p")) {
            paramHtmlTreeBuilder.process(new Token.EndTag("p"));
          }
          paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
        }
        else if (StringUtil.in((String)localObject2, new String[] { "h1", "h2", "h3", "h4", "h5", "h6" }))
        {
          if (paramHtmlTreeBuilder.inButtonScope("p")) {
            paramHtmlTreeBuilder.process(new Token.EndTag("p"));
          }
          if (StringUtil.in(paramHtmlTreeBuilder.currentElement().nodeName(), new String[] { "h1", "h2", "h3", "h4", "h5", "h6" }))
          {
            paramHtmlTreeBuilder.error(this);
            paramHtmlTreeBuilder.pop();
          }
          paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
        }
        else if (StringUtil.in((String)localObject2, new String[] { "pre", "listing" }))
        {
          if (paramHtmlTreeBuilder.inButtonScope("p")) {
            paramHtmlTreeBuilder.process(new Token.EndTag("p"));
          }
          paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
          paramHtmlTreeBuilder.framesetOk(false);
        }
        else if (((String)localObject2).equals("form"))
        {
          if (paramHtmlTreeBuilder.getFormElement() != null)
          {
            paramHtmlTreeBuilder.error(this);
            return false;
          }
          if (paramHtmlTreeBuilder.inButtonScope("p")) {
            paramHtmlTreeBuilder.process(new Token.EndTag("p"));
          }
          paramHtmlTreeBuilder.setFormElement(paramHtmlTreeBuilder.insert((Token.StartTag)localObject1));
        }
        else
        {
          if (((String)localObject2).equals("li"))
          {
            paramHtmlTreeBuilder.framesetOk(false);
            paramToken = paramHtmlTreeBuilder.getStack();
            i = paramToken.size() - 1;
            for (;;)
            {
              if (i > 0)
              {
                localObject2 = (Element)paramToken.get(i);
                if (!((Element)localObject2).nodeName().equals("li")) {
                  break label1104;
                }
                paramHtmlTreeBuilder.process(new Token.EndTag("li"));
              }
              do
              {
                if (paramHtmlTreeBuilder.inButtonScope("p")) {
                  paramHtmlTreeBuilder.process(new Token.EndTag("p"));
                }
                paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
                break;
                if (!paramHtmlTreeBuilder.isSpecial((Element)localObject2)) {
                  break label1144;
                }
              } while (!StringUtil.in(((Element)localObject2).nodeName(), new String[] { "address", "div", "p" }));
              i -= 1;
            }
          }
          if (StringUtil.in((String)localObject2, new String[] { "dd", "dt" }))
          {
            paramHtmlTreeBuilder.framesetOk(false);
            paramToken = paramHtmlTreeBuilder.getStack();
            i = paramToken.size() - 1;
            for (;;)
            {
              if (i > 0)
              {
                localObject2 = (Element)paramToken.get(i);
                if (!StringUtil.in(((Element)localObject2).nodeName(), new String[] { "dd", "dt" })) {
                  break label1285;
                }
                paramHtmlTreeBuilder.process(new Token.EndTag(((Element)localObject2).nodeName()));
              }
              do
              {
                if (paramHtmlTreeBuilder.inButtonScope("p")) {
                  paramHtmlTreeBuilder.process(new Token.EndTag("p"));
                }
                paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
                break;
                if (!paramHtmlTreeBuilder.isSpecial((Element)localObject2)) {
                  break label1325;
                }
              } while (!StringUtil.in(((Element)localObject2).nodeName(), new String[] { "address", "div", "p" }));
              i -= 1;
            }
          }
          if (((String)localObject2).equals("plaintext"))
          {
            if (paramHtmlTreeBuilder.inButtonScope("p")) {
              paramHtmlTreeBuilder.process(new Token.EndTag("p"));
            }
            paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
            paramHtmlTreeBuilder.tokeniser.transition(TokeniserState.PLAINTEXT);
          }
          else if (((String)localObject2).equals("button"))
          {
            if (paramHtmlTreeBuilder.inButtonScope("button"))
            {
              paramHtmlTreeBuilder.error(this);
              paramHtmlTreeBuilder.process(new Token.EndTag("button"));
              paramHtmlTreeBuilder.process((Token)localObject1);
            }
            else
            {
              paramHtmlTreeBuilder.reconstructFormattingElements();
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
              paramHtmlTreeBuilder.framesetOk(false);
            }
          }
          else if (((String)localObject2).equals("a"))
          {
            if (paramHtmlTreeBuilder.getActiveFormattingElement("a") != null)
            {
              paramHtmlTreeBuilder.error(this);
              paramHtmlTreeBuilder.process(new Token.EndTag("a"));
              paramToken = paramHtmlTreeBuilder.getFromStack("a");
              if (paramToken != null)
              {
                paramHtmlTreeBuilder.removeFromActiveFormattingElements(paramToken);
                paramHtmlTreeBuilder.removeFromStack(paramToken);
              }
            }
            paramHtmlTreeBuilder.reconstructFormattingElements();
            paramHtmlTreeBuilder.pushActiveFormattingElements(paramHtmlTreeBuilder.insert((Token.StartTag)localObject1));
          }
          else if (StringUtil.in((String)localObject2, new String[] { "b", "big", "code", "em", "font", "i", "s", "small", "strike", "strong", "tt", "u" }))
          {
            paramHtmlTreeBuilder.reconstructFormattingElements();
            paramHtmlTreeBuilder.pushActiveFormattingElements(paramHtmlTreeBuilder.insert((Token.StartTag)localObject1));
          }
          else if (((String)localObject2).equals("nobr"))
          {
            paramHtmlTreeBuilder.reconstructFormattingElements();
            if (paramHtmlTreeBuilder.inScope("nobr"))
            {
              paramHtmlTreeBuilder.error(this);
              paramHtmlTreeBuilder.process(new Token.EndTag("nobr"));
              paramHtmlTreeBuilder.reconstructFormattingElements();
            }
            paramHtmlTreeBuilder.pushActiveFormattingElements(paramHtmlTreeBuilder.insert((Token.StartTag)localObject1));
          }
          else if (StringUtil.in((String)localObject2, new String[] { "applet", "marquee", "object" }))
          {
            paramHtmlTreeBuilder.reconstructFormattingElements();
            paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
            paramHtmlTreeBuilder.insertMarkerToFormattingElements();
            paramHtmlTreeBuilder.framesetOk(false);
          }
          else if (((String)localObject2).equals("table"))
          {
            if ((paramHtmlTreeBuilder.getDocument().quirksMode() != Document.QuirksMode.quirks) && (paramHtmlTreeBuilder.inButtonScope("p"))) {
              paramHtmlTreeBuilder.process(new Token.EndTag("p"));
            }
            paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
            paramHtmlTreeBuilder.framesetOk(false);
            paramHtmlTreeBuilder.transition(InTable);
          }
          else if (StringUtil.in((String)localObject2, new String[] { "area", "br", "embed", "img", "keygen", "wbr" }))
          {
            paramHtmlTreeBuilder.reconstructFormattingElements();
            paramHtmlTreeBuilder.insertEmpty((Token.StartTag)localObject1);
            paramHtmlTreeBuilder.framesetOk(false);
          }
          else if (((String)localObject2).equals("input"))
          {
            paramHtmlTreeBuilder.reconstructFormattingElements();
            if (!paramHtmlTreeBuilder.insertEmpty((Token.StartTag)localObject1).attr("type").equalsIgnoreCase("hidden")) {
              paramHtmlTreeBuilder.framesetOk(false);
            }
          }
          else if (StringUtil.in((String)localObject2, new String[] { "param", "source", "track" }))
          {
            paramHtmlTreeBuilder.insertEmpty((Token.StartTag)localObject1);
          }
          else if (((String)localObject2).equals("hr"))
          {
            if (paramHtmlTreeBuilder.inButtonScope("p")) {
              paramHtmlTreeBuilder.process(new Token.EndTag("p"));
            }
            paramHtmlTreeBuilder.insertEmpty((Token.StartTag)localObject1);
            paramHtmlTreeBuilder.framesetOk(false);
          }
          else
          {
            if (((String)localObject2).equals("image"))
            {
              ((Token.StartTag)localObject1).name("img");
              return paramHtmlTreeBuilder.process((Token)localObject1);
            }
            if (((String)localObject2).equals("isindex"))
            {
              paramHtmlTreeBuilder.error(this);
              if (paramHtmlTreeBuilder.getFormElement() != null) {
                return false;
              }
              paramHtmlTreeBuilder.tokeniser.acknowledgeSelfClosingFlag();
              paramHtmlTreeBuilder.process(new Token.StartTag("form"));
              if (((Token.StartTag)localObject1).attributes.hasKey("action")) {
                paramHtmlTreeBuilder.getFormElement().attr("action", ((Token.StartTag)localObject1).attributes.get("action"));
              }
              paramHtmlTreeBuilder.process(new Token.StartTag("hr"));
              paramHtmlTreeBuilder.process(new Token.StartTag("label"));
              if (((Token.StartTag)localObject1).attributes.hasKey("prompt")) {}
              for (paramToken = ((Token.StartTag)localObject1).attributes.get("prompt");; paramToken = "This is a searchable index. Enter search keywords: ")
              {
                paramHtmlTreeBuilder.process(new Token.Character(paramToken));
                paramToken = new Attributes();
                localObject1 = ((Token.StartTag)localObject1).attributes.iterator();
                while (((Iterator)localObject1).hasNext())
                {
                  localObject2 = (Attribute)((Iterator)localObject1).next();
                  if (!StringUtil.in(((Attribute)localObject2).getKey(), new String[] { "name", "action", "prompt" })) {
                    paramToken.put((Attribute)localObject2);
                  }
                }
              }
              paramToken.put("name", "isindex");
              paramHtmlTreeBuilder.process(new Token.StartTag("input", paramToken));
              paramHtmlTreeBuilder.process(new Token.EndTag("label"));
              paramHtmlTreeBuilder.process(new Token.StartTag("hr"));
              paramHtmlTreeBuilder.process(new Token.EndTag("form"));
            }
            else if (((String)localObject2).equals("textarea"))
            {
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
              paramHtmlTreeBuilder.tokeniser.transition(TokeniserState.Rcdata);
              paramHtmlTreeBuilder.markInsertionMode();
              paramHtmlTreeBuilder.framesetOk(false);
              paramHtmlTreeBuilder.transition(Text);
            }
            else if (((String)localObject2).equals("xmp"))
            {
              if (paramHtmlTreeBuilder.inButtonScope("p")) {
                paramHtmlTreeBuilder.process(new Token.EndTag("p"));
              }
              paramHtmlTreeBuilder.reconstructFormattingElements();
              paramHtmlTreeBuilder.framesetOk(false);
              HtmlTreeBuilderState.access$300((Token.StartTag)localObject1, paramHtmlTreeBuilder);
            }
            else if (((String)localObject2).equals("iframe"))
            {
              paramHtmlTreeBuilder.framesetOk(false);
              HtmlTreeBuilderState.access$300((Token.StartTag)localObject1, paramHtmlTreeBuilder);
            }
            else if (((String)localObject2).equals("noembed"))
            {
              HtmlTreeBuilderState.access$300((Token.StartTag)localObject1, paramHtmlTreeBuilder);
            }
            else if (((String)localObject2).equals("select"))
            {
              paramHtmlTreeBuilder.reconstructFormattingElements();
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
              paramHtmlTreeBuilder.framesetOk(false);
              paramToken = paramHtmlTreeBuilder.state();
              if ((paramToken.equals(InTable)) || (paramToken.equals(InCaption)) || (paramToken.equals(InTableBody)) || (paramToken.equals(InRow)) || (paramToken.equals(InCell))) {
                paramHtmlTreeBuilder.transition(InSelectInTable);
              } else {
                paramHtmlTreeBuilder.transition(InSelect);
              }
            }
            else if (StringUtil.in("optgroup", new String[] { "option" }))
            {
              if (paramHtmlTreeBuilder.currentElement().nodeName().equals("option")) {
                paramHtmlTreeBuilder.process(new Token.EndTag("option"));
              }
              paramHtmlTreeBuilder.reconstructFormattingElements();
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
            }
            else if (StringUtil.in("rp", new String[] { "rt" }))
            {
              if (paramHtmlTreeBuilder.inScope("ruby"))
              {
                paramHtmlTreeBuilder.generateImpliedEndTags();
                if (!paramHtmlTreeBuilder.currentElement().nodeName().equals("ruby"))
                {
                  paramHtmlTreeBuilder.error(this);
                  paramHtmlTreeBuilder.popStackToBefore("ruby");
                }
                paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
              }
            }
            else if (((String)localObject2).equals("math"))
            {
              paramHtmlTreeBuilder.reconstructFormattingElements();
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
              paramHtmlTreeBuilder.tokeniser.acknowledgeSelfClosingFlag();
            }
            else if (((String)localObject2).equals("svg"))
            {
              paramHtmlTreeBuilder.reconstructFormattingElements();
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
              paramHtmlTreeBuilder.tokeniser.acknowledgeSelfClosingFlag();
            }
            else
            {
              if (StringUtil.in((String)localObject2, new String[] { "caption", "col", "colgroup", "frame", "head", "tbody", "td", "tfoot", "th", "thead", "tr" }))
              {
                paramHtmlTreeBuilder.error(this);
                return false;
              }
              paramHtmlTreeBuilder.reconstructFormattingElements();
              paramHtmlTreeBuilder.insert((Token.StartTag)localObject1);
              continue;
              localObject1 = paramToken.asEndTag();
              str = ((Token.EndTag)localObject1).name();
              if (str.equals("body"))
              {
                if (!paramHtmlTreeBuilder.inScope("body"))
                {
                  paramHtmlTreeBuilder.error(this);
                  return false;
                }
                paramHtmlTreeBuilder.transition(AfterBody);
              }
              else if (str.equals("html"))
              {
                if (paramHtmlTreeBuilder.process(new Token.EndTag("body"))) {
                  return paramHtmlTreeBuilder.process((Token)localObject1);
                }
              }
              else if (StringUtil.in(str, new String[] { "address", "article", "aside", "blockquote", "button", "center", "details", "dir", "div", "dl", "fieldset", "figcaption", "figure", "footer", "header", "hgroup", "listing", "menu", "nav", "ol", "pre", "section", "summary", "ul" }))
              {
                if (!paramHtmlTreeBuilder.inScope(str))
                {
                  paramHtmlTreeBuilder.error(this);
                  return false;
                }
                paramHtmlTreeBuilder.generateImpliedEndTags();
                if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
                  paramHtmlTreeBuilder.error(this);
                }
                paramHtmlTreeBuilder.popStackToClose(str);
              }
              else if (str.equals("form"))
              {
                paramToken = paramHtmlTreeBuilder.getFormElement();
                paramHtmlTreeBuilder.setFormElement(null);
                if ((paramToken == null) || (!paramHtmlTreeBuilder.inScope(str)))
                {
                  paramHtmlTreeBuilder.error(this);
                  return false;
                }
                paramHtmlTreeBuilder.generateImpliedEndTags();
                if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
                  paramHtmlTreeBuilder.error(this);
                }
                paramHtmlTreeBuilder.removeFromStack(paramToken);
              }
              else if (str.equals("p"))
              {
                if (!paramHtmlTreeBuilder.inButtonScope(str))
                {
                  paramHtmlTreeBuilder.error(this);
                  paramHtmlTreeBuilder.process(new Token.StartTag(str));
                  return paramHtmlTreeBuilder.process((Token)localObject1);
                }
                paramHtmlTreeBuilder.generateImpliedEndTags(str);
                if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
                  paramHtmlTreeBuilder.error(this);
                }
                paramHtmlTreeBuilder.popStackToClose(str);
              }
              else if (str.equals("li"))
              {
                if (!paramHtmlTreeBuilder.inListItemScope(str))
                {
                  paramHtmlTreeBuilder.error(this);
                  return false;
                }
                paramHtmlTreeBuilder.generateImpliedEndTags(str);
                if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
                  paramHtmlTreeBuilder.error(this);
                }
                paramHtmlTreeBuilder.popStackToClose(str);
              }
              else if (StringUtil.in(str, new String[] { "dd", "dt" }))
              {
                if (!paramHtmlTreeBuilder.inScope(str))
                {
                  paramHtmlTreeBuilder.error(this);
                  return false;
                }
                paramHtmlTreeBuilder.generateImpliedEndTags(str);
                if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
                  paramHtmlTreeBuilder.error(this);
                }
                paramHtmlTreeBuilder.popStackToClose(str);
              }
              else
              {
                if (!StringUtil.in(str, new String[] { "h1", "h2", "h3", "h4", "h5", "h6" })) {
                  break;
                }
                if (!paramHtmlTreeBuilder.inScope(new String[] { "h1", "h2", "h3", "h4", "h5", "h6" }))
                {
                  paramHtmlTreeBuilder.error(this);
                  return false;
                }
                paramHtmlTreeBuilder.generateImpliedEndTags(str);
                if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
                  paramHtmlTreeBuilder.error(this);
                }
                paramHtmlTreeBuilder.popStackToClose(new String[] { "h1", "h2", "h3", "h4", "h5", "h6" });
              }
            }
          }
        }
      }
    }
    if (str.equals("sarcasm")) {
      return anyOtherEndTag(paramToken, paramHtmlTreeBuilder);
    }
    int j;
    label3820:
    Element localElement;
    Object localObject3;
    Object localObject4;
    int k;
    if (StringUtil.in(str, new String[] { "a", "b", "big", "code", "em", "font", "i", "nobr", "s", "small", "strike", "strong", "tt", "u" }))
    {
      j = 0;
      if (j < 8)
      {
        localElement = paramHtmlTreeBuilder.getActiveFormattingElement(str);
        if (localElement == null) {
          return anyOtherEndTag(paramToken, paramHtmlTreeBuilder);
        }
        if (!paramHtmlTreeBuilder.onStack(localElement))
        {
          paramHtmlTreeBuilder.error(this);
          paramHtmlTreeBuilder.removeFromActiveFormattingElements(localElement);
          return true;
        }
        if (!paramHtmlTreeBuilder.inScope(localElement.nodeName()))
        {
          paramHtmlTreeBuilder.error(this);
          return false;
        }
        if (paramHtmlTreeBuilder.currentElement() != localElement) {
          paramHtmlTreeBuilder.error(this);
        }
        localObject3 = null;
        localObject2 = null;
        i = 0;
        localObject4 = paramHtmlTreeBuilder.getStack();
        k = 0;
        label3919:
        localObject1 = localObject3;
        if (k < ((LinkedList)localObject4).size())
        {
          localObject1 = (Element)((LinkedList)localObject4).get(k);
          if (localObject1 == localElement)
          {
            localObject1 = (Element)((LinkedList)localObject4).get(k - 1);
            i = 1;
          }
        }
      }
    }
    for (;;)
    {
      k += 1;
      localObject2 = localObject1;
      break label3919;
      if ((i != 0) && (paramHtmlTreeBuilder.isSpecial((Element)localObject1)))
      {
        if (localObject1 == null)
        {
          paramHtmlTreeBuilder.popStackToClose(localElement.nodeName());
          paramHtmlTreeBuilder.removeFromActiveFormattingElements(localElement);
          return true;
        }
        localObject3 = localObject1;
        i = 0;
        Object localObject5 = localObject1;
        if (i < 3)
        {
          localObject4 = localObject3;
          if (paramHtmlTreeBuilder.onStack((Element)localObject3)) {
            localObject4 = paramHtmlTreeBuilder.aboveOnStack((Element)localObject3);
          }
          if (!paramHtmlTreeBuilder.isInActiveFormattingElements((Element)localObject4))
          {
            paramHtmlTreeBuilder.removeFromStack((Element)localObject4);
            localObject3 = localObject4;
          }
          for (;;)
          {
            i += 1;
            break;
            if (localObject4 == localElement) {
              break label4151;
            }
            localObject3 = new Element(Tag.valueOf(((Element)localObject4).nodeName()), paramHtmlTreeBuilder.getBaseUri());
            paramHtmlTreeBuilder.replaceActiveFormattingElement((Element)localObject4, (Element)localObject3);
            paramHtmlTreeBuilder.replaceOnStack((Element)localObject4, (Element)localObject3);
            if (((Element)localObject5).parent() != null) {
              ((Element)localObject5).remove();
            }
            ((Element)localObject3).appendChild((Node)localObject5);
            localObject5 = localObject3;
          }
        }
        label4151:
        if (StringUtil.in(((Element)localObject2).nodeName(), new String[] { "table", "tbody", "tfoot", "thead", "tr" }))
        {
          if (((Element)localObject5).parent() != null) {
            ((Element)localObject5).remove();
          }
          paramHtmlTreeBuilder.insertInFosterParent((Node)localObject5);
        }
        for (;;)
        {
          localObject2 = new Element(Tag.valueOf(str), paramHtmlTreeBuilder.getBaseUri());
          localObject3 = (Node[])((Element)localObject1).childNodes().toArray(new Node[((Element)localObject1).childNodes().size()]);
          k = localObject3.length;
          i = 0;
          while (i < k)
          {
            ((Element)localObject2).appendChild(localObject3[i]);
            i += 1;
          }
          if (((Element)localObject5).parent() != null) {
            ((Element)localObject5).remove();
          }
          ((Element)localObject2).appendChild((Node)localObject5);
        }
        ((Element)localObject1).appendChild((Node)localObject2);
        paramHtmlTreeBuilder.removeFromActiveFormattingElements(localElement);
        paramHtmlTreeBuilder.removeFromStack(localElement);
        paramHtmlTreeBuilder.insertOnStackAfter((Element)localObject1, (Element)localObject2);
        j += 1;
        break label3820;
        break;
        if (StringUtil.in(str, new String[] { "applet", "marquee", "object" }))
        {
          if (paramHtmlTreeBuilder.inScope("name")) {
            break;
          }
          if (!paramHtmlTreeBuilder.inScope(str))
          {
            paramHtmlTreeBuilder.error(this);
            return false;
          }
          paramHtmlTreeBuilder.generateImpliedEndTags();
          if (!paramHtmlTreeBuilder.currentElement().nodeName().equals(str)) {
            paramHtmlTreeBuilder.error(this);
          }
          paramHtmlTreeBuilder.popStackToClose(str);
          paramHtmlTreeBuilder.clearFormattingElementsToLastMarker();
          break;
        }
        if (str.equals("br"))
        {
          paramHtmlTreeBuilder.error(this);
          paramHtmlTreeBuilder.process(new Token.StartTag("br"));
          return false;
        }
        return anyOtherEndTag(paramToken, paramHtmlTreeBuilder);
      }
      localObject1 = localObject2;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\parser\HtmlTreeBuilderState$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */