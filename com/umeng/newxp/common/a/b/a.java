package com.umeng.newxp.common.a.b;

import com.umeng.common.ufp.Log;
import com.umeng.newxp.common.a.a.k;
import com.umeng.newxp.common.a.a.l;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class a
{
  private static final String a = a.class.getName();
  private static final int b = 1024;
  private static final String c = "SHA-1";
  
  private static MessageDigest a()
  {
    return a("MD5");
  }
  
  static MessageDigest a(String paramString)
  {
    try
    {
      paramString = MessageDigest.getInstance(paramString);
      return paramString;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      throw new RuntimeException(paramString.getMessage());
    }
  }
  
  public static byte[] a(InputStream paramInputStream)
  {
    return a(a(), paramInputStream);
  }
  
  private static byte[] a(MessageDigest paramMessageDigest, InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte['Ѐ'];
    for (int i = paramInputStream.read(arrayOfByte, 0, 1024); i >= 0; i = paramInputStream.read(arrayOfByte, 0, 1024)) {
      paramMessageDigest.update(arrayOfByte, 0, i);
    }
    return paramMessageDigest.digest();
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    Object localObject2 = null;
    Object localObject1 = localObject2;
    if (paramArrayOfByte != null)
    {
      localObject1 = localObject2;
      if (paramArrayOfByte.length <= 0) {}
    }
    try
    {
      localObject1 = MessageDigest.getInstance("SHA-1");
      ((MessageDigest)localObject1).update(paramArrayOfByte);
      localObject1 = ((MessageDigest)localObject1).digest();
      return (byte[])localObject1;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      Log.c(a, "SHA-1 encode exception,info:" + paramArrayOfByte.toString());
      return null;
    }
    catch (Exception paramArrayOfByte)
    {
      Log.c(a, "SHA-1 encode exception,info:" + paramArrayOfByte.toString());
    }
    return null;
  }
  
  public static String b(InputStream paramInputStream)
  {
    return k.d(a(paramInputStream));
  }
  
  private static MessageDigest b()
  {
    return a("SHA-256");
  }
  
  public static byte[] b(String paramString)
  {
    return b(l(paramString));
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    return a().digest(paramArrayOfByte);
  }
  
  public static String c(String paramString)
  {
    return k.d(b(paramString));
  }
  
  public static String c(byte[] paramArrayOfByte)
  {
    return k.d(b(paramArrayOfByte));
  }
  
  private static MessageDigest c()
  {
    return a("SHA-384");
  }
  
  public static byte[] c(InputStream paramInputStream)
  {
    return a(e(), paramInputStream);
  }
  
  private static MessageDigest d()
  {
    return a("SHA-512");
  }
  
  public static byte[] d(InputStream paramInputStream)
  {
    return a(b(), paramInputStream);
  }
  
  public static byte[] d(String paramString)
  {
    return d(l(paramString));
  }
  
  public static byte[] d(byte[] paramArrayOfByte)
  {
    return e().digest(paramArrayOfByte);
  }
  
  public static String e(InputStream paramInputStream)
  {
    return k.d(d(paramInputStream));
  }
  
  private static MessageDigest e()
  {
    return a("SHA");
  }
  
  public static byte[] e(String paramString)
  {
    return e(l(paramString));
  }
  
  public static byte[] e(byte[] paramArrayOfByte)
  {
    return b().digest(paramArrayOfByte);
  }
  
  public static String f(String paramString)
  {
    return k.d(e(paramString));
  }
  
  public static String f(byte[] paramArrayOfByte)
  {
    return k.d(e(paramArrayOfByte));
  }
  
  public static byte[] f(InputStream paramInputStream)
  {
    return a(c(), paramInputStream);
  }
  
  public static String g(InputStream paramInputStream)
  {
    return k.d(f(paramInputStream));
  }
  
  public static byte[] g(String paramString)
  {
    return g(l(paramString));
  }
  
  public static byte[] g(byte[] paramArrayOfByte)
  {
    return c().digest(paramArrayOfByte);
  }
  
  public static String h(String paramString)
  {
    return k.d(g(paramString));
  }
  
  public static String h(byte[] paramArrayOfByte)
  {
    return k.d(g(paramArrayOfByte));
  }
  
  public static byte[] h(InputStream paramInputStream)
  {
    return a(d(), paramInputStream);
  }
  
  public static String i(InputStream paramInputStream)
  {
    return k.d(h(paramInputStream));
  }
  
  public static byte[] i(String paramString)
  {
    return i(l(paramString));
  }
  
  public static byte[] i(byte[] paramArrayOfByte)
  {
    return d().digest(paramArrayOfByte);
  }
  
  public static String j(InputStream paramInputStream)
  {
    return k.d(c(paramInputStream));
  }
  
  public static String j(String paramString)
  {
    return k.d(i(paramString));
  }
  
  public static String j(byte[] paramArrayOfByte)
  {
    return k.d(i(paramArrayOfByte));
  }
  
  public static String k(String paramString)
  {
    return k.d(d(paramString));
  }
  
  public static String k(byte[] paramArrayOfByte)
  {
    return k.d(d(paramArrayOfByte));
  }
  
  private static byte[] l(String paramString)
  {
    return l.f(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */