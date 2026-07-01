package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$ContainsOwnText
  extends Evaluator
{
  private String searchText;
  
  public Evaluator$ContainsOwnText(String paramString)
  {
    this.searchText = paramString.toLowerCase();
  }
  
  public final boolean matches(Element paramElement1, Element paramElement2)
  {
    return paramElement2.ownText().toLowerCase().contains(this.searchText);
  }
  
  public final String toString()
  {
    return String.format(":containsOwn(%s", new Object[] { this.searchText });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$ContainsOwnText.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */