package com.umeng.newxp.common.a.d;

import com.umeng.newxp.common.a.a;
import com.umeng.newxp.common.a.a.l;
import com.umeng.newxp.common.a.b;
import com.umeng.newxp.common.a.e;
import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.h;
import com.umeng.newxp.common.a.i;
import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;

public class c
  implements a, b, h, i
{
  private static final BitSet b = new BitSet(256);
  private static final byte c = 61;
  private static final byte d = 9;
  private static final byte e = 32;
  private final String a;
  
  static
  {
    int i = 33;
    while (i <= 60)
    {
      b.set(i);
      i += 1;
    }
    i = 62;
    while (i <= 126)
    {
      b.set(i);
      i += 1;
    }
    b.set(9);
    b.set(32);
  }
  
  public c()
  {
    this("UTF-8");
  }
  
  public c(String paramString)
  {
    this.a = paramString;
  }
  
  private static final void a(int paramInt, ByteArrayOutputStream paramByteArrayOutputStream)
  {
    paramByteArrayOutputStream.write(61);
    int i = Character.toUpperCase(Character.forDigit(paramInt >> 4 & 0xF, 16));
    paramInt = Character.toUpperCase(Character.forDigit(paramInt & 0xF, 16));
    paramByteArrayOutputStream.write(i);
    paramByteArrayOutputStream.write(paramInt);
  }
  
  public static final byte[] a(BitSet paramBitSet, byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    BitSet localBitSet = paramBitSet;
    if (paramBitSet == null) {
      localBitSet = b;
    }
    paramBitSet = new ByteArrayOutputStream();
    int m = paramArrayOfByte.length;
    int i = 0;
    if (i < m)
    {
      int k = paramArrayOfByte[i];
      int j = k;
      if (k < 0) {
        j = k + 256;
      }
      if (localBitSet.get(j)) {
        paramBitSet.write(j);
      }
      for (;;)
      {
        i += 1;
        break;
        a(j, paramBitSet);
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
      if (j == 61) {
        i += 1;
      }
      for (;;)
      {
        try
        {
          j = f.a(paramArrayOfByte[i]);
          i += 1;
          localByteArrayOutputStream.write((char)((j << 4) + f.a(paramArrayOfByte[i])));
          i += 1;
        }
        catch (ArrayIndexOutOfBoundsException paramArrayOfByte)
        {
          throw new e("Invalid quoted-printable encoding", paramArrayOfByte);
        }
        localByteArrayOutputStream.write(j);
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
    throw new e("Objects of type " + paramObject.getClass().getName() + " cannot be quoted-printable decoded");
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String a(String paramString)
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
      throw new e(paramString.getMessage(), paramString);
    }
  }
  
  public String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    return new String(a(l.b(paramString1)), paramString2);
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
    throw new g("Objects of type " + paramObject.getClass().getName() + " cannot be quoted-printable encoded");
  }
  
  public String b(String paramString)
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
      throw new g(paramString.getMessage(), paramString);
    }
  }
  
  public String b(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    return l.b(b(paramString1.getBytes(paramString2)));
  }
  
  public byte[] b(byte[] paramArrayOfByte)
  {
    return a(b, paramArrayOfByte);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\d\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */