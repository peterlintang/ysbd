package com.umeng.newxp.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.GridView;
import com.umeng.newxp.view.widget.pulltorefresh.internal.EmptyViewMethodAccessor;

class PullToRefreshGridView$InternalGridView
  extends GridView
  implements EmptyViewMethodAccessor
{
  public PullToRefreshGridView$InternalGridView(PullToRefreshGridView paramPullToRefreshGridView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public void a(View paramView)
  {
    super.setEmptyView(paramView);
  }
  
  public void setEmptyView(View paramView)
  {
    this.a.a(paramView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\PullToRefreshGridView$InternalGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */