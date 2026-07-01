package com.taobao.munion.nineoldandroids.animation;

import java.util.ArrayList;
import java.util.HashMap;

public class d$b
{
  private d.e b;
  
  d$b(d paramd, a parama)
  {
    this.b = ((d.e)d.b(paramd).get(parama));
    if (this.b == null)
    {
      this.b = new d.e(parama);
      d.b(paramd).put(parama, this.b);
      d.d(paramd).add(this.b);
    }
  }
  
  public b a(long paramLong)
  {
    q localq = q.b(new float[] { 0.0F, 1.0F });
    localq.d(paramLong);
    c(localq);
    return this;
  }
  
  public b a(a parama)
  {
    d.e locale2 = (d.e)d.b(this.a).get(parama);
    d.e locale1 = locale2;
    if (locale2 == null)
    {
      locale1 = new d.e(parama);
      d.b(this.a).put(parama, locale1);
      d.d(this.a).add(locale1);
    }
    locale1.a(new d.c(this.b, 0));
    return this;
  }
  
  public b b(a parama)
  {
    d.e locale2 = (d.e)d.b(this.a).get(parama);
    d.e locale1 = locale2;
    if (locale2 == null)
    {
      locale1 = new d.e(parama);
      d.b(this.a).put(parama, locale1);
      d.d(this.a).add(locale1);
    }
    locale1.a(new d.c(this.b, 1));
    return this;
  }
  
  public b c(a parama)
  {
    d.e locale2 = (d.e)d.b(this.a).get(parama);
    d.e locale1 = locale2;
    if (locale2 == null)
    {
      locale1 = new d.e(parama);
      d.b(this.a).put(parama, locale1);
      d.d(this.a).add(locale1);
    }
    parama = new d.c(locale1, 1);
    this.b.a(parama);
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\d$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */