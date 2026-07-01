package com.umeng.newxp.view;

import android.text.TextUtils;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.controller.XpListenersCenter.FloatDialogListener;
import com.umeng.newxp.view.popup.FloatDialogConfig;
import com.umeng.newxp.view.popup.b;
import java.util.List;

class ExchangeViewManager$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ExchangeViewManager$1(ExchangeViewManager paramExchangeViewManager, FloatDialogConfig paramFloatDialogConfig) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (this.a.getListener() != null) {
      this.a.getListener().onPrepared(paramInt);
    }
    String str = ExchangeViewManager.a(this.b).opensize;
    if (!TextUtils.isEmpty(str))
    {
      if ((paramList != null) && (paramList.size() > 0) && (str.equals("0.04")))
      {
        paramList = (Promoter)paramList.get(0);
        ExchangeViewManager.a(this.b, paramList, this.a.getListener());
        return;
      }
      b.a(this.b.a, ExchangeViewManager.a(this.b), this.a, paramList);
      return;
    }
    Log.e(ExchangeViewManager.b(this.b), "Unshow the suspended window. opensize is null");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */