package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.i;
import java.util.Locale;

public class g
  implements i
{
  private static final String a = "AEIOU";
  private static final String b = "EIY";
  private static final String c = "CSPTG";
  private int d = 4;
  
  private boolean a(int paramInt1, int paramInt2)
  {
    return paramInt2 + 1 == paramInt1;
  }
  
  private boolean a(StringBuffer paramStringBuffer, int paramInt)
  {
    return "AEIOU".indexOf(paramStringBuffer.charAt(paramInt)) >= 0;
  }
  
  private boolean a(StringBuffer paramStringBuffer, int paramInt, char paramChar)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt > 0)
    {
      bool1 = bool2;
      if (paramInt < paramStringBuffer.length())
      {
        bool1 = bool2;
        if (paramStringBuffer.charAt(paramInt - 1) == paramChar) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  private boolean a(StringBuffer paramStringBuffer, int paramInt, String paramString)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= 0)
    {
      bool1 = bool2;
      if (paramString.length() + paramInt - 1 < paramStringBuffer.length()) {
        bool1 = paramStringBuffer.substring(paramInt, paramString.length() + paramInt).equals(paramString);
      }
    }
    return bool1;
  }
  
  private boolean b(StringBuffer paramStringBuffer, int paramInt, char paramChar)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramInt >= 0)
    {
      bool1 = bool2;
      if (paramInt < paramStringBuffer.length() - 1)
      {
        bool1 = bool2;
        if (paramStringBuffer.charAt(paramInt + 1) == paramChar) {
          bool1 = true;
        }
      }
    }
    return bool1;
  }
  
  public int a()
  {
    return this.d;
  }
  
  public String a(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return "";
    }
    if (paramString.length() == 1) {
      return paramString.toUpperCase(Locale.ENGLISH);
    }
    paramString = paramString.toUpperCase(Locale.ENGLISH).toCharArray();
    StringBuffer localStringBuffer1 = new StringBuffer(40);
    StringBuffer localStringBuffer2 = new StringBuffer(10);
    int k;
    int i;
    label140:
    char c1;
    int j;
    switch (paramString[0])
    {
    default: 
      localStringBuffer1.append(paramString);
      k = localStringBuffer1.length();
      i = 0;
      if ((localStringBuffer2.length() >= a()) || (i >= k)) {
        break label1439;
      }
      c1 = localStringBuffer1.charAt(i);
      if (c1 != 'C')
      {
        j = i;
        if (a(localStringBuffer1, i, c1)) {
          break;
        }
      }
      else
      {
        switch (c1)
        {
        default: 
          j = i;
        }
      }
      break;
    }
    for (;;)
    {
      j += 1;
      i = j;
      if (localStringBuffer2.length() <= a()) {
        break label140;
      }
      localStringBuffer2.setLength(a());
      i = j;
      break label140;
      if (paramString[1] == 'N')
      {
        localStringBuffer1.append(paramString, 1, paramString.length - 1);
        break;
      }
      localStringBuffer1.append(paramString);
      break;
      if (paramString[1] == 'E')
      {
        localStringBuffer1.append(paramString, 1, paramString.length - 1);
        break;
      }
      localStringBuffer1.append(paramString);
      break;
      if (paramString[1] == 'R')
      {
        localStringBuffer1.append(paramString, 1, paramString.length - 1);
        break;
      }
      if (paramString[1] == 'H')
      {
        localStringBuffer1.append(paramString, 1, paramString.length - 1);
        localStringBuffer1.setCharAt(0, 'W');
        break;
      }
      localStringBuffer1.append(paramString);
      break;
      paramString[0] = 83;
      localStringBuffer1.append(paramString);
      break;
      j = i;
      if (i == 0)
      {
        localStringBuffer2.append(c1);
        j = i;
        continue;
        if (a(localStringBuffer1, i, 'M'))
        {
          j = i;
          if (a(k, i)) {}
        }
        else
        {
          localStringBuffer2.append(c1);
          j = i;
          continue;
          if ((a(localStringBuffer1, i, 'S')) && (!a(k, i)))
          {
            j = i;
            if ("EIY".indexOf(localStringBuffer1.charAt(i + 1)) >= 0) {}
          }
          else if (a(localStringBuffer1, i, "CIA"))
          {
            localStringBuffer2.append('X');
            j = i;
          }
          else if ((!a(k, i)) && ("EIY".indexOf(localStringBuffer1.charAt(i + 1)) >= 0))
          {
            localStringBuffer2.append('S');
            j = i;
          }
          else if ((a(localStringBuffer1, i, 'S')) && (b(localStringBuffer1, i, 'H')))
          {
            localStringBuffer2.append('K');
            j = i;
          }
          else if (b(localStringBuffer1, i, 'H'))
          {
            if ((i == 0) && (k >= 3) && (a(localStringBuffer1, 2)))
            {
              localStringBuffer2.append('K');
              j = i;
            }
            else
            {
              localStringBuffer2.append('X');
              j = i;
            }
          }
          else
          {
            localStringBuffer2.append('K');
            j = i;
            continue;
            if ((!a(k, i + 1)) && (b(localStringBuffer1, i, 'G')) && ("EIY".indexOf(localStringBuffer1.charAt(i + 2)) >= 0))
            {
              localStringBuffer2.append('J');
              j = i + 2;
            }
            else
            {
              localStringBuffer2.append('T');
              j = i;
              continue;
              if (a(k, i + 1))
              {
                j = i;
                if (b(localStringBuffer1, i, 'H')) {}
              }
              else if ((!a(k, i + 1)) && (b(localStringBuffer1, i, 'H')))
              {
                j = i;
                if (!a(localStringBuffer1, i + 2)) {}
              }
              else if (i > 0)
              {
                j = i;
                if (!a(localStringBuffer1, i, "GN"))
                {
                  j = i;
                  if (a(localStringBuffer1, i, "GNED")) {}
                }
              }
              else
              {
                if (a(localStringBuffer1, i, 'G')) {}
                for (j = 1;; j = 0)
                {
                  if ((a(k, i)) || ("EIY".indexOf(localStringBuffer1.charAt(i + 1)) < 0) || (j != 0)) {
                    break label1001;
                  }
                  localStringBuffer2.append('J');
                  j = i;
                  break;
                }
                label1001:
                localStringBuffer2.append('K');
                j = i;
                continue;
                j = i;
                if (!a(k, i)) {
                  if (i > 0)
                  {
                    j = i;
                    if ("CSPTG".indexOf(localStringBuffer1.charAt(i - 1)) >= 0) {}
                  }
                  else
                  {
                    j = i;
                    if (a(localStringBuffer1, i + 1))
                    {
                      localStringBuffer2.append('H');
                      j = i;
                      continue;
                      localStringBuffer2.append(c1);
                      j = i;
                      continue;
                      if (i > 0)
                      {
                        j = i;
                        if (!a(localStringBuffer1, i, 'C'))
                        {
                          localStringBuffer2.append(c1);
                          j = i;
                        }
                      }
                      else
                      {
                        localStringBuffer2.append(c1);
                        j = i;
                        continue;
                        if (b(localStringBuffer1, i, 'H'))
                        {
                          localStringBuffer2.append('F');
                          j = i;
                        }
                        else
                        {
                          localStringBuffer2.append(c1);
                          j = i;
                          continue;
                          localStringBuffer2.append('K');
                          j = i;
                          continue;
                          if ((a(localStringBuffer1, i, "SH")) || (a(localStringBuffer1, i, "SIO")) || (a(localStringBuffer1, i, "SIA")))
                          {
                            localStringBuffer2.append('X');
                            j = i;
                          }
                          else
                          {
                            localStringBuffer2.append('S');
                            j = i;
                            continue;
                            if ((a(localStringBuffer1, i, "TIA")) || (a(localStringBuffer1, i, "TIO")))
                            {
                              localStringBuffer2.append('X');
                              j = i;
                            }
                            else
                            {
                              j = i;
                              if (!a(localStringBuffer1, i, "TCH")) {
                                if (a(localStringBuffer1, i, "TH"))
                                {
                                  localStringBuffer2.append('0');
                                  j = i;
                                }
                                else
                                {
                                  localStringBuffer2.append('T');
                                  j = i;
                                  continue;
                                  localStringBuffer2.append('F');
                                  j = i;
                                  continue;
                                  j = i;
                                  if (!a(k, i))
                                  {
                                    j = i;
                                    if (a(localStringBuffer1, i + 1))
                                    {
                                      localStringBuffer2.append(c1);
                                      j = i;
                                      continue;
                                      localStringBuffer2.append('K');
                                      localStringBuffer2.append('S');
                                      j = i;
                                      continue;
                                      localStringBuffer2.append('S');
                                      j = i;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
    label1439:
    return localStringBuffer2.toString();
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    return a(paramString1).equals(a(paramString2));
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new com.umeng.newxp.common.a.g("Parameter supplied to Metaphone encode is not of type java.lang.String");
    }
    return a((String)paramObject);
  }
  
  public String b(String paramString)
  {
    return a(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */