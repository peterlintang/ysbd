package com.taobao.munion.nineoldandroids.animation;

import android.view.View;
import com.taobao.munion.nineoldandroids.util.d;
import com.taobao.munion.nineoldandroids.view.animation.a;
import java.util.HashMap;
import java.util.Map;

public final class l
  extends q
{
  private static final boolean p = false;
  private static final Map<String, d> q;
  private Object r;
  private String s;
  private d t;
  
  static
  {
    HashMap localHashMap = new HashMap();
    q = localHashMap;
    localHashMap.put("alpha", m.a);
    q.put("pivotX", m.b);
    q.put("pivotY", m.c);
    q.put("translationX", m.d);
    q.put("translationY", m.e);
    q.put("rotation", m.f);
    q.put("rotationX", m.g);
    q.put("rotationY", m.h);
    q.put("scaleX", m.i);
    q.put("scaleY", m.j);
    q.put("scrollX", m.k);
    q.put("scrollY", m.l);
    q.put("x", m.m);
    q.put("y", m.n);
  }
  
  public l() {}
  
  private <T> l(T paramT, d<T, ?> paramd)
  {
    this.r = paramT;
    a(paramd);
  }
  
  private l(Object paramObject, String paramString)
  {
    this.r = paramObject;
    a(paramString);
  }
  
  public static <T, V> l a(T paramT, d<T, V> paramd, p<V> paramp, V... paramVarArgs)
  {
    paramT = new l(paramT, paramd);
    paramT.a(paramVarArgs);
    paramT.a(paramp);
    return paramT;
  }
  
  public static <T> l a(T paramT, d<T, Float> paramd, float... paramVarArgs)
  {
    paramT = new l(paramT, paramd);
    paramT.a(paramVarArgs);
    return paramT;
  }
  
  public static <T> l a(T paramT, d<T, Integer> paramd, int... paramVarArgs)
  {
    paramT = new l(paramT, paramd);
    paramT.a(paramVarArgs);
    return paramT;
  }
  
  public static l a(Object paramObject, String paramString, p paramp, Object... paramVarArgs)
  {
    paramObject = new l(paramObject, paramString);
    ((l)paramObject).a(paramVarArgs);
    ((l)paramObject).a(paramp);
    return (l)paramObject;
  }
  
  public static l a(Object paramObject, String paramString, float... paramVarArgs)
  {
    paramObject = new l(paramObject, paramString);
    ((l)paramObject).a(paramVarArgs);
    return (l)paramObject;
  }
  
  public static l a(Object paramObject, String paramString, int... paramVarArgs)
  {
    paramObject = new l(paramObject, paramString);
    ((l)paramObject).a(paramVarArgs);
    return (l)paramObject;
  }
  
  public static l a(Object paramObject, n... paramVarArgs)
  {
    l locall = new l();
    locall.r = paramObject;
    locall.b(paramVarArgs);
    return locall;
  }
  
  public final void a()
  {
    super.a();
  }
  
  final void a(float paramFloat)
  {
    super.a(paramFloat);
    int j = this.k.length;
    int i = 0;
    while (i < j)
    {
      this.k[i].d(this.r);
      i += 1;
    }
  }
  
  public final void a(d paramd)
  {
    if (this.k != null)
    {
      n localn = this.k[0];
      String str = localn.c();
      localn.a(paramd);
      this.l.remove(str);
      this.l.put(this.s, localn);
    }
    if (this.t != null) {
      this.s = paramd.b();
    }
    this.t = paramd;
    this.j = false;
  }
  
  public final void a(Object paramObject)
  {
    if (this.r != paramObject)
    {
      Object localObject = this.r;
      this.r = paramObject;
      if ((localObject == null) || (paramObject == null) || (localObject.getClass() != paramObject.getClass())) {}
    }
    else
    {
      return;
    }
    this.j = false;
  }
  
  public final void a(String paramString)
  {
    if (this.k != null)
    {
      n localn = this.k[0];
      String str = localn.c();
      localn.a(paramString);
      this.l.remove(str);
      this.l.put(paramString, localn);
    }
    this.s = paramString;
    this.j = false;
  }
  
  public final void a(float... paramVarArgs)
  {
    if ((this.k == null) || (this.k.length == 0))
    {
      if (this.t != null)
      {
        b(new n[] { n.a(this.t, paramVarArgs) });
        return;
      }
      b(new n[] { n.a(this.s, paramVarArgs) });
      return;
    }
    super.a(paramVarArgs);
  }
  
  public final void a(int... paramVarArgs)
  {
    if ((this.k == null) || (this.k.length == 0))
    {
      if (this.t != null)
      {
        b(new n[] { n.a(this.t, paramVarArgs) });
        return;
      }
      b(new n[] { n.a(this.s, paramVarArgs) });
      return;
    }
    super.a(paramVarArgs);
  }
  
  public final void a(Object... paramVarArgs)
  {
    if ((this.k == null) || (this.k.length == 0))
    {
      if (this.t != null)
      {
        b(new n[] { n.a(this.t, null, paramVarArgs) });
        return;
      }
      b(new n[] { n.a(this.s, null, paramVarArgs) });
      return;
    }
    super.a(paramVarArgs);
  }
  
  public final l a_(long paramLong)
  {
    super.d(paramLong);
    return this;
  }
  
  public final void k()
  {
    n();
    int j = this.k.length;
    int i = 0;
    while (i < j)
    {
      this.k[i].b(this.r);
      i += 1;
    }
  }
  
  public final void l()
  {
    n();
    int j = this.k.length;
    int i = 0;
    while (i < j)
    {
      this.k[i].c(this.r);
      i += 1;
    }
  }
  
  public final String m()
  {
    return this.s;
  }
  
  final void n()
  {
    if (!this.j)
    {
      if ((this.t == null) && (a.a) && ((this.r instanceof View)) && (q.containsKey(this.s))) {
        a((d)q.get(this.s));
      }
      int j = this.k.length;
      int i = 0;
      while (i < j)
      {
        this.k[i].a(this.r);
        i += 1;
      }
      super.n();
    }
  }
  
  public final Object o()
  {
    return this.r;
  }
  
  public final l p()
  {
    return (l)super.q();
  }
  
  public final String toString()
  {
    String str1 = "ObjectAnimator@" + Integer.toHexString(hashCode()) + ", target " + this.r;
    String str2 = str1;
    if (this.k != null)
    {
      int i = 0;
      for (;;)
      {
        str2 = str1;
        if (i >= this.k.length) {
          break;
        }
        str1 = str1 + "\n    " + this.k[i].toString();
        i += 1;
      }
    }
    return str2;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */