package com.ireadercity.b2.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Color;
import com.ireadercity.b2.a;
import com.ireadercity.b2.h.y;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class t
{
  private static String a = "OwenLinTechCoLTD";
  private static int b = 256;
  private static int c = 50;
  private static int d = 24;
  private static Cipher e = null;
  private static SecretKey f;
  private static IvParameterSpec g;
  private static String h = "AES/CBC/NoPadding";
  private static String i = "AES";
  private static byte[] j = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
  
  public static int a()
  {
    return b;
  }
  
  public static int a(long paramLong)
  {
    long l = paramLong / c;
    paramLong = l;
    if (l < b) {
      paramLong = b;
    }
    new StringBuilder("width=").append((int)paramLong).toString();
    return (int)paramLong;
  }
  
  private static String a(Bitmap paramBitmap)
  {
    int m;
    int i1;
    int i4;
    int k;
    int i2;
    int i3;
    try
    {
      if ((paramBitmap.getHeight() < d) || (paramBitmap.getWidth() < d)) {
        break label169;
      }
      localStringBuilder = new StringBuilder();
      m = 0;
    }
    catch (Exception paramBitmap)
    {
      StringBuilder localStringBuilder;
      return null;
    }
    if (i1 < 8)
    {
      i4 = m * 8 + i1;
      k = i4 / (d * 3);
      i2 = i4 / 3;
      i3 = d;
      i4 %= 3;
      i3 = paramBitmap.getPixel(i2 % i3, k);
      k = Color.red(i3);
      i2 = Color.green(i3);
      i3 = Color.blue(i3);
      if (i4 != 0) {
        break label198;
      }
    }
    for (;;)
    {
      i2 = n;
      if ((k & 0x1) == 1)
      {
        i2 = n | (int)Math.pow(2.0D, i1);
        break label186;
        localStringBuilder.append((char)n);
        m += 1;
        label169:
        while (m >= 216)
        {
          paramBitmap = localStringBuilder.toString();
          return paramBitmap;
          return null;
        }
        i1 = 0;
        n = 0;
        break;
      }
      label186:
      i1 += 1;
      int n = i2;
      break;
      label198:
      if (i4 == 1) {
        k = i2;
      } else {
        k = i3;
      }
    }
  }
  
  public static String a(com.ireadercity.b2.bean.b paramb)
  {
    String str2 = null;
    if (!y.d(paramb.g()))
    {
      new StringBuilder("book.getKey()=").append(paramb.g()).toString();
      str2 = paramb.g();
    }
    String str1;
    for (;;)
    {
      return str2;
      try
      {
        str1 = b(y.g(paramb.l()), a);
        if (str1 == null)
        {
          str1 = null;
          label59:
          new StringBuilder("keyFromPath=").append(str1).toString();
          if (!y.d(str1)) {
            break;
          }
          str1 = e(paramb.r());
          if (str1 != null) {
            break label140;
          }
          str1 = null;
        }
        while (!y.d(str1))
        {
          new StringBuilder("keyFromCover=").append(str1).toString();
          paramb.b(str1);
          return str1;
          str1 = str1.split(":::")[0];
          break label59;
          label140:
          Object localObject = str1.split(":::");
          str1 = localObject[0];
          localObject = localObject[1];
          new StringBuilder("key=").append(str1).append(" deviceID=").append((String)localObject).append(" Macro.DEVICEID=").append(a.F).toString();
        }
        paramb.b(str1);
      }
      catch (Exception paramb)
      {
        paramb.printStackTrace();
        return null;
      }
    }
    return str1;
  }
  
  public static String a(String paramString)
  {
    String str = paramString;
    if (paramString.length() < 16) {
      str = String.format("%1$-16s", new Object[] { paramString });
    }
    return a(str, a);
  }
  
  private static String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    try
    {
      paramString1 = b.a(d(paramString1.getBytes("UTF-8"), paramString2));
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
  
  public static void a(byte[] paramArrayOfByte, String paramString)
  {
    byte[] arrayOfByte = new byte[b];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, b);
    System.arraycopy(c(arrayOfByte, paramString), 0, paramArrayOfByte, 0, b);
  }
  
  public static String b(String paramString)
  {
    return b(paramString, a).trim();
  }
  
  private static String b(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    try
    {
      paramString1 = b.a(paramString1);
      new StringBuilder("passPhrase=").append(paramString2).toString();
      paramString1 = new String(c(paramString1, paramString2), "UTF-8");
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  private static void b()
  {
    try
    {
      e = Cipher.getInstance(h);
      return;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      new StringBuilder("No such algorithm ").append(i).toString();
      return;
    }
    catch (NoSuchPaddingException localNoSuchPaddingException) {}
  }
  
  public static void b(byte[] paramArrayOfByte, String paramString)
  {
    int n = paramArrayOfByte.length;
    int m = n / c;
    int k = m;
    if (m < b) {
      k = b;
    }
    m = 0;
    while ((m < c) && (k * m + b < n))
    {
      byte[] arrayOfByte = new byte[b];
      System.arraycopy(paramArrayOfByte, k * m, arrayOfByte, 0, b);
      System.arraycopy(c(arrayOfByte, paramString), 0, paramArrayOfByte, k * m, b);
      m += 1;
    }
  }
  
  public static String c(String paramString)
  {
    return a(paramString, a);
  }
  
  private static byte[] c(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      b();
      f = new SecretKeySpec(paramString.getBytes("UTF-8"), i);
      if (g == null) {
        g = new IvParameterSpec(j);
      }
      e.init(2, f, g);
      try
      {
        paramArrayOfByte = e.doFinal(paramArrayOfByte);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        return null;
      }
      return null;
    }
    catch (Exception paramArrayOfByte) {}
  }
  
  public static String d(String paramString)
  {
    return b(paramString, a);
  }
  
  private static byte[] d(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      b();
      f = new SecretKeySpec(paramString.getBytes("UTF-8"), i);
      if (g == null) {
        g = new IvParameterSpec(j);
      }
      e.init(1, f, g);
      try
      {
        paramArrayOfByte = e.doFinal(paramArrayOfByte);
        return paramArrayOfByte;
      }
      catch (Exception paramArrayOfByte)
      {
        return null;
      }
      return null;
    }
    catch (Exception paramArrayOfByte) {}
  }
  
  private static String e(String paramString)
  {
    Object localObject = new BitmapFactory.Options();
    ((BitmapFactory.Options)localObject).inDither = false;
    ((BitmapFactory.Options)localObject).inScaled = false;
    ((BitmapFactory.Options)localObject).inPreferredConfig = Bitmap.Config.ARGB_8888;
    try
    {
      paramString = BitmapFactory.decodeFile(paramString, (BitmapFactory.Options)localObject);
      localObject = b(a(paramString).trim(), a).trim();
      paramString.recycle();
      return (String)localObject;
    }
    catch (OutOfMemoryError paramString)
    {
      System.gc();
      paramString.printStackTrace();
    }
    return "";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\b\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */