package com.umeng.newxp.view.widget.pulltorefresh.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.ProgressBar;
import com.umeng.newxp.view.widget.pulltorefresh.PTFMapper;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Mode;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Orientation;

public class FlipLoadingLayout
  extends LoadingLayout
{
  static final int a = 150;
  private final Animation i;
  private final Animation j;
  
  public FlipLoadingLayout(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.Orientation paramOrientation, TypedArray paramTypedArray)
  {
    super(paramContext, paramMode, paramOrientation, paramTypedArray);
    if (paramMode == PullToRefreshBase.Mode.b) {}
    for (int k = 65356;; k = 180)
    {
      this.i = new RotateAnimation(0.0F, k, 1, 0.5F, 1, 0.5F);
      this.i.setInterpolator(c);
      this.i.setDuration(150L);
      this.i.setFillAfter(true);
      this.j = new RotateAnimation(k, 0.0F, 1, 0.5F, 1, 0.5F);
      this.j.setInterpolator(c);
      this.j.setDuration(150L);
      this.j.setFillAfter(true);
      return;
    }
  }
  
  private float m()
  {
    switch (FlipLoadingLayout.1.a[this.f.ordinal()])
    {
    }
    do
    {
      return 0.0F;
      if (this.g == PullToRefreshBase.Orientation.b) {
        return 90.0F;
      }
      return 180.0F;
    } while (this.g != PullToRefreshBase.Orientation.b);
    return 270.0F;
  }
  
  protected void a()
  {
    if (this.i == this.d.getAnimation()) {
      this.d.startAnimation(this.j);
    }
  }
  
  protected void a(float paramFloat) {}
  
  protected void b()
  {
    this.d.clearAnimation();
    this.d.setVisibility(4);
    this.e.setVisibility(0);
  }
  
  protected void b(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      int k = paramDrawable.getIntrinsicHeight();
      int m = paramDrawable.getIntrinsicWidth();
      paramDrawable = this.d.getLayoutParams();
      int n = Math.max(k, m);
      paramDrawable.height = n;
      paramDrawable.width = n;
      this.d.requestLayout();
      this.d.setScaleType(ImageView.ScaleType.MATRIX);
      Matrix localMatrix = new Matrix();
      localMatrix.postTranslate((paramDrawable.width - m) / 2.0F, (paramDrawable.height - k) / 2.0F);
      localMatrix.postRotate(m(), paramDrawable.width / 2.0F, paramDrawable.height / 2.0F);
      this.d.setImageMatrix(localMatrix);
    }
  }
  
  protected void c()
  {
    this.d.startAnimation(this.i);
  }
  
  protected void d()
  {
    this.d.clearAnimation();
    this.e.setVisibility(8);
    this.d.setVisibility(0);
  }
  
  protected int e()
  {
    return PTFMapper.i(getContext());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\internal\FlipLoadingLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */