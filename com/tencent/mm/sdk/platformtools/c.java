package com.tencent.mm.sdk.platformtools;

import android.os.Build;
import android.os.Build.VERSION;
import java.io.PrintStream;

public final class c
{
  private static int a = 6;
  private static PrintStream b;
  private static byte[] c = null;
  private static final String d;
  
  static
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("VERSION.RELEASE:[" + Build.VERSION.RELEASE);
    localStringBuilder.append("] VERSION.CODENAME:[" + Build.VERSION.CODENAME);
    localStringBuilder.append("] VERSION.INCREMENTAL:[" + Build.VERSION.INCREMENTAL);
    localStringBuilder.append("] BOARD:[" + Build.BOARD);
    localStringBuilder.append("] DEVICE:[" + Build.DEVICE);
    localStringBuilder.append("] DISPLAY:[" + Build.DISPLAY);
    localStringBuilder.append("] FINGERPRINT:[" + Build.FINGERPRINT);
    localStringBuilder.append("] HOST:[" + Build.HOST);
    localStringBuilder.append("] MANUFACTURER:[" + Build.MANUFACTURER);
    localStringBuilder.append("] MODEL:[" + Build.MODEL);
    localStringBuilder.append("] PRODUCT:[" + Build.PRODUCT);
    localStringBuilder.append("] TAGS:[" + Build.TAGS);
    localStringBuilder.append("] TYPE:[" + Build.TYPE);
    localStringBuilder.append("] USER:[" + Build.USER + "]");
    d = localStringBuilder.toString();
  }
  
  public static void a(String paramString1, String paramString2)
  {
    if (a <= 4) {
      d.a(b, c, "E/" + paramString1, paramString2);
    }
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if (a <= 2) {
      d.a(b, c, "I/" + paramString1, paramString2);
    }
  }
  
  public static void c(String paramString1, String paramString2)
  {
    if (a <= 1) {
      d.a(b, c, "D/" + paramString1, paramString2);
    }
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if (a <= 0) {
      d.a(b, c, "V/" + paramString1, paramString2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */