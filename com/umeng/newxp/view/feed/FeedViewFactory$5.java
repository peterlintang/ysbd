package com.umeng.newxp.view.feed;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.AbsHorizontalStrip.b;
import java.util.Set;

final class FeedViewFactory$5
  implements AbsHorizontalStrip.b
{
  FeedViewFactory$5(Feed paramFeed, ItemClickStrip paramItemClickStrip) {}
  
  public final void onChildVisibleChanged(int paramInt1, int paramInt2)
  {
    while (paramInt1 <= paramInt2)
    {
      Object localObject;
      if (!this.a.d.contains(Integer.valueOf(paramInt1))) {
        localObject = this.b.getChildAt(paramInt1);
      }
      try
      {
        if ((localObject instanceof a))
        {
          localObject = ((a)localObject).a;
          ExchangeDataService localExchangeDataService = this.a.c;
          if (localObject != null) {
            localExchangeDataService.reportImpression(new Promoter[] { localObject });
          }
        }
        this.a.d.add(Integer.valueOf(paramInt1));
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      paramInt1 += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */