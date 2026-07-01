package com.umeng.newxp.view.widget.pulltorefresh.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.umeng.newxp.view.widget.pulltorefresh.ILoadingLayout;
import com.umeng.newxp.view.widget.pulltorefresh.PTFMapper;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Mode;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Orientation;

public abstract class LoadingLayout
  extends FrameLayout
  implements ILoadingLayout
{
  static final String b = "PullToRefresh-LoadingLayout";
  static final Interpolator c = new LinearInterpolator();
  private final FrameLayout a;
  protected final ImageView d;
  protected final ProgressBar e;
  protected final PullToRefreshBase.Mode f;
  protected final PullToRefreshBase.Orientation g;
  protected final int h;
  private boolean i;
  private final TextView j;
  private final TextView k;
  private CharSequence l;
  private CharSequence m;
  private CharSequence n;
  
  public LoadingLayout(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.Orientation paramOrientation, TypedArray paramTypedArray)
  {
    super(paramContext);
    this.f = paramMode;
    this.g = paramOrientation;
    this.h = PTFMapper.m(paramContext);
    FrameLayout.LayoutParams localLayoutParams;
    int i1;
    switch (LoadingLayout.1.a[paramOrientation.ordinal()])
    {
    default: 
      LayoutInflater.from(paramContext).inflate(PTFMapper.b(paramContext), this);
      this.a = ((FrameLayout)findViewById(PTFMapper.p(paramContext)));
      this.j = ((TextView)this.a.findViewById(PTFMapper.q(paramContext)));
      this.e = ((ProgressBar)this.a.findViewById(PTFMapper.r(paramContext)));
      this.k = ((TextView)this.a.findViewById(PTFMapper.s(paramContext)));
      this.d = ((ImageView)this.a.findViewById(PTFMapper.t(paramContext)));
      localLayoutParams = (FrameLayout.LayoutParams)this.a.getLayoutParams();
      switch (LoadingLayout.1.b[paramMode.ordinal()])
      {
      default: 
        if (paramOrientation == PullToRefreshBase.Orientation.a)
        {
          i1 = 80;
          label199:
          localLayoutParams.gravity = i1;
          this.l = paramContext.getString(PTFMapper.c(paramContext));
          this.m = paramContext.getString(PTFMapper.e(paramContext));
          this.n = paramContext.getString(PTFMapper.d(paramContext));
          if (paramTypedArray.hasValue(PTFMapper.y(paramContext)))
          {
            paramOrientation = paramTypedArray.getDrawable(PTFMapper.y(paramContext));
            if (paramOrientation != null) {
              ViewCompat.a(this, paramOrientation);
            }
          }
          if (paramTypedArray.hasValue(PTFMapper.z(paramContext)))
          {
            paramOrientation = new TypedValue();
            paramTypedArray.getValue(PTFMapper.z(paramContext), paramOrientation);
            d(paramOrientation.data);
          }
          if (paramTypedArray.hasValue(PTFMapper.A(paramContext)))
          {
            paramOrientation = new TypedValue();
            paramTypedArray.getValue(PTFMapper.A(paramContext), paramOrientation);
            c(paramOrientation.data);
          }
          if (paramTypedArray.hasValue(PTFMapper.B(paramContext)))
          {
            paramOrientation = paramTypedArray.getColorStateList(PTFMapper.B(paramContext));
            if (paramOrientation != null) {
              b(paramOrientation);
            }
          }
          if (paramTypedArray.hasValue(PTFMapper.C(paramContext)))
          {
            paramOrientation = paramTypedArray.getColorStateList(PTFMapper.C(paramContext));
            if (paramOrientation != null) {
              a(paramOrientation);
            }
          }
          paramOrientation = null;
          if (paramTypedArray.hasValue(PTFMapper.D(paramContext))) {
            paramOrientation = paramTypedArray.getDrawable(PTFMapper.D(paramContext));
          }
          switch (LoadingLayout.1.b[paramMode.ordinal()])
          {
          default: 
            if (paramTypedArray.hasValue(PTFMapper.E(paramContext))) {
              paramMode = paramTypedArray.getDrawable(PTFMapper.E(paramContext));
            }
            break;
          }
        }
        break;
      }
      break;
    }
    for (;;)
    {
      paramOrientation = paramMode;
      if (paramMode == null) {
        paramOrientation = paramContext.getResources().getDrawable(e());
      }
      a(paramOrientation);
      k();
      return;
      LayoutInflater.from(paramContext).inflate(PTFMapper.a(paramContext), this);
      break;
      if (paramOrientation == PullToRefreshBase.Orientation.a) {}
      for (i1 = 48;; i1 = 3)
      {
        localLayoutParams.gravity = i1;
        this.l = paramContext.getString(PTFMapper.f(paramContext));
        this.m = paramContext.getString(PTFMapper.h(paramContext));
        this.n = paramContext.getString(PTFMapper.g(paramContext));
        break;
      }
      i1 = 5;
      break label199;
      paramMode = paramOrientation;
      if (paramTypedArray.hasValue(PTFMapper.G(paramContext)))
      {
        Utils.a("ptrDrawableTop", "ptrDrawableStart");
        paramMode = paramTypedArray.getDrawable(PTFMapper.G(paramContext));
        continue;
        if (paramTypedArray.hasValue(PTFMapper.F(paramContext)))
        {
          paramMode = paramTypedArray.getDrawable(PTFMapper.F(paramContext));
        }
        else
        {
          paramMode = paramOrientation;
          if (paramTypedArray.hasValue(PTFMapper.H(paramContext)))
          {
            Utils.a("ptrDrawableBottom", "ptrDrawableEnd");
            paramMode = paramTypedArray.getDrawable(PTFMapper.H(paramContext));
          }
        }
      }
    }
  }
  
  private void a(ColorStateList paramColorStateList)
  {
    if (this.k != null) {
      this.k.setTextColor(paramColorStateList);
    }
  }
  
  private void b(ColorStateList paramColorStateList)
  {
    if (this.j != null) {
      this.j.setTextColor(paramColorStateList);
    }
    if (this.k != null) {
      this.k.setTextColor(paramColorStateList);
    }
  }
  
  private void c(int paramInt)
  {
    if (this.k != null) {
      this.k.setTextAppearance(getContext(), paramInt);
    }
  }
  
  private void d(int paramInt)
  {
    if (this.j != null) {
      this.j.setTextAppearance(getContext(), paramInt);
    }
    if (this.k != null) {
      this.k.setTextAppearance(getContext(), paramInt);
    }
  }
  
  private void e(CharSequence paramCharSequence)
  {
    if (this.k != null)
    {
      if (!TextUtils.isEmpty(paramCharSequence)) {
        break label24;
      }
      this.k.setVisibility(8);
    }
    label24:
    do
    {
      return;
      this.k.setText(paramCharSequence);
    } while (8 != this.k.getVisibility());
    this.k.setVisibility(0);
  }
  
  protected abstract void a();
  
  protected abstract void a(float paramFloat);
  
  public final void a(int paramInt)
  {
    getLayoutParams().height = paramInt;
    requestLayout();
  }
  
  public void a(Typeface paramTypeface)
  {
    this.j.setTypeface(paramTypeface);
  }
  
  public final void a(Drawable paramDrawable)
  {
    this.d.setImageDrawable(paramDrawable);
    this.i = (paramDrawable instanceof AnimationDrawable);
    b(paramDrawable);
  }
  
  public void a(CharSequence paramCharSequence)
  {
    e(paramCharSequence);
  }
  
  protected abstract void b();
  
  public final void b(float paramFloat)
  {
    if (!this.i) {
      a(paramFloat);
    }
  }
  
  public final void b(int paramInt)
  {
    getLayoutParams().width = paramInt;
    requestLayout();
  }
  
  protected abstract void b(Drawable paramDrawable);
  
  public void b(CharSequence paramCharSequence)
  {
    this.l = paramCharSequence;
  }
  
  protected abstract void c();
  
  public void c(CharSequence paramCharSequence)
  {
    this.m = paramCharSequence;
  }
  
  protected abstract void d();
  
  public void d(CharSequence paramCharSequence)
  {
    this.n = paramCharSequence;
  }
  
  protected abstract int e();
  
  public final int f()
  {
    switch (LoadingLayout.1.a[this.g.ordinal()])
    {
    default: 
      return this.a.getHeight();
    }
    return this.a.getWidth();
  }
  
  public final void g()
  {
    if (this.j.getVisibility() == 0) {
      this.j.setVisibility(4);
    }
    if (this.e.getVisibility() == 0) {
      this.e.setVisibility(4);
    }
    if (this.d.getVisibility() == 0) {
      this.d.setVisibility(4);
    }
    if (this.k.getVisibility() == 0) {
      this.k.setVisibility(4);
    }
  }
  
  public final void h()
  {
    if (this.j != null) {
      this.j.setText(this.l);
    }
    a();
  }
  
  public final void i()
  {
    if (this.j != null) {
      this.j.setText(this.m);
    }
    if (this.i) {
      ((AnimationDrawable)this.d.getDrawable()).start();
    }
    for (;;)
    {
      if (this.k != null) {
        this.k.setVisibility(8);
      }
      return;
      b();
    }
  }
  
  public final void j()
  {
    if (this.j != null) {
      this.j.setText(this.n);
    }
    c();
  }
  
  public final void k()
  {
    if (this.j != null) {
      this.j.setText(this.l);
    }
    this.d.setVisibility(0);
    if (this.i) {
      ((AnimationDrawable)this.d.getDrawable()).stop();
    }
    for (;;)
    {
      if (this.k != null)
      {
        if (!TextUtils.isEmpty(this.k.getText())) {
          break;
        }
        this.k.setVisibility(8);
      }
      return;
      d();
    }
    this.k.setVisibility(0);
  }
  
  public final void l()
  {
    if (4 == this.j.getVisibility()) {
      this.j.setVisibility(0);
    }
    if (4 == this.e.getVisibility()) {
      this.e.setVisibility(0);
    }
    if (4 == this.d.getVisibility()) {
      this.d.setVisibility(0);
    }
    if (4 == this.k.getVisibility()) {
      this.k.setVisibility(0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\internal\LoadingLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */