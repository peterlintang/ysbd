package com.umeng.newxp;

import com.umeng.newxp.common.a.a;
import java.util.Set;

public enum c
{
  private c() {}
  
  public static c a(String paramString)
  {
    try
    {
      paramString = paramString.split("\\.")[0];
      c[] arrayOfc = values();
      int j = arrayOfc.length;
      int i = 0;
      while (i < j)
      {
        c localc = arrayOfc[i];
        boolean bool = localc.toString().equals(paramString);
        if (bool) {
          return localc;
        }
        i += 1;
      }
      return null;
    }
    catch (Exception paramString) {}
  }
  
  public static c a(String paramString, Set<a.a> paramSet)
  {
    int i = 1;
    try
    {
      String[] arrayOfString = paramString.split("\\.");
      paramString = arrayOfString[0];
      if ((arrayOfString.length > 1) && (paramSet != null)) {
        while (i < arrayOfString.length)
        {
          paramSet.add(a.a.a(arrayOfString[i]));
          i += 1;
        }
      }
      paramSet = values();
      int j = paramSet.length;
      i = 0;
      while (i < j)
      {
        arrayOfString = paramSet[i];
        boolean bool = arrayOfString.toString().equals(paramString);
        if (bool) {
          return arrayOfString;
        }
        i += 1;
      }
      return null;
    }
    catch (Exception paramString) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */