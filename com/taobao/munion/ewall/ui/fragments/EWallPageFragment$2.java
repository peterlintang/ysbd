package com.taobao.munion.ewall.ui.fragments;

import android.widget.GridView;
import com.taobao.munion.requests.e;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.OnRefreshListener;

class EWallPageFragment$2
  implements PullToRefreshBase.OnRefreshListener<GridView>
{
  EWallPageFragment$2(EWallPageFragment paramEWallPageFragment) {}
  
  public void onRefresh(PullToRefreshBase<GridView> paramPullToRefreshBase)
  {
    new EWallPageFragment.GetPageDataTask(this.this$0, true, true).loadHttpContent(new e(this.this$0.mParent.sEWallMainBean, this.this$0.mEWallTabBean));
    this.this$0.isNoMore = false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */