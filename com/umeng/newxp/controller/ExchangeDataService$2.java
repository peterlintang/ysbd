package com.umeng.newxp.controller;

import android.content.Context;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import java.util.List;

class ExchangeDataService$2
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ExchangeDataService$2(ExchangeDataService paramExchangeDataService, boolean paramBoolean, Context paramContext, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    Object localObject;
    label106:
    StringBuilder localStringBuilder;
    if ((1 == paramInt) && (paramList != null) && (paramList.size() > 0))
    {
      if (!this.a) {
        break label209;
      }
      if (ExchangeDataService.b(this.d) != null) {
        break label194;
      }
      localObject = new d(this.b, this.d, null);
      ((d)localObject).a(paramList, 1);
      ExchangeDataService.a(this.d, (d)localObject);
      Log.a(ExchangeDataService.a(this.d), "create new preload data object.[" + paramList.size() + "]");
      localObject = ExchangeDataService.a(this.d);
      localStringBuilder = new StringBuilder("received data ").append(paramList.size()).append("   preload is avaliable=");
      if (ExchangeDataService.b(this.d) == null) {
        break label269;
      }
    }
    label194:
    label209:
    label269:
    for (boolean bool = ExchangeDataService.b(this.d).b();; bool = false)
    {
      Log.a((String)localObject, bool);
      if (this.c != null) {
        this.c.dataReceived(paramInt, paramList);
      }
      return;
      localObject = ExchangeDataService.b(this.d).d();
      break;
      if (ExchangeDataService.b(this.d) == null) {
        break label106;
      }
      ExchangeDataService.b(this.d).a(paramList);
      Log.a(ExchangeDataService.a(this.d), "add extend promoter data..[" + paramList.size() + "]");
      break label106;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */