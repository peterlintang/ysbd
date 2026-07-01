package com.umeng.newxp.view.widget.pulltorefresh;

import android.view.View;

public final class OverscrollHelper
{
  static final String a = "OverscrollHelper";
  static final float b = 1.0F;
  
  public static void a(PullToRefreshBase<?> paramPullToRefreshBase, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, float paramFloat, boolean paramBoolean)
  {
    int i;
    int k;
    int j;
    PullToRefreshBase.Mode localMode;
    switch (OverscrollHelper.1.a[paramPullToRefreshBase.a().ordinal()])
    {
    default: 
      i = paramPullToRefreshBase.getScrollY();
      k = paramInt3;
      j = paramInt4;
      if ((paramPullToRefreshBase.l()) && (!paramPullToRefreshBase.m()))
      {
        localMode = paramPullToRefreshBase.g();
        if ((!localMode.b()) || (paramBoolean) || (k == 0)) {
          break label308;
        }
        j += k;
        new StringBuilder("OverScroll. DeltaX: ").append(paramInt1).append(", ScrollX: ").append(paramInt2).append(", DeltaY: ").append(paramInt3).append(", ScrollY: ").append(paramInt4).append(", NewY: ").append(j).append(", ScrollRange: ").append(paramInt5).append(", CurrentScroll: ").append(i).toString();
        if (j >= 0 - paramInt6) {
          break label223;
        }
        if (localMode.c())
        {
          if (i == 0) {
            paramPullToRefreshBase.a(PullToRefreshBase.State.f, new boolean[0]);
          }
          paramPullToRefreshBase.a((int)((j + i) * paramFloat));
        }
      }
      break;
    }
    label223:
    label274:
    label308:
    while ((!paramBoolean) || (PullToRefreshBase.State.f != paramPullToRefreshBase.j()))
    {
      do
      {
        do
        {
          return;
          i = paramPullToRefreshBase.getScrollX();
          k = paramInt1;
          j = paramInt2;
          break;
          if (j <= paramInt5 + paramInt6) {
            break label274;
          }
        } while (!localMode.d());
        if (i == 0) {
          paramPullToRefreshBase.a(PullToRefreshBase.State.f, new boolean[0]);
        }
        paramPullToRefreshBase.a((int)((j + i - paramInt5) * paramFloat));
        return;
      } while ((Math.abs(j) > paramInt6) && (Math.abs(j - paramInt5) > paramInt6));
      paramPullToRefreshBase.a(PullToRefreshBase.State.a, new boolean[0]);
      return;
    }
    paramPullToRefreshBase.a(PullToRefreshBase.State.a, new boolean[0]);
  }
  
  public static void a(PullToRefreshBase<?> paramPullToRefreshBase, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, boolean paramBoolean)
  {
    a(paramPullToRefreshBase, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, 1.0F, paramBoolean);
  }
  
  public static void a(PullToRefreshBase<?> paramPullToRefreshBase, int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean)
  {
    a(paramPullToRefreshBase, paramInt1, paramInt2, paramInt3, paramInt4, 0, paramBoolean);
  }
  
  static boolean a(View paramView)
  {
    return paramView.getOverScrollMode() != 2;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\OverscrollHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */