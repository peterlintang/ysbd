package com.umeng.newxp.view.widget.pulltorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import com.umeng.newxp.view.widget.pulltorefresh.internal.FlipLoadingLayout;
import com.umeng.newxp.view.widget.pulltorefresh.internal.LoadingLayout;
import com.umeng.newxp.view.widget.pulltorefresh.internal.RotateLoadingLayout;

public enum PullToRefreshBase$AnimationStyle
{
  private PullToRefreshBase$AnimationStyle() {}
  
  static AnimationStyle a()
  {
    return a;
  }
  
  static AnimationStyle a(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return a;
    }
    return b;
  }
  
  final LoadingLayout a(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.Orientation paramOrientation, TypedArray paramTypedArray)
  {
    switch (PullToRefreshBase.4.d[ordinal()])
    {
    default: 
      return new RotateLoadingLayout(paramContext, paramMode, paramOrientation, paramTypedArray);
    }
    return new FlipLoadingLayout(paramContext, paramMode, paramOrientation, paramTypedArray);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\PullToRefreshBase$AnimationStyle.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */