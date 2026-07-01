package com.taobao.munion.nineoldandroids.animation;

import java.util.ArrayList;

class d$e
  implements Cloneable
{
  public a a;
  public ArrayList<d.c> b = null;
  public ArrayList<d.c> c = null;
  public ArrayList<e> d = null;
  public ArrayList<e> e = null;
  public boolean f = false;
  
  public d$e(a parama)
  {
    this.a = parama;
  }
  
  public e a()
  {
    try
    {
      e locale = (e)super.clone();
      locale.a = this.a.j();
      return locale;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
  
  public void a(d.c paramc)
  {
    if (this.b == null)
    {
      this.b = new ArrayList();
      this.d = new ArrayList();
    }
    this.b.add(paramc);
    if (!this.d.contains(paramc.c)) {
      this.d.add(paramc.c);
    }
    paramc = paramc.c;
    if (paramc.e == null) {
      paramc.e = new ArrayList();
    }
    paramc.e.add(this);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\d$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */