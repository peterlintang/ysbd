package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;

final class gc
  implements View.OnClickListener
{
  gc(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void onClick(View paramView)
  {
    ShowContentScrollUpAndDown.l(this.a).setVisibility(0);
    ShowContentScrollUpAndDown.m(this.a).bringChildToFront(ShowContentScrollUpAndDown.l(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */