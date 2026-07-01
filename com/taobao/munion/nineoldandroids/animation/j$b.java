package com.taobao.munion.nineoldandroids.animation;

class j$b
  extends j
{
  int d;
  
  j$b(float paramFloat)
  {
    this.a = paramFloat;
    this.b = Integer.TYPE;
  }
  
  j$b(float paramFloat, int paramInt)
  {
    this.a = paramFloat;
    this.d = paramInt;
    this.b = Integer.TYPE;
    this.c = true;
  }
  
  public void a(Object paramObject)
  {
    if ((paramObject != null) && (paramObject.getClass() == Integer.class))
    {
      this.d = ((Integer)paramObject).intValue();
      this.c = true;
    }
  }
  
  public Object b()
  {
    return Integer.valueOf(this.d);
  }
  
  public int g()
  {
    return this.d;
  }
  
  public b h()
  {
    b localb = new b(c(), this.d);
    localb.a(d());
    return localb;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\j$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */