package com.umeng.newxp.view.feed;

import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.Set;

final class FeedViewFactory$3
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  FeedViewFactory$3(DragViewPager paramDragViewPager, Feed paramFeed) {}
  
  public final void onGlobalLayout()
  {
    int i = this.a.getCurrentItem();
    Object localObject = this.a.getChildAt(i);
    if ((localObject instanceof b))
    {
      localObject = (b)localObject;
      if ((((b)localObject).a != null) && (!this.b.d.contains(Integer.valueOf(i))))
      {
        this.b.c.reportImpression(new Promoter[] { ((b)localObject).a });
        this.b.d.add(Integer.valueOf(i));
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */