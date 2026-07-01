package com.umeng.newxp.view.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class DragHorizontalStrip
  extends ItemClickStrip
{
  private float m;
  private float n;
  private float o;
  private float p;
  private int q = 10;
  private boolean r = false;
  
  public DragHorizontalStrip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.q = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      return super.dispatchTouchEvent(paramMotionEvent);
    case 0: 
      this.m = paramMotionEvent.getY();
      this.n = paramMotionEvent.getX();
      this.r = false;
      return super.dispatchTouchEvent(paramMotionEvent);
    case 2: 
      this.r = false;
      this.o += Math.abs(this.m - paramMotionEvent.getY());
      this.p += Math.abs(this.n - paramMotionEvent.getX());
      this.m = paramMotionEvent.getY();
      this.n = paramMotionEvent.getX();
      if ((this.p > this.q) && (this.p > this.o))
      {
        this.r = true;
        if ((this.o <= this.q) && (this.p <= this.q)) {
          break label210;
        }
        requestDisallowInterceptTouchEvent(this.r);
      }
      for (;;)
      {
        return super.dispatchTouchEvent(paramMotionEvent);
        this.r = false;
        break;
        label210:
        requestDisallowInterceptTouchEvent(true);
      }
    }
    this.m = 0.0F;
    this.n = 0.0F;
    this.o = 0.0F;
    this.p = 0.0F;
    this.r = false;
    return super.dispatchTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\DragHorizontalStrip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */