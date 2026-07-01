package com.umeng.newxp.controller;

import android.view.View;
import com.umeng.newxp.Promoter;

public abstract interface XpListenersCenter$WelcomeAdsListener
{
  public abstract void onCountdown(int paramInt);
  
  public abstract void onDataReviced(Promoter paramPromoter);
  
  public abstract void onError(String paramString);
  
  public abstract void onFinish();
  
  public abstract void onShow(View paramView);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\XpListenersCenter$WelcomeAdsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */