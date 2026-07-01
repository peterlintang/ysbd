package com.umeng.newxp.view.feed;

import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;
import java.util.Queue;

class FeedsManager$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  FeedsManager$1(FeedsManager paramFeedsManager, FeedsManager.a parama) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    Feed localFeed;
    if ((paramInt == 1) && (paramList != null) && (paramList.size() > 0))
    {
      localFeed = new Feed(this.a.a);
      localFeed.b = this.a.b;
      if (this.a.a.displayType.equals("icon"))
      {
        localFeed.style = Feed.a.a;
        localFeed.a = paramList;
        this.b.d.add(localFeed);
        if (this.b.e != null) {
          this.b.e.onComplete(1, localFeed, this.a.b);
        }
        Log.a(FeedsManager.a, "make feed product " + String.valueOf(localFeed.getTag()));
      }
    }
    for (;;)
    {
      this.b.c.remove(this.a);
      if (this.b.c.size() == 0) {
        this.b.f = false;
      }
      return;
      localFeed.style = Feed.a.b;
      break;
      if (this.b.e != null) {
        this.b.e.onComplete(0, null, this.a.b);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedsManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */