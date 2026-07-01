package com.umeng.socialize.view;

import android.view.View;

class ax
  implements Runnable
{
  ax(aw paramaw, View paramView1, View paramView2) {}
  
  public void run()
  {
    this.b.setVisibility(8);
    if (this.c.getVisibility() == 0) {
      this.c.setVisibility(8);
    }
    this.a.requestLayout();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */