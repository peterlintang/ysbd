package com.taobao.munion.ewall.ui.fragments;

import android.widget.AbsListView;
import com.taobao.munion.listviewanimations.itemmanipulation.a;
import java.util.ArrayList;
import java.util.LinkedHashSet;

class FavListCommonFragment$4
  implements a
{
  FavListCommonFragment$4(FavListCommonFragment paramFavListCommonFragment) {}
  
  public void onDismiss(AbsListView paramAbsListView, int[] paramArrayOfInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      int k = paramArrayOfInt[i];
      if ((this.this$0.mList != null) && (this.this$0.mList.size() > 0))
      {
        if (this.this$0.mList.size() > k) {
          this.this$0.mList.remove(k);
        }
        this.this$0.mSelectedPositions.clear();
        FavListCommonFragment.access$200(this.this$0);
      }
      i += 1;
    }
    this.this$0.mAdapter.setList(this.this$0.mList);
    if ((this.this$0.mList != null) && (this.this$0.mList.size() <= 0))
    {
      this.this$0.refreshList();
      this.this$0.switchBottomButtonState(FavListCommonFragment.BottomButtonState.normal);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavListCommonFragment$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */