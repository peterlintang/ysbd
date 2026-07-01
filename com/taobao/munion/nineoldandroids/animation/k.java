package com.taobao.munion.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

class k
  implements Cloneable
{
  int a;
  j b;
  j c;
  Interpolator d;
  ArrayList<j> e;
  p f;
  
  public k(j... paramVarArgs)
  {
    this.a = paramVarArgs.length;
    this.e = new ArrayList();
    this.e.addAll(Arrays.asList(paramVarArgs));
    this.b = ((j)this.e.get(0));
    this.c = ((j)this.e.get(this.a - 1));
    this.d = this.c.d();
  }
  
  public static k a(float... paramVarArgs)
  {
    int i = 1;
    int j = paramVarArgs.length;
    j.a[] arrayOfa = new j.a[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfa[0] = ((j.a)j.b(0.0F));
      arrayOfa[1] = ((j.a)j.a(1.0F, paramVarArgs[0]));
    }
    for (;;)
    {
      return new g(arrayOfa);
      arrayOfa[0] = ((j.a)j.a(0.0F, paramVarArgs[0]));
      while (i < j)
      {
        arrayOfa[i] = ((j.a)j.a(i / (j - 1), paramVarArgs[i]));
        i += 1;
      }
    }
  }
  
  public static k a(int... paramVarArgs)
  {
    int i = 1;
    int j = paramVarArgs.length;
    j.b[] arrayOfb = new j.b[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfb[0] = ((j.b)j.a(0.0F));
      arrayOfb[1] = ((j.b)j.a(1.0F, paramVarArgs[0]));
    }
    for (;;)
    {
      return new i(arrayOfb);
      arrayOfb[0] = ((j.b)j.a(0.0F, paramVarArgs[0]));
      while (i < j)
      {
        arrayOfb[i] = ((j.b)j.a(i / (j - 1), paramVarArgs[i]));
        i += 1;
      }
    }
  }
  
  public static k a(j... paramVarArgs)
  {
    int n = 0;
    int i1 = paramVarArgs.length;
    int i = 0;
    int m = 0;
    int k = 0;
    int j = 0;
    if (i < i1)
    {
      if ((paramVarArgs[i] instanceof j.a)) {
        j = 1;
      }
      for (;;)
      {
        i += 1;
        break;
        if ((paramVarArgs[i] instanceof j.b)) {
          k = 1;
        } else {
          m = 1;
        }
      }
    }
    Object localObject;
    if ((j != 0) && (k == 0) && (m == 0))
    {
      localObject = new j.a[i1];
      i = n;
      while (i < i1)
      {
        localObject[i] = ((j.a)paramVarArgs[i]);
        i += 1;
      }
      return new g((j.a[])localObject);
    }
    if ((k != 0) && (j == 0) && (m == 0))
    {
      localObject = new j.b[i1];
      i = 0;
      while (i < i1)
      {
        localObject[i] = ((j.b)paramVarArgs[i]);
        i += 1;
      }
      return new i((j.b[])localObject);
    }
    return new k(paramVarArgs);
  }
  
  public static k a(Object... paramVarArgs)
  {
    int i = 1;
    int j = paramVarArgs.length;
    j.c[] arrayOfc = new j.c[Math.max(j, 2)];
    if (j == 1)
    {
      arrayOfc[0] = ((j.c)j.c(0.0F));
      arrayOfc[1] = ((j.c)j.a(1.0F, paramVarArgs[0]));
    }
    for (;;)
    {
      return new k(arrayOfc);
      arrayOfc[0] = ((j.c)j.a(0.0F, paramVarArgs[0]));
      while (i < j)
      {
        arrayOfc[i] = ((j.c)j.a(i / (j - 1), paramVarArgs[i]));
        i += 1;
      }
    }
  }
  
  public Object a(float paramFloat)
  {
    float f1;
    if (this.a == 2)
    {
      f1 = paramFloat;
      if (this.d != null) {
        f1 = this.d.getInterpolation(paramFloat);
      }
      return this.f.a(f1, this.b.b(), this.c.b());
    }
    Object localObject2;
    if (paramFloat <= 0.0F)
    {
      localObject1 = (j)this.e.get(1);
      localObject2 = ((j)localObject1).d();
      f1 = paramFloat;
      if (localObject2 != null) {
        f1 = ((Interpolator)localObject2).getInterpolation(paramFloat);
      }
      paramFloat = this.b.c();
      paramFloat = (f1 - paramFloat) / (((j)localObject1).c() - paramFloat);
      return this.f.a(paramFloat, this.b.b(), ((j)localObject1).b());
    }
    if (paramFloat >= 1.0F)
    {
      localObject1 = (j)this.e.get(this.a - 2);
      localObject2 = this.c.d();
      f1 = paramFloat;
      if (localObject2 != null) {
        f1 = ((Interpolator)localObject2).getInterpolation(paramFloat);
      }
      paramFloat = ((j)localObject1).c();
      paramFloat = (f1 - paramFloat) / (this.c.c() - paramFloat);
      return this.f.a(paramFloat, ((j)localObject1).b(), this.c.b());
    }
    Object localObject1 = this.b;
    int i = 1;
    while (i < this.a)
    {
      localObject2 = (j)this.e.get(i);
      if (paramFloat < ((j)localObject2).c())
      {
        Interpolator localInterpolator = ((j)localObject2).d();
        f1 = paramFloat;
        if (localInterpolator != null) {
          f1 = localInterpolator.getInterpolation(paramFloat);
        }
        paramFloat = ((j)localObject1).c();
        paramFloat = (f1 - paramFloat) / (((j)localObject2).c() - paramFloat);
        return this.f.a(paramFloat, ((j)localObject1).b(), ((j)localObject2).b());
      }
      i += 1;
      localObject1 = localObject2;
    }
    return this.c.b();
  }
  
  public void a(p paramp)
  {
    this.f = paramp;
  }
  
  public k b()
  {
    ArrayList localArrayList = this.e;
    int j = this.e.size();
    j[] arrayOfj = new j[j];
    int i = 0;
    while (i < j)
    {
      arrayOfj[i] = ((j)localArrayList.get(i)).f();
      i += 1;
    }
    return new k(arrayOfj);
  }
  
  public String toString()
  {
    String str = " ";
    int i = 0;
    while (i < this.a)
    {
      str = str + ((j)this.e.get(i)).b() + "  ";
      i += 1;
    }
    return str;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */