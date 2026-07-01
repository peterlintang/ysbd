package com.taobao.munion.net;

import java.util.concurrent.Callable;

class g$a
  implements Callable<h>
{
  b a;
  e b;
  
  public g$a(g paramg, b paramb, e parame)
  {
    this.a = paramb;
    this.b = parame;
  }
  
  public h a()
  {
    Object localObject = a.a().a(this.b.i(), this.b.g(), this.b.h());
    if ((localObject != null) && (localObject.getClass() == h.class))
    {
      this.a.a((h)localObject);
      return (h)localObject;
    }
    localObject = this.a.b();
    this.a.a((h)localObject);
    return (h)localObject;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\g$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */