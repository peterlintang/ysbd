package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$Id
  extends Evaluator
{
  private String id;
  
  public Evaluator$Id(String paramString)
  {
    this.id = paramString;
  }
  
  public final boolean matches(Element paramElement1, Element paramElement2)
  {
    return this.id.equals(paramElement2.id());
  }
  
  public final String toString()
  {
    return String.format("#%s", new Object[] { this.id });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$Id.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */