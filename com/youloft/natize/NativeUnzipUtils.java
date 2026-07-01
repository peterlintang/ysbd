package com.youloft.natize;

public class NativeUnzipUtils
{
  static
  {
    System.loadLibrary("jniunzip");
  }
  
  public static synchronized native int upZipFile(String paramString1, String paramString2);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\youloft\natize\NativeUnzipUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */