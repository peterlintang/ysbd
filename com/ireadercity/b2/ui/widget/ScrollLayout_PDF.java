package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.widget.Scroller;

public class ScrollLayout_PDF
  extends ViewGroup
{
  private static String g = "ScrollLayout_PDF";
  private static boolean m = false;
  private static float n;
  private static float o = 30.0F;
  protected ScaleGestureDetector a;
  protected GestureDetector b;
  protected h c;
  protected i d;
  protected final float e = 2.0F;
  protected float f = 1.0F;
  private int h = this.i;
  private int i = 0;
  private Scroller j;
  private g k;
  private j l;
  private boolean p = false;
  
  public ScrollLayout_PDF(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.j = new Scroller(paramContext);
    this.c = new h(this);
    this.d = new i(this);
    this.a = new ScaleGestureDetector(getContext(), this.d);
    this.b = new GestureDetector(getContext(), this.c, null, true);
    this.b = new GestureDetector(getContext(), this.c, null);
  }
  
  public final int a()
  {
    return this.h;
  }
  
  public final void a(int paramInt)
  {
    paramInt = Math.max(0, Math.min(paramInt, getChildCount() - 1));
    this.h = paramInt;
    scrollTo(paramInt * getWidth(), 0);
  }
  
  public final void a(g paramg)
  {
    this.k = paramg;
  }
  
  public final void a(j paramj)
  {
    this.l = paramj;
  }
  
  public final void b(int paramInt)
  {
    this.i = paramInt;
    this.h = paramInt;
    String str = g;
    new StringBuilder().append(paramInt).append(" setmDefaultScreen ").append(this.h).toString();
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
    String str = g;
    int i2 = View.MeasureSpec.getSize(paramInt1);
    if (View.MeasureSpec.getMode(paramInt1) != 1073741824) {
      throw new IllegalStateException("ScrollLayout only canmCurScreen run at EXACTLY mode!");
    }
    if (View.MeasureSpec.getMode(paramInt2) != 1073741824) {
      throw new IllegalStateException("ScrollLayout only can run at EXACTLY mode!");
    }
    int i3 = getChildCount();
    int i1 = 0;
    while (i1 < i3)
    {
      getChildAt(i1).measure(paramInt1, paramInt2);
      i1 += 1;
    }
    scrollTo(this.h * i2, 0);
  }
  
  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getPointerCount() >= 2) {
      this.a.onTouchEvent(paramMotionEvent);
    }
    if (!this.a.isInProgress()) {
      this.b.onTouchEvent(paramMotionEvent);
    }
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    }
    for (;;)
    {
      return true;
      this.k.b();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\ScrollLayout_PDF.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */