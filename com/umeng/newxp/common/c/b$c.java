package com.umeng.newxp.common.c;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

class b$c
  implements Executor
{
  final ArrayDeque<Runnable> a = new ArrayDeque();
  Runnable b;
  
  protected void a()
  {
    try
    {
      Runnable localRunnable = (Runnable)this.a.poll();
      this.b = localRunnable;
      if (localRunnable != null) {
        b.a.execute(this.b);
      }
      return;
    }
    finally {}
  }
  
  public void execute(Runnable paramRunnable)
  {
    try
    {
      this.a.offer(new b.c.1(this, paramRunnable));
      if (this.b == null) {
        a();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\b$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */