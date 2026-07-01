package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;

class f
  extends LinearLayout
{
  private static final int[] a = { 16843049, 16843561, 16843562 };
  private static final int b = 0;
  private static final int c = 1;
  private static final int d = 2;
  private Drawable e;
  private int f;
  private int g;
  private int h;
  private int i;
  
  public f(Context paramContext, int paramInt)
  {
    super(paramContext);
    paramContext = paramContext.obtainStyledAttributes(null, a, paramInt, 0);
    setDividerDrawable(paramContext.getDrawable(0));
    this.i = paramContext.getDimensionPixelSize(2, 0);
    this.h = paramContext.getInteger(1, 0);
    paramContext.recycle();
  }
  
  private void a(Canvas paramCanvas)
  {
    int k = getChildCount();
    int j = 0;
    View localView;
    while (j < k)
    {
      localView = getChildAt(j);
      if ((localView != null) && (localView.getVisibility() != 8) && (a(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
        a(paramCanvas, localView.getTop() - localLayoutParams.topMargin);
      }
      j += 1;
    }
    if (a(k))
    {
      localView = getChildAt(k - 1);
      if (localView != null) {
        break label119;
      }
    }
    label119:
    for (j = getHeight() - getPaddingBottom() - this.g;; j = localView.getBottom())
    {
      a(paramCanvas, j);
      return;
    }
  }
  
  private void a(Canvas paramCanvas, int paramInt)
  {
    this.e.setBounds(getPaddingLeft() + this.i, paramInt, getWidth() - getPaddingRight() - this.i, this.g + paramInt);
    this.e.draw(paramCanvas);
  }
  
  private boolean a(int paramInt)
  {
    if ((paramInt == 0) || (paramInt == getChildCount())) {}
    for (;;)
    {
      return false;
      if ((this.h & 0x2) != 0)
      {
        paramInt -= 1;
        while (paramInt >= 0)
        {
          if (getChildAt(paramInt).getVisibility() != 8) {
            return true;
          }
          paramInt -= 1;
        }
      }
    }
  }
  
  private void b(Canvas paramCanvas)
  {
    int k = getChildCount();
    int j = 0;
    View localView;
    while (j < k)
    {
      localView = getChildAt(j);
      if ((localView != null) && (localView.getVisibility() != 8) && (a(j)))
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)localView.getLayoutParams();
        b(paramCanvas, localView.getLeft() - localLayoutParams.leftMargin);
      }
      j += 1;
    }
    if (a(k))
    {
      localView = getChildAt(k - 1);
      if (localView != null) {
        break label119;
      }
    }
    label119:
    for (j = getWidth() - getPaddingRight() - this.f;; j = localView.getRight())
    {
      b(paramCanvas, j);
      return;
    }
  }
  
  private void b(Canvas paramCanvas, int paramInt)
  {
    this.e.setBounds(paramInt, getPaddingTop() + this.i, this.f + paramInt, getHeight() - getPaddingBottom() - this.i);
    this.e.draw(paramCanvas);
  }
  
  protected void measureChildWithMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = indexOfChild(paramView);
    int k = getOrientation();
    LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)paramView.getLayoutParams();
    if (a(j))
    {
      if (k == 1) {
        localLayoutParams.topMargin = this.g;
      }
    }
    else
    {
      int m = getChildCount();
      if ((j == m - 1) && (a(m)))
      {
        if (k != 1) {
          break label109;
        }
        localLayoutParams.bottomMargin = this.g;
      }
    }
    for (;;)
    {
      super.measureChildWithMargins(paramView, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
      localLayoutParams.leftMargin = this.f;
      break;
      label109:
      localLayoutParams.rightMargin = this.f;
    }
  }
  
  protected void onDraw(Canvas paramCanvas)
  {
    if (this.e != null)
    {
      if (getOrientation() != 1) {
        break label26;
      }
      a(paramCanvas);
    }
    for (;;)
    {
      super.onDraw(paramCanvas);
      return;
      label26:
      b(paramCanvas);
    }
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    boolean bool = false;
    if (paramDrawable == this.e) {
      return;
    }
    this.e = paramDrawable;
    if (paramDrawable != null) {
      this.f = paramDrawable.getIntrinsicWidth();
    }
    for (this.g = paramDrawable.getIntrinsicHeight();; this.g = 0)
    {
      if (paramDrawable == null) {
        bool = true;
      }
      setWillNotDraw(bool);
      requestLayout();
      return;
      this.f = 0;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */