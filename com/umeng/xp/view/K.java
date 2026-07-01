package com.umeng.xp.view;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.xp.controller.XpListenersCenter.EntryOnClickListener;

class K
  implements View.OnClickListener
{
  K(ExchangeViewManager paramExchangeViewManager) {}
  
  public void onClick(View paramView)
  {
    ao.a(this.a.c, ExchangeViewManager.a(this.a), null);
    if (this.a.e != null) {
      this.a.e.onClick(ExchangeViewManager.c(this.a));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\K.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */