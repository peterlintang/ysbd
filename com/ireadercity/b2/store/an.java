package com.ireadercity.b2.store;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import java.util.HashMap;
import java.util.List;

final class an
  implements AbsListView.OnScrollListener
{
  private an(ak paramak) {}
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt1 + paramInt2 >= paramInt3) {}
    for (int i = 1;; i = 0)
    {
      if ((i != 0) && (ak.b(this.a).size() > 0) && ((!ak.c(this.a).containsKey(Integer.valueOf(paramInt3))) || (((Integer)ak.c(this.a).get(Integer.valueOf(paramInt3))).intValue() == 0)))
      {
        ak.c(this.a).put(Integer.valueOf(paramInt3), Integer.valueOf(1));
        new StringBuilder("loadBooks.... firstVisibleItem=").append(paramInt1).append(" visibleItemCount=").append(paramInt2).append(" totalItemCount=").append(paramInt3).toString();
        this.a.a(ak.d(this.a));
      }
      return;
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */