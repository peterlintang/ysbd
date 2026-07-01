package com.taobao.munion.nineoldandroids.animation;

import java.util.ArrayList;

class d$1
  extends c
{
  boolean a = false;
  
  d$1(d paramd, ArrayList paramArrayList) {}
  
  public void a(a parama)
  {
    if (!this.a)
    {
      int j = this.b.size();
      int i = 0;
      while (i < j)
      {
        parama = (d.e)this.b.get(i);
        parama.a.a();
        d.a(this.c).add(parama.a);
        i += 1;
      }
    }
  }
  
  public void d(a parama)
  {
    this.a = true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\d$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */