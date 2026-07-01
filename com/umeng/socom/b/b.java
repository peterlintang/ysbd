package com.umeng.socom.b;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class b
{
  private static byte[] a = "uLi4/f4+Pb39.T19".getBytes();
  private static byte[] b = "nmeug.f9/Om+L823".getBytes();
  
  public static String a(String paramString1, String paramString2)
  {
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(1, new SecretKeySpec(a, "AES"), new IvParameterSpec(b));
    return c.d(localCipher.doFinal(paramString1.getBytes(paramString2)));
  }
  
  public static String b(String paramString1, String paramString2)
  {
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(2, new SecretKeySpec(a, "AES"), new IvParameterSpec(b));
    return new String(localCipher.doFinal(c.b(paramString1)), paramString2);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */