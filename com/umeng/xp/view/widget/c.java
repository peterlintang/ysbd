package com.umeng.xp.view.widget;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

class c
  implements View.OnTouchListener
{
  c(SwipeViewPointer paramSwipeViewPointer) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if (SwipeViewPointer.a(this.a) != null) {}
    switch (paramMotionEvent.getAction())
    {
    default: 
      return true;
    }
    if (this.a.getOrientation() == 0) {
      if (paramMotionEvent.getX() < this.a.getWidth() / 2) {
        if (SwipeViewPointer.b(this.a) > 0) {
          SwipeViewPointer.a(this.a).b();
        }
      }
    }
    for (;;)
    {
      return false;
      if (SwipeViewPointer.b(this.a) < SwipeViewPointer.c(this.a) - 1)
      {
        SwipeViewPointer.a(this.a).a();
        continue;
        if (paramMotionEvent.getY() < this.a.getHeight() / 2)
        {
          if (SwipeViewPointer.b(this.a) > 0) {
            SwipeViewPointer.a(this.a).b();
          }
        }
        else if (SwipeViewPointer.b(this.a) < SwipeViewPointer.c(this.a) - 1) {
          SwipeViewPointer.a(this.a).a();
        }
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */