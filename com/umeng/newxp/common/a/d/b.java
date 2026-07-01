package com.umeng.newxp.common.a.d;

import com.umeng.newxp.common.a.e;
import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.h;
import com.umeng.newxp.common.a.i;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;

public class b
  extends d
  implements h, i
{
  private static final BitSet e;
  private static final byte f = 32;
  private static final byte g = 95;
  private final String d;
  private boolean h = false;
  
  static
  {
    BitSet localBitSet = new BitSet(256);
    e = localBitSet;
    localBitSet.set(32);
    e.set(33);
    e.set(34);
    e.set(35);
    e.set(36);
    e.set(37);
    e.set(38);
    e.set(39);
    e.set(40);
    e.set(41);
    e.set(42);
    e.set(43);
    e.set(44);
    e.set(45);
    e.set(46);
    e.set(47);
    int i = 48;
    while (i <= 57)
    {
      e.set(i);
      i += 1;
    }
    e.set(58);
    e.set(59);
    e.set(60);
    e.set(62);
    e.set(64);
    i = 65;
    while (i <= 90)
    {
      e.set(i);
      i += 1;
    }
    e.set(91);
    e.set(92);
    e.set(93);
    e.set(94);
    e.set(96);
    i = 97;
    while (i <= 122)
    {
      e.set(i);
      i += 1;
    }
    e.set(123);
    e.set(124);
    e.set(125);
    e.set(126);
  }
  
  public b()
  {
    this("UTF-8");
  }
  
  public b(String paramString)
  {
    this.d = paramString;
  }
  
  public Object a(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof String)) {
      return a((String)paramObject);
    }
    throw new e("Objects of type " + paramObject.getClass().getName() + " cannot be decoded using Q codec");
  }
  
  protected String a()
  {
    return "Q";
  }
  
  public String a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = c(paramString);
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
    try
    {
      paramString1 = b(paramString1, paramString2);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw new g(paramString1.getMessage(), paramString1);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  protected byte[] a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    paramArrayOfByte = c.a(e, paramArrayOfByte);
    if (this.h)
    {
      int i = 0;
      while (i < paramArrayOfByte.length)
      {
        if (paramArrayOfByte[i] == 32) {
          paramArrayOfByte[i] = 95;
        }
        i += 1;
      }
    }
    return paramArrayOfByte;
  }
  
  public Object b(Object paramObject)
  {
    if (paramObject == null) {
      return null;
    }
    if ((paramObject instanceof String)) {
      return b((String)paramObject);
    }
    throw new g("Objects of type " + paramObject.getClass().getName() + " cannot be encoded using Q codec");
  }
  
  public String b()
  {
    return this.d;
  }
  
  public String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return a(paramString, b());
  }
  
  protected byte[] b(byte[] paramArrayOfByte)
  {
    int k = 0;
    if (paramArrayOfByte == null) {
      return null;
    }
    int m = paramArrayOfByte.length;
    int j = 0;
    if (j < m) {
      if (paramArrayOfByte[j] != 95) {}
    }
    for (j = 1;; j = 0)
    {
      if (j != 0)
      {
        byte[] arrayOfByte = new byte[paramArrayOfByte.length];
        j = k;
        label44:
        if (j < paramArrayOfByte.length)
        {
          int i = paramArrayOfByte[j];
          if (i != 95) {
            arrayOfByte[j] = i;
          }
          for (;;)
          {
            j += 1;
            break label44;
            j += 1;
            break;
            arrayOfByte[j] = 32;
          }
        }
        return c.c(arrayOfByte);
      }
      return c.c(paramArrayOfByte);
    }
  }
  
  public boolean c()
  {
    return this.h;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\d\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */