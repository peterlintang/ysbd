package com.taobao.munion.threadpool2;

public class a
  implements b, Runnable
{
  private Runnable e;
  private e f;
  private int g;
  
  public a(int paramInt, Runnable paramRunnable, e parame)
  {
    this.g = paramInt;
    this.e = paramRunnable;
    this.f = parame;
  }
  
  public int a()
  {
    return this.g;
  }
  
  public void run()
  {
    if (this.f != null) {
      this.f.b(this);
    }
    if (this.e != null) {
      this.e.run();
    }
    if (this.f != null) {
      this.f.c(this);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\threadpool2\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */