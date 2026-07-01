package com.tencent.mm.sdk.openapi;

import android.content.Context;

public final class n
{
  private static n a = null;
  
  public static e a(Context paramContext, String paramString)
  {
    if (a == null) {
      a = new n();
    }
    return new o(paramContext, paramString);
  }
  
  public static e b(Context paramContext, String paramString)
  {
    if (a == null) {
      a = new n();
    }
    return new o(paramContext, paramString, (byte)0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\openapi\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */