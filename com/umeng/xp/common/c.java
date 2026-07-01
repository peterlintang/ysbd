package com.umeng.xp.common;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class c
  implements Animation.AnimationListener
{
  c(View paramView) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    this.a.setVisibility(0);
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */