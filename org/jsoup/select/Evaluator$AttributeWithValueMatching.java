package org.jsoup.select;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.jsoup.nodes.Element;

public final class Evaluator$AttributeWithValueMatching
  extends Evaluator
{
  String key;
  Pattern pattern;
  
  public Evaluator$AttributeWithValueMatching(String paramString, Pattern paramPattern)
  {
    this.key = paramString.trim().toLowerCase();
    this.pattern = paramPattern;
  }
  
  public final boolean matches(Element paramElement1, Element paramElement2)
  {
    return (paramElement2.hasAttr(this.key)) && (this.pattern.matcher(paramElement2.attr(this.key)).find());
  }
  
  public final String toString()
  {
    return String.format("[%s~=%s]", new Object[] { this.key, this.pattern.toString() });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$AttributeWithValueMatching.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */