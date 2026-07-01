package com.umeng.xp.view;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import com.umeng.common.Log;
import com.umeng.xp.common.ExchangeConstants;

public class w$a
  implements AbsListView.OnScrollListener
{
  private boolean b = false;
  
  public w$a(w paramw) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 0) && (paramInt2 == paramInt3))
    {
      this.b = true;
      return;
    }
    this.b = false;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (!this.b)
    {
      if (w.e(this.a).getVisibility() != 0)
      {
        w.f(this.a).setVisibility(0);
        w.f(this.a).startAnimation(w.g(this.a));
        w.e(this.a).setVisibility(0);
        w.e(this.a).setClickable(false);
      }
      if ((Math.abs(w.c(this.a).getLastVisiblePosition() - w.c(this.a).getCount()) <= 2) && (paramInt == 0))
      {
        Log.c(ExchangeConstants.LOG_TAG, "requesting next page...");
        this.a.a();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\w$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */