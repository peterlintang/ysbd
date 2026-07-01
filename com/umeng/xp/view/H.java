package com.umeng.xp.view;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.common.Log;
import com.umeng.common.c;
import com.umeng.xp.controller.XpListenersCenter.NTipsChangedListener;

class H
  implements XpListenersCenter.NTipsChangedListener
{
  H(ExchangeViewManager paramExchangeViewManager) {}
  
  public void onChanged(int paramInt)
  {
    if (paramInt == 0) {}
    try
    {
      ExchangeViewManager.d(this.a).setVisibility(0);
      ExchangeViewManager.e(this.a).setImageResource(c.a(this.a.c).c("umeng_xp_new_tip"));
      ExchangeViewManager.f(this.a).setText("");
      ExchangeViewManager.f(this.a).setBackgroundDrawable(null);
      return;
    }
    catch (Exception localException)
    {
      Log.e(ExchangeViewManager.b(this.a), "", localException);
      return;
    }
    if (paramInt > 0)
    {
      ExchangeViewManager.e(this.a).setImageDrawable(null);
      ExchangeViewManager.f(this.a).setBackgroundResource(c.a(this.a.c).c("umeng_xp_new_tip_bg"));
      ExchangeViewManager.f(this.a).setText(paramInt);
      ExchangeViewManager.d(this.a).setVisibility(0);
      return;
    }
    ExchangeViewManager.d(this.a).setVisibility(4);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\H.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */