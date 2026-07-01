package com.umeng.xp.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.umeng.common.Log;
import com.umeng.xp.Promoter;
import java.util.List;
import java.util.Map;

class c
  implements XpListenersCenter.ExchangeDataRequestListener
{
  c(ExchangeDataService paramExchangeDataService, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, boolean paramBoolean) {}
  
  private void a(boolean paramBoolean)
  {
    if ((this.c.page_index < 0) || (paramBoolean)) {}
    synchronized (this.c.mContext.getSharedPreferences(ExchangeDataService.b(this.c), 0))
    {
      SharedPreferences.Editor localEditor = ((SharedPreferences)???).edit();
      localEditor.remove(ExchangeDataService.c(this.c));
      localEditor.commit();
      new ExchangeDataService.a(this.c, null, 0, null).start();
      if (paramBoolean)
      {
        ??? = ExchangeDataService.d(this.c);
        if (((Map)???).containsKey("sid")) {
          ((Map)???).remove("sid");
        }
        new ExchangeDataService.a(this.c, null, 0, (Map)???).start();
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
    paramList = new d(this);
    new ExchangeDataService.a(this.c, paramList, 0, null).start();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\controller\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */