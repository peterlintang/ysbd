package com.umeng.xp.view;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

class as
  implements Animation.AnimationListener
{
  as(ao paramao) {}
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    this.a.dismiss();
    ao.a(this.a, false);
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */