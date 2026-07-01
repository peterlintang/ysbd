package com.umeng.newxp.view;

import android.content.Context;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.controller.d;
import java.util.List;

class ExHeader$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ExHeader$1(ExHeader paramExHeader, Context paramContext, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    ExHeader.a();
    Object localObject = new StringBuilder("the ExHeader has preload data.[");
    if (paramList == null) {}
    for (int i = 0;; i = paramList.size())
    {
      ((StringBuilder)localObject).append(i).append("]").toString();
      localObject = new d(this.a, ExHeader.a(this.c), null);
      ExHeader.a(this.c).setPreloadData((d)localObject);
      ((d)localObject).a(paramList);
      if (this.b != null) {
        this.b.dataReceived(paramInt, paramList);
      }
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExHeader$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */