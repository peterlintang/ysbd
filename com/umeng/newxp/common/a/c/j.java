package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.i;
import java.util.Locale;

final class j
{
  static int a(i parami, String paramString1, String paramString2)
  {
    return a(parami.b(paramString1), parami.b(paramString2));
  }
  
  static int a(String paramString1, String paramString2)
  {
    int i = 0;
    int j = 0;
    int k = j;
    if (paramString1 != null)
    {
      if (paramString2 == null) {
        k = j;
      }
    }
    else {
      return k;
    }
    int m = Math.min(paramString1.length(), paramString2.length());
    j = 0;
    for (;;)
    {
      k = i;
      if (j >= m) {
        break;
      }
      k = i;
      if (paramString1.charAt(j) == paramString2.charAt(j)) {
        k = i + 1;
      }
      j += 1;
      i = k;
    }
  }
  
  static String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return paramString;
    }
    int m = paramString.length();
    char[] arrayOfChar = new char[m];
    int j = 0;
    int i = 0;
    if (j < m)
    {
      if (!Character.isLetter(paramString.charAt(j))) {
        break label100;
      }
      int k = i + 1;
      arrayOfChar[i] = paramString.charAt(j);
      i = k;
    }
    label100:
    for (;;)
    {
      j += 1;
      break;
      if (i == m) {
        return paramString.toUpperCase(Locale.ENGLISH);
      }
      return new String(arrayOfChar, 0, i).toUpperCase(Locale.ENGLISH);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */