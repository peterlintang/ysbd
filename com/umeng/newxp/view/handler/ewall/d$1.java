package com.umeng.newxp.view.handler.ewall;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.handler.UMEWallPromoter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class d$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  d$1(d paramd, boolean paramBoolean) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      ArrayList localArrayList = new ArrayList();
      paramList = paramList.iterator();
      while (paramList.hasNext())
      {
        Promoter localPromoter = (Promoter)paramList.next();
        if ((localPromoter instanceof UMEWallPromoter)) {
          localArrayList.add((UMEWallPromoter)localPromoter);
        }
      }
      if (this.a) {
        this.b.a(paramInt, localArrayList);
      }
      for (;;)
      {
        paramList = new m.a(this.b.b).a(0).b(0).g(this.b.a.getTimeConsuming()).d(5).c(this.b.a.layoutType).a((Promoter[])localArrayList.toArray(new Promoter[0])).f(c.a(this.b.b, this.b.a)).a(this.b.a.slot_id).a(this.b.a.sessionId, this.b.a.psid).a();
        new XpReportClient(this.b.b).sendAsync(paramList, null);
        return;
        this.b.b(paramInt, localArrayList);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\d$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */