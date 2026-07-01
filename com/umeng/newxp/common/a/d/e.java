package com.umeng.newxp.common.a.d;

import com.umeng.newxp.common.a.a;
import com.umeng.newxp.common.a.a.l;
import com.umeng.newxp.common.a.b;
import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.h;
import com.umeng.newxp.common.a.i;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;

public class e
  implements a, b, h, i
{
  static final int a = 16;
  protected static final byte c = 37;
  protected static final BitSet d = new BitSet(256);
  protected String b;
  
  static
  {
    int i = 97;
    while (i <= 122)
    {
      d.set(i);
      i += 1;
    }
    i = 65;
    while (i <= 90)
    {
      d.set(i);
      i += 1;
    }
    i = 48;
    while (i <= 57)
    {
      d.set(i);
      i += 1;
    }
    d.set(45);
    d.set(95);
    d.set(46);
    d.set(42);
    d.set(32);
  }
  
  public e()
  {
    this("UTF-8");
  }
  
  public e(String paramString)
  {
    this.b = paramString;
  }
  
  public static final byte[] a(BitSet paramBitSet, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    BitSet localBitSet = paramBitSet;
    if (paramBitSet == null) {
      localBitSet = d;
    }
    paramBitSet = new ByteArrayOutputStream();
    int m = paramArrayOfByte.length;
    int j = 0;
    if (j < m)
    {
      int k = paramArrayOfByte[j];
      int i = k;
      if (k < 0) {
        i = k + 256;
      }
      if (localBitSet.get(i))
      {
        k = i;
        if (i == 32) {
          k = 43;
        }
        paramBitSet.write(k);
      }
      for (;;)
      {
        j += 1;
        break;
        paramBitSet.write(37);
        k = Character.toUpperCase(Character.forDigit(i >> 4 & 0xF, 16));
        i = Character.toUpperCase(Character.forDigit(i & 0xF, 16));
        paramBitSet.write(k);
        paramBitSet.write(i);
      }
    }
    return paramBitSet.toByteArray();
  }
  
  public static final byte[] c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int i = 0;
    if (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i];
      if (j == 43) {
        localByteArrayOutputStream.write(32);
      }
      for (;;)
      {
        i += 1;
        break;
        if (j == 37)
        {
          i += 1;
          try
          {
            j = f.a(paramArrayOfByte[i]);
            i += 1;
            localByteArrayOutputStream.write((char)((j << 4) + f.a(paramArrayOfByte[i])));
          }
          catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
          {
            throw new com.umeng.newxp.common.a.e("Invalid URL encoding: ", paramArrayOfByte);
          }
        }
        else
        {
          localByteArrayOutputStream.write(j);
        }
      }
    }
    return localByteArrayOutputStream.toByteArray();
  }
  
  public Object a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof byte[])) {
      return a((byte[])paramObject);
    }
    if ((paramObject instanceof String)) {
      return a((String)paramObject);
    }
    throw new com.umeng.newxp.common.a.e("Objects of type " + paramObject.getClass().getName() + " cannot be URL decoded");
  }
  
  public String a()
  {
    return this.b;
  }
  
  public String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = b(paramString, a());
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new com.umeng.newxp.common.a.e(paramString.getMessage(), paramString);
    }
  }
  
  public String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    return l.b(b(paramString1.getBytes(paramString2)));
  }
  
  public byte[] a(byte[] paramArrayOfByte)
  {
    return c(paramArrayOfByte);
  }
  
  public Object b(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof byte[])) {
      return b((byte[])paramObject);
    }
    if ((paramObject instanceof String)) {
      return b((String)paramObject);
    }
    throw new g("Objects of type " + paramObject.getClass().getName() + " cannot be URL encoded");
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = a(paramString, a());
      return paramString;
    }
    catch (UnsupportedEncodingException paramString)
    {
      throw new g(paramString.getMessage(), paramString);
    }
  }
  
  public String b(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    return new String(a(l.b(paramString1)), paramString2);
  }
  
  public byte[] b(byte[] paramArrayOfByte)
  {
    return a(d, paramArrayOfByte);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */