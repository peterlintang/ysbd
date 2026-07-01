package com.umeng.newxp.view.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.GridView;
import com.umeng.newxp.a.c;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshAdapterViewBase;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.AnimationStyle;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Mode;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Orientation;

public class PullToRefreshGridView
  extends PullToRefreshAdapterViewBase<GridView>
{
  public PullToRefreshGridView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PullToRefreshGridView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PullToRefreshGridView(Context paramContext, PullToRefreshBase.Mode paramMode)
  {
    super(paramContext, paramMode);
  }
  
  public PullToRefreshGridView(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.AnimationStyle paramAnimationStyle)
  {
    super(paramContext, paramMode, paramAnimationStyle);
  }
  
  protected final GridView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramAttributeSet = new PullToRefreshGridView.InternalGridViewSDK9(this, paramContext, paramAttributeSet);; paramAttributeSet = new PullToRefreshGridView.InternalGridView(this, paramContext, paramAttributeSet))
    {
      paramAttributeSet.setId(c.T(paramContext));
      return paramAttributeSet;
    }
  }
  
  public final PullToRefreshBase.Orientation a()
  {
    return PullToRefreshBase.Orientation.a;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\PullToRefreshGridView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */