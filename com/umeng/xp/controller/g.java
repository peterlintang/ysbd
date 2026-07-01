package com.umeng.xp.controller;

import android.os.Handler;
import com.umeng.xp.common.ExchangeConstants;

public class g
  extends Thread
{
  public f.a a;
  final Handler b = new h(this);
  
  public g(f.a parama)
  {
    this.a = parama;
  }
  
  public void run()
  {
    try
    {
      if (ExchangeConstants.DEBUG_MODE) {
        ExchangeConstants.REFRESH_INTERVAL = 3000;
      }
      Thread.sleep(ExchangeConstants.REFRESH_INTERVAL);
      this.b.sendEmptyMessage(0);
      return;
    }
    catch (InterruptedException localInterruptedException) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\controller\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */