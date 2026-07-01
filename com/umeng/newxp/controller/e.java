package com.umeng.newxp.controller;

import android.os.Handler;
import com.umeng.newxp.common.ExchangeConstants;

public class e
  extends Thread
{
  public c.a a;
  final Handler b = new e.1(this);
  
  public e(c.a parama)
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */