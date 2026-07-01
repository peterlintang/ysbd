package com.umeng.newxp.view;

import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.controller.XpListenersCenter.WelcomeAdsListener;
import java.util.List;

class ExchangeViewManager$3
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ExchangeViewManager$3(ExchangeViewManager paramExchangeViewManager, XpListenersCenter.WelcomeAdsListener paramWelcomeAdsListener, long paramLong1, long paramLong2, long paramLong3) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (ExchangeViewManager.j(this.e)) {}
    while (1 != paramInt) {
      return;
    }
    String str = ExchangeViewManager.b(this.e);
    StringBuilder localStringBuilder = new StringBuilder("request data from network.");
    if (paramList == null) {}
    for (paramInt = 0;; paramInt = paramList.size())
    {
      Log.a(str, paramInt);
      ExchangeViewManager.a(this.e, this.a, this.b, this.c, this.d, false, paramList);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */