package com.taobao.munion.nineoldandroids.animation;

class j$a
  extends j
{
  float d;
  
  j$a(float paramFloat)
  {
    this.a = paramFloat;
    this.b = Float.TYPE;
  }
  
  j$a(float paramFloat1, float paramFloat2)
  {
    this.a = paramFloat1;
    this.d = paramFloat2;
    this.b = Float.TYPE;
    this.c = true;
  }
  
  public void a(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == Float.class))
    {
      this.d = ((Float)paramObject).floatValue();
      this.c = true;
    }
  }
  
  public Object b()
  {
    return Float.valueOf(this.d);
  }
  
  public float g()
  {
    return this.d;
  }
  
  public a h()
  {
    a locala = new a(c(), this.d);
    locala.a(d());
    return locala;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\j$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */