package com.umeng.newxp.view.feed;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewConfiguration;

public class DragViewPager
  extends ItemClickViewPager
{
  private float f;
  private float g;
  private float h;
  private float i;
  private int j = 10;
  private boolean k = false;
  
  public DragViewPager(Context paramContext)
  {
    super(paramContext);
    this.j = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public DragViewPager(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    this.j = ViewConfiguration.get(paramContext).getScaledTouchSlop();
  }
  
  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    default: 
      return super.dispatchTouchEvent(paramMotionEvent);
    case 0: 
      this.f = paramMotionEvent.getY();
      this.g = paramMotionEvent.getX();
      this.k = false;
      return super.dispatchTouchEvent(paramMotionEvent);
    case 2: 
      this.k = false;
      this.h += Math.abs(this.f - paramMotionEvent.getY());
      this.i += Math.abs(this.g - paramMotionEvent.getX());
      this.f = paramMotionEvent.getY();
      this.g = paramMotionEvent.getX();
      if ((this.i > this.j) && (this.i > this.h))
      {
        this.k = true;
        if ((this.h <= this.j) && (this.i <= this.j)) {
          break label210;
        }
        requestDisallowInterceptTouchEvent(this.k);
      }
      for (;;)
      {
        return super.dispatchTouchEvent(paramMotionEvent);
        this.k = false;
        break;
        label210:
        requestDisallowInterceptTouchEvent(true);
      }
    }
    this.f = 0.0F;
    this.g = 0.0F;
    this.h = 0.0F;
    this.i = 0.0F;
    this.k = false;
    return super.dispatchTouchEvent(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\feed\DragViewPager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */