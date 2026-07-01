package com.taobao.munion.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

public abstract class a
  implements Cloneable
{
  ArrayList<a.a> a = null;
  
  public void a() {}
  
  public abstract void a(long paramLong);
  
  public abstract void a(Interpolator paramInterpolator);
  
  public void a(a.a parama)
  {
    if (this.a == null) {
      this.a = new ArrayList();
    }
    this.a.add(parama);
  }
  
  public void a(Object paramObject) {}
  
  public abstract a b(long paramLong);
  
  public void b() {}
  
  public void b(a.a parama)
  {
    if (this.a == null) {}
    do
    {
      return;
      this.a.remove(parama);
    } while (this.a.size() != 0);
    this.a = null;
  }
  
  public void c() {}
  
  public abstract long d();
  
  public abstract long e();
  
  public abstract boolean f();
  
  public boolean g()
  {
    return f();
  }
  
  public ArrayList<a.a> h()
  {
    return this.a;
  }
  
  public void i()
  {
    if (this.a != null)
    {
      this.a.clear();
      this.a = null;
    }
  }
  
  public a j()
  {
    try
    {
      a locala = (a)super.clone();
      if (this.a != null)
      {
        ArrayList localArrayList = this.a;
        locala.a = new ArrayList();
        int j = localArrayList.size();
        int i = 0;
        while (i < j)
        {
          locala.a.add(localArrayList.get(i));
          i += 1;
        }
      }
      return localCloneNotSupportedException;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException)
    {
      throw new AssertionError();
    }
  }
  
  public void k() {}
  
  public void l() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */