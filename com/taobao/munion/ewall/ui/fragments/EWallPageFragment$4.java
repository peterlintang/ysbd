package com.taobao.munion.ewall.ui.fragments;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.umeng.newxp.view.handler.utils.c;

class EWallPageFragment$4
  implements AbsListView.OnScrollListener
{
  EWallPageFragment$4(EWallPageFragment paramEWallPageFragment) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 > 0) && (!this.this$0.isNoMore) && (paramInt1 + paramInt2 == paramInt3)) {
      this.this$0.loadNextPage();
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2)
    {
      this.this$0.getImageFetcher().c(true);
      return;
    }
    this.this$0.getImageFetcher().c(false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */