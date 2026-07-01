package com.umeng.newxp.view.widget.pulltorefresh.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import com.umeng.newxp.view.widget.pulltorefresh.PTFMapper;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Mode;
import com.umeng.newxp.view.widget.pulltorefresh.PullToRefreshBase.Orientation;

public class RotateLoadingLayout
  extends LoadingLayout
{
  static final int a = 1200;
  private final Animation i;
  private final Matrix j;
  private float k;
  private float l;
  private final boolean m;
  
  public RotateLoadingLayout(Context paramContext, PullToRefreshBase.Mode paramMode, PullToRefreshBase.Orientation paramOrientation, TypedArray paramTypedArray)
  {
    super(paramContext, paramMode, paramOrientation, paramTypedArray);
    this.m = paramTypedArray.getBoolean(PTFMapper.I(paramContext), true);
    this.d.setScaleType(ImageView.ScaleType.MATRIX);
    this.j = new Matrix();
    this.d.setImageMatrix(this.j);
    this.i = new RotateAnimation(0.0F, 720.0F, 1, 0.5F, 1, 0.5F);
    this.i.setInterpolator(c);
    this.i.setDuration(1200L);
    this.i.setRepeatCount(-1);
    this.i.setRepeatMode(1);
  }
  
  private void m()
  {
    if (this.j != null)
    {
      this.j.reset();
      this.d.setImageMatrix(this.j);
    }
  }
  
  protected void a() {}
  
  protected void a(float paramFloat)
  {
    if (this.m) {}
    for (paramFloat = 90.0F * paramFloat;; paramFloat = Math.max(0.0F, Math.min(180.0F, 360.0F * paramFloat - 180.0F)))
    {
      this.j.setRotate(paramFloat, this.k, this.l);
      this.d.setImageMatrix(this.j);
      return;
    }
  }
  
  protected void b()
  {
    this.d.startAnimation(this.i);
  }
  
  public void b(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      this.k = Math.round(paramDrawable.getIntrinsicWidth() / 2.0F);
      this.l = Math.round(paramDrawable.getIntrinsicHeight() / 2.0F);
    }
  }
  
  protected void c() {}
  
  protected void d()
  {
    this.d.clearAnimation();
    m();
  }
  
  protected int e()
  {
    return this.h;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\internal\RotateLoadingLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */