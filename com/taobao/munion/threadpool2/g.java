package com.taobao.munion.threadpool2;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class g
  extends ThreadPoolExecutor
{
  private i a;
  
  public g(int paramInt1, int paramInt2, long paramLong, TimeUnit paramTimeUnit, BlockingQueue<Runnable> paramBlockingQueue)
  {
    super(paramInt1, paramInt2, paramLong, paramTimeUnit, paramBlockingQueue);
  }
  
  public void a(i parami)
  {
    this.a = parami;
  }
  
  protected void terminated()
  {
    if (this.a != null) {
      this.a.e();
    }
    super.terminated();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\threadpool2\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */