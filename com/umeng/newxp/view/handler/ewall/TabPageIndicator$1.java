package com.umeng.newxp.view.handler.ewall;

import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.View.OnClickListener;

class TabPageIndicator$1
  implements View.OnClickListener
{
  TabPageIndicator$1(TabPageIndicator paramTabPageIndicator) {}
  
  public void onClick(View paramView)
  {
    paramView = (TabPageIndicator.b)paramView;
    int i = TabPageIndicator.a(this.a).getCurrentItem();
    int j = paramView.a();
    TabPageIndicator.a(this.a).setCurrentItem(j);
    if ((i == j) && (TabPageIndicator.b(this.a) != null)) {
      TabPageIndicator.b(this.a).a(j);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\TabPageIndicator$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */