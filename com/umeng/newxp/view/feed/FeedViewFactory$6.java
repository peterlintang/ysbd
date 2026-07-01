package com.umeng.newxp.view.feed;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.List;
import java.util.Set;

final class FeedViewFactory$6
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  FeedViewFactory$6(ItemClickStrip paramItemClickStrip, Feed paramFeed) {}
  
  public final void onGlobalLayout()
  {
    List localList = this.a.getVisibleChild();
    if ((localList != null) && (localList.size() > 0))
    {
      int i = ((Integer)localList.get(0)).intValue();
      while (i <= ((Integer)localList.get(localList.size() - 1)).intValue())
      {
        Object localObject;
        if (!this.b.d.contains(Integer.valueOf(i))) {
          localObject = this.a.getChildAt(i);
        }
        try
        {
          if ((localObject instanceof a))
          {
            localObject = ((a)localObject).a;
            ExchangeDataService localExchangeDataService = this.b.c;
            if (localObject != null) {
              localExchangeDataService.reportImpression(new Promoter[] { localObject });
            }
          }
          this.b.d.add(Integer.valueOf(i));
        }
        catch (Exception localException)
        {
          for (;;) {}
        }
        i += 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */