package com.umeng.xp.view;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.umeng.common.b;
import com.umeng.xp.a.e;
import com.umeng.xp.common.g;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.EntryOnClickListener;

class G
  implements View.OnClickListener
{
  G(ExchangeViewManager paramExchangeViewManager) {}
  
  public void onClick(View paramView)
  {
    if ((b.a(this.a.c, "android.permission.ACCESS_NETWORK_STATE")) && (!b.m(this.a.c)))
    {
      Toast.makeText(this.a.c, this.a.c.getResources().getString(e.f(this.a.c)), 1).show();
      return;
    }
    paramView = new StringBuilder("http://ex.mobmore.com/api/wap?sdk_version=" + b.d(this.a.c));
    if (!TextUtils.isEmpty(ExchangeViewManager.a(this.a).slot_id)) {
      paramView.append("&slot_id=" + ExchangeViewManager.a(this.a).slot_id);
    }
    for (;;)
    {
      new i(this.a.c, paramView.toString()).show();
      if (this.a.e == null) {
        break;
      }
      this.a.e.onClick(ExchangeViewManager.c(this.a));
      return;
      if (TextUtils.isEmpty(g.a(this.a.c))) {
        break;
      }
      paramView.append("&app_key=" + g.a(this.a.c));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\G.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */