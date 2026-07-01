package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.i;

public class h
  implements i
{
  public static final String a = "01360240043788015936020505";
  public static final h b = new h();
  private static final char[] c = "01360240043788015936020505".toCharArray();
  private final char[] d;
  
  public h()
  {
    this.d = c;
  }
  
  public h(String paramString)
  {
    this.d = paramString.toCharArray();
  }
  
  public h(char[] paramArrayOfChar)
  {
    this.d = new char[paramArrayOfChar.length];
    System.arraycopy(paramArrayOfChar, 0, this.d, 0, paramArrayOfChar.length);
  }
  
  char a(char paramChar)
  {
    if (!Character.isLetter(paramChar)) {
      return '\000';
    }
    return this.d[(Character.toUpperCase(paramChar) - 'A')];
  }
  
  public int a(String paramString1, String paramString2)
  {
    return j.a(this, paramString1, paramString2);
  }
  
  public String a(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return null;
    }
    paramString = j.a(paramString);
    if (paramString.length() == 0) {
      return paramString;
    }
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append(paramString.charAt(0));
    int k;
    for (int j = 42; i < paramString.length(); j = k)
    {
      char c1 = a(paramString.charAt(i));
      k = j;
      if (c1 != j)
      {
        if (c1 != 0) {
          localStringBuffer.append(c1);
        }
        k = c1;
      }
      i += 1;
    }
    return localStringBuffer.toString();
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new g("Parameter supplied to RefinedSoundex encode is not of type java.lang.String");
    }
    return a((String)paramObject);
  }
  
  public String b(String paramString)
  {
    return a(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */