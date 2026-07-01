package com.umeng.xp.view.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout.LayoutParams;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;

public class SwipeView
  extends HorizontalScrollView
{
  private static int b = 60;
  protected boolean a = false;
  private LinearLayout c;
  private Context d;
  private int e;
  private int f;
  private int g;
  private boolean h = false;
  private boolean i = false;
  private boolean j = false;
  private int k = 0;
  private int l = 0;
  private SwipeView.a m = null;
  private SwipeView.b n;
  private View.OnTouchListener o;
  private SwipeViewPointer p = null;
  
  public SwipeView(Context paramContext)
  {
    super(paramContext);
    this.d = paramContext;
    b();
  }
  
  public SwipeView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.d = paramContext;
    b();
  }
  
  public SwipeView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    this.d = paramContext;
    b();
  }
  
  private void a(int paramInt, boolean paramBoolean)
  {
    boolean bool = false;
    int i2 = this.k;
    int i1;
    if ((paramInt >= getPageCount()) && (getPageCount() > 0))
    {
      i1 = paramInt - 1;
      if (!paramBoolean) {
        break label123;
      }
      smoothScrollTo(this.l * i1, 0);
    }
    for (;;)
    {
      this.k = i1;
      if ((this.m != null) && (i2 != i1)) {
        this.m.a(i2, i1);
      }
      if ((this.p != null) && (i2 != i1)) {
        this.p.setCurrentPage(i1);
      }
      paramBoolean = bool;
      if (!this.a) {
        paramBoolean = true;
      }
      this.a = paramBoolean;
      return;
      i1 = paramInt;
      if (paramInt >= 0) {
        break;
      }
      i1 = 0;
      break;
      label123:
      scrollTo(this.l * i1, 0);
    }
  }
  
  private void a(MotionEvent paramMotionEvent)
  {
    float f1;
    float f2;
    if ((!this.h) && (!this.i))
    {
      f1 = Math.abs(this.f - paramMotionEvent.getX());
      f2 = Math.abs(this.g - paramMotionEvent.getY());
      if (f2 <= f1 + 5.0F) {
        break label57;
      }
      this.i = true;
    }
    label57:
    while (f1 <= f2 + 5.0F) {
      return;
    }
    this.h = true;
  }
  
  private void b()
  {
    this.c = new LinearLayout(this.d);
    this.c.setOrientation(0);
    super.addView(this.c, -1, new FrameLayout.LayoutParams(-1, -1));
    setSmoothScrollingEnabled(true);
    setHorizontalFadingEdgeEnabled(false);
    setHorizontalScrollBarEnabled(false);
    this.e = ((WindowManager)this.d.getSystemService("window")).getDefaultDisplay().getWidth();
    this.l = this.e;
    this.k = 0;
    this.n = new SwipeView.b(this, null);
    super.setOnTouchListener(this.n);
  }
  
  public void addPageControlPointer(int paramInt)
  {
    if (this.p != null) {
      this.p.addPageCount(paramInt);
    }
  }
  
  public void addView(View paramView)
  {
    addView(paramView, -1);
  }
  
  public void addView(View paramView, int paramInt)
  {
    Object localObject;
    if (paramView.getLayoutParams() == null) {
      localObject = new FrameLayout.LayoutParams(this.l, -1);
    }
    for (;;)
    {
      addView(paramView, paramInt, (ViewGroup.LayoutParams)localObject);
      return;
      localObject = paramView.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject).width = this.l;
    }
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    requestLayout();
    invalidate();
    this.c.addView(paramView, paramInt, paramLayoutParams);
  }
  
  public void addView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    paramLayoutParams.width = this.l;
    addView(paramView, -1, paramLayoutParams);
  }
  
  public int calculatePageSize(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    return setPageWidth(paramMarginLayoutParams.leftMargin + paramMarginLayoutParams.width + paramMarginLayoutParams.rightMargin);
  }
  
  public LinearLayout getChildContainer()
  {
    return this.c;
  }
  
  public int getCurrentPage()
  {
    return this.k;
  }
  
  public SwipeView.a getOnPageChangedListener()
  {
    return this.m;
  }
  
  public SwipeViewPointer getPageControl()
  {
    return this.p;
  }
  
  public int getPageCount()
  {
    return this.c.getChildCount();
  }
  
  public int getPageWidth()
  {
    return this.l;
  }
  
  public int getSwipeThreshold()
  {
    return b;
  }
  
  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    if (paramMotionEvent.getAction() == 0)
    {
      this.f = ((int)paramMotionEvent.getX());
      this.g = ((int)paramMotionEvent.getY());
      if (!this.j)
      {
        this.h = false;
        this.i = false;
      }
    }
    while (this.i)
    {
      return false;
      if (paramMotionEvent.getAction() == 2) {
        a(paramMotionEvent);
      }
    }
    if (this.h)
    {
      this.j = true;
      return true;
    }
    return bool;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    if (this.a)
    {
      scrollToPage(this.k);
      this.a = false;
    }
  }
  
  protected boolean onRequestFocusInDescendants(int paramInt, Rect paramRect)
  {
    return false;
  }
  
  public boolean onTrackballEvent(MotionEvent paramMotionEvent)
  {
    return true;
  }
  
  public void requestChildFocus(View paramView1, View paramView2)
  {
    requestFocus();
  }
  
  public void scrollToPage(int paramInt)
  {
    a(paramInt, false);
  }
  
  public void setOnPageChangedListener(SwipeView.a parama)
  {
    this.m = parama;
  }
  
  public void setOnTouchListener(View.OnTouchListener paramOnTouchListener)
  {
    this.o = paramOnTouchListener;
  }
  
  public void setPageControl(SwipeViewPointer paramSwipeViewPointer)
  {
    this.p = paramSwipeViewPointer;
    paramSwipeViewPointer.setPageCount(getPageCount());
    paramSwipeViewPointer.setCurrentPage(this.k);
    paramSwipeViewPointer.setOnPageControlClickListener(new b(this));
  }
  
  public int setPageWidth(int paramInt)
  {
    this.l = paramInt;
    return (this.e - this.l) / 2;
  }
  
  public void setSwipeThreshold(int paramInt)
  {
    b = paramInt;
  }
  
  public void smoothScrollToPage(int paramInt)
  {
    a(paramInt, true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\widget\SwipeView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */