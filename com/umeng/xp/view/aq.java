package com.umeng.xp.view;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import com.umeng.common.Log;
import com.umeng.xp.a;
import com.umeng.xp.a.a;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.common.g;
import com.umeng.xp.controller.ExchangeDataService;
import java.util.List;

class aq
  implements Animation.AnimationListener
{
  aq(ao paramao) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    if (ao.b(this.a) != 1)
    {
      if ((ao.c(this.a).preloadData != null) && (ao.c(this.a).preloadData.a == a.a.a))
      {
        paramAnimation = ao.c(this.a).preloadData.b();
        if (this.a.b != null) {
          this.a.b.b();
        }
        ao.a(this.a, g.a(ao.d(this.a), paramAnimation));
        ao.a(this.a);
        Log.c(ExchangeConstants.LOG_TAG, "init view use preloadData.... " + paramAnimation.size());
      }
    }
    else {
      return;
    }
    ao.c(this.a).sessionId = "";
    ao.c(this.a).requestDataAsyn(ao.e(this.a), ao.f(this.a));
    Log.c(ExchangeConstants.LOG_TAG, "init view use server data.... ");
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation)
  {
    if (ao.b(this.a) != 1) {
      this.a.b.a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */