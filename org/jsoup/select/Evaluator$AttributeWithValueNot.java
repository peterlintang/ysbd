package org.jsoup.select;

import org.jsoup.nodes.Element;

public final class Evaluator$AttributeWithValueNot
  extends Evaluator.AttributeKeyPair
{
  public Evaluator$AttributeWithValueNot(String paramString1, String paramString2)
  {
    super(paramString1, paramString2);
  }
  
  public final boolean matches(Element paramElement1, Element paramElement2)
  {
    return !this.value.equalsIgnoreCase(paramElement2.attr(this.key));
  }
  
  public final String toString()
  {
    return String.format("[%s!=%s]", new Object[] { this.key, this.value });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$AttributeWithValueNot.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */