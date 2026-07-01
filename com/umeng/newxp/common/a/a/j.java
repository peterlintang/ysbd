package com.umeng.newxp.common.a.a;

import com.umeng.newxp.common.a.a;
import com.umeng.newxp.common.a.b;
import com.umeng.newxp.common.a.e;
import com.umeng.newxp.common.a.g;

public class j
  implements a, b
{
  private static final char[] a = new char[0];
  private static final byte[] b = new byte[0];
  private static final int c = 1;
  private static final int d = 2;
  private static final int e = 4;
  private static final int f = 8;
  private static final int g = 16;
  private static final int h = 32;
  private static final int i = 64;
  private static final int j = 128;
  private static final int[] k = { 1, 2, 4, 8, 16, 32, 64, 128 };
  
  public static byte[] a(char[] paramArrayOfChar)
  {
    if ((paramArrayOfChar == null) || (paramArrayOfChar.length == 0)) {
      return b;
    }
    byte[] arrayOfByte = new byte[paramArrayOfChar.length >> 3];
    int m = paramArrayOfChar.length - 1;
    int n = 0;
    while (n < arrayOfByte.length)
    {
      int i1 = 0;
      while (i1 < k.length)
      {
        if (paramArrayOfChar[(m - i1)] == '1') {
          arrayOfByte[n] = ((byte)(arrayOfByte[n] | k[i1]));
        }
        i1 += 1;
      }
      n += 1;
      m -= 8;
    }
    return arrayOfByte;
  }
  
  public static byte[] c(byte[] paramArrayOfByte)
  {
    if (g(paramArrayOfByte)) {
      return b;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length >> 3];
    int m = paramArrayOfByte.length - 1;
    int n = 0;
    while (n < arrayOfByte.length)
    {
      int i1 = 0;
      while (i1 < k.length)
      {
        if (paramArrayOfByte[(m - i1)] == 49) {
          arrayOfByte[n] = ((byte)(arrayOfByte[n] | k[i1]));
        }
        i1 += 1;
      }
      n += 1;
      m -= 8;
    }
    return arrayOfByte;
  }
  
  public static byte[] d(byte[] paramArrayOfByte)
  {
    if (g(paramArrayOfByte)) {
      return b;
    }
    byte[] arrayOfByte = new byte[paramArrayOfByte.length << 3];
    int m = arrayOfByte.length - 1;
    int n = 0;
    while (n < paramArrayOfByte.length)
    {
      int i1 = 0;
      if (i1 < k.length)
      {
        if ((paramArrayOfByte[n] & k[i1]) == 0) {
          arrayOfByte[(m - i1)] = 48;
        }
        for (;;)
        {
          i1 += 1;
          break;
          arrayOfByte[(m - i1)] = 49;
        }
      }
      n += 1;
      m -= 8;
    }
    return arrayOfByte;
  }
  
  public static char[] e(byte[] paramArrayOfByte)
  {
    if (g(paramArrayOfByte)) {
      return a;
    }
    char[] arrayOfChar = new char[paramArrayOfByte.length << 3];
    int m = arrayOfChar.length - 1;
    int n = 0;
    while (n < paramArrayOfByte.length)
    {
      int i1 = 0;
      if (i1 < k.length)
      {
        if ((paramArrayOfByte[n] & k[i1]) == 0) {
          arrayOfChar[(m - i1)] = '0';
        }
        for (;;)
        {
          i1 += 1;
          break;
          arrayOfChar[(m - i1)] = '1';
        }
      }
      n += 1;
      m -= 8;
    }
    return arrayOfChar;
  }
  
  public static String f(byte[] paramArrayOfByte)
  {
    return new String(e(paramArrayOfByte));
  }
  
  private static boolean g(byte[] paramArrayOfByte)
  {
    return (paramArrayOfByte == null) || (paramArrayOfByte.length == 0);
  }
  
  public Object a(Object paramObject)
  {
    if (paramObject == null) {
      return b;
    }
    if ((paramObject instanceof byte[])) {
      return c((byte[])paramObject);
    }
    if ((paramObject instanceof char[])) {
      return a((char[])paramObject);
    }
    if ((paramObject instanceof String)) {
      return a(((String)paramObject).toCharArray());
    }
    throw new e("argument not a byte array");
  }
  
  public byte[] a(String paramString)
  {
    if (paramString == null) {
      return b;
    }
    return a(paramString.toCharArray());
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    return c(paramArrayOfByte);
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof byte[])) {
      throw new g("argument not a byte array");
    }
    return e((byte[])paramObject);
  }
  
  public byte[] b(byte[] paramArrayOfByte)
  {
    return d(paramArrayOfByte);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */