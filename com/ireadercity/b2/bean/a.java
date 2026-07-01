package com.ireadercity.b2.bean;

import com.ireadercity.b2.h.y;
import java.util.ArrayList;

public final class a
{
  public static ArrayList<a> f = c(com.ireadercity.b2.a.ah);
  public String a;
  public String b;
  public float c;
  public int d;
  public int e;
  
  public static void a(String paramString)
  {
    f = c(paramString);
  }
  
  private static a b(String paramString)
  {
    String[] arrayOfString = paramString.split(":");
    paramString = new a();
    try
    {
      paramString.a = arrayOfString[0];
      paramString.b = arrayOfString[1];
      paramString.c = Float.parseFloat(arrayOfString[2]);
      paramString.d = Integer.parseInt(arrayOfString[3]);
      paramString.e = Integer.parseInt(arrayOfString[4]);
      return paramString;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramString;
  }
  
  private static ArrayList<a> c(String paramString)
  {
    if ((paramString == null) || (y.d(paramString))) {
      return null;
    }
    paramString = paramString.split(":::");
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    while (i < paramString.length)
    {
      a locala = b(paramString[i]);
      if (locala.e == 1) {
        localArrayList.add(locala);
      }
      i += 1;
    }
    return localArrayList;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\bean\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */