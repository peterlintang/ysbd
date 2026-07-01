package com.umeng.xp.common;

import android.view.View;
import android.view.animation.AlphaAnimation;

public class a
{
  public static void a(View paramView)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(1.0F, 0.0F);
    localAlphaAnimation.setDuration(1000L);
    localAlphaAnimation.setStartTime(200L);
    localAlphaAnimation.setAnimationListener(new b(paramView));
    paramView.startAnimation(localAlphaAnimation);
  }
  
  public static void b(View paramView)
  {
    AlphaAnimation localAlphaAnimation = new AlphaAnimation(0.0F, 1.0F);
    localAlphaAnimation.setDuration(1000L);
    localAlphaAnimation.setStartTime(200L);
    localAlphaAnimation.setAnimationListener(new c(paramView));
    paramView.startAnimation(localAlphaAnimation);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */