package org.jsoup.select;

import org.jsoup.helper.Validate;

public abstract class Evaluator$AttributeKeyPair
  extends Evaluator
{
  String key;
  String value;
  
  public Evaluator$AttributeKeyPair(String paramString1, String paramString2)
  {
    Validate.notEmpty(paramString1);
    Validate.notEmpty(paramString2);
    this.key = paramString1.trim().toLowerCase();
    this.value = paramString2.trim().toLowerCase();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\org\jsoup\select\Evaluator$AttributeKeyPair.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */