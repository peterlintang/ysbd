package com.taobao.munion.nineoldandroids.util;

public abstract class a<T>
  extends d<T, Float>
{
  public a(String paramString)
  {
    super(Float.class, paramString);
  }
  
  public abstract void a(T paramT, float paramFloat);
  
  public final void a(T paramT, Float paramFloat)
  {
    a(paramT, paramFloat.floatValue());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\util\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */