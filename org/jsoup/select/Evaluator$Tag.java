package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$Tag
  extends Evaluator
{
  private String tagName;
  
  public Evaluator$Tag(String paramString)
  {
    this.tagName = paramString;
  }
  
  public final boolean matches(Element paramElement1, Element paramElement2)
  {
    return paramElement2.tagName().equals(this.tagName);
  }
  
  public final String toString()
  {
    return String.format("%s", new Object[] { this.tagName });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$Tag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */