package com.umeng.newxp.view.handler.utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public final class a$a
{
  private final a.b b;
  private boolean c;
  
  private a$a(a parama, a.b paramb)
  {
    this.b = paramb;
  }
  
  public final InputStream a(int paramInt)
  {
    synchronized (this.a)
    {
      if (a.b.a(this.b) != this) {
        throw new IllegalStateException();
      }
    }
    if (!a.b.d(this.b)) {
      return null;
    }
    FileInputStream localFileInputStream = new FileInputStream(this.b.a(paramInt));
    return localFileInputStream;
  }
  
  public final void a()
  {
    if (this.c)
    {
      a.a(this.a, this, false);
      this.a.c(a.b.c(this.b));
      return;
    }
    a.a(this.a, this, true);
  }
  
  public final void a(int paramInt, String paramString)
  {
    try
    {
      OutputStreamWriter localOutputStreamWriter = new OutputStreamWriter(c(paramInt), a.g());
      a.a(localOutputStreamWriter);
    }
    finally
    {
      try
      {
        localOutputStreamWriter.write(paramString);
        a.a(localOutputStreamWriter);
        return;
      }
      finally {}
      paramString = finally;
      localOutputStreamWriter = null;
    }
    throw paramString;
  }
  
  public final String b(int paramInt)
  {
    InputStream localInputStream = a(paramInt);
    if (localInputStream != null) {
      return a.b(localInputStream);
    }
    return null;
  }
  
  public final void b()
  {
    a.a(this.a, this, false);
  }
  
  public final OutputStream c(int paramInt)
  {
    synchronized (this.a)
    {
      if (a.b.a(this.b) != this) {
        throw new IllegalStateException();
      }
    }
    a.a.a locala1 = new a.a.a(this, new FileOutputStream(this.b.b(paramInt)), null);
    return locala1;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */