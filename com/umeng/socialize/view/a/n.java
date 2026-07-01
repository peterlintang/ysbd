package com.umeng.socialize.view.a;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;

class n
  implements View.OnTouchListener
{
  n(h paramh) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    switch (paramMotionEvent.getAction())
    {
    default: 
      return false;
    case 0: 
      h.e(this.a).setPressed(true);
      return false;
    }
    h.e(this.a).setPressed(false);
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */