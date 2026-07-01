package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.g;

public class i
  implements com.umeng.newxp.common.a.i
{
  public static final String a = "01230120022455012623010202";
  public static final i b = new i();
  private static final char[] c = "01230120022455012623010202".toCharArray();
  private int d = 4;
  private final char[] e;
  
  public i()
  {
    this.e = c;
  }
  
  public i(String paramString)
  {
    this.e = paramString.toCharArray();
  }
  
  public i(char[] paramArrayOfChar)
  {
    this.e = new char[paramArrayOfChar.length];
    System.arraycopy(paramArrayOfChar, 0, this.e, 0, paramArrayOfChar.length);
  }
  
  private char a(char paramChar)
  {
    int i = paramChar - 'A';
    if ((i < 0) || (i >= b().length)) {
      throw new IllegalArgumentException("The character is not mapped: " + paramChar);
    }
    return b()[i];
  }
  
  private char a(String paramString, int paramInt)
  {
    char c2 = a(paramString.charAt(paramInt));
    char c1 = c2;
    if (paramInt > 1)
    {
      c1 = c2;
      if (c2 != '0')
      {
        int i = paramString.charAt(paramInt - 1);
        if (72 != i)
        {
          c1 = c2;
          if (87 != i) {}
        }
        else
        {
          char c3 = paramString.charAt(paramInt - 2);
          if ((a(c3) != c2) && ('H' != c3))
          {
            c1 = c2;
            if ('W' != c3) {}
          }
          else
          {
            c1 = '\000';
          }
        }
      }
    }
    return c1;
  }
  
  private char[] b()
  {
    return this.e;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public int a(String paramString1, String paramString2)
  {
    return j.a(this, paramString1, paramString2);
  }
  
  public String a(String paramString)
  {
    int k = 1;
    if (paramString == null) {
      return null;
    }
    paramString = j.a(paramString);
    if (paramString.length() == 0) {
      return paramString;
    }
    char[] arrayOfChar = new char[4];
    char[] tmp30_28 = arrayOfChar;
    tmp30_28[0] = 48;
    char[] tmp35_30 = tmp30_28;
    tmp35_30[1] = 48;
    char[] tmp40_35 = tmp35_30;
    tmp40_35[2] = 48;
    char[] tmp45_40 = tmp40_35;
    tmp45_40[3] = 48;
    tmp45_40;
    arrayOfChar[0] = paramString.charAt(0);
    int m = a(paramString, 0);
    int j = 1;
    for (;;)
    {
      int n;
      if ((j < paramString.length()) && (k < arrayOfChar.length))
      {
        n = j + 1;
        int i = a(paramString, j);
        if (i != 0)
        {
          j = k;
          if (i != 48)
          {
            j = k;
            if (i != m)
            {
              arrayOfChar[k] = i;
              j = k + 1;
            }
          }
          m = i;
          k = j;
          j = n;
        }
      }
      else
      {
        return new String(arrayOfChar);
      }
      j = n;
    }
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new g("Parameter supplied to Soundex encode is not of type java.lang.String");
    }
    return a((String)paramObject);
  }
  
  public String b(String paramString)
  {
    return a(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */