package com.umeng.xp.view.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;

class SwipeView$b
  implements View.OnTouchListener
{
  private boolean b = false;
  private int c;
  private int d;
  private boolean e = true;
  
  private SwipeView$b(SwipeView paramSwipeView) {}
  
  private boolean a(MotionEvent paramMotionEvent)
  {
    SwipeView.a(this.a, (int)paramMotionEvent.getX());
    SwipeView.b(this.a, (int)paramMotionEvent.getY());
    this.e = false;
    return false;
  }
  
  private boolean b(MotionEvent paramMotionEvent)
  {
    int j = SwipeView.d(this.a) - (int)paramMotionEvent.getX();
    int i;
    if (j < 0) {
      if (this.c + 4 <= j)
      {
        i = 1;
        if ((i == this.d) || (this.e)) {
          break label195;
        }
        SwipeView.a(this.a, (int)paramMotionEvent.getX());
      }
    }
    label195:
    for (this.c = (SwipeView.d(this.a) - (int)paramMotionEvent.getX());; this.c = j)
    {
      this.d = i;
      if (!SwipeView.c(this.a)) {
        break label203;
      }
      this.b = true;
      this.a.dispatchTouchEvent(MotionEvent.obtain(paramMotionEvent.getDownTime(), paramMotionEvent.getEventTime(), 0, SwipeView.d(this.a), SwipeView.e(this.a), paramMotionEvent.getPressure(), paramMotionEvent.getSize(), paramMotionEvent.getMetaState(), paramMotionEvent.getXPrecision(), paramMotionEvent.getYPrecision(), paramMotionEvent.getDeviceId(), paramMotionEvent.getEdgeFlags()));
      SwipeView.a(this.a, false);
      return true;
      i = -1;
      break;
      if (this.c - 4 <= j)
      {
        i = 1;
        break;
      }
      i = -1;
      break;
    }
    label203:
    return false;
  }
  
  private boolean c(MotionEvent paramMotionEvent)
  {
    float f2 = this.a.getScrollX();
    float f1 = SwipeView.f(this.a).getMeasuredWidth() / SwipeView.g(this.a);
    f2 /= SwipeView.g(this.a);
    if (this.d == 1) {
      if (this.c > SwipeView.a()) {
        if (SwipeView.a(this.a) < f1 - 1.0F) {
          f1 = (int)(f2 + 1.0F) * SwipeView.g(this.a);
        }
      }
    }
    for (;;)
    {
      this.a.smoothScrollToPage((int)f1 / SwipeView.g(this.a));
      this.e = true;
      this.c = 0;
      SwipeView.b(this.a, false);
      SwipeView.c(this.a, false);
      return true;
      f1 = SwipeView.a(this.a) * SwipeView.g(this.a);
      continue;
      if (Math.round(f2) == f1 - 1.0F)
      {
        f1 = (int)(f2 + 1.0F) * SwipeView.g(this.a);
      }
      else
      {
        f1 = SwipeView.a(this.a) * SwipeView.g(this.a);
        continue;
        if (this.c < -SwipeView.a()) {
          f1 = (int)f2 * SwipeView.g(this.a);
        } else if (Math.round(f2) == 0) {
          f1 = (int)f2 * SwipeView.g(this.a);
        } else {
          f1 = SwipeView.a(this.a) * SwipeView.g(this.a);
        }
      }
    }
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (((SwipeView.b(this.a) != null) && (!SwipeView.c(this.a))) || ((SwipeView.b(this.a) != null) && (this.b) && (SwipeView.b(this.a).onTouch(paramView, paramMotionEvent))))
    {
      if (paramMotionEvent.getAction() == 1) {
        c(paramMotionEvent);
      }
      return true;
    }
    if (this.b)
    {
      this.b = false;
      return false;
    }
    switch (paramMotionEvent.getAction())
    {
    default: 
      return false;
    case 0: 
      return a(paramMotionEvent);
    case 2: 
      return b(paramMotionEvent);
    }
    return c(paramMotionEvent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\widget\SwipeView$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */