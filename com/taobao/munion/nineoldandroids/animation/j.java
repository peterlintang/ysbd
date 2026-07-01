package com.taobao.munion.nineoldandroids.animation;

import android.view.animation.Interpolator;

public abstract class j
  implements Cloneable
{
  float a;
  Class b;
  boolean c = false;
  private Interpolator d = null;
  
  public static j a(float paramFloat)
  {
    return new j.b(paramFloat);
  }
  
  public static j a(float paramFloat1, float paramFloat2)
  {
    return new j.a(paramFloat1, paramFloat2);
  }
  
  public static j a(float paramFloat, int paramInt)
  {
    return new j.b(paramFloat, paramInt);
  }
  
  public static j a(float paramFloat, Object paramObject)
  {
    return new j.c(paramFloat, paramObject);
  }
  
  public static j b(float paramFloat)
  {
    return new j.a(paramFloat);
  }
  
  public static j c(float paramFloat)
  {
    return new j.c(paramFloat, null);
  }
  
  public void a(Interpolator paramInterpolator)
  {
    this.d = paramInterpolator;
  }
  
  public abstract void a(Object paramObject);
  
  public boolean a()
  {
    return this.c;
  }
  
  public abstract Object b();
  
  public float c()
  {
    return this.a;
  }
  
  public Interpolator d()
  {
    return this.d;
  }
  
  public void d(float paramFloat)
  {
    this.a = paramFloat;
  }
  
  public Class e()
  {
    return this.b;
  }
  
  public abstract j f();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */