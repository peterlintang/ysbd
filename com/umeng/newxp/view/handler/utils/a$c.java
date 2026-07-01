package com.umeng.newxp.view.handler.utils;

import java.io.Closeable;
import java.io.InputStream;

public final class a$c
  implements Closeable
{
  private final String b;
  private final long c;
  private final InputStream[] d;
  
  private a$c(a parama, String paramString, long paramLong, InputStream[] paramArrayOfInputStream)
  {
    this.b = paramString;
    this.c = paramLong;
    this.d = paramArrayOfInputStream;
  }
  
  public final a.a a()
  {
    return a.a(this.a, this.b, this.c);
  }
  
  public final InputStream a(int paramInt)
  {
    return this.d[paramInt];
  }
  
  public final String b(int paramInt)
  {
    return a.b(a(paramInt));
  }
  
  public final void close()
  {
    InputStream[] arrayOfInputStream = this.d;
    int j = arrayOfInputStream.length;
    int i = 0;
    while (i < j)
    {
      a.a(arrayOfInputStream[i]);
      i += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\a$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */