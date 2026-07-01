package com.ireadercity.b2.h;

import a.a.a.c;
import com.ireadercity.b2.bean.b;
import java.util.Comparator;

public final class a
  implements Comparator<b>
{
  private int a = 10011;
  
  public a(int paramInt)
  {
    this.a = paramInt;
  }
  
  private int a(b paramb1, b paramb2)
  {
    int j = -1;
    try
    {
      switch (this.a)
      {
      default: 
        i = j;
        if (paramb1.k() == null) {
          break label305;
        }
        i = j;
        if (paramb1.k().trim().length() <= 0) {
          break label305;
        }
        if ((paramb2.k() == null) || (paramb2.k().trim().length() <= 0)) {
          break label322;
        }
        char c1 = paramb1.k().charAt(0);
        char c2 = paramb2.k().charAt(0);
        paramb1 = c.a(c1);
        paramb2 = c.a(c2);
        if (paramb2 == null) {
          return 1;
        }
        i = j;
        if (paramb1 == null) {
          break label305;
        }
        return a(paramb1).compareTo(a(paramb2));
      }
    }
    catch (Exception paramb1)
    {
      label139:
      long l1;
      paramb1.printStackTrace();
      return 0;
    }
    int i = j;
    if (paramb1.s() != null)
    {
      i = j;
      if (!"".equals(paramb1.s().trim()))
      {
        if ((paramb2.s() == null) || ("".equals(paramb2.s().trim()))) {
          break label338;
        }
        l1 = Long.parseLong(paramb1.s());
        return (int)(Long.parseLong(paramb2.s()) - l1);
      }
    }
    label305:
    label322:
    label338:
    do
    {
      i = j;
      if (paramb1.f() != null)
      {
        i = j;
        if (!"".equals(paramb1.f().trim()))
        {
          if ((paramb2.f() == null) || ("".equals(paramb2.f().trim()))) {
            break label354;
          }
          l1 = Long.parseLong(paramb1.s());
          long l2 = Long.parseLong(paramb2.s());
          return (int)(l2 - l1);
          i = 0;
        }
      }
      do
      {
        do
        {
          do
          {
            return i;
            i = j;
          } while (paramb1 == null);
          if (paramb2 != null) {
            break;
          }
          return 1;
          return 1;
          i = j;
        } while (paramb1 == null);
        if (paramb2 != null) {
          break label139;
        }
        return 1;
        return 1;
        i = j;
      } while (paramb1 == null);
    } while (paramb2 != null);
    return 1;
    label354:
    return 1;
  }
  
  private static String a(String[] paramArrayOfString)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if ((paramArrayOfString != null) && (paramArrayOfString.length > 0))
    {
      int i = 0;
      while (i < paramArrayOfString.length)
      {
        localStringBuffer.append(paramArrayOfString[i]);
        i += 1;
      }
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */