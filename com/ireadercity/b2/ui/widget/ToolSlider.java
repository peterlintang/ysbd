package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.TranslateAnimation;

public class ToolSlider
  extends View
{
  private Context a;
  private Animation b = null;
  private float c = 0.0F;
  private int d = 1000;
  private int e = 0;
  private float f = 0.0F;
  private float g = 0.0F;
  private int h = 0;
  private int i = 0;
  
  public ToolSlider(Context paramContext)
  {
    super(paramContext);
    this.a = paramContext;
  }
  
  public ToolSlider(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.a = paramContext;
  }
  
  public final void a(float paramFloat1, float paramFloat2)
  {
    this.i = 4;
    this.f = paramFloat1;
    this.c = paramFloat2;
    this.d = 500;
    this.h = 1;
    this.e = 10;
    setDrawingCacheBackgroundColor(0);
    setDrawingCacheEnabled(true);
  }
  
  public final void a(int paramInt, View paramView)
  {
    float f1 = this.c * this.h;
    float f2 = this.c;
    float f3 = paramInt;
    float f4 = this.g;
    float f5 = this.g;
    new StringBuilder().append(f1).toString();
    new StringBuilder().append(paramInt).toString();
    new StringBuilder().append(getMeasuredHeight()).toString();
    new StringBuilder().append(getMeasuredWidth()).toString();
    int j = this.d;
    int k = this.e;
    this.b = new TranslateAnimation(f1, f2 * f3, f4, f5);
    this.b.setDuration(j);
    this.b.setStartOffset(k);
    this.b.setFillAfter(true);
    Animation localAnimation = this.b;
    startAnimation(this.b);
    this.b.setInterpolator(new AccelerateDecelerateInterpolator());
    this.b.setZAdjustment(-1);
    this.b.setFillEnabled(true);
    this.h = paramInt;
    if (paramView != null) {
      paramView.invalidate();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\ToolSlider.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */