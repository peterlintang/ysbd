package com.umeng.newxp.view.widget;

import android.content.Context;
import android.util.AttributeSet;
import com.umeng.newxp.view.widget.pulltorefresh.OverscrollHelper;

final class PullToRefreshGridView$InternalGridViewSDK9
  extends PullToRefreshGridView.InternalGridView
{
  public PullToRefreshGridView$InternalGridViewSDK9(PullToRefreshGridView paramPullToRefreshGridView, Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramPullToRefreshGridView, paramContext, paramAttributeSet);
  }
  
  protected final boolean overScrollBy(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, boolean paramBoolean)
  {
    boolean bool = super.overScrollBy(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBoolean);
    OverscrollHelper.a(this.b, paramInt1, paramInt3, paramInt2, paramInt4, paramBoolean);
    return bool;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\PullToRefreshGridView$InternalGridViewSDK9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */