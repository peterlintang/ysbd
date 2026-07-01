package com.umeng.newxp.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.a.b;
import com.umeng.newxp.controller.XpListenersCenter.NTipsChangedListener;

class ExchangeViewManager$9
  implements XpListenersCenter.NTipsChangedListener
{
  ExchangeViewManager$9(ExchangeViewManager paramExchangeViewManager) {}
  
  public void onChanged(int paramInt)
  {
    if (paramInt == 0) {}
    try
    {
      ExchangeViewManager.e(this.a).setVisibility(0);
      ExchangeViewManager.f(this.a).setImageResource(b.h(this.a.a));
      ExchangeViewManager.g(this.a).setText("");
      ExchangeViewManager.g(this.a).setBackgroundDrawable(null);
      return;
    }
    catch (Exception localException)
    {
      Log.e(ExchangeViewManager.b(this.a), "", localException);
      return;
    }
    if (paramInt > 0)
    {
      ExchangeViewManager.f(this.a).setImageDrawable(null);
      ExchangeViewManager.g(this.a).setBackgroundResource(b.i(this.a.a));
      ExchangeViewManager.g(this.a).setText(paramInt);
      ExchangeViewManager.e(this.a).setVisibility(0);
      return;
    }
    ExchangeViewManager.e(this.a).setVisibility(4);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */