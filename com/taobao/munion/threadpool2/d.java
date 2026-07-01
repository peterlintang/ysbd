package com.taobao.munion.threadpool2;

public class d
  extends e
{
  private a a;
  private int b;
  
  public d(Runnable paramRunnable, int paramInt)
  {
    this.b = paramInt;
    if (paramRunnable != null) {
      this.a = new a(3, paramRunnable, this);
    }
  }
  
  public int a()
  {
    return this.b;
  }
  
  protected void a(a parama)
  {
    this.a = null;
  }
  
  public void b()
  {
    h.b().a(this);
    h.b().f();
  }
  
  protected void b(a parama) {}
  
  protected a c()
  {
    try
    {
      a locala = this.a;
      return locala;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected void c(a parama) {}
  
  protected boolean d()
  {
    return this.a != null;
  }
  
  protected boolean e()
  {
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\threadpool2\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */