package com.taobao.munion.nineoldandroids.view;

import android.view.View;
import android.view.animation.Interpolator;
import com.taobao.munion.nineoldandroids.animation.a.a;
import com.taobao.munion.nineoldandroids.animation.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

class e
  extends b
{
  private static final int l = 0;
  private static final int m = 1;
  private static final int n = 2;
  private static final int o = 4;
  private static final int p = 8;
  private static final int q = 16;
  private static final int r = 32;
  private static final int s = 64;
  private static final int t = 128;
  private static final int u = 256;
  private static final int v = 512;
  private static final int w = 511;
  ArrayList<e.b> a = new ArrayList();
  private final com.taobao.munion.nineoldandroids.view.animation.a b;
  private final WeakReference<View> c;
  private long d;
  private boolean e = false;
  private long f = 0L;
  private boolean g = false;
  private Interpolator h;
  private boolean i = false;
  private a.a j = null;
  private e.a k = new e.a(this, null);
  private Runnable x = new e.1(this);
  private HashMap<com.taobao.munion.nineoldandroids.animation.a, e.c> y = new HashMap();
  
  e(View paramView)
  {
    this.c = new WeakReference(paramView);
    this.b = com.taobao.munion.nineoldandroids.view.animation.a.a(paramView);
  }
  
  private float a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return 0.0F;
    case 1: 
      return this.b.k();
    case 2: 
      return this.b.l();
    case 16: 
      return this.b.d();
    case 32: 
      return this.b.e();
    case 64: 
      return this.b.f();
    case 4: 
      return this.b.g();
    case 8: 
      return this.b.h();
    case 128: 
      return this.b.m();
    case 256: 
      return this.b.n();
    }
    return this.b.a();
  }
  
  private void a(int paramInt, float paramFloat)
  {
    float f1 = a(paramInt);
    a(paramInt, f1, paramFloat - f1);
  }
  
  private void a(int paramInt, float paramFloat1, float paramFloat2)
  {
    Object localObject;
    if (this.y.size() > 0)
    {
      Iterator localIterator = this.y.keySet().iterator();
      e.c localc;
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject = (com.taobao.munion.nineoldandroids.animation.a)localIterator.next();
        localc = (e.c)this.y.get(localObject);
      } while ((!localc.a(paramInt)) || (localc.a != 0));
    }
    for (;;)
    {
      if (localObject != null) {
        ((com.taobao.munion.nineoldandroids.animation.a)localObject).b();
      }
      localObject = new e.b(paramInt, paramFloat1, paramFloat2);
      this.a.add(localObject);
      localObject = (View)this.c.get();
      if (localObject != null)
      {
        ((View)localObject).removeCallbacks(this.x);
        ((View)localObject).post(this.x);
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
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      this.b.i(paramFloat);
      return;
    case 2: 
      this.b.j(paramFloat);
      return;
    case 16: 
      this.b.d(paramFloat);
      return;
    case 32: 
      this.b.e(paramFloat);
      return;
    case 64: 
      this.b.f(paramFloat);
      return;
    case 4: 
      this.b.g(paramFloat);
      return;
    case 8: 
      this.b.h(paramFloat);
      return;
    case 128: 
      this.b.k(paramFloat);
      return;
    case 256: 
      this.b.l(paramFloat);
      return;
    }
    this.b.a(paramFloat);
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
      i2 |= ((e.b)localArrayList.get(i1)).a;
      i1 += 1;
    }
    this.y.put(localq, new e.c(i2, localArrayList));
    localq.a(this.k);
    localq.a(this.k);
    if (this.g) {
      localq.a(this.f);
    }
    if (this.e) {
      localq.d(this.d);
    }
    if (this.i) {
      localq.a(this.h);
    }
    localq.a();
  }
  
  public long a()
  {
    if (this.e) {
      return this.d;
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
    this.e = true;
    this.d = paramLong;
    return this;
  }
  
  public b a(Interpolator paramInterpolator)
  {
    this.i = true;
    this.h = paramInterpolator;
    return this;
  }
  
  public b a(a.a parama)
  {
    this.j = parama;
    return this;
  }
  
  public long b()
  {
    if (this.g) {
      return this.f;
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
    this.g = true;
    this.f = paramLong;
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
    if (this.y.size() > 0)
    {
      localObject = ((HashMap)this.y.clone()).keySet().iterator();
      while (((Iterator)localObject).hasNext()) {
        ((com.taobao.munion.nineoldandroids.animation.a)((Iterator)localObject).next()).b();
      }
    }
    this.a.clear();
    Object localObject = (View)this.c.get();
    if (localObject != null) {
      ((View)localObject).removeCallbacks(this.x);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\view\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */