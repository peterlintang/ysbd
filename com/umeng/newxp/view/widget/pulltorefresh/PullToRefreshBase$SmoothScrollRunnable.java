package com.umeng.newxp.view.widget.pulltorefresh;

import android.view.animation.Interpolator;
import com.umeng.newxp.view.widget.pulltorefresh.internal.ViewCompat;

final class PullToRefreshBase$SmoothScrollRunnable
  implements Runnable
{
  private final Interpolator b;
  private final int c;
  private final int d;
  private final long e;
  private final PullToRefreshBase.OnSmoothScrollFinishedListener f;
  private boolean g = true;
  private long h = -1L;
  private int i = -1;
  
  public PullToRefreshBase$SmoothScrollRunnable(PullToRefreshBase paramPullToRefreshBase, int paramInt1, int paramInt2, long paramLong, PullToRefreshBase.OnSmoothScrollFinishedListener paramOnSmoothScrollFinishedListener)
  {
    this.d = paramInt1;
    this.c = paramInt2;
    this.b = PullToRefreshBase.b(paramPullToRefreshBase);
    this.e = paramLong;
    this.f = paramOnSmoothScrollFinishedListener;
  }
  
  public final void a()
  {
    this.g = false;
    this.a.removeCallbacks(this);
  }
  
  public final void run()
  {
    if (this.h == -1L)
    {
      this.h = System.currentTimeMillis();
      if ((!this.g) || (this.c == this.i)) {
        break label128;
      }
      ViewCompat.a(this.a, this);
    }
    label128:
    while (this.f == null)
    {
      return;
      long l = Math.max(Math.min((System.currentTimeMillis() - this.h) * 1000L / this.e, 1000L), 0L);
      float f1 = this.d - this.c;
      int j = Math.round(this.b.getInterpolation((float)l / 1000.0F) * f1);
      this.i = (this.d - j);
      this.a.a(this.i);
      break;
    }
    this.f.a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\PullToRefreshBase$SmoothScrollRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */