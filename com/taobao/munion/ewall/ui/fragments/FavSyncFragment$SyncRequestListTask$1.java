package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.widget.AbsListView;
import android.widget.ListView;
import com.taobao.munion.animationadapter.b.e;

class FavSyncFragment$SyncRequestListTask$1
  implements b.e
{
  FavSyncFragment$SyncRequestListTask$1(FavSyncFragment.SyncRequestListTask paramSyncRequestListTask) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.this$1.this$0.visibleLastIndex = (paramInt1 + paramInt2 - 1);
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((this.this$1.this$0.mAdapter != null) && (paramInt == 0))
    {
      this.this$1.this$0.mPosition = this.this$1.this$0.mListView.getFirstVisiblePosition();
      this.this$1.this$0.mFirstItemTop = paramAbsListView.getChildAt(0).getTop();
      paramInt = this.this$1.this$0.mAdapter.getCount();
      if ((!this.this$1.this$0.isNoLoadMore) && (!FavSyncFragment.access$100(this.this$1.this$0)) && (this.this$1.this$0.visibleLastIndex == paramInt - 1))
      {
        FavSyncFragment.access$102(this.this$1.this$0, true);
        this.this$1.this$0.loadMore(this.this$1.this$0.mCurrentPage + 1);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavSyncFragment$SyncRequestListTask$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */