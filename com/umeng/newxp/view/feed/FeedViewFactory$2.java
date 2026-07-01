package com.umeng.newxp.view.feed;

import android.support.v4.view.ViewPager.OnPageChangeListener;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.Set;

final class FeedViewFactory$2
  implements ViewPager.OnPageChangeListener
{
  FeedViewFactory$2(DragViewPager paramDragViewPager, Feed paramFeed) {}
  
  public final void onPageScrollStateChanged(int paramInt) {}
  
  public final void onPageScrolled(int paramInt1, float paramFloat, int paramInt2) {}
  
  public final void onPageSelected(int paramInt)
  {
    Object localObject = this.a.getChildAt(paramInt);
    if ((localObject instanceof b))
    {
      localObject = (b)localObject;
      if ((((b)localObject).a != null) && (!this.b.d.contains(Integer.valueOf(paramInt))))
      {
        this.b.c.reportImpression(new Promoter[] { ((b)localObject).a });
        this.b.d.add(Integer.valueOf(paramInt));
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */