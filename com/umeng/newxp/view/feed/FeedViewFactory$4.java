package com.umeng.newxp.view.feed;

import android.app.Activity;
import android.view.View;
import com.umeng.newxp.controller.ExchangeDataService;

final class FeedViewFactory$4
  extends ItemClickStrip.a
{
  FeedViewFactory$4(Feed paramFeed, Activity paramActivity) {}
  
  public final void onItemClick(View paramView, int paramInt)
  {
    if ((paramView instanceof a))
    {
      paramView = ((a)paramView).a;
      this.a.c.clickOnPromoter(this.b, paramView);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */