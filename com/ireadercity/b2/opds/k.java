package com.ireadercity.b2.opds;

import android.content.Context;

public final class k
{
  Context a;
  
  public k(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    String str;
    if (paramString2.equals("")) {
      str = "";
    }
    do
    {
      return str;
      str = paramString2;
    } while (paramString2.startsWith("http:"));
    if (paramString2.startsWith("./")) {
      return paramString1.substring(0, paramString1.lastIndexOf("/")) + paramString2.substring(1, paramString2.length());
    }
    if (paramString2.startsWith("../"))
    {
      paramString1 = paramString1.substring(0, paramString1.lastIndexOf("/"));
      return paramString1.substring(0, paramString1.lastIndexOf("/")) + paramString2.substring(2, paramString2.length());
    }
    if (paramString2.startsWith("/"))
    {
      paramString1 = paramString1.substring(paramString1.indexOf("//") + 2, paramString1.lastIndexOf("/") + 1);
      return "http://" + paramString1.substring(0, paramString1.indexOf("/")) + paramString2;
    }
    return paramString1.substring(0, paramString1.lastIndexOf("/") + 1) + paramString2;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */