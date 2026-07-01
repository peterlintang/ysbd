package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;

public class FriendlyScrollLayout
  extends ViewGroup
{
  public static boolean a = true;
  private static int d;
  private Scroller b;
  private VelocityTracker c;
  private int e = 0;
  private int f;
  private float g;
  private float h;
  private e i = null;
  
  public FriendlyScrollLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public FriendlyScrollLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.b = new Scroller(paramContext);
    this.f = ViewConfiguration.get(getContext()).getScaledTouchSlop();
  }
  
  public static int a()
  {
    return d;
  }
  
  public static void b()
  {
    d = 1;
  }
  
  private void b(int paramInt)
  {
    if (this.i != null) {
      this.i.a(paramInt);
    }
  }
  
  public final void a(int paramInt)
  {
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    if (getScrollX() != getWidth() * paramInt)
    {
      int j = getWidth() * paramInt - getScrollX();
      this.b.startScroll(getScrollX(), 0, j, 0, Math.abs(j) * 2);
      d = paramInt;
      b(d);
      invalidate();
    }
  }
  
  public final void a(e parame)
  {
    this.i = parame;
  }
  
  public void computeScroll()
  {
    if (this.b.computeScrollOffset())
    {
      scrollTo(this.b.getCurrX(), this.b.getCurrY());
      postInvalidate();
    }
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    new StringBuilder("onInterceptTouchEvent-slop:").append(this.f).toString();
    int j = paramMotionEvent.getAction();
    if ((j == 2) && (this.e != 0)) {}
    for (;;)
    {
      return true;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      switch (j)
      {
      }
      while (this.e == 0)
      {
        return false;
        this.g = f1;
        this.h = f2;
        if (this.b.isFinished()) {}
        for (j = 0;; j = 1)
        {
          this.e = j;
          break;
        }
        if (((int)Math.abs(this.g - f1) > this.f) && (Math.abs(this.h - f2) / Math.abs(this.g - f1) < 1.0F))
        {
          this.e = 1;
          continue;
          this.e = 0;
        }
      }
    }
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt4 = getChildCount();
    paramInt1 = 0;
    for (paramInt2 = 0; paramInt1 < paramInt4; paramInt2 = paramInt3)
    {
      View localView = getChildAt(paramInt1);
      paramInt3 = paramInt2;
      if (localView.getVisibility() != 8)
      {
        paramInt3 = localView.getMeasuredWidth();
        localView.layout(paramInt2, 0, paramInt2 + paramInt3, localView.getMeasuredHeight());
        paramInt3 = paramInt2 + paramInt3;
      }
      paramInt1 += 1;
    }
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    int k = View.MeasureSpec.getSize(paramInt1);
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException("ScrollLayout only canmCurScreen run at EXACTLY mode!");
    }
    if (View.MeasureSpec.getMode(paramInt2) != 1073741824) {
      throw new IllegalStateException("ScrollLayout only can run at EXACTLY mode!");
    }
    int m = getChildCount();
    int j = 0;
    while (j < m)
    {
      getChildAt(j).measure(paramInt1, paramInt2);
      j += 1;
    }
    scrollTo(d * k, 0);
    b(d);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (this.c == null) {
      this.c = VelocityTracker.obtain();
    }
    this.c.addMovement(paramMotionEvent);
    int j = paramMotionEvent.getAction();
    float f1 = paramMotionEvent.getX();
    switch (j)
    {
    }
    for (;;)
    {
      return true;
      if (!this.b.isFinished()) {
        this.b.abortAnimation();
      }
      this.g = f1;
      continue;
      j = (int)(this.g - f1);
      this.g = f1;
      scrollBy(j, 0);
      continue;
      paramMotionEvent = this.c;
      paramMotionEvent.computeCurrentVelocity(1000);
      j = (int)paramMotionEvent.getXVelocity();
      new StringBuilder("velocityX:").append(j).toString();
      if ((j > 600) && (d > 0)) {
        a(d - 1);
      }
      for (;;)
      {
        if (this.c != null)
        {
          this.c.recycle();
          this.c = null;
        }
        this.e = 0;
        break;
        if ((j < 64936) && (d < getChildCount() - 1))
        {
          a(d + 1);
        }
        else
        {
          j = getWidth();
          a((getScrollX() + j / 2) / j);
        }
      }
      this.e = 0;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\FriendlyScrollLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */