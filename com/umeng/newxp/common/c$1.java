package com.umeng.newxp.common;

import android.content.Context;
import android.widget.ImageView;
import com.umeng.common.ufp.net.g;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

final class c$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  c$1(c.a parama, ExchangeDataService paramExchangeDataService, Context paramContext, ImageView paramImageView) {}
  
  public final void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt == 0) {
      this.a.a(0, paramList);
    }
    while (this.b.landing_image == null) {
      return;
    }
    paramList = new c.1.1(this, paramList);
    g.a(this.c, this.d, this.b.landing_image, false, paramList, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */