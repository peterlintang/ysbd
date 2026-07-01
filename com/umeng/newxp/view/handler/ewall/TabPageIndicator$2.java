package com.umeng.newxp.view.handler.ewall;

import android.view.View;

class TabPageIndicator$2
  implements Runnable
{
  TabPageIndicator$2(TabPageIndicator paramTabPageIndicator, View paramView) {}
  
  public void run()
  {
    int i = this.a.getLeft();
    int j = (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i - j, 0);
    TabPageIndicator.a(this.b, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\TabPageIndicator$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */