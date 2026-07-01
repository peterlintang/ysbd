package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.i;
import java.util.Locale;

public class e
  implements i
{
  private static final char[][] a = { { 196, 65 }, { 220, 85 }, { 214, 79 }, { 223, 83 } };
  
  private static boolean a(char[] paramArrayOfChar, char paramChar)
  {
    boolean bool2 = false;
    int j = paramArrayOfChar.length;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < j)
      {
        if (paramArrayOfChar[i] == paramChar) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  private String c(String paramString)
  {
    paramString = paramString.toUpperCase(Locale.GERMAN).toCharArray();
    int i = 0;
    if (i < paramString.length)
    {
      char[][] arrayOfChar;
      int k;
      int j;
      if (paramString[i] > 'Z')
      {
        arrayOfChar = a;
        k = arrayOfChar.length;
        j = 0;
      }
      for (;;)
      {
        if (j < k)
        {
          char[] arrayOfChar1 = arrayOfChar[j];
          if (paramString[i] == arrayOfChar1[0]) {
            paramString[i] = arrayOfChar1[1];
          }
        }
        else
        {
          i += 1;
          break;
        }
        j += 1;
      }
    }
    return new String(paramString);
  }
  
  public String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject = c(paramString);
    paramString = new e.c(this, ((String)localObject).length() * 2);
    localObject = new e.b(this, ((String)localObject).toCharArray());
    int j = ((e.b)localObject).a();
    int k = 47;
    char c1 = '-';
    if (j > 0)
    {
      char c2 = ((e.b)localObject).d();
      int i = ((e.b)localObject).a();
      char c3;
      if (i > 0)
      {
        c3 = ((e.b)localObject).b();
        label88:
        if (!a(new char[] { 65, 69, 73, 74, 79, 85, 89 }, c2)) {
          break label199;
        }
        c1 = '0';
      }
      for (;;)
      {
        if ((c1 != '-') && (((k != c1) && ((c1 != '0') || (k == 47))) || (c1 < '0') || (c1 > '8'))) {
          paramString.a(c1);
        }
        k = c1;
        c1 = c2;
        j = i;
        break;
        c3 = '-';
        break label88;
        label199:
        if ((c2 == 'H') || (c2 < 'A') || (c2 > 'Z'))
        {
          j = i;
          if (k == 47) {
            break;
          }
          c1 = '-';
          continue;
        }
        if ((c2 == 'B') || ((c2 == 'P') && (c3 != 'H')))
        {
          c1 = '1';
        }
        else
        {
          if ((c2 == 'D') || (c2 == 'T')) {
            if (!a(new char[] { 83, 67, 90 }, c3))
            {
              c1 = '2';
              continue;
            }
          }
          if (a(new char[] { 87, 70, 80, 86 }, c2))
          {
            c1 = '3';
          }
          else if (a(new char[] { 71, 75, 81 }, c2))
          {
            c1 = '4';
          }
          else
          {
            if (c2 == 'X') {
              if (!a(new char[] { 67, 75, 81 }, c1))
              {
                ((e.b)localObject).a('S');
                i += 1;
                c1 = '4';
                continue;
              }
            }
            if ((c2 == 'S') || (c2 == 'Z')) {
              c1 = '8';
            } else if (c2 == 'C')
            {
              if (k == 47)
              {
                if (a(new char[] { 65, 72, 75, 76, 79, 81, 82, 85, 88 }, c3)) {
                  c1 = '4';
                } else {
                  c1 = '8';
                }
              }
              else
              {
                if (!a(new char[] { 83, 90 }, c1))
                {
                  if (a(new char[] { 65, 72, 79, 85, 75, 81, 88 }, c3)) {}
                }
                else
                {
                  c1 = '8';
                  continue;
                }
                c1 = '4';
              }
            }
            else if (a(new char[] { 84, 68, 88 }, c2)) {
              c1 = '8';
            } else if (c2 == 'R') {
              c1 = '7';
            } else if (c2 == 'L') {
              c1 = '5';
            } else if ((c2 == 'M') || (c2 == 'N')) {
              c1 = '6';
            } else {
              c1 = c2;
            }
          }
        }
      }
    }
    return paramString.toString();
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    return a(paramString1).equals(a(paramString2));
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new g("This method's parameter was expected to be of the type " + String.class.getName() + ". But actually it was of the type " + paramObject.getClass().getName() + ".");
    }
    return b((String)paramObject);
  }
  
  public String b(String paramString)
  {
    return a(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */