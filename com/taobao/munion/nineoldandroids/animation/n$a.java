package com.taobao.munion.nineoldandroids.animation;

import com.taobao.munion.nineoldandroids.util.a;
import com.taobao.munion.nineoldandroids.util.d;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class n$a
  extends n
{
  g h;
  float i;
  private a j;
  
  public n$a(d paramd, g paramg)
  {
    super(paramd, null);
    this.d = Float.TYPE;
    this.e = paramg;
    this.h = ((g)this.e);
    if ((paramd instanceof a)) {
      this.j = ((a)this.b);
    }
  }
  
  public n$a(d paramd, float... paramVarArgs)
  {
    super(paramd, null);
    a(paramVarArgs);
    if ((paramd instanceof a)) {
      this.j = ((a)this.b);
    }
  }
  
  public n$a(String paramString, g paramg)
  {
    super(paramString, null);
    this.d = Float.TYPE;
    this.e = paramg;
    this.h = ((g)this.e);
  }
  
  public n$a(String paramString, float... paramVarArgs)
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
  
  public void a(float... paramVarArgs)
  {
    super.a(paramVarArgs);
    this.h = ((g)this.e);
  }
  
  Object d()
  {
    return Float.valueOf(this.i);
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
        this.b.a(paramObject, Float.valueOf(this.i));
        return;
      }
    } while (this.c == null);
    try
    {
      this.g[0] = Float.valueOf(this.i);
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
  
  public a e()
  {
    a locala = (a)super.a();
    locala.h = ((g)locala.e);
    return locala;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\n$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */