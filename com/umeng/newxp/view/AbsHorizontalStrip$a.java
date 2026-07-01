package com.umeng.newxp.view;

class AbsHorizontalStrip$a
  implements Runnable
{
  private float b;
  private long c = System.nanoTime();
  private float d;
  
  public AbsHorizontalStrip$a(AbsHorizontalStrip paramAbsHorizontalStrip, float paramFloat, long paramLong)
  {
    this.b = ((float)paramLong / 1000.0F);
    this.d = paramFloat;
  }
  
  private void b()
  {
    this.a.post(this);
  }
  
  public void a()
  {
    b();
  }
  
  public void run()
  {
    float f2 = (float)(System.nanoTime() - this.c) / 1.0E9F;
    float f1 = f2;
    if (f2 > this.b) {
      f1 = this.b;
    }
    f2 = this.d;
    float f3 = this.a.d;
    f2 = Math.round(f2 * f1) + f3;
    AbsHorizontalStrip.a();
    new StringBuilder("do animation ").append(f2).append("  ").append(f1).toString();
    AbsHorizontalStrip.a(this.a, f2);
    if (f1 < this.b) {
      b();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\AbsHorizontalStrip$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */