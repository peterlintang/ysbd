package com.umeng.newxp.view.feed;

import android.app.Activity;
import android.view.View;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.List;

final class FeedViewFactory$1
  extends ItemClickViewPager.a
{
  FeedViewFactory$1(Feed paramFeed, Activity paramActivity) {}
  
  public final void onItemClick(View paramView, int paramInt)
  {
    try
    {
      paramView = (Promoter)this.a.a.get(paramInt);
      if (paramView != null) {
        this.a.c.clickOnPromoter(this.b, paramView);
      }
      return;
    }
    catch (IndexOutOfBoundsException paramView)
    {
      for (;;)
      {
        paramView = null;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */