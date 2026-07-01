package com.umeng.newxp.common.c;

class b$c$1
  implements Runnable
{
  b$c$1(b.c paramc, Runnable paramRunnable) {}
  
  public void run()
  {
    try
    {
      this.a.run();
      return;
    }
    finally
    {
      this.b.a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\b$c$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */