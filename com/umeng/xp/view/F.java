package com.umeng.xp.view;

import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.xp.Promoter;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.xp.controller.XpListenersCenter.FloatDialogListener;
import java.util.List;

class F
  implements XpListenersCenter.ExchangeDataRequestListener
{
  F(ExchangeViewManager paramExchangeViewManager, FloatDialogConfig paramFloatDialogConfig) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (this.a.getListener() != null) {
      this.a.getListener().onPrepared(paramInt);
    }
    if (!TextUtils.isEmpty(ExchangeViewManager.a(this.b).opensize))
    {
      N.a(this.b.c, ExchangeViewManager.a(this.b), this.a);
      return;
    }
    Log.e(ExchangeViewManager.b(this.b), "Unshow the suspended window. opensize is null");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\F.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */