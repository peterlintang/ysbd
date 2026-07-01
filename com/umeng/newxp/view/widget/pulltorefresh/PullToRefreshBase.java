package com.umeng.newxp.view.widget.pulltorefresh;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.taobao.munion.p4p.statistics.a;
import com.umeng.newxp.view.widget.pulltorefresh.internal.LoadingLayout;
import com.umeng.newxp.view.widget.pulltorefresh.internal.Utils;

public abstract class PullToRefreshBase<T extends View>
  extends LinearLayout
  implements IPullToRefresh<T>
{
  static final boolean a = true;
  static final boolean b = false;
  static final String c = "PullToRefresh";
  static final float d = 2.0F;
  public static final int e = 200;
  public static final int f = 325;
  static final int g = 225;
  static final String h = "ptr_state";
  static final String i = "ptr_mode";
  static final String j = "ptr_current_mode";
  static final String k = "ptr_disable_scrolling";
  static final String l = "ptr_show_refreshing_view";
  static final String m = "ptr_super";
  private boolean A = true;
  private boolean B = true;
  private boolean C = true;
  private Interpolator D;
  private PullToRefreshBase.AnimationStyle E = PullToRefreshBase.AnimationStyle.a();
  private LoadingLayout F;
  private LoadingLayout G;
  private PullToRefreshBase.OnRefreshListener<T> H;
  private PullToRefreshBase.OnRefreshListener2<T> I;
  private PullToRefreshBase.OnPullEventListener<T> J;
  private PullToRefreshBase<T>.SmoothScrollRunnable K;
  protected T n;
  private int o;
  private float p;
  private float q;
  private float r;
  private float s;
  private boolean t = false;
  private PullToRefreshBase.State u = PullToRefreshBase.State.a;
  private PullToRefreshBase.Mode v = PullToRefreshBase.Mode.a();
  private PullToRefreshBase.Mode w;
  private FrameLayout x;
  private boolean y = true;
  private boolean z = false;
  
  public PullToRefreshBase(Context paramContext)
  {
    super(paramContext);
    a(paramContext, null);
  }
  
  public PullToRefreshBase(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    a(paramContext, paramAttributeSet);
  }
  
  public PullToRefreshBase(Context paramContext, PullToRefreshBase.Mode paramMode)
  {
    super(paramContext);
    this.v = paramMode;
    a(paramContext, null);
  }
  
  public PullToRefreshBase(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.AnimationStyle paramAnimationStyle)
  {
    super(paramContext);
    this.v = paramMode;
    this.E = paramAnimationStyle;
    a(paramContext, null);
  }
  
  private boolean G()
  {
    switch (PullToRefreshBase.4.c[this.v.ordinal()])
    {
    }
    do
    {
      return false;
      return t();
      return u();
    } while ((!u()) && (!t()));
    return true;
  }
  
  private void H()
  {
    float f2;
    float f1;
    int i2;
    int i1;
    switch (PullToRefreshBase.4.a[a().ordinal()])
    {
    default: 
      f2 = this.s;
      f1 = this.q;
      switch (PullToRefreshBase.4.c[this.w.ordinal()])
      {
      default: 
        i2 = Math.round(Math.min(f2 - f1, 0.0F) / 2.0F);
        i1 = B();
        label87:
        a(i2);
        if ((i2 != 0) && (!m()))
        {
          f1 = Math.abs(i2) / i1;
          switch (PullToRefreshBase.4.c[this.w.ordinal()])
          {
          default: 
            this.F.b(f1);
            label152:
            if ((this.u != PullToRefreshBase.State.b) && (i1 >= Math.abs(i2))) {
              a(PullToRefreshBase.State.b, new boolean[0]);
            }
            break;
          }
        }
        break;
      }
      break;
    }
    while ((this.u != PullToRefreshBase.State.b) || (i1 >= Math.abs(i2)))
    {
      return;
      f2 = this.r;
      f1 = this.p;
      break;
      i2 = Math.round(Math.max(f2 - f1, 0.0F) / 2.0F);
      i1 = z();
      break label87;
      this.G.b(f1);
      break label152;
    }
    a(PullToRefreshBase.State.c, new boolean[0]);
  }
  
  private LinearLayout.LayoutParams I()
  {
    switch (PullToRefreshBase.4.a[a().ordinal()])
    {
    default: 
      return new LinearLayout.LayoutParams(-1, -2);
    }
    return new LinearLayout.LayoutParams(-2, -1);
  }
  
  private int J()
  {
    switch (PullToRefreshBase.4.a[a().ordinal()])
    {
    default: 
      return Math.round(getHeight() / 2.0F);
    }
    return Math.round(getWidth() / 2.0F);
  }
  
  private final void a(int paramInt, long paramLong)
  {
    a(paramInt, paramLong, 0L, null);
  }
  
  private final void a(int paramInt, long paramLong1, long paramLong2, PullToRefreshBase.OnSmoothScrollFinishedListener paramOnSmoothScrollFinishedListener)
  {
    if (this.K != null) {
      this.K.a();
    }
    switch (PullToRefreshBase.4.a[a().ordinal()])
    {
    }
    for (int i1 = getScrollY();; i1 = getScrollX())
    {
      if (i1 != paramInt)
      {
        if (this.D == null) {
          this.D = new DecelerateInterpolator();
        }
        this.K = new PullToRefreshBase.SmoothScrollRunnable(this, i1, paramInt, paramLong1, paramOnSmoothScrollFinishedListener);
        if (paramLong2 <= 0L) {
          break;
        }
        postDelayed(this.K, paramLong2);
      }
      return;
    }
    post(this.K);
  }
  
  private void a(Context paramContext, AttributeSet paramAttributeSet)
  {
    TypedArray localTypedArray;
    switch (PullToRefreshBase.4.a[a().ordinal()])
    {
    default: 
      setOrientation(1);
      setGravity(17);
      this.o = ViewConfiguration.get(paramContext).getScaledTouchSlop();
      localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, PTFMapper.K(paramContext));
      if (localTypedArray.hasValue(PTFMapper.L(paramContext))) {
        this.v = PullToRefreshBase.Mode.a(localTypedArray.getInteger(PTFMapper.L(paramContext), 0));
      }
      if (localTypedArray.hasValue(PTFMapper.M(paramContext))) {
        this.E = PullToRefreshBase.AnimationStyle.a(localTypedArray.getInteger(PTFMapper.M(paramContext), 0));
      }
      this.n = b(paramContext, paramAttributeSet);
      a(paramContext, this.n);
      this.F = a(paramContext, PullToRefreshBase.Mode.b, localTypedArray);
      this.G = a(paramContext, PullToRefreshBase.Mode.c, localTypedArray);
      if (localTypedArray.hasValue(PTFMapper.N(paramContext)))
      {
        paramAttributeSet = localTypedArray.getDrawable(PTFMapper.N(paramContext));
        if (paramAttributeSet != null) {
          this.n.setBackgroundDrawable(paramAttributeSet);
        }
      }
      break;
    }
    for (;;)
    {
      if (localTypedArray.hasValue(PTFMapper.P(paramContext))) {
        this.B = localTypedArray.getBoolean(PTFMapper.P(paramContext), true);
      }
      if (localTypedArray.hasValue(PTFMapper.Q(paramContext))) {
        this.z = localTypedArray.getBoolean(PTFMapper.Q(paramContext), false);
      }
      a(localTypedArray);
      localTypedArray.recycle();
      v();
      return;
      setOrientation(0);
      break;
      if (localTypedArray.hasValue(PTFMapper.O(paramContext)))
      {
        Utils.a("ptrAdapterViewBackground", "ptrRefreshableViewBackground");
        paramAttributeSet = localTypedArray.getDrawable(PTFMapper.O(paramContext));
        if (paramAttributeSet != null) {
          this.n.setBackgroundDrawable(paramAttributeSet);
        }
      }
    }
  }
  
  private void a(Context paramContext, T paramT)
  {
    this.x = new FrameLayout(paramContext);
    this.x.addView(paramT, -1, -1);
    a(this.x, new LinearLayout.LayoutParams(-1, -1));
  }
  
  private final void d(int paramInt)
  {
    a(paramInt, 200L, 0L, new PullToRefreshBase.3(this));
  }
  
  private void q()
  {
    if (this.H != null) {
      this.H.onRefresh(this);
    }
    do
    {
      do
      {
        return;
      } while (this.I == null);
      if (this.w == PullToRefreshBase.Mode.b)
      {
        this.I.a(this);
        return;
      }
    } while (this.w != PullToRefreshBase.Mode.c);
    this.I.b(this);
  }
  
  protected final LoadingLayout A()
  {
    return this.F;
  }
  
  protected final int B()
  {
    return this.F.f();
  }
  
  protected int C()
  {
    return 200;
  }
  
  protected int D()
  {
    return 325;
  }
  
  protected FrameLayout E()
  {
    return this.x;
  }
  
  protected final void F()
  {
    int i6 = (int)(J() * 1.2F);
    int i2 = getPaddingLeft();
    int i5 = getPaddingTop();
    int i3 = getPaddingRight();
    int i4 = getPaddingBottom();
    int i1;
    switch (PullToRefreshBase.4.a[a().ordinal()])
    {
    default: 
      i1 = i4;
      i6 = i3;
      i3 = i5;
      i4 = i2;
      i2 = i6;
    }
    for (;;)
    {
      String.format("Setting Padding. L: %d, T: %d, R: %d, B: %d", new Object[] { Integer.valueOf(i4), Integer.valueOf(i3), Integer.valueOf(i2), Integer.valueOf(i1) });
      setPadding(i4, i3, i2, i1);
      return;
      if (this.v.c()) {
        this.F.b(i6);
      }
      for (i1 = -i6;; i1 = 0)
      {
        if (!this.v.d()) {
          break label200;
        }
        this.G.b(i6);
        i2 = -i6;
        i3 = i5;
        i5 = i1;
        i1 = i4;
        i4 = i5;
        break;
      }
      label200:
      i3 = i5;
      i5 = i1;
      i1 = i4;
      i2 = 0;
      i4 = i5;
      continue;
      if (this.v.c()) {
        this.F.a(i6);
      }
      for (i1 = -i6;; i1 = 0)
      {
        if (!this.v.d()) {
          break label287;
        }
        this.G.a(i6);
        i6 = -i6;
        i4 = i2;
        i5 = i1;
        i1 = i6;
        i2 = i3;
        i3 = i5;
        break;
      }
      label287:
      i4 = i2;
      i5 = i1;
      i1 = 0;
      i2 = i3;
      i3 = i5;
    }
  }
  
  protected LoadingLayoutProxy a(boolean paramBoolean1, boolean paramBoolean2)
  {
    LoadingLayoutProxy localLoadingLayoutProxy = new LoadingLayoutProxy();
    if ((paramBoolean1) && (this.v.c())) {
      localLoadingLayoutProxy.a(this.F);
    }
    if ((paramBoolean2) && (this.v.d())) {
      localLoadingLayoutProxy.a(this.G);
    }
    return localLoadingLayoutProxy;
  }
  
  public abstract PullToRefreshBase.Orientation a();
  
  protected LoadingLayout a(Context paramContext, PullToRefreshBase.Mode paramMode, TypedArray paramTypedArray)
  {
    paramContext = this.E.a(paramContext, paramMode, a(), paramTypedArray);
    paramContext.setVisibility(4);
    return paramContext;
  }
  
  protected final void a(int paramInt)
  {
    new StringBuilder("setHeaderScroll: ").append(paramInt).toString();
    int i1 = J();
    paramInt = Math.min(i1, Math.max(-i1, paramInt));
    if (this.C)
    {
      if (paramInt >= 0) {
        break label89;
      }
      this.F.setVisibility(0);
    }
    for (;;)
    {
      switch (PullToRefreshBase.4.a[a().ordinal()])
      {
      default: 
        return;
        label89:
        if (paramInt > 0)
        {
          this.G.setVisibility(0);
        }
        else
        {
          this.F.setVisibility(4);
          this.G.setVisibility(4);
        }
        break;
      }
    }
    scrollTo(0, paramInt);
    return;
    scrollTo(paramInt, 0);
  }
  
  protected final void a(int paramInt1, int paramInt2)
  {
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)this.x.getLayoutParams();
    switch (PullToRefreshBase.4.a[a().ordinal()])
    {
    }
    do
    {
      do
      {
        return;
      } while (localLayoutParams.width == paramInt1);
      localLayoutParams.width = paramInt1;
      this.x.requestLayout();
      return;
    } while (localLayoutParams.height == paramInt2);
    localLayoutParams.height = paramInt2;
    this.x.requestLayout();
  }
  
  protected final void a(int paramInt, PullToRefreshBase.OnSmoothScrollFinishedListener paramOnSmoothScrollFinishedListener)
  {
    a(paramInt, C(), 0L, paramOnSmoothScrollFinishedListener);
  }
  
  protected void a(TypedArray paramTypedArray) {}
  
  public void a(Drawable paramDrawable)
  {
    f().a(paramDrawable);
  }
  
  public void a(Drawable paramDrawable, PullToRefreshBase.Mode paramMode)
  {
    b(paramMode.c(), paramMode.d()).a(paramDrawable);
  }
  
  protected void a(Bundle paramBundle) {}
  
  protected final void a(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, paramInt, paramLayoutParams);
  }
  
  protected final void a(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    super.addView(paramView, -1, paramLayoutParams);
  }
  
  public void a(Interpolator paramInterpolator)
  {
    this.D = paramInterpolator;
  }
  
  public final void a(PullToRefreshBase.Mode paramMode)
  {
    if (paramMode != this.v)
    {
      new StringBuilder("Setting mode to: ").append(paramMode).toString();
      this.v = paramMode;
      v();
    }
  }
  
  public void a(PullToRefreshBase.OnPullEventListener<T> paramOnPullEventListener)
  {
    this.J = paramOnPullEventListener;
  }
  
  public final void a(PullToRefreshBase.OnRefreshListener2<T> paramOnRefreshListener2)
  {
    this.I = paramOnRefreshListener2;
    this.H = null;
  }
  
  public final void a(PullToRefreshBase.OnRefreshListener<T> paramOnRefreshListener)
  {
    this.H = paramOnRefreshListener;
    this.I = null;
  }
  
  final void a(PullToRefreshBase.State paramState, boolean... paramVarArgs)
  {
    this.u = paramState;
    new StringBuilder("State: ").append(this.u.name()).toString();
    switch (PullToRefreshBase.4.b[this.u.ordinal()])
    {
    }
    for (;;)
    {
      if (this.J != null) {
        this.J.a(this, this.u, this.w);
      }
      return;
      b();
      continue;
      r();
      continue;
      s();
      continue;
      a(paramVarArgs[0]);
    }
  }
  
  public void a(CharSequence paramCharSequence)
  {
    f().a(paramCharSequence);
  }
  
  public void a(CharSequence paramCharSequence, PullToRefreshBase.Mode paramMode)
  {
    b(paramMode.c(), paramMode.d()).b(paramCharSequence);
  }
  
  protected void a(boolean paramBoolean)
  {
    if (this.v.c()) {
      this.F.i();
    }
    if (this.v.d()) {
      this.G.i();
    }
    if (paramBoolean)
    {
      if (this.y)
      {
        PullToRefreshBase.1 local1 = new PullToRefreshBase.1(this);
        switch (PullToRefreshBase.4.c[this.w.ordinal()])
        {
        case 2: 
        default: 
          a(-B(), local1);
          return;
        }
        a(z(), local1);
        return;
      }
      b(0);
      return;
    }
    q();
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    new StringBuilder("addView: ").append(paramView.getClass().getSimpleName()).toString();
    View localView = h();
    if ((localView instanceof ViewGroup))
    {
      ((ViewGroup)localView).addView(paramView, paramInt, paramLayoutParams);
      return;
    }
    throw new UnsupportedOperationException("Refreshable View is not a ViewGroup so can't addView");
  }
  
  protected abstract T b(Context paramContext, AttributeSet paramAttributeSet);
  
  public final ILoadingLayout b(boolean paramBoolean1, boolean paramBoolean2)
  {
    return a(paramBoolean1, paramBoolean2);
  }
  
  protected void b()
  {
    this.t = false;
    this.C = true;
    this.F.k();
    this.G.k();
    b(0);
  }
  
  protected final void b(int paramInt)
  {
    a(paramInt, C());
  }
  
  protected void b(Bundle paramBundle) {}
  
  public void b(CharSequence paramCharSequence)
  {
    f().b(paramCharSequence);
  }
  
  public void b(CharSequence paramCharSequence, PullToRefreshBase.Mode paramMode)
  {
    b(paramMode.c(), paramMode.d()).c(paramCharSequence);
  }
  
  public final void b(boolean paramBoolean)
  {
    this.A = paramBoolean;
  }
  
  protected final void c(int paramInt)
  {
    a(paramInt, D());
  }
  
  public void c(CharSequence paramCharSequence)
  {
    f().c(paramCharSequence);
  }
  
  public void c(CharSequence paramCharSequence, PullToRefreshBase.Mode paramMode)
  {
    b(paramMode.c(), paramMode.d()).d(paramCharSequence);
  }
  
  public final void c(boolean paramBoolean)
  {
    this.B = paramBoolean;
  }
  
  public final boolean c()
  {
    if ((this.v.c()) && (t()))
    {
      d(-B() * 2);
      return true;
    }
    if ((this.v.d()) && (u()))
    {
      d(z() * 2);
      return true;
    }
    return false;
  }
  
  public final PullToRefreshBase.Mode d()
  {
    return this.w;
  }
  
  public void d(CharSequence paramCharSequence)
  {
    c(paramCharSequence, PullToRefreshBase.Mode.d);
  }
  
  public final void d(boolean paramBoolean)
  {
    if (!m()) {
      a(PullToRefreshBase.State.e, new boolean[] { paramBoolean });
    }
  }
  
  public final void e(boolean paramBoolean)
  {
    this.z = paramBoolean;
  }
  
  public final boolean e()
  {
    return this.A;
  }
  
  public final ILoadingLayout f()
  {
    return b(true, true);
  }
  
  public final void f(boolean paramBoolean)
  {
    this.y = paramBoolean;
  }
  
  public final PullToRefreshBase.Mode g()
  {
    return this.v;
  }
  
  public final T h()
  {
    return this.n;
  }
  
  public void i(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    for (paramBoolean = true;; paramBoolean = false)
    {
      this.z = paramBoolean;
      return;
    }
  }
  
  public final boolean i()
  {
    return this.y;
  }
  
  public final PullToRefreshBase.State j()
  {
    return this.u;
  }
  
  public final void j(boolean paramBoolean)
  {
    if (paramBoolean) {}
    for (PullToRefreshBase.Mode localMode = PullToRefreshBase.Mode.a();; localMode = PullToRefreshBase.Mode.a)
    {
      a(localMode);
      return;
    }
  }
  
  public final boolean k()
  {
    return this.v.b();
  }
  
  public final boolean l()
  {
    return (Build.VERSION.SDK_INT >= 9) && (this.B) && (OverscrollHelper.a(this.n));
  }
  
  public final boolean m()
  {
    return (this.u == PullToRefreshBase.State.d) || (this.u == PullToRefreshBase.State.e);
  }
  
  public final boolean n()
  {
    return this.z;
  }
  
  public final void o()
  {
    if (m()) {
      a(PullToRefreshBase.State.a, new boolean[0]);
    }
  }
  
  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    new StringBuilder("Screen touch event: ").append(paramMotionEvent.getAction()).toString();
    if (paramMotionEvent.getAction() == 6) {
      new StringBuilder("Screen touch event on up,X is: ").append(paramMotionEvent.getX()).append(" Y is: ").append(paramMotionEvent.getY()).toString();
    }
    a.a().a(super.getContext(), paramMotionEvent);
    if (!k()) {
      return false;
    }
    int i1 = paramMotionEvent.getAction();
    if ((i1 == 3) || (i1 == 1))
    {
      this.t = false;
      return false;
    }
    if ((i1 != 0) && (this.t)) {
      return true;
    }
    switch (i1)
    {
    }
    for (;;)
    {
      return this.t;
      if ((!this.z) && (m())) {
        return true;
      }
      if (G())
      {
        float f3 = paramMotionEvent.getY();
        float f4 = paramMotionEvent.getX();
        float f2;
        switch (PullToRefreshBase.4.a[a().ordinal()])
        {
        default: 
          f2 = f3 - this.q;
        }
        for (float f1 = f4 - this.p;; f1 = f3 - this.q)
        {
          float f5 = Math.abs(f2);
          if ((f5 <= this.o) || ((this.A) && (f5 <= Math.abs(f1)))) {
            break;
          }
          if ((!this.v.c()) || (f2 < 1.0F) || (!t())) {
            break label349;
          }
          this.q = f3;
          this.p = f4;
          this.t = true;
          if (this.v != PullToRefreshBase.Mode.d) {
            break;
          }
          this.w = PullToRefreshBase.Mode.b;
          break;
          f2 = f4 - this.p;
        }
        label349:
        if ((this.v.d()) && (f2 <= -1.0F) && (u()))
        {
          this.q = f3;
          this.p = f4;
          this.t = true;
          if (this.v == PullToRefreshBase.Mode.d)
          {
            this.w = PullToRefreshBase.Mode.c;
            continue;
            if (G())
            {
              f1 = paramMotionEvent.getY();
              this.s = f1;
              this.q = f1;
              f1 = paramMotionEvent.getX();
              this.r = f1;
              this.p = f1;
              this.t = false;
            }
          }
        }
      }
    }
  }
  
  protected final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof Bundle))
    {
      paramParcelable = (Bundle)paramParcelable;
      a(PullToRefreshBase.Mode.a(paramParcelable.getInt("ptr_mode", 0)));
      this.w = PullToRefreshBase.Mode.a(paramParcelable.getInt("ptr_current_mode", 0));
      this.z = paramParcelable.getBoolean("ptr_disable_scrolling", false);
      this.y = paramParcelable.getBoolean("ptr_show_refreshing_view", true);
      super.onRestoreInstanceState(paramParcelable.getParcelable("ptr_super"));
      PullToRefreshBase.State localState = PullToRefreshBase.State.a(paramParcelable.getInt("ptr_state", 0));
      if ((localState == PullToRefreshBase.State.d) || (localState == PullToRefreshBase.State.e)) {
        a(localState, new boolean[] { true });
      }
      a(paramParcelable);
      return;
    }
    super.onRestoreInstanceState(paramParcelable);
  }
  
  protected final Parcelable onSaveInstanceState()
  {
    Bundle localBundle = new Bundle();
    b(localBundle);
    localBundle.putInt("ptr_state", this.u.a());
    localBundle.putInt("ptr_mode", this.v.e());
    localBundle.putInt("ptr_current_mode", this.w.e());
    localBundle.putBoolean("ptr_disable_scrolling", this.z);
    localBundle.putBoolean("ptr_show_refreshing_view", this.y);
    localBundle.putParcelable("ptr_super", super.onSaveInstanceState());
    return localBundle;
  }
  
  protected final void onSizeChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    String.format("onSizeChanged. W: %d, H: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    super.onSizeChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    F();
    a(paramInt1, paramInt2);
    post(new PullToRefreshBase.2(this));
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (!k()) {}
    do
    {
      do
      {
        do
        {
          do
          {
            return false;
            if ((!this.z) && (m())) {
              return true;
            }
          } while ((paramMotionEvent.getAction() == 0) && (paramMotionEvent.getEdgeFlags() != 0));
          switch (paramMotionEvent.getAction())
          {
          default: 
            return false;
          }
        } while (!G());
        float f1 = paramMotionEvent.getY();
        this.s = f1;
        this.q = f1;
        f1 = paramMotionEvent.getX();
        this.r = f1;
        this.p = f1;
        return true;
      } while (!this.t);
      this.q = paramMotionEvent.getY();
      this.p = paramMotionEvent.getX();
      H();
      return true;
    } while (!this.t);
    this.t = false;
    if ((this.u == PullToRefreshBase.State.c) && ((this.H != null) || (this.I != null)))
    {
      a(PullToRefreshBase.State.d, new boolean[] { true });
      return true;
    }
    if (m())
    {
      b(0);
      return true;
    }
    a(PullToRefreshBase.State.a, new boolean[0]);
    return true;
  }
  
  public final void p()
  {
    d(true);
  }
  
  protected void r()
  {
    switch (PullToRefreshBase.4.c[this.w.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.G.h();
      return;
    }
    this.F.h();
  }
  
  protected void s()
  {
    switch (PullToRefreshBase.4.c[this.w.ordinal()])
    {
    default: 
      return;
    case 1: 
      this.G.j();
      return;
    }
    this.F.j();
  }
  
  public void setLongClickable(boolean paramBoolean)
  {
    h().setLongClickable(paramBoolean);
  }
  
  protected abstract boolean t();
  
  protected abstract boolean u();
  
  protected void v()
  {
    Object localObject = I();
    if (this == this.F.getParent()) {
      removeView(this.F);
    }
    if (this.v.c()) {
      super.addView(this.F, 0, (ViewGroup.LayoutParams)localObject);
    }
    if (this == this.G.getParent()) {
      removeView(this.G);
    }
    if (this.v.d()) {
      super.addView(this.G, -1, (ViewGroup.LayoutParams)localObject);
    }
    F();
    if (this.v != PullToRefreshBase.Mode.d) {}
    for (localObject = this.v;; localObject = PullToRefreshBase.Mode.b)
    {
      this.w = ((PullToRefreshBase.Mode)localObject);
      return;
    }
  }
  
  public final boolean w()
  {
    return !n();
  }
  
  protected final void x()
  {
    this.C = false;
  }
  
  protected final LoadingLayout y()
  {
    return this.G;
  }
  
  protected final int z()
  {
    return this.G.f();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\PullToRefreshBase.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */