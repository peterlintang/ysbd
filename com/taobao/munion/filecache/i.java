package com.taobao.munion.filecache;

import java.io.UnsupportedEncodingException;

public class i
  implements h, Comparable<i>
{
  public static final char a = '-';
  public static final char b = '_';
  private String c;
  private long d = 0L;
  private long e;
  private boolean f = true;
  
  public int a(i parami)
  {
    if (this == parami) {
      return 0;
    }
    if (this.d > parami.d) {
      return 1;
    }
    return -1;
  }
  
  public String a()
  {
    return this.c;
  }
  
  public void a(long paramLong)
  {
    this.e = paramLong;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public long b()
  {
    return this.e;
  }
  
  public long b(long paramLong)
  {
    return this.d;
  }
  
  public void c(long paramLong)
  {
    this.d = paramLong;
  }
  
  public byte[] c()
  {
    Object localObject = new StringBuffer();
    if (this.d != 0L) {
      ((StringBuffer)localObject).append(this.d);
    }
    while (((StringBuffer)localObject).length() < 13)
    {
      int j = ((StringBuffer)localObject).length();
      int i = 0;
      while (i < 13 - j)
      {
        ((StringBuffer)localObject).insert(0, "0");
        i += 1;
      }
      ((StringBuffer)localObject).append("0000000000000");
    }
    if (this.f) {
      ((StringBuffer)localObject).append('-');
    }
    for (;;)
    {
      ((StringBuffer)localObject).append(this.c);
      try
      {
        localObject = ((StringBuffer)localObject).toString().getBytes("UTF-8");
        return (byte[])localObject;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        localUnsupportedEncodingException.printStackTrace();
      }
      ((StringBuffer)localObject).append('_');
    }
    return null;
  }
  
  public void d()
  {
    this.f = false;
  }
  
  public long e()
  {
    return this.d;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\filecache\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */