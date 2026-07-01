package com.umeng.newxp.view;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import java.util.HashMap;

public class HorizontalStrip
  extends AbsHorizontalStrip
{
  protected final float g;
  private e h;
  private final c i = new c();
  private int j;
  
  public HorizontalStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public HorizontalStrip(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.g = paramContext.getResources().getDisplayMetrics().density;
    this.j = -16777216;
  }
  
  private int a(int paramInt)
  {
    float f = this.g;
    this.h.a(paramInt, this.i, f);
    return this.i.a();
  }
  
  private int b(int paramInt)
  {
    float f = this.g;
    this.h.a(paramInt, this.i, f);
    return this.i.b();
  }
  
  private void b()
  {
    int k = 0;
    while (k < this.h.a())
    {
      View localView = getChildAt(k);
      Drawable localDrawable = this.h.a(k);
      if (((localView instanceof h)) && (localDrawable != null)) {
        ((h)localView).a(localDrawable);
      }
      k += 1;
    }
    requestLayout();
  }
  
  private int c(int paramInt)
  {
    return getChildAt(paramInt).getWidth();
  }
  
  protected float getLeftEdgeOfChild(int paramInt)
  {
    if (this.f.containsKey(Integer.valueOf(paramInt))) {
      return ((Float[])this.f.get(Integer.valueOf(paramInt)))[0].floatValue();
    }
    return 0.0F;
  }
  
  protected float getLeftEdgeOfChildOnLeft(float paramFloat)
  {
    int k = 0;
    int m = 0;
    for (int n = 0; k < getChildCount(); n = m)
    {
      m += c(k);
      k += 1;
    }
    return n;
  }
  
  protected float getLeftEdgeOfChildOnRight(float paramFloat)
  {
    int k = 0;
    int m = 0;
    for (int n = 0; k < getChildCount(); n = m)
    {
      m += c(k);
      k += 1;
    }
    return n;
  }
  
  protected float getLeftFadingEdgeStrength()
  {
    return 0.0F;
  }
  
  protected float getRightFadingEdgeStrength()
  {
    return 0.0F;
  }
  
  public int getSolidColor()
  {
    return this.j;
  }
  
  public void onDestroyView()
  {
    setAdapter(null);
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (this.h == null) {}
    do
    {
      return;
      int i1 = getHeight();
      this.e = 0.0F;
      int m = getPaddingLeft();
      int k = m;
      if (this.h.b()) {
        k = m + this.c;
      }
      int n = 0;
      m = k;
      k = n;
      if (k < getChildCount())
      {
        View localView = getChildAt(k);
        if ((localView.getLayoutParams() != null) && (localView.getLayoutParams().width > 0)) {}
        for (n = localView.getLayoutParams().width + m;; n = localView.getMeasuredWidth() + m)
        {
          measureChild(localView, localView.getLayoutParams().width, localView.getLayoutParams().height);
          localView.layout(m, 0, n, i1);
          float f1 = m;
          float f2 = n;
          this.f.put(Integer.valueOf(k), new Float[] { Float.valueOf(f1), Float.valueOf(f2) });
          m = this.c + n;
          this.e = n;
          k += 1;
          break;
          localView.setMinimumWidth(paramInt3 - paramInt1);
          localView.setMinimumHeight(paramInt4 - paramInt2);
          localView.measure(paramInt3 - paramInt1, paramInt4 - paramInt2);
        }
      }
    } while (!this.h.b());
    this.e += this.c;
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt2 = View.MeasureSpec.getSize(paramInt2);
    setMeasuredDimension(View.MeasureSpec.getSize(paramInt1), paramInt2);
    if (this.h != null)
    {
      this.h.b(getHeight());
      setAdapter(this.h);
    }
  }
  
  protected void recreateChildViews()
  {
    removeAllViews();
    this.f.clear();
    if (this.h == null) {
      return;
    }
    int k = 0;
    while (k < this.h.a())
    {
      View localView = this.h.a(this.a, this, k);
      localView.setOnFocusChangeListener(new HorizontalStrip.b(this, this, k));
      addView(localView);
      k += 1;
    }
    b();
  }
  
  public void setAdapter(e parame)
  {
    this.h = parame;
    recreateChildViews();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\HorizontalStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */