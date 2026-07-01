package com.umeng.newxp.view.templates;

import android.view.View;
import android.widget.ListView;
import java.util.List;

class a$4$1
  implements Runnable
{
  a$4$1(a.4 param4, int paramInt) {}
  
  public void run()
  {
    if ((a.c(this.b.a).getFirstVisiblePosition() == 0) && (this.a <= a.i(this.b.a).size()))
    {
      a.e(this.b.a).setVisibility(4);
      a.e(this.b.a).setClickable(false);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\a$4$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */