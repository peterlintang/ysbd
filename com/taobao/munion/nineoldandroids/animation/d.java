package com.taobao.munion.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class d
  extends a
{
  boolean b = false;
  private ArrayList<a> c = new ArrayList();
  private HashMap<a, d.e> d = new HashMap();
  private ArrayList<d.e> e = new ArrayList();
  private ArrayList<d.e> f = new ArrayList();
  private boolean g = true;
  private d.a h = null;
  private boolean i = false;
  private long j = 0L;
  private q k = null;
  private long l = -1L;
  
  private void o()
  {
    Object localObject1;
    int n;
    int m;
    Object localObject2;
    int i1;
    int i2;
    if (this.g)
    {
      this.f.clear();
      localObject1 = new ArrayList();
      n = this.e.size();
      m = 0;
      while (m < n)
      {
        localObject2 = (d.e)this.e.get(m);
        if ((((d.e)localObject2).b == null) || (((d.e)localObject2).b.size() == 0)) {
          ((ArrayList)localObject1).add(localObject2);
        }
        m += 1;
      }
      localObject2 = new ArrayList();
      while (((ArrayList)localObject1).size() > 0)
      {
        i1 = ((ArrayList)localObject1).size();
        m = 0;
        while (m < i1)
        {
          d.e locale1 = (d.e)((ArrayList)localObject1).get(m);
          this.f.add(locale1);
          if (locale1.e != null)
          {
            i2 = locale1.e.size();
            n = 0;
            while (n < i2)
            {
              d.e locale2 = (d.e)locale1.e.get(n);
              locale2.d.remove(locale1);
              if (locale2.d.size() == 0) {
                ((ArrayList)localObject2).add(locale2);
              }
              n += 1;
            }
          }
          m += 1;
        }
        ((ArrayList)localObject1).clear();
        ((ArrayList)localObject1).addAll((Collection)localObject2);
        ((ArrayList)localObject2).clear();
      }
      this.g = false;
      if (this.f.size() != this.e.size()) {
        throw new IllegalStateException("Circular dependencies cannot exist in AnimatorSet");
      }
    }
    else
    {
      i1 = this.e.size();
      m = 0;
      while (m < i1)
      {
        localObject1 = (d.e)this.e.get(m);
        if ((((d.e)localObject1).b != null) && (((d.e)localObject1).b.size() > 0))
        {
          i2 = ((d.e)localObject1).b.size();
          n = 0;
          while (n < i2)
          {
            localObject2 = (d.c)((d.e)localObject1).b.get(n);
            if (((d.e)localObject1).d == null) {
              ((d.e)localObject1).d = new ArrayList();
            }
            if (!((d.e)localObject1).d.contains(((d.c)localObject2).c)) {
              ((d.e)localObject1).d.add(((d.c)localObject2).c);
            }
            n += 1;
          }
        }
        ((d.e)localObject1).f = false;
        m += 1;
      }
    }
  }
  
  public final d.b a(a parama)
  {
    if (parama != null)
    {
      this.g = true;
      return new d.b(this, parama);
    }
    return null;
  }
  
  public final void a()
  {
    int i1 = 0;
    this.b = false;
    this.i = true;
    o();
    int i2 = this.f.size();
    int m = 0;
    Object localObject2;
    Object localObject3;
    while (m < i2)
    {
      localObject1 = (d.e)this.f.get(m);
      localObject2 = ((d.e)localObject1).a.h();
      if ((localObject2 != null) && (((ArrayList)localObject2).size() > 0))
      {
        localObject2 = new ArrayList((Collection)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject3 = (a.a)((Iterator)localObject2).next();
          if (((localObject3 instanceof d.d)) || ((localObject3 instanceof d.a))) {
            ((d.e)localObject1).a.b((a.a)localObject3);
          }
        }
      }
      m += 1;
    }
    Object localObject1 = new ArrayList();
    m = 0;
    int n;
    if (m < i2)
    {
      localObject2 = (d.e)this.f.get(m);
      if (this.h == null) {
        this.h = new d.a(this, this);
      }
      if ((((d.e)localObject2).b == null) || (((d.e)localObject2).b.size() == 0)) {
        ((ArrayList)localObject1).add(localObject2);
      }
      for (;;)
      {
        ((d.e)localObject2).a.a(this.h);
        m += 1;
        break;
        int i3 = ((d.e)localObject2).b.size();
        n = 0;
        while (n < i3)
        {
          localObject3 = (d.c)((d.e)localObject2).b.get(n);
          ((d.c)localObject3).c.a.a(new d.d(this, (d.e)localObject2, ((d.c)localObject3).d));
          n += 1;
        }
        ((d.e)localObject2).c = ((ArrayList)((d.e)localObject2).b.clone());
      }
    }
    if (this.j <= 0L)
    {
      localObject1 = ((ArrayList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (d.e)((Iterator)localObject1).next();
        ((d.e)localObject2).a.a();
        this.c.add(((d.e)localObject2).a);
      }
    }
    this.k = q.b(new float[] { 0.0F, 1.0F });
    this.k.d(this.j);
    this.k.a(new d.1(this, (ArrayList)localObject1));
    this.k.a();
    if (this.a != null)
    {
      localObject1 = (ArrayList)this.a.clone();
      n = ((ArrayList)localObject1).size();
      m = 0;
      while (m < n)
      {
        ((a.a)((ArrayList)localObject1).get(m)).b(this);
        m += 1;
      }
    }
    if ((this.e.size() == 0) && (this.j == 0L))
    {
      this.i = false;
      if (this.a != null)
      {
        localObject1 = (ArrayList)this.a.clone();
        n = ((ArrayList)localObject1).size();
        m = i1;
        while (m < n)
        {
          ((a.a)((ArrayList)localObject1).get(m)).a(this);
          m += 1;
        }
      }
    }
  }
  
  public final void a(long paramLong)
  {
    this.j = paramLong;
  }
  
  public final void a(Interpolator paramInterpolator)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((d.e)localIterator.next()).a.a(paramInterpolator);
    }
  }
  
  public final void a(Object paramObject)
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext())
    {
      a locala = ((d.e)localIterator.next()).a;
      if ((locala instanceof d)) {
        ((d)locala).a(paramObject);
      } else if ((locala instanceof l)) {
        ((l)locala).a(paramObject);
      }
    }
  }
  
  public final void a(Collection<a> paramCollection)
  {
    if ((paramCollection != null) && (paramCollection.size() > 0))
    {
      this.g = true;
      Iterator localIterator = paramCollection.iterator();
      paramCollection = null;
      while (localIterator.hasNext())
      {
        a locala = (a)localIterator.next();
        if (paramCollection == null) {
          paramCollection = a(locala);
        } else {
          paramCollection.a(locala);
        }
      }
    }
  }
  
  public final void a(List<a> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      this.g = true;
      if (paramList.size() != 1) {
        break label44;
      }
      a((a)paramList.get(0));
    }
    for (;;)
    {
      return;
      label44:
      int m = 0;
      while (m < paramList.size() - 1)
      {
        a((a)paramList.get(m)).b((a)paramList.get(m + 1));
        m += 1;
      }
    }
  }
  
  public final void a(a... paramVarArgs)
  {
    int m = 1;
    if (paramVarArgs != null)
    {
      this.g = true;
      d.b localb = a(paramVarArgs[0]);
      while (m < paramVarArgs.length)
      {
        localb.a(paramVarArgs[m]);
        m += 1;
      }
    }
  }
  
  public final void b()
  {
    this.b = true;
    Object localObject;
    Iterator localIterator;
    if (g())
    {
      if (this.a == null) {
        break label173;
      }
      localObject = (ArrayList)this.a.clone();
      localIterator = ((ArrayList)localObject).iterator();
      while (localIterator.hasNext()) {
        ((a.a)localIterator.next()).d(this);
      }
    }
    for (;;)
    {
      if ((this.k != null) && (this.k.f())) {
        this.k.b();
      }
      while (localObject != null)
      {
        localObject = ((ArrayList)localObject).iterator();
        while (((Iterator)localObject).hasNext()) {
          ((a.a)((Iterator)localObject).next()).a(this);
        }
        if (this.f.size() > 0)
        {
          localIterator = this.f.iterator();
          while (localIterator.hasNext()) {
            ((d.e)localIterator.next()).a.b();
          }
        }
      }
      this.i = false;
      return;
      label173:
      localObject = null;
    }
  }
  
  public final void b(a... paramVarArgs)
  {
    int m = 0;
    if (paramVarArgs != null)
    {
      this.g = true;
      if (paramVarArgs.length != 1) {
        break label26;
      }
      a(paramVarArgs[0]);
    }
    for (;;)
    {
      return;
      label26:
      while (m < paramVarArgs.length - 1)
      {
        a(paramVarArgs[m]).b(paramVarArgs[(m + 1)]);
        m += 1;
      }
    }
  }
  
  public final d c(long paramLong)
  {
    if (paramLong < 0L) {
      throw new IllegalArgumentException("duration must be a value of zero or greater");
    }
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((d.e)localIterator.next()).a.b(paramLong);
    }
    this.l = paramLong;
    return this;
  }
  
  public final void c()
  {
    this.b = true;
    if (g())
    {
      Iterator localIterator;
      if (this.f.size() != this.e.size())
      {
        o();
        localIterator = this.f.iterator();
        while (localIterator.hasNext())
        {
          d.e locale = (d.e)localIterator.next();
          if (this.h == null) {
            this.h = new d.a(this, this);
          }
          locale.a.a(this.h);
        }
      }
      if (this.k != null) {
        this.k.b();
      }
      if (this.f.size() > 0)
      {
        localIterator = this.f.iterator();
        while (localIterator.hasNext()) {
          ((d.e)localIterator.next()).a.c();
        }
      }
      if (this.a != null)
      {
        localIterator = ((ArrayList)this.a.clone()).iterator();
        while (localIterator.hasNext()) {
          ((a.a)localIterator.next()).a(this);
        }
      }
      this.i = false;
    }
  }
  
  public final long d()
  {
    return this.j;
  }
  
  public final long e()
  {
    return this.l;
  }
  
  public final boolean f()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      if (((d.e)localIterator.next()).a.f()) {
        return true;
      }
    }
    return false;
  }
  
  public final boolean g()
  {
    return this.i;
  }
  
  public final void k()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((d.e)localIterator.next()).a.k();
    }
  }
  
  public final void l()
  {
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      ((d.e)localIterator.next()).a.l();
    }
  }
  
  public final ArrayList<a> m()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.e.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((d.e)localIterator.next()).a);
    }
    return localArrayList;
  }
  
  public final d n()
  {
    d locald = (d)super.j();
    locald.g = true;
    locald.b = false;
    locald.i = false;
    locald.c = new ArrayList();
    locald.d = new HashMap();
    locald.e = new ArrayList();
    locald.f = new ArrayList();
    HashMap localHashMap = new HashMap();
    Object localObject3 = this.e.iterator();
    Object localObject2;
    Object localObject4;
    while (((Iterator)localObject3).hasNext())
    {
      localObject1 = (d.e)((Iterator)localObject3).next();
      localObject2 = ((d.e)localObject1).a();
      localHashMap.put(localObject1, localObject2);
      locald.e.add(localObject2);
      locald.d.put(((d.e)localObject2).a, localObject2);
      ((d.e)localObject2).b = null;
      ((d.e)localObject2).c = null;
      ((d.e)localObject2).e = null;
      ((d.e)localObject2).d = null;
      localObject4 = ((d.e)localObject2).a.h();
      if (localObject4 != null)
      {
        Iterator localIterator = ((ArrayList)localObject4).iterator();
        localObject1 = null;
        while (localIterator.hasNext())
        {
          a.a locala = (a.a)localIterator.next();
          if ((locala instanceof d.a))
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = new ArrayList();
            }
            ((ArrayList)localObject2).add(locala);
            localObject1 = localObject2;
          }
        }
        if (localObject1 != null)
        {
          localObject1 = ((ArrayList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext()) {
            ((ArrayList)localObject4).remove((a.a)((Iterator)localObject1).next());
          }
        }
      }
    }
    Object localObject1 = this.e.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject3 = (d.e)((Iterator)localObject1).next();
      localObject2 = (d.e)localHashMap.get(localObject3);
      if (((d.e)localObject3).b != null)
      {
        localObject3 = ((d.e)localObject3).b.iterator();
        while (((Iterator)localObject3).hasNext())
        {
          localObject4 = (d.c)((Iterator)localObject3).next();
          ((d.e)localObject2).a(new d.c((d.e)localHashMap.get(((d.c)localObject4).c), ((d.c)localObject4).d));
        }
      }
    }
    return locald;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */