package com.umeng.common.ufp.util;

import java.io.PrintStream;
import java.security.Key;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;

public class DES
{
  Key a;
  
  public DES()
  {
    a("umeng_exchange");
  }
  
  public DES(String paramString)
  {
    a(paramString);
  }
  
  private byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("DES");
      localCipher.init(1, this.a);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte = paramArrayOfByte;
      throw new RuntimeException("Error initializing SqlMap class. Cause: " + paramArrayOfByte);
    }
    finally {}
  }
  
  private byte[] b(byte[] paramArrayOfByte)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("DES");
      localCipher.init(2, this.a);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte = paramArrayOfByte;
      throw new RuntimeException("Error initializing SqlMap class. Cause: " + paramArrayOfByte);
    }
    finally {}
  }
  
  public static void main(String[] paramArrayOfString)
  {
    Object localObject = new DES();
    paramArrayOfString = ((DES)localObject).b("密文");
    localObject = ((DES)localObject).c(paramArrayOfString);
    System.out.println("密文:" + paramArrayOfString);
    System.out.println("明文:" + (String)localObject);
  }
  
  public void a(String paramString)
  {
    try
    {
      KeyGenerator localKeyGenerator = KeyGenerator.getInstance("DES");
      localKeyGenerator.init(new SecureRandom(paramString.getBytes()));
      this.a = localKeyGenerator.generateKey();
      return;
    }
    catch (Exception paramString)
    {
      throw new RuntimeException("Error initializing SqlMap class. Cause: " + paramString);
    }
  }
  
  public String b(String paramString)
  {
    c localc = new c();
    try
    {
      paramString = localc.m(a(paramString.getBytes("UTF8")));
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString = paramString;
      throw new RuntimeException("Error initializing SqlMap class. Cause: " + paramString);
    }
    finally {}
  }
  
  public String c(String paramString)
  {
    c localc = new c();
    try
    {
      paramString = new String(b(localc.c(paramString)), "UTF8");
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString = paramString;
      throw new RuntimeException("Error initializing SqlMap class. Cause: " + paramString);
    }
    finally {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\util\DES.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */