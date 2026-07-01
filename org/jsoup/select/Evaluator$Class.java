package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$Class
  extends Evaluator
{
  private String className;
  
  public Evaluator$Class(String paramString)
  {
    this.className = paramString;
  }
  
  public final boolean matches(Element paramElement1, Element paramElement2)
  {
    return paramElement2.hasClass(this.className);
  }
  
  public final String toString()
  {
    return String.format(".%s", new Object[] { this.className });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$Class.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */