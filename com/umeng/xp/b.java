package com.umeng.xp;

import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.Iterator;
import java.util.List;

class b
  implements XpListenersCenter.ExchangeDataRequestListener
{
  b(a parama) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramList == null) || (paramList.size() <= 0)) {
      this.a.a = a.a.b;
    }
    for (;;)
    {
      return;
      a.a(this.a, paramList, false);
      this.a.a(this.a.b.newTips);
      a.c();
      new StringBuilder().append(this.a.b.oid).append("  : init preload data from server...").toString();
      if (a.a(this.a))
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          Promoter localPromoter = (Promoter)paramList.next();
          a.c();
          new StringBuilder().append(this.a.b.oid).append("  promoter ").append(localPromoter.title).toString();
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */