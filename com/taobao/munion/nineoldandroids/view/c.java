package com.taobao.munion.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.taobao.munion.nineoldandroids.animation.a;
import com.taobao.munion.nineoldandroids.animation.a.a;
import com.taobao.munion.nineoldandroids.animation.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class c
  extends b
{
  private static final int k = 0;
  private static final int l = 1;
  private static final int m = 2;
  private static final int n = 4;
  private static final int o = 8;
  private static final int p = 16;
  private static final int q = 32;
  private static final int r = 64;
  private static final int s = 128;
  private static final int t = 256;
  private static final int u = 512;
  private static final int v = 511;
  ArrayList<c.b> a = new ArrayList();
  private final WeakReference<View> b;
  private long c;
  private boolean d = false;
  private long e = 0L;
  private boolean f = false;
  private Interpolator g;
  private boolean h = false;
  private a.a i = null;
  private c.a j = new c.a(this, null);
  private Runnable w = new c.1(this);
  private HashMap<a, c.c> x = new HashMap();
  
  c(View paramView)
  {
    this.b = new WeakReference(paramView);
  }
  
  private float a(int paramInt)
  {
    View localView = (View)this.b.get();
    if (localView != null) {}
    switch (paramInt)
    {
    default: 
      return 0.0F;
    case 1: 
      return localView.getTranslationX();
    case 2: 
      return localView.getTranslationY();
    case 16: 
      return localView.getRotation();
    case 32: 
      return localView.getRotationX();
    case 64: 
      return localView.getRotationY();
    case 4: 
      return localView.getScaleX();
    case 8: 
      return localView.getScaleY();
    case 128: 
      return localView.getX();
    case 256: 
      return localView.getY();
    }
    return localView.getAlpha();
  }
  
  private void a(int paramInt, float paramFloat)
  {
    float f1 = a(paramInt);
    a(paramInt, f1, paramFloat - f1);
  }
  
  private void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    Object localObject;
    if (this.x.size() > 0)
    {
      Iterator localIterator = this.x.keySet().iterator();
      c.c localc;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (a)localIterator.next();
        localc = (c.c)this.x.get(localObject);
      } while ((!localc.a(paramInt)) || (localc.a != 0));
    }
    for (;;)
    {
      if (localObject != null) {
        ((a)localObject).b();
      }
      localObject = new c.b(paramInt, paramFloat1, paramFloat2);
      this.a.add(localObject);
      localObject = (View)this.b.get();
      if (localObject != null)
      {
        ((View)localObject).removeCallbacks(this.w);
        ((View)localObject).post(this.w);
      }
      return;
      localObject = null;
    }
  }
  
  private void b(int paramInt, float paramFloat)
  {
    a(paramInt, a(paramInt), paramFloat);
  }
  
  private void c(int paramInt, float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {}
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      localView.setTranslationX(paramFloat);
      return;
    case 2: 
      localView.setTranslationY(paramFloat);
      return;
    case 16: 
      localView.setRotation(paramFloat);
      return;
    case 32: 
      localView.setRotationX(paramFloat);
      return;
    case 64: 
      localView.setRotationY(paramFloat);
      return;
    case 4: 
      localView.setScaleX(paramFloat);
      return;
    case 8: 
      localView.setScaleY(paramFloat);
      return;
    case 128: 
      localView.setX(paramFloat);
      return;
    case 256: 
      localView.setY(paramFloat);
      return;
    }
    localView.setAlpha(paramFloat);
  }
  
  private void e()
  {
    q localq = q.b(new float[] { 1.0F });
    ArrayList localArrayList = (ArrayList)this.a.clone();
    this.a.clear();
    int i3 = localArrayList.size();
    int i1 = 0;
    int i2 = 0;
    while (i1 < i3)
    {
      i2 |= ((c.b)localArrayList.get(i1)).a;
      i1 += 1;
    }
    this.x.put(localq, new c.c(i2, localArrayList));
    localq.a(this.j);
    localq.a(this.j);
    if (this.f) {
      localq.a(this.e);
    }
    if (this.d) {
      localq.d(this.c);
    }
    if (this.h) {
      localq.a(this.g);
    }
    localq.a();
  }
  
  public long a()
  {
    if (this.d) {
      return this.c;
    }
    return new q().e();
  }
  
  public b a(float paramFloat)
  {
    a(128, paramFloat);
    return this;
  }
  
  public b a(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    }
    this.d = true;
    this.c = paramLong;
    return this;
  }
  
  public b a(Interpolator paramInterpolator)
  {
    this.h = true;
    this.g = paramInterpolator;
    return this;
  }
  
  public b a(a.a parama)
  {
    this.i = parama;
    return this;
  }
  
  public long b()
  {
    if (this.f) {
      return this.e;
    }
    return 0L;
  }
  
  public b b(float paramFloat)
  {
    b(128, paramFloat);
    return this;
  }
  
  public b b(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    }
    this.f = true;
    this.e = paramLong;
    return this;
  }
  
  public b c(float paramFloat)
  {
    a(256, paramFloat);
    return this;
  }
  
  public void c()
  {
    e();
  }
  
  public b d(float paramFloat)
  {
    b(256, paramFloat);
    return this;
  }
  
  public void d()
  {
    if (this.x.size() > 0)
    {
      localObject = ((HashMap)this.x.clone()).keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((a)((Iterator)localObject).next()).b();
      }
    }
    this.a.clear();
    Object localObject = (View)this.b.get();
    if (localObject != null) {
      ((View)localObject).removeCallbacks(this.w);
    }
  }
  
  public b e(float paramFloat)
  {
    a(16, paramFloat);
    return this;
  }
  
  public b f(float paramFloat)
  {
    b(16, paramFloat);
    return this;
  }
  
  public b g(float paramFloat)
  {
    a(32, paramFloat);
    return this;
  }
  
  public b h(float paramFloat)
  {
    b(32, paramFloat);
    return this;
  }
  
  public b i(float paramFloat)
  {
    a(64, paramFloat);
    return this;
  }
  
  public b j(float paramFloat)
  {
    b(64, paramFloat);
    return this;
  }
  
  public b k(float paramFloat)
  {
    a(1, paramFloat);
    return this;
  }
  
  public b l(float paramFloat)
  {
    b(1, paramFloat);
    return this;
  }
  
  public b m(float paramFloat)
  {
    a(2, paramFloat);
    return this;
  }
  
  public b n(float paramFloat)
  {
    b(2, paramFloat);
    return this;
  }
  
  public b o(float paramFloat)
  {
    a(4, paramFloat);
    return this;
  }
  
  public b p(float paramFloat)
  {
    b(4, paramFloat);
    return this;
  }
  
  public b q(float paramFloat)
  {
    a(8, paramFloat);
    return this;
  }
  
  public b r(float paramFloat)
  {
    b(8, paramFloat);
    return this;
  }
  
  public b s(float paramFloat)
  {
    a(512, paramFloat);
    return this;
  }
  
  public b t(float paramFloat)
  {
    b(512, paramFloat);
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\view\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */