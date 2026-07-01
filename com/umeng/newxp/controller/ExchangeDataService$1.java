package com.umeng.newxp.controller;

import com.umeng.newxp.Promoter;
import java.util.List;

class ExchangeDataService$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ExchangeDataService$1(ExchangeDataService paramExchangeDataService, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramList == null)
    {
      if (this.a != null) {
        this.a.dataReceived(paramInt, paramList);
      }
      return;
    }
    new ExchangeDataService.1.1(this, paramList, paramInt).execute(new Void[0]);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */