package com.umeng.newxp.view.feed;

import android.view.View.MeasureSpec;

final class FeedViewFactory$7
  implements e.a
{
  boolean a = false;
  
  FeedViewFactory$7(ItemClickStrip paramItemClickStrip, Feed paramFeed) {}
  
  public final void onMeasured(int paramInt1, int paramInt2)
  {
    paramInt1 = View.MeasureSpec.getSize(paramInt1);
    View.MeasureSpec.getSize(paramInt2);
    if ((!this.a) && (paramInt1 > 0))
    {
      paramInt1 = (paramInt1 - this.b.getLayoutMargin() * 2) / 3;
      this.b.setAdapter(new d(this.c.a, paramInt1, this.c.c));
      this.a = true;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\FeedViewFactory$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */