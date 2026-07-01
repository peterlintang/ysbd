package com.umeng.newxp.view.handler.umwall;

import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import com.umeng.newxp.view.handler.utils.c;

class UMWallFragment$5
  implements AbsListView.OnScrollListener
{
  UMWallFragment$5(UMWallFragment paramUMWallFragment) {}
  
  public void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt1 > 0) && (!this.a.g) && (!this.a.h) && (paramInt1 + paramInt2 == paramInt3)) {
      this.a.a();
    }
    if ((!this.a.j) && (!this.a.g) && (!this.a.h) && (paramInt2 > 0) && (paramInt1 == 0) && (paramInt3 == paramInt2 - paramInt1))
    {
      this.a.a();
      this.a.j = true;
      UMWallFragment.b();
    }
  }
  
  public void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if (paramInt == 2)
    {
      this.a.k.c(true);
      return;
    }
    this.a.k.c(false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWallFragment$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */