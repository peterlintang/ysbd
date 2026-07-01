package com.umeng.xp.view;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.xp.a.e;
import com.umeng.xp.controller.ExchangeDataService;

class EmbededContainer$a$a
  implements AbsListView.OnScrollListener
{
  private ExchangeDataService b;
  private boolean c = false;
  
  public EmbededContainer$a$a(EmbededContainer.a parama, ExchangeDataService paramExchangeDataService)
  {
    this.b = paramExchangeDataService;
  }
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 == 0) && (paramInt2 == paramInt3))
    {
      this.c = true;
      return;
    }
    this.c = false;
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (!this.c)
    {
      if (EmbededContainer.a.a(this.a).getVisibility() != 0)
      {
        EmbededContainer.a.a(this.a).setVisibility(0);
        EmbededContainer.a.a(this.a).startAnimation(EmbededContainer.f(this.a.a));
        EmbededContainer.a.b(this.a).setText(e.h(EmbededContainer.c(this.a.a)));
      }
      if ((Math.abs(EmbededContainer.b(this.a.a).getLastVisiblePosition() - EmbededContainer.b(this.a.a).getCount()) <= 2) && (paramInt == 0)) {
        EmbededContainer.a.c(this.a);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\EmbededContainer$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */