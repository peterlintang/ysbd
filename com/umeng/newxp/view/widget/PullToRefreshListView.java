package com.umeng.newxp.view.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.umeng.newxp.view.widget.pulltorefresh.LoadingLayoutProxy;
import com.umeng.newxp.view.widget.pulltorefresh.PTFMapper;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshAdapterViewBase;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.AnimationStyle;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Mode;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Orientation;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.State;
import com.umeng.newxp.view.widget.pulltorefresh.internal.LoadingLayout;

public class PullToRefreshListView
  extends PullToRefreshAdapterViewBase<ListView>
{
  private LoadingLayout o;
  private LoadingLayout p;
  private FrameLayout q;
  private boolean r;
  
  public PullToRefreshListView(Context paramContext)
  {
    super(paramContext);
  }
  
  public PullToRefreshListView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public PullToRefreshListView(Context paramContext, PullToRefreshBase.Mode paramMode)
  {
    super(paramContext, paramMode);
  }
  
  public PullToRefreshListView(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.AnimationStyle paramAnimationStyle)
  {
    super(paramContext, paramMode, paramAnimationStyle);
  }
  
  protected ListView a(Context paramContext, AttributeSet paramAttributeSet)
  {
    if (Build.VERSION.SDK_INT >= 9) {
      return new PullToRefreshListView.InternalListViewSDK9(this, paramContext, paramAttributeSet);
    }
    return new PullToRefreshListView.InternalListView(this, paramContext, paramAttributeSet);
  }
  
  protected LoadingLayoutProxy a(boolean paramBoolean1, boolean paramBoolean2)
  {
    LoadingLayoutProxy localLoadingLayoutProxy = super.a(paramBoolean1, paramBoolean2);
    if (this.r)
    {
      PullToRefreshBase.Mode localMode = g();
      if ((paramBoolean1) && (localMode.c())) {
        localLoadingLayoutProxy.a(this.o);
      }
      if ((paramBoolean2) && (localMode.d())) {
        localLoadingLayoutProxy.a(this.p);
      }
    }
    return localLoadingLayoutProxy;
  }
  
  public final PullToRefreshBase.Orientation a()
  {
    return PullToRefreshBase.Orientation.a;
  }
  
  protected void a(TypedArray paramTypedArray)
  {
    super.a(paramTypedArray);
    this.r = paramTypedArray.getBoolean(PTFMapper.R(getContext()), true);
    if (this.r)
    {
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-1, -2, 1);
      FrameLayout localFrameLayout = new FrameLayout(getContext());
      this.o = a(getContext(), PullToRefreshBase.Mode.b, paramTypedArray);
      this.o.setVisibility(8);
      localFrameLayout.addView(this.o, localLayoutParams);
      ((ListView)this.n).addHeaderView(localFrameLayout, null, false);
      this.q = new FrameLayout(getContext());
      this.p = a(getContext(), PullToRefreshBase.Mode.c, paramTypedArray);
      this.p.setVisibility(8);
      this.q.addView(this.p, localLayoutParams);
      if (!paramTypedArray.hasValue(PTFMapper.Q(getContext()))) {
        e(true);
      }
    }
  }
  
  protected void a(boolean paramBoolean)
  {
    Object localObject = ((ListView)this.n).getAdapter();
    if ((!this.r) || (!i()) || (localObject == null) || (((ListAdapter)localObject).isEmpty()))
    {
      super.a(paramBoolean);
      return;
    }
    super.a(false);
    LoadingLayout localLoadingLayout1;
    LoadingLayout localLoadingLayout2;
    int i;
    int j;
    switch (PullToRefreshListView.1.a[d().ordinal()])
    {
    default: 
      localObject = A();
      localLoadingLayout1 = this.o;
      localLoadingLayout2 = this.p;
      i = getScrollY() + B();
      j = 0;
    }
    for (;;)
    {
      ((LoadingLayout)localObject).k();
      ((LoadingLayout)localObject).g();
      localLoadingLayout2.setVisibility(8);
      localLoadingLayout1.setVisibility(0);
      localLoadingLayout1.i();
      if (!paramBoolean) {
        break;
      }
      x();
      a(i);
      ((ListView)this.n).setSelection(j);
      b(0);
      return;
      localObject = y();
      localLoadingLayout1 = this.p;
      localLoadingLayout2 = this.o;
      j = ((ListView)this.n).getCount() - 1;
      i = getScrollY() - z();
    }
  }
  
  protected void b()
  {
    int j = 0;
    int i = 1;
    if (!this.r)
    {
      super.b();
      return;
    }
    LoadingLayout localLoadingLayout2;
    LoadingLayout localLoadingLayout1;
    int k;
    switch (PullToRefreshListView.1.a[d().ordinal()])
    {
    default: 
      localLoadingLayout2 = A();
      localLoadingLayout1 = this.o;
      k = -B();
      if (Math.abs(((ListView)this.n).getFirstVisiblePosition() + 0) > 1) {
        break;
      }
    }
    for (;;)
    {
      if (localLoadingLayout1.getVisibility() == 0)
      {
        localLoadingLayout2.l();
        localLoadingLayout1.setVisibility(8);
        if ((i != 0) && (j() != PullToRefreshBase.State.e))
        {
          ((ListView)this.n).setSelection(j);
          a(k);
        }
      }
      super.b();
      return;
      localLoadingLayout2 = y();
      localLoadingLayout1 = this.p;
      j = ((ListView)this.n).getCount() - 1;
      k = z();
      if (Math.abs(((ListView)this.n).getLastVisiblePosition() - j) <= 1) {}
      for (i = 1;; i = 0) {
        break;
      }
      i = 0;
    }
  }
  
  protected ListView c(Context paramContext, AttributeSet paramAttributeSet)
  {
    paramContext = a(paramContext, paramAttributeSet);
    paramContext.setId(16908298);
    return paramContext;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\PullToRefreshListView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */