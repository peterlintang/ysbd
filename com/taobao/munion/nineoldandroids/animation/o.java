package com.taobao.munion.nineoldandroids.animation;

public class o
  extends q
{
  private o.a p;
  private long q = -1L;
  
  void a(float paramFloat) {}
  
  public void a(o.a parama)
  {
    this.p = parama;
  }
  
  boolean c(long paramLong)
  {
    long l1 = 0L;
    long l2;
    if (this.i == 0)
    {
      this.i = 1;
      if (this.h < 0L) {
        this.g = paramLong;
      }
    }
    else if (this.p != null)
    {
      l2 = this.g;
      if (this.q >= 0L) {
        break label92;
      }
    }
    for (;;)
    {
      this.q = paramLong;
      this.p.a(this, paramLong - l2, l1);
      return false;
      this.g = (paramLong - this.h);
      this.h = -1L;
      break;
      label92:
      l1 = paramLong - this.q;
    }
  }
  
  void n() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\nineoldandroids\animation\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */