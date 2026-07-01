package com.umeng.newxp.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.umeng.common.ufp.a.c;
import com.umeng.newxp.controller.XpListenersCenter.EntryOnClickListener;

class ExchangeViewManager$12
  implements View.OnClickListener
{
  ExchangeViewManager$12(ExchangeViewManager paramExchangeViewManager) {}
  
  public void onClick(View paramView)
  {
    if ((com.umeng.common.ufp.b.a(this.a.a, "android.permission.ACCESS_NETWORK_STATE")) && (!com.umeng.common.ufp.b.z(this.a.a))) {
      Toast.makeText(this.a.a, this.a.a.getResources().getString(c.a(this.a.a)), 1).show();
    }
    for (;;)
    {
      ExchangeViewManager.c(this.a);
      if (this.a.c != null) {
        this.a.c.onClick(ExchangeViewManager.d(this.a));
      }
      return;
      com.umeng.newxp.view.handler.b.a(this.a.a, ExchangeViewManager.a(this.a), null);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */