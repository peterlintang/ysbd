package com.umeng.newxp.controller;

import com.umeng.newxp.Promoter;
import java.util.List;

class ExchangeDataService$3$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ExchangeDataService$3$1(ExchangeDataService.3 param3) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    this.a.a.dataReceived(paramInt, paramList);
    if (paramInt == 1) {
      ExchangeDataService.3.a(this.a, this.a.b);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService$3$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */