package com.taobao.munion.nineoldandroids.util;

public abstract class b<T>
  extends d<T, Integer>
{
  public b(String paramString)
  {
    super(Integer.class, paramString);
  }
  
  public abstract void a(T paramT, int paramInt);
  
  public final void a(T paramT, Integer paramInteger)
  {
    a(paramT, paramInteger.intValue());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\util\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */