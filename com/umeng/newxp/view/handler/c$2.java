package com.umeng.newxp.view.handler;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.common.e;

class c$2
  implements Animation.AnimationListener
{
  c$2(c paramc) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (c.b(this.a) != 1)
    {
      c.e(this.a).requestDataAsyn(c.c(this.a), c.d(this.a), true);
      Log.c(ExchangeConstants.LOG_TAG, "init view use server data.... ");
    }
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    if (c.b(this.a) != 1) {
      this.a.a.a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\c$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */