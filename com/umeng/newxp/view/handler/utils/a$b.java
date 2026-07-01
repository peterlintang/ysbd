package com.umeng.newxp.view.handler.utils;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;

final class a$b
{
  private final String b;
  private final long[] c;
  private boolean d;
  private a.a e;
  private long f;
  
  private a$b(a parama, String paramString)
  {
    this.b = paramString;
    this.c = new long[a.e(parama)];
  }
  
  private void a(String[] paramArrayOfString)
  {
    if (paramArrayOfString.length != a.e(this.a)) {
      throw b(paramArrayOfString);
    }
    int i = 0;
    try
    {
      while (i < paramArrayOfString.length)
      {
        this.c[i] = Long.parseLong(paramArrayOfString[i]);
        i += 1;
      }
      return;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      throw b(paramArrayOfString);
    }
  }
  
  private IOException b(String[] paramArrayOfString)
  {
    throw new IOException("unexpected journal line: " + Arrays.toString(paramArrayOfString));
  }
  
  public final File a(int paramInt)
  {
    return new File(a.f(this.a), this.b + "." + paramInt);
  }
  
  public final String a()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    long[] arrayOfLong = this.c;
    int j = arrayOfLong.length;
    int i = 0;
    while (i < j)
    {
      long l = arrayOfLong[i];
      localStringBuilder.append(' ').append(l);
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public final File b(int paramInt)
  {
    return new File(a.f(this.a), this.b + "." + paramInt + ".tmp");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */