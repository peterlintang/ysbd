package com.umeng.newxp.view.handler.utils;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class a$a$a
  extends FilterOutputStream
{
  private a$a$a(a.a parama, OutputStream paramOutputStream)
  {
    super(paramOutputStream);
  }
  
  public void close()
  {
    try
    {
      this.out.close();
      return;
    }
    catch (IOException localIOException)
    {
      a.a.a(this.a, true);
    }
  }
  
  public void flush()
  {
    try
    {
      this.out.flush();
      return;
    }
    catch (IOException localIOException)
    {
      a.a.a(this.a, true);
    }
  }
  
  public void write(int paramInt)
  {
    try
    {
      this.out.write(paramInt);
      return;
    }
    catch (IOException localIOException)
    {
      a.a.a(this.a, true);
    }
  }
  
  public void write(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    try
    {
      this.out.write(paramArrayOfByte, paramInt1, paramInt2);
      return;
    }
    catch (IOException paramArrayOfByte)
    {
      a.a.a(this.a, true);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\a$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */