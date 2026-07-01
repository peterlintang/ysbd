package com.taobao.munion.nineoldandroids.animation;

import java.util.ArrayList;
import java.util.HashMap;

class d$a
  implements a.a
{
  private d b;
  
  d$a(d paramd1, d paramd2)
  {
    this.b = paramd2;
  }
  
  public void a(a parama)
  {
    parama.b(this);
    d.a(this.a).remove(parama);
    ((d.e)d.b(this.b).get(parama)).f = true;
    int j;
    if (!this.a.b)
    {
      parama = d.c(this.b);
      j = parama.size();
      i = 0;
      if (i >= j) {
        break label162;
      }
      if (((d.e)parama.get(i)).f) {}
    }
    label162:
    for (int i = 0;; i = 1)
    {
      if (i != 0)
      {
        if (this.a.a != null)
        {
          parama = (ArrayList)this.a.a.clone();
          j = parama.size();
          i = 0;
          for (;;)
          {
            if (i < j)
            {
              ((a.a)parama.get(i)).a(this.b);
              i += 1;
              continue;
              i += 1;
              break;
            }
          }
        }
        d.a(this.b, false);
      }
      return;
    }
  }
  
  public void b(a parama) {}
  
  public void c(a parama) {}
  
  public void d(a parama)
  {
    if ((!this.a.b) && (d.a(this.a).size() == 0) && (this.a.a != null))
    {
      int j = this.a.a.size();
      int i = 0;
      while (i < j)
      {
        ((a.a)this.a.a.get(i)).d(this.b);
        i += 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\d$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */