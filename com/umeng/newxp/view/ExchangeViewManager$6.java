package com.umeng.newxp.view;

import android.content.Context;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import com.umeng.newxp.controller.XpListenersCenter.WelcomeAdsListener;
import com.umeng.newxp.view.welcome.WelcomeView;
import com.umeng.newxp.view.welcome.i;

class ExchangeViewManager$6
  extends WelcomeView
{
  ExchangeViewManager$6(ExchangeViewManager paramExchangeViewManager, Context paramContext, i parami, XpListenersCenter.WelcomeAdsListener paramWelcomeAdsListener)
  {
    super(paramContext);
  }
  
  public void a(int paramInt, View paramView1, View paramView2)
  {
    super.a(paramInt, paramView1, paramView2);
    if (this.b != null) {
      this.b.onCountdown(paramInt);
    }
  }
  
  public void a(WelcomeView paramWelcomeView)
  {
    try
    {
      if (this.a.isShowing()) {
        this.a.dismiss();
      }
      super.a(paramWelcomeView);
      if (this.b != null) {
        this.b.onFinish();
      }
      return;
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      for (;;)
      {
        ExchangeViewManager.b(this.c);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        ExchangeViewManager.b(this.c);
      }
    }
  }
  
  public void a(String paramString)
  {
    super.a(paramString);
    try
    {
      if (this.a.isShowing()) {
        this.a.dismiss();
      }
      if (this.b != null)
      {
        this.b.onError(paramString);
        this.b.onFinish();
      }
      return;
    }
    catch (WindowManager.BadTokenException localBadTokenException)
    {
      for (;;)
      {
        ExchangeViewManager.b(this.c);
      }
    }
    catch (IllegalArgumentException localIllegalArgumentException)
    {
      for (;;)
      {
        ExchangeViewManager.b(this.c);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */