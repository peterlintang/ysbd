package com.umeng.xp.common;

import android.content.Context;
import android.widget.ImageView;
import com.umeng.xp.Promoter;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

final class h
  implements XpListenersCenter.ExchangeDataRequestListener
{
  h(g.a parama, ExchangeDataService paramExchangeDataService, ImageView paramImageView, Context paramContext) {}
  
  public final void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt == 0) {
      this.a.a(paramInt);
    }
    while (this.b.landing_image == null) {
      return;
    }
    paramList = new i(this, paramList);
    com.umeng.common.net.i.a(this.d, this.c, this.b.landing_image, false, paramList, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */