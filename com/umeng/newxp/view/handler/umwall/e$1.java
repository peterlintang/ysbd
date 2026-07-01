package com.umeng.newxp.view.handler.umwall;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.a;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import java.util.ArrayList;
import java.util.List;

class e$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  e$1(e parame, boolean paramBoolean) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      new ArrayList().addAll(paramList);
      if (this.a) {
        this.b.a(paramInt, paramList);
      }
      for (;;)
      {
        paramList = new m.a(this.b.d).a(0).b(0).g(this.b.b.getTimeConsuming()).d(5).c(this.b.b.layoutType).a((Promoter[])paramList.toArray(new Promoter[0])).f(c.a(this.b.d, this.b.b)).a(this.b.b.slot_id).c(this.b.c.d).a(this.b.b.sessionId, this.b.b.psid).a();
        new XpReportClient(this.b.d).sendAsync(paramList, null);
        return;
        this.b.b(paramInt, paramList);
      }
    }
    if (this.a)
    {
      this.b.a(paramInt, null);
      return;
    }
    this.b.b(paramInt, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\e$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */