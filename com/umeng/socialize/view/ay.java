package com.umeng.socialize.view;

import android.view.View;
import java.util.Set;

class ay
  implements Runnable
{
  ay(aw paramaw, View paramView1, View paramView2) {}
  
  public void run()
  {
    this.b.setVisibility(0);
    if ((this.c.getVisibility() != 0) && (at.g(aw.a(this.a)) != null) && (at.g(aw.a(this.a)).size() > 0)) {
      this.c.setVisibility(0);
    }
    this.a.requestLayout();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */