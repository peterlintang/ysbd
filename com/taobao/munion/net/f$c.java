package com.taobao.munion.net;

class f$c
  implements i
{
  i a;
  m b;
  e c;
  
  f$c(f paramf, i parami, m paramm, e parame)
  {
    this.a = parami;
    this.b = paramm;
    this.c = parame;
  }
  
  public void a(h paramh)
  {
    h localh = paramh;
    if (paramh.a())
    {
      localh = paramh;
      if (this.b != null)
      {
        localh = (h)this.b.a(paramh.k);
        if (localh != null) {
          if (paramh.f >= this.c.o) {
            break label110;
          }
        }
      }
    }
    label110:
    for (int i = paramh.f;; i = this.c.o)
    {
      a.a().a(this.c.i(), localh, this.c.g(), this.c.h(), i);
      paramh.k = null;
      if (this.a != null) {
        this.a.a(localh);
      }
      return;
    }
  }
  
  public void a(String paramString, int paramInt1, int paramInt2)
  {
    if (this.a != null) {
      this.a.a(paramString, paramInt1, paramInt2);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\f$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */