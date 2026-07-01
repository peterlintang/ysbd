package com.umeng.newxp.view;

import android.view.View;
import android.view.View.OnFocusChangeListener;

class HorizontalStrip$b
  implements View.OnFocusChangeListener
{
  HorizontalStrip a;
  int b;
  
  public HorizontalStrip$b(HorizontalStrip paramHorizontalStrip1, HorizontalStrip paramHorizontalStrip2, int paramInt)
  {
    this.a = paramHorizontalStrip2;
    this.b = paramInt;
  }
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a.onChildAcquiredFocus(this.b);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\HorizontalStrip$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */