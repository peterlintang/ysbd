package com.umeng.newxp.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import java.util.List;
import java.util.Map;

class ExchangeDataService$3
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ExchangeDataService$3(ExchangeDataService paramExchangeDataService, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, boolean paramBoolean) {}
  
  private void a(boolean paramBoolean)
  {
    if ((this.c.page_index < 0) || (paramBoolean)) {}
    synchronized (this.c.mContext.getSharedPreferences(ExchangeDataService.c(this.c), 0))
    {
      SharedPreferences.Editor localEditor = ((SharedPreferences)???).edit();
      localEditor.remove(ExchangeDataService.d(this.c));
      localEditor.commit();
      new g(this.c, null, 0, null, true).a(g.c, new Void[0]);
      if (paramBoolean)
      {
        ??? = this.c.getRequestInput();
        if (((Map)???).containsKey("sid")) {
          ((Map)???).remove("sid");
        }
        new g(this.c, null, 0, (Map)???, true).a(g.c, new Void[0]);
      }
      return;
    }
  }
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt == 1)
    {
      this.a.dataReceived(paramInt, paramList);
      a(this.b);
      return;
    }
    Log.c(ExchangeDataService.a(this.c), "Get from cache failed...");
    paramList = new ExchangeDataService.3.1(this);
    new g(this.c, paramList, 0, null, false).a(g.c, new Void[0]);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */