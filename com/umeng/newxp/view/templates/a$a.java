package com.umeng.newxp.view.templates;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.common.ExchangeConstants;

public class a$a
  implements AbsListView.OnScrollListener
{
  private boolean b = false;
  
  public a$a(a parama) {}
  
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
      if (a.e(this.a).getVisibility() != 0)
      {
        a.f(this.a).setVisibility(0);
        a.f(this.a).startAnimation(a.g(this.a));
        a.e(this.a).setVisibility(0);
        a.e(this.a).setClickable(false);
      }
      if ((Math.abs(a.c(this.a).getLastVisiblePosition() - a.c(this.a).getCount()) <= 2) && (paramInt == 0))
      {
        Log.c(ExchangeConstants.LOG_TAG, "requesting next page...");
        this.a.a();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */