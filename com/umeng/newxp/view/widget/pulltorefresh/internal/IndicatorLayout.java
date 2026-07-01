package com.umeng.newxp.view.widget.pulltorefresh.internal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.umeng.newxp.view.widget.pulltorefresh.PTFMapper;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Mode;

public class IndicatorLayout
  extends FrameLayout
  implements Animation.AnimationListener
{
  static final int a = 150;
  private final Animation b;
  private final Animation c;
  private final ImageView d;
  private final Animation e;
  private final Animation f;
  
  public IndicatorLayout(Context paramContext, PullToRefreshBase.Mode paramMode)
  {
    super(paramContext);
    this.d = new ImageView(paramContext);
    Drawable localDrawable = getResources().getDrawable(PTFMapper.l(paramContext));
    this.d.setImageDrawable(localDrawable);
    int i = getResources().getDimensionPixelSize(PTFMapper.n(paramContext));
    this.d.setPadding(i, i, i, i);
    addView(this.d);
    int j;
    switch (IndicatorLayout.1.a[paramMode.ordinal()])
    {
    default: 
      j = PTFMapper.v(getContext());
      i = PTFMapper.w(getContext());
      setBackgroundResource(PTFMapper.j(getContext()));
    }
    for (;;)
    {
      this.b = AnimationUtils.loadAnimation(paramContext, j);
      this.b.setAnimationListener(this);
      this.c = AnimationUtils.loadAnimation(paramContext, i);
      this.c.setAnimationListener(this);
      paramContext = new LinearInterpolator();
      this.e = new RotateAnimation(0.0F, -180.0F, 1, 0.5F, 1, 0.5F);
      this.e.setInterpolator(paramContext);
      this.e.setDuration(150L);
      this.e.setFillAfter(true);
      this.f = new RotateAnimation(-180.0F, 0.0F, 1, 0.5F, 1, 0.5F);
      this.f.setInterpolator(paramContext);
      this.f.setDuration(150L);
      this.f.setFillAfter(true);
      return;
      j = PTFMapper.u(getContext());
      i = PTFMapper.x(getContext());
      setBackgroundResource(PTFMapper.k(getContext()));
      this.d.setScaleType(ImageView.ScaleType.MATRIX);
      paramMode = new Matrix();
      paramMode.setRotate(180.0F, localDrawable.getIntrinsicWidth() / 2.0F, localDrawable.getIntrinsicHeight() / 2.0F);
      this.d.setImageMatrix(paramMode);
    }
  }
  
  public final boolean a()
  {
    Animation localAnimation = getAnimation();
    if (localAnimation != null) {
      if (this.b != localAnimation) {}
    }
    while (getVisibility() == 0)
    {
      return true;
      return false;
    }
    return false;
  }
  
  public void b()
  {
    startAnimation(this.c);
  }
  
  public void c()
  {
    this.d.clearAnimation();
    startAnimation(this.b);
  }
  
  public void d()
  {
    this.d.startAnimation(this.e);
  }
  
  public void e()
  {
    this.d.startAnimation(this.f);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (paramAnimation == this.c)
    {
      this.d.clearAnimation();
      setVisibility(8);
    }
    for (;;)
    {
      clearAnimation();
      return;
      if (paramAnimation == this.b) {
        setVisibility(0);
      }
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    setVisibility(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\internal\IndicatorLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */