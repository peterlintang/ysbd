package com.taobao.munion.nineoldandroids.animation;

import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class q
  extends a
{
  private static long I = 10L;
  static final int b = 0;
  static final int c = 1;
  static final int d = 0;
  static final int e = 1;
  static final int f = 2;
  public static final int m = 1;
  public static final int n = 2;
  public static final int o = -1;
  private static final long p = 10L;
  private static ThreadLocal<q.a> q = new ThreadLocal();
  private static final ThreadLocal<ArrayList<q>> r = new q.1();
  private static final ThreadLocal<ArrayList<q>> s = new q.2();
  private static final ThreadLocal<ArrayList<q>> t = new q.3();
  private static final ThreadLocal<ArrayList<q>> u = new q.4();
  private static final ThreadLocal<ArrayList<q>> v = new q.5();
  private static final Interpolator w = new AccelerateDecelerateInterpolator();
  private static final p x = new h();
  private static final p y = new f();
  private int A = 0;
  private float B = 0.0F;
  private boolean C = false;
  private long D;
  private boolean E = false;
  private boolean F = false;
  private long G = 300L;
  private long H = 0L;
  private int J = 0;
  private int K = 1;
  private Interpolator L = w;
  private ArrayList<q.b> M = null;
  long g;
  long h = -1L;
  int i = 0;
  boolean j = false;
  n[] k;
  HashMap<String, n> l;
  private boolean z = false;
  
  public static int B()
  {
    return ((ArrayList)r.get()).size();
  }
  
  public static void C()
  {
    ((ArrayList)r.get()).clear();
    ((ArrayList)s.get()).clear();
    ((ArrayList)t.get()).clear();
  }
  
  public static q a(p paramp, Object... paramVarArgs)
  {
    q localq = new q();
    localq.a(paramVarArgs);
    localq.a(paramp);
    return localq;
  }
  
  public static q a(n... paramVarArgs)
  {
    q localq = new q();
    localq.b(paramVarArgs);
    return localq;
  }
  
  private void a(boolean paramBoolean)
  {
    if (Looper.myLooper() == null) {
      throw new AndroidRuntimeException("Animators may only be run on Looper threads");
    }
    this.z = paramBoolean;
    this.A = 0;
    this.i = 0;
    this.F = true;
    this.C = false;
    ((ArrayList)s.get()).add(this);
    if (this.H == 0L)
    {
      e(s());
      this.i = 0;
      this.E = true;
      if (this.a != null)
      {
        localObject = (ArrayList)this.a.clone();
        int i2 = ((ArrayList)localObject).size();
        int i1 = 0;
        while (i1 < i2)
        {
          ((a.a)((ArrayList)localObject).get(i1)).b(this);
          i1 += 1;
        }
      }
    }
    q.a locala = (q.a)q.get();
    Object localObject = locala;
    if (locala == null)
    {
      localObject = new q.a(null);
      q.set(localObject);
    }
    ((q.a)localObject).sendEmptyMessage(0);
  }
  
  public static q b(float... paramVarArgs)
  {
    q localq = new q();
    localq.a(paramVarArgs);
    return localq;
  }
  
  public static q b(int... paramVarArgs)
  {
    q localq = new q();
    localq.a(paramVarArgs);
    return localq;
  }
  
  public static void f(long paramLong)
  {
    I = paramLong;
  }
  
  private boolean g(long paramLong)
  {
    if (!this.C)
    {
      this.C = true;
      this.D = paramLong;
    }
    long l1;
    do
    {
      return false;
      l1 = paramLong - this.D;
    } while (l1 <= this.H);
    this.g = (paramLong - (l1 - this.H));
    this.i = 1;
    return true;
  }
  
  private void m()
  {
    ((ArrayList)r.get()).remove(this);
    ((ArrayList)s.get()).remove(this);
    ((ArrayList)t.get()).remove(this);
    this.i = 0;
    if ((this.E) && (this.a != null))
    {
      ArrayList localArrayList = (ArrayList)this.a.clone();
      int i2 = localArrayList.size();
      int i1 = 0;
      while (i1 < i2)
      {
        ((a.a)localArrayList.get(i1)).a(this);
        i1 += 1;
      }
    }
    this.E = false;
    this.F = false;
  }
  
  private void o()
  {
    n();
    ((ArrayList)r.get()).add(this);
    if ((this.H > 0L) && (this.a != null))
    {
      ArrayList localArrayList = (ArrayList)this.a.clone();
      int i2 = localArrayList.size();
      int i1 = 0;
      while (i1 < i2)
      {
        ((a.a)localArrayList.get(i1)).b(this);
        i1 += 1;
      }
    }
  }
  
  public static long t()
  {
    return I;
  }
  
  public float A()
  {
    return this.B;
  }
  
  public void a()
  {
    a(false);
  }
  
  void a(float paramFloat)
  {
    paramFloat = this.L.getInterpolation(paramFloat);
    this.B = paramFloat;
    int i2 = this.k.length;
    int i1 = 0;
    while (i1 < i2)
    {
      this.k[i1].a(paramFloat);
      i1 += 1;
    }
    if (this.M != null)
    {
      i2 = this.M.size();
      i1 = 0;
      while (i1 < i2)
      {
        ((q.b)this.M.get(i1)).a(this);
        i1 += 1;
      }
    }
  }
  
  public void a(int paramInt)
  {
    this.J = paramInt;
  }
  
  public void a(long paramLong)
  {
    this.H = paramLong;
  }
  
  public void a(Interpolator paramInterpolator)
  {
    if (paramInterpolator != null)
    {
      this.L = paramInterpolator;
      return;
    }
    this.L = new LinearInterpolator();
  }
  
  public void a(p paramp)
  {
    if ((paramp != null) && (this.k != null) && (this.k.length > 0)) {
      this.k[0].a(paramp);
    }
  }
  
  public void a(q.b paramb)
  {
    if (this.M == null) {
      this.M = new ArrayList();
    }
    this.M.add(paramb);
  }
  
  public void a(float... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    if ((this.k == null) || (this.k.length == 0)) {
      b(new n[] { n.a("", paramVarArgs) });
    }
    for (;;)
    {
      this.j = false;
      return;
      this.k[0].a(paramVarArgs);
    }
  }
  
  public void a(int... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    if ((this.k == null) || (this.k.length == 0)) {
      b(new n[] { n.a("", paramVarArgs) });
    }
    for (;;)
    {
      this.j = false;
      return;
      this.k[0].a(paramVarArgs);
    }
  }
  
  public void a(Object... paramVarArgs)
  {
    if ((paramVarArgs == null) || (paramVarArgs.length == 0)) {
      return;
    }
    if ((this.k == null) || (this.k.length == 0)) {
      b(new n[] { n.a("", null, paramVarArgs) });
    }
    for (;;)
    {
      this.j = false;
      return;
      this.k[0].a(paramVarArgs);
    }
  }
  
  public Object b(String paramString)
  {
    paramString = (n)this.l.get(paramString);
    if (paramString != null) {
      return paramString.d();
    }
    return null;
  }
  
  public void b()
  {
    if ((this.i != 0) || (((ArrayList)s.get()).contains(this)) || (((ArrayList)t.get()).contains(this)))
    {
      if ((this.E) && (this.a != null))
      {
        Iterator localIterator = ((ArrayList)this.a.clone()).iterator();
        while (localIterator.hasNext()) {
          ((a.a)localIterator.next()).d(this);
        }
      }
      m();
    }
  }
  
  public void b(int paramInt)
  {
    this.K = paramInt;
  }
  
  public void b(q.b paramb)
  {
    if (this.M == null) {}
    do
    {
      return;
      this.M.remove(paramb);
    } while (this.M.size() != 0);
    this.M = null;
  }
  
  public void b(n... paramVarArgs)
  {
    int i2 = paramVarArgs.length;
    this.k = paramVarArgs;
    this.l = new HashMap(i2);
    int i1 = 0;
    while (i1 < i2)
    {
      n localn = paramVarArgs[i1];
      this.l.put(localn.c(), localn);
      i1 += 1;
    }
    this.j = false;
  }
  
  public void c()
  {
    if ((!((ArrayList)r.get()).contains(this)) && (!((ArrayList)s.get()).contains(this)))
    {
      this.C = false;
      o();
      if ((this.J <= 0) || ((this.J & 0x1) != 1)) {
        break label82;
      }
      a(0.0F);
    }
    for (;;)
    {
      m();
      return;
      if (this.j) {
        break;
      }
      n();
      break;
      label82:
      a(1.0F);
    }
  }
  
  boolean c(long paramLong)
  {
    boolean bool2 = false;
    if (this.i == 0)
    {
      this.i = 1;
      if (this.h >= 0L) {
        break label58;
      }
      this.g = paramLong;
    }
    for (;;)
    {
      switch (this.i)
      {
      default: 
        return false;
        label58:
        this.g = (paramLong - this.h);
        this.h = -1L;
      }
    }
    float f1;
    if (this.G > 0L) {
      f1 = (float)(paramLong - this.g) / (float)this.G;
    }
    boolean bool1;
    for (;;)
    {
      if (f1 >= 1.0F) {
        if ((this.A < this.J) || (this.J == -1))
        {
          if (this.a != null)
          {
            int i2 = this.a.size();
            int i1 = 0;
            for (;;)
            {
              if (i1 < i2)
              {
                ((a.a)this.a.get(i1)).c(this);
                i1 += 1;
                continue;
                f1 = 1.0F;
                break;
              }
            }
          }
          if (this.K == 2)
          {
            if (this.z)
            {
              bool1 = false;
              this.z = bool1;
            }
          }
          else
          {
            this.A += (int)f1;
            f1 %= 1.0F;
            this.g += this.G;
            bool1 = bool2;
          }
        }
      }
    }
    for (;;)
    {
      float f2 = f1;
      if (this.z) {
        f2 = 1.0F - f1;
      }
      a(f2);
      return bool1;
      bool1 = true;
      break;
      f1 = Math.min(f1, 1.0F);
      bool1 = true;
      continue;
      bool1 = bool2;
    }
  }
  
  public long d()
  {
    return this.H;
  }
  
  public q d(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("Animators cannot have negative duration: " + paramLong);
    }
    this.G = paramLong;
    return this;
  }
  
  public long e()
  {
    return this.G;
  }
  
  public void e(long paramLong)
  {
    n();
    long l1 = AnimationUtils.currentAnimationTimeMillis();
    if (this.i != 1)
    {
      this.h = paramLong;
      this.i = 2;
    }
    this.g = (l1 - paramLong);
    c(l1);
  }
  
  public boolean f()
  {
    return (this.i == 1) || (this.E);
  }
  
  public boolean g()
  {
    return this.F;
  }
  
  void n()
  {
    if (!this.j)
    {
      int i2 = this.k.length;
      int i1 = 0;
      while (i1 < i2)
      {
        this.k[i1].b();
        i1 += 1;
      }
      this.j = true;
    }
  }
  
  public q q()
  {
    int i2 = 0;
    q localq = (q)super.j();
    int i3;
    int i1;
    if (this.M != null)
    {
      localObject = this.M;
      localq.M = new ArrayList();
      i3 = ((ArrayList)localObject).size();
      i1 = 0;
      while (i1 < i3)
      {
        localq.M.add(((ArrayList)localObject).get(i1));
        i1 += 1;
      }
    }
    localq.h = -1L;
    localq.z = false;
    localq.A = 0;
    localq.j = false;
    localq.i = 0;
    localq.C = false;
    Object localObject = this.k;
    if (localObject != null)
    {
      i3 = localObject.length;
      localq.k = new n[i3];
      localq.l = new HashMap(i3);
      i1 = i2;
      while (i1 < i3)
      {
        n localn = localObject[i1].a();
        localq.k[i1] = localn;
        localq.l.put(localn.c(), localn);
        i1 += 1;
      }
    }
    return localq;
  }
  
  public n[] r()
  {
    return this.k;
  }
  
  public long s()
  {
    if ((!this.j) || (this.i == 0)) {
      return 0L;
    }
    return AnimationUtils.currentAnimationTimeMillis() - this.g;
  }
  
  public String toString()
  {
    String str1 = "ValueAnimator@" + Integer.toHexString(hashCode());
    String str2 = str1;
    if (this.k != null)
    {
      int i1 = 0;
      for (;;)
      {
        str2 = str1;
        if (i1 >= this.k.length) {
          break;
        }
        str1 = str1 + "\n    " + this.k[i1].toString();
        i1 += 1;
      }
    }
    return str2;
  }
  
  public Object u()
  {
    if ((this.k != null) && (this.k.length > 0)) {
      return this.k[0].d();
    }
    return null;
  }
  
  public int v()
  {
    return this.J;
  }
  
  public int w()
  {
    return this.K;
  }
  
  public void x()
  {
    if (this.M == null) {
      return;
    }
    this.M.clear();
    this.M = null;
  }
  
  public Interpolator y()
  {
    return this.L;
  }
  
  public void z()
  {
    if (!this.z) {}
    for (boolean bool = true;; bool = false)
    {
      this.z = bool;
      if (this.i != 1) {
        break;
      }
      long l1 = AnimationUtils.currentAnimationTimeMillis();
      long l2 = this.g;
      this.g = (l1 - (this.G - (l1 - l2)));
      return;
    }
    a(true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */