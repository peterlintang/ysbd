package com.taobao.munion.net;

import java.io.IOException;
import java.io.OutputStream;

class f$b
  implements i
{
  i a;
  OutputStream b;
  
  f$b(f paramf, i parami, OutputStream paramOutputStream)
  {
    this.a = parami;
    this.b = paramOutputStream;
  }
  
  public void a(h paramh)
  {
    h localh = paramh;
    if (paramh.b == 416) {
      localh = new h(200, "success", null);
    }
    if (this.b != null) {}
    try
    {
      this.b.flush();
      this.b.close();
      if (this.a != null) {
        this.a.a(localh);
      }
      return;
    }
    catch (IOException paramh)
    {
      for (;;)
      {
        paramh.printStackTrace();
      }
    }
  }
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    if (this.a != null) {
      this.a.a(paramString, paramInt1, paramInt2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\f$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */