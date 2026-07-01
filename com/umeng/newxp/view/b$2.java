package com.umeng.newxp.view;

import android.content.Context;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class b$2
  implements XpListenersCenter.ExchangeDataRequestListener
{
  b$2(b paramb, ExHeader paramExHeader, Context paramContext) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    paramList = this.a.getExDataService().getPreloadData();
    if (paramList != null) {
      b.a(this.c, this.b, this.a, paramList);
    }
    this.c.a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\b$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */