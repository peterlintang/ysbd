package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.widget.AbsListView;
import com.taobao.munion.animationadapter.b.e;

class FavNotSyncFragment$NotSyncRequestListTask$1
  implements b.e
{
  FavNotSyncFragment$NotSyncRequestListTask$1(FavNotSyncFragment.NotSyncRequestListTask paramNotSyncRequestListTask) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.this$1.this$0.visibleLastIndex = (paramInt1 + paramInt2 - 1);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((this.this$1.this$0.mAdapter != null) && (paramInt == 0))
    {
      this.this$1.this$0.mPosition = paramAbsListView.getFirstVisiblePosition();
      this.this$1.this$0.mFirstItemTop = paramAbsListView.getChildAt(0).getTop();
      paramInt = this.this$1.this$0.mAdapter.getCount();
      if ((!this.this$1.this$0.isNoLoadMore) && (!FavNotSyncFragment.access$100(this.this$1.this$0)) && (this.this$1.this$0.visibleLastIndex == paramInt - 1))
      {
        FavNotSyncFragment.access$102(this.this$1.this$0, true);
        this.this$1.this$0.loadMore(this.this$1.this$0.mCurrentPage + 1);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavNotSyncFragment$NotSyncRequestListTask$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */