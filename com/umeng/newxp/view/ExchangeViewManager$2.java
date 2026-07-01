package com.umeng.newxp.view;

import com.umeng.common.ufp.Log;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.WelcomeAdsListener;
import java.util.List;

class ExchangeViewManager$2
  implements Runnable
{
  ExchangeViewManager$2(ExchangeViewManager paramExchangeViewManager, XpListenersCenter.WelcomeAdsListener paramWelcomeAdsListener, long paramLong1, long paramLong2, long paramLong3) {}
  
  public void run()
  {
    int i = 0;
    List localList;
    String str;
    StringBuilder localStringBuilder;
    if (!ExchangeViewManager.j(this.e))
    {
      ExchangeViewManager.a(this.e, true);
      localList = ExchangeViewManager.a(this.e).requestCache(true, false);
      str = ExchangeViewManager.b(this.e);
      localStringBuilder = new StringBuilder("timeout,request data from cache.");
      if (localList != null) {
        break label96;
      }
    }
    for (;;)
    {
      Log.a(str, i);
      ExchangeViewManager.a(this.e, this.a, this.b, this.c, this.d, true, localList);
      return;
      label96:
      i = localList.size();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */