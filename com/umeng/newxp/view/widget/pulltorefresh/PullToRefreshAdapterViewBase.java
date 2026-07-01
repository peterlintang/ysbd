package com.umeng.newxp.view.widget.pulltorefresh;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import com.umeng.newxp.view.widget.pulltorefresh.internal.EmptyViewMethodAccessor;
import com.umeng.newxp.view.widget.pulltorefresh.internal.IndicatorLayout;

public abstract class PullToRefreshAdapterViewBase<T extends AbsListView>
  extends PullToRefreshBase<T>
  implements AbsListView.OnScrollListener
{
  private boolean o;
  private AbsListView.OnScrollListener p;
  private PullToRefreshBase.OnLastItemVisibleListener q;
  private View r;
  private IndicatorLayout s;
  private IndicatorLayout t;
  private boolean u;
  private boolean v = true;
  
  public PullToRefreshAdapterViewBase(Context paramContext)
  {
    super(paramContext);
    ((AbsListView)this.n).setOnScrollListener(this);
  }
  
  public PullToRefreshAdapterViewBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    ((AbsListView)this.n).setOnScrollListener(this);
  }
  
  public PullToRefreshAdapterViewBase(Context paramContext, PullToRefreshBase.Mode paramMode)
  {
    super(paramContext, paramMode);
    ((AbsListView)this.n).setOnScrollListener(this);
  }
  
  public PullToRefreshAdapterViewBase(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.AnimationStyle paramAnimationStyle)
  {
    super(paramContext, paramMode, paramAnimationStyle);
    ((AbsListView)this.n).setOnScrollListener(this);
  }
  
  private void G()
  {
    Object localObject = g();
    FrameLayout localFrameLayout = E();
    if ((((PullToRefreshBase.Mode)localObject).c()) && (this.s == null))
    {
      this.s = new IndicatorLayout(getContext(), PullToRefreshBase.Mode.b);
      FrameLayout.LayoutParams localLayoutParams = new FrameLayout.LayoutParams(-2, -2);
      localLayoutParams.rightMargin = getResources().getDimensionPixelSize(PTFMapper.o(getContext()));
      localLayoutParams.gravity = 53;
      localFrameLayout.addView(this.s, localLayoutParams);
    }
    do
    {
      while ((((PullToRefreshBase.Mode)localObject).d()) && (this.t == null))
      {
        this.t = new IndicatorLayout(getContext(), PullToRefreshBase.Mode.c);
        localObject = new FrameLayout.LayoutParams(-2, -2);
        ((FrameLayout.LayoutParams)localObject).rightMargin = getResources().getDimensionPixelSize(PTFMapper.o(getContext()));
        ((FrameLayout.LayoutParams)localObject).gravity = 85;
        localFrameLayout.addView(this.t, (ViewGroup.LayoutParams)localObject);
        return;
        if ((!((PullToRefreshBase.Mode)localObject).c()) && (this.s != null))
        {
          localFrameLayout.removeView(this.s);
          this.s = null;
        }
      }
    } while ((((PullToRefreshBase.Mode)localObject).d()) || (this.t == null));
    localFrameLayout.removeView(this.t);
    this.t = null;
  }
  
  private boolean H()
  {
    return (this.u) && (k());
  }
  
  private boolean I()
  {
    Object localObject = ((AbsListView)this.n).getAdapter();
    if ((localObject == null) || (((Adapter)localObject).isEmpty())) {
      return true;
    }
    if (((AbsListView)this.n).getFirstVisiblePosition() <= 1)
    {
      localObject = ((AbsListView)this.n).getChildAt(0);
      if (localObject != null) {
        return ((View)localObject).getTop() >= ((AbsListView)this.n).getTop();
      }
    }
    return false;
  }
  
  private boolean J()
  {
    Object localObject = ((AbsListView)this.n).getAdapter();
    if ((localObject == null) || (((Adapter)localObject).isEmpty())) {
      return true;
    }
    int j = ((AbsListView)this.n).getCount() - 1;
    int i = ((AbsListView)this.n).getLastVisiblePosition();
    new StringBuilder("isLastItemVisible. Last Item Position: ").append(j).append(" Last Visible Pos: ").append(i).toString();
    if (i >= j - 1)
    {
      j = ((AbsListView)this.n).getFirstVisiblePosition();
      localObject = ((AbsListView)this.n).getChildAt(i - j);
      if (localObject != null) {
        return ((View)localObject).getBottom() <= ((AbsListView)this.n).getBottom();
      }
    }
    return false;
  }
  
  private void K()
  {
    if (this.s != null)
    {
      E().removeView(this.s);
      this.s = null;
    }
    if (this.t != null)
    {
      E().removeView(this.t);
      this.t = null;
    }
  }
  
  private void L()
  {
    if (this.s != null)
    {
      if ((m()) || (!t())) {
        break label77;
      }
      if (!this.s.a()) {
        this.s.c();
      }
    }
    label77:
    do
    {
      for (;;)
      {
        if (this.t != null)
        {
          if ((m()) || (!u())) {
            break;
          }
          if (!this.t.a()) {
            this.t.c();
          }
        }
        return;
        if (this.s.a()) {
          this.s.b();
        }
      }
    } while (!this.t.a());
    this.t.b();
  }
  
  private static FrameLayout.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    FrameLayout.LayoutParams localLayoutParams = null;
    if (paramLayoutParams != null)
    {
      localLayoutParams = new FrameLayout.LayoutParams(paramLayoutParams);
      if ((paramLayoutParams instanceof LinearLayout.LayoutParams)) {
        localLayoutParams.gravity = ((LinearLayout.LayoutParams)paramLayoutParams).gravity;
      }
    }
    else
    {
      return localLayoutParams;
    }
    localLayoutParams.gravity = 17;
    return localLayoutParams;
  }
  
  protected void a(TypedArray paramTypedArray)
  {
    int i = PTFMapper.J(getContext());
    if (!l()) {}
    for (boolean bool = true;; bool = false)
    {
      this.u = paramTypedArray.getBoolean(i, bool);
      return;
    }
  }
  
  public final void a(View paramView)
  {
    FrameLayout localFrameLayout = E();
    if (paramView != null)
    {
      paramView.setClickable(true);
      Object localObject = paramView.getParent();
      if ((localObject != null) && ((localObject instanceof ViewGroup))) {
        ((ViewGroup)localObject).removeView(paramView);
      }
      localObject = a(paramView.getLayoutParams());
      if (localObject != null) {
        localFrameLayout.addView(paramView, (ViewGroup.LayoutParams)localObject);
      }
    }
    else
    {
      if (!(this.n instanceof EmptyViewMethodAccessor)) {
        break label93;
      }
      ((EmptyViewMethodAccessor)this.n).a(paramView);
    }
    for (;;)
    {
      this.r = paramView;
      return;
      localFrameLayout.addView(paramView);
      break;
      label93:
      ((AbsListView)this.n).setEmptyView(paramView);
    }
  }
  
  public final void a(AbsListView.OnScrollListener paramOnScrollListener)
  {
    this.p = paramOnScrollListener;
  }
  
  public void a(AdapterView.OnItemClickListener paramOnItemClickListener)
  {
    ((AbsListView)this.n).setOnItemClickListener(paramOnItemClickListener);
  }
  
  public void a(ListAdapter paramListAdapter)
  {
    ((AdapterView)this.n).setAdapter(paramListAdapter);
  }
  
  public final void a(PullToRefreshBase.OnLastItemVisibleListener paramOnLastItemVisibleListener)
  {
    this.q = paramOnLastItemVisibleListener;
  }
  
  protected void a(boolean paramBoolean)
  {
    super.a(paramBoolean);
    if (H()) {
      L();
    }
  }
  
  protected void b()
  {
    super.b();
    if (H()) {
      L();
    }
  }
  
  public final void g(boolean paramBoolean)
  {
    this.v = paramBoolean;
  }
  
  public void h(boolean paramBoolean)
  {
    this.u = paramBoolean;
    if (H())
    {
      G();
      return;
    }
    K();
  }
  
  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    new StringBuilder("First Visible: ").append(paramInt1).append(". Visible Count: ").append(paramInt2).append(". Total Items:").append(paramInt3).toString();
    if (this.q != null) {
      if ((paramInt3 <= 0) || (paramInt1 + paramInt2 < paramInt3 - 1)) {
        break label103;
      }
    }
    label103:
    for (boolean bool = true;; bool = false)
    {
      this.o = bool;
      if (H()) {
        L();
      }
      if (this.p != null) {
        this.p.onScroll(paramAbsListView, paramInt1, paramInt2, paramInt3);
      }
      return;
    }
  }
  
  protected void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    if ((this.r != null) && (!this.v)) {
      this.r.scrollTo(-paramInt1, -paramInt2);
    }
  }
  
  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    if ((paramInt == 0) && (this.q != null) && (this.o)) {
      this.q.a();
    }
    if (this.p != null) {
      this.p.onScrollStateChanged(paramAbsListView, paramInt);
    }
  }
  
  public boolean q()
  {
    return this.u;
  }
  
  protected void r()
  {
    super.r();
    if (H()) {}
    switch (PullToRefreshAdapterViewBase.1.a[d().ordinal()])
    {
    default: 
      return;
    case 1: 
      this.t.e();
      return;
    }
    this.s.e();
  }
  
  protected void s()
  {
    super.s();
    if (H()) {}
    switch (PullToRefreshAdapterViewBase.1.a[d().ordinal()])
    {
    default: 
      return;
    case 1: 
      this.t.d();
      return;
    }
    this.s.d();
  }
  
  protected boolean t()
  {
    return I();
  }
  
  protected boolean u()
  {
    return J();
  }
  
  protected void v()
  {
    super.v();
    if (H())
    {
      G();
      return;
    }
    K();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\PullToRefreshAdapterViewBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */