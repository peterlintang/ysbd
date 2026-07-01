package com.umeng.newxp.view;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.umeng.common.ufp.a.c;
import com.umeng.common.ufp.b;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.EntryOnClickListener;
import com.umeng.newxp.view.wap.a;

class ExchangeViewManager$8
  implements View.OnClickListener
{
  ExchangeViewManager$8(ExchangeViewManager paramExchangeViewManager) {}
  
  public void onClick(View paramView)
  {
    if ((b.a(this.a.a, "android.permission.ACCESS_NETWORK_STATE")) && (!b.z(this.a.a))) {
      Toast.makeText(this.a.a, this.a.a.getResources().getString(c.a(this.a.a)), 1).show();
    }
    for (;;)
    {
      if (this.a.c != null) {
        this.a.c.onClick(ExchangeViewManager.d(this.a));
      }
      return;
      paramView = ExchangeViewManager.a(this.a).getWapUrl(this.a.a);
      new a(this.a.a, paramView).show();
      ExchangeViewManager.c(this.a);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */