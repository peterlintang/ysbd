package com.umeng.newxp.view.widget.pulltorefresh;

import android.view.View;
import android.view.animation.Interpolator;

public abstract interface IPullToRefresh<T extends View>
{
  public abstract void a(Interpolator paramInterpolator);
  
  public abstract void a(PullToRefreshBase.Mode paramMode);
  
  public abstract void a(PullToRefreshBase.OnPullEventListener<T> paramOnPullEventListener);
  
  public abstract void a(PullToRefreshBase.OnRefreshListener2<T> paramOnRefreshListener2);
  
  public abstract void a(PullToRefreshBase.OnRefreshListener<T> paramOnRefreshListener);
  
  public abstract ILoadingLayout b(boolean paramBoolean1, boolean paramBoolean2);
  
  public abstract void b(boolean paramBoolean);
  
  public abstract void c(boolean paramBoolean);
  
  public abstract boolean c();
  
  public abstract PullToRefreshBase.Mode d();
  
  public abstract void d(boolean paramBoolean);
  
  public abstract void e(boolean paramBoolean);
  
  public abstract boolean e();
  
  public abstract ILoadingLayout f();
  
  public abstract void f(boolean paramBoolean);
  
  public abstract PullToRefreshBase.Mode g();
  
  public abstract T h();
  
  public abstract boolean i();
  
  public abstract PullToRefreshBase.State j();
  
  public abstract boolean k();
  
  public abstract boolean l();
  
  public abstract boolean m();
  
  public abstract boolean n();
  
  public abstract void o();
  
  public abstract void p();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\IPullToRefresh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */