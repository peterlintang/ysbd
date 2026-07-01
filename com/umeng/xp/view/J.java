package com.umeng.xp.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.xp.controller.XpListenersCenter.EntryOnClickListener;
import java.util.ArrayList;
import java.util.List;

class J
  implements View.OnClickListener
{
  J(I paramI, List paramList) {}
  
  public void onClick(View paramView)
  {
    paramView = new ArrayList();
    if ((this.a != null) && (this.a.size() > 0))
    {
      paramView.addAll(this.a);
      this.a.clear();
    }
    ao.a(this.b.b.c, ExchangeViewManager.a(this.b.b), null);
    if (this.b.b.e != null) {
      this.b.b.e.onClick(ExchangeViewManager.c(this.b.b));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\J.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */