package com.umeng.socialize.view.wigets;

import android.view.View;
import android.view.View.OnClickListener;

class PullToRefreshListView$a
  implements View.OnClickListener
{
  private PullToRefreshListView$a(PullToRefreshListView paramPullToRefreshListView) {}
  
  public void onClick(View paramView)
  {
    if (PullToRefreshListView.access$0(this.a) != 4)
    {
      this.a.prepareForRefresh();
      this.a.onRefresh();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\PullToRefreshListView$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */