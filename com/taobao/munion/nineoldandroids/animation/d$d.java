package com.taobao.munion.nineoldandroids.animation;

import java.util.ArrayList;

class d$d
  implements a.a
{
  private d a;
  private d.e b;
  private int c;
  
  public d$d(d paramd, d.e parame, int paramInt)
  {
    this.a = paramd;
    this.b = parame;
    this.c = paramInt;
  }
  
  private void e(a parama)
  {
    if (this.a.b) {
      return;
    }
    int j = this.b.c.size();
    int i = 0;
    label24:
    d.c localc;
    if (i < j)
    {
      localc = (d.c)this.b.c.get(i);
      if ((localc.d == this.c) && (localc.c.a == parama)) {
        parama.b(this);
      }
    }
    for (parama = localc;; parama = null)
    {
      this.b.c.remove(parama);
      if (this.b.c.size() != 0) {
        break;
      }
      this.b.a.a();
      d.a(this.a).add(this.b.a);
      return;
      i += 1;
      break label24;
    }
  }
  
  public void a(a parama)
  {
    if (this.c == 1) {
      e(parama);
    }
  }
  
  public void b(a parama)
  {
    if (this.c == 0) {
      e(parama);
    }
  }
  
  public void c(a parama) {}
  
  public void d(a parama) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\d$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */