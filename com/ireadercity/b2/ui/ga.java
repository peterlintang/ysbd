package com.ireadercity.b2.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.LinearLayout;
import com.ireadercity.b2.a;

final class ga
  implements View.OnTouchListener
{
  ga(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    if ((paramMotionEvent.getY() > ShowContentScrollUpAndDown.w(this.a).getHeight() + 25) && (paramMotionEvent.getY() < a.E - ShowContentScrollUpAndDown.x(this.a).getHeight())) {
      this.a.a(0);
    }
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ga.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */