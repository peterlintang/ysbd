package com.taobao.munion.nineoldandroids.animation;

class j$c
  extends j
{
  Object d;
  
  j$c(float paramFloat, Object paramObject)
  {
    this.a = paramFloat;
    this.d = paramObject;
    boolean bool;
    if (paramObject != null)
    {
      bool = true;
      this.c = bool;
      if (!this.c) {
        break label48;
      }
    }
    label48:
    for (paramObject = paramObject.getClass();; paramObject = Object.class)
    {
      this.b = ((Class)paramObject);
      return;
      bool = false;
      break;
    }
  }
  
  public void a(Object paramObject)
  {
    this.d = paramObject;
    if (paramObject != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.c = bool;
      return;
    }
  }
  
  public Object b()
  {
    return this.d;
  }
  
  public c g()
  {
    c localc = new c(c(), this.d);
    localc.a(d());
    return localc;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\j$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */