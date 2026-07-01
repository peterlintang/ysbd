package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Scroller;
import com.ireadercity.b2.a;

public class ScrollLayout
  extends ViewGroup
{
  private static Boolean l = Boolean.valueOf(false);
  GestureDetector a;
  f b;
  private Scroller c;
  private int d;
  private int e = 0;
  private int f = 0;
  private int g;
  private int h = 30;
  private Rect i;
  private boolean j = false;
  private boolean k = false;
  
  public ScrollLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.c = new Scroller(paramContext);
    this.d = this.e;
    this.g = ViewConfiguration.get(getContext()).getScaledTouchSlop();
    this.i = new Rect(0, 0, a.D, a.E);
  }
  
  public void computeScroll()
  {
    if (this.c.computeScrollOffset())
    {
      scrollTo(this.c.getCurrX(), this.c.getCurrY());
      this.k = false;
      postInvalidate();
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
    int n = View.MeasureSpec.getSize(paramInt1);
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException("ScrollLayout only canmCurScreen run at EXACTLY mode!");
    }
    if (View.MeasureSpec.getMode(paramInt2) != 1073741824) {
      throw new IllegalStateException("ScrollLayout only can run at EXACTLY mode!");
    }
    int i1 = getChildCount();
    int m = 0;
    while (m < i1)
    {
      getChildAt(m).measure(paramInt1, paramInt2);
      m += 1;
    }
    scrollTo(this.d * n, 0);
    this.k = false;
    this.b = new f(this);
    this.a = new GestureDetector(getContext(), this.b, null, true);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    paramMotionEvent.getAction();
    paramMotionEvent.getX();
    this.a.onTouchEvent(paramMotionEvent);
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\ScrollLayout.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */