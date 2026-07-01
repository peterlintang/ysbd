package com.taobao.munion.nineoldandroids.animation;

import com.taobao.munion.nineoldandroids.util.b;
import com.taobao.munion.nineoldandroids.util.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class n$b
  extends n
{
  i h;
  int i;
  private b j;
  
  public n$b(d paramd, i parami)
  {
    super(paramd, null);
    this.d = Integer.TYPE;
    this.e = parami;
    this.h = ((i)this.e);
    if ((paramd instanceof b)) {
      this.j = ((b)this.b);
    }
  }
  
  public n$b(d paramd, int... paramVarArgs)
  {
    super(paramd, null);
    a(paramVarArgs);
    if ((paramd instanceof b)) {
      this.j = ((b)this.b);
    }
  }
  
  public n$b(String paramString, i parami)
  {
    super(paramString, null);
    this.d = Integer.TYPE;
    this.e = parami;
    this.h = ((i)this.e);
  }
  
  public n$b(String paramString, int... paramVarArgs)
  {
    super(paramString, null);
    a(paramVarArgs);
  }
  
  void a(float paramFloat)
  {
    this.i = this.h.b(paramFloat);
  }
  
  void a(Class paramClass)
  {
    if (this.b != null) {
      return;
    }
    super.a(paramClass);
  }
  
  public void a(int... paramVarArgs)
  {
    super.a(paramVarArgs);
    this.h = ((i)this.e);
  }
  
  Object d()
  {
    return Integer.valueOf(this.i);
  }
  
  void d(Object paramObject)
  {
    if (this.j != null) {
      this.j.a(paramObject, this.i);
    }
    do
    {
      return;
      if (this.b != null)
      {
        this.b.a(paramObject, Integer.valueOf(this.i));
        return;
      }
    } while (this.c == null);
    try
    {
      this.g[0] = Integer.valueOf(this.i);
      this.c.invoke(paramObject, this.g);
      return;
    }
    catch (InvocationTargetException paramObject)
    {
      ((InvocationTargetException)paramObject).toString();
      return;
    }
    catch (IllegalAccessException paramObject)
    {
      ((IllegalAccessException)paramObject).toString();
    }
  }
  
  public b e()
  {
    b localb = (b)super.a();
    localb.h = ((i)localb.e);
    return localb;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\n$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */