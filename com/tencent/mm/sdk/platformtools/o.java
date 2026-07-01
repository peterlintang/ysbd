package com.tencent.mm.sdk.platformtools;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import java.io.ByteArrayOutputStream;
import java.util.TimeZone;

public final class o
{
  private static final long[] a = { 300L, 200L, 300L, 200L };
  private static final TimeZone b = TimeZone.getTimeZone("GMT");
  private static final char[] c = { 9, 10, 13 };
  private static final char[] d = { 60, 62, 34, 39, 38 };
  private static final String[] e = { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;" };
  
  public static String a(String paramString)
  {
    String str = paramString;
    if (paramString == null) {
      str = "";
    }
    return str;
  }
  
  public static boolean a(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte == null) || (paramArrayOfByte.length <= 0);
  }
  
  public static byte[] a(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramBitmap.compress(Bitmap.CompressFormat.JPEG, 100, localByteArrayOutputStream);
    paramBitmap.recycle();
    paramBitmap = localByteArrayOutputStream.toByteArray();
    try
    {
      localByteArrayOutputStream.close();
      return paramBitmap;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return paramBitmap;
  }
  
  public static boolean b(String paramString)
  {
    return (paramString == null) || (paramString.length() <= 0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */