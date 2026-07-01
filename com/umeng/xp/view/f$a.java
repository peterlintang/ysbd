package com.umeng.xp.view;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.widget.ViewSwitcher;
import com.umeng.xp.a.c;

class f$a
  implements Animation.AnimationListener
{
  Animation a;
  Animation b;
  
  public f$a(f paramf, Animation paramAnimation1, Animation paramAnimation2)
  {
    this.a = paramAnimation1;
    this.b = paramAnimation2;
    paramAnimation2.setDuration(f.c());
    paramAnimation1.setDuration(f.c());
    paramAnimation1.setAnimationListener(this);
  }
  
  public f$a(f paramf, Animation paramAnimation1, Animation paramAnimation2, long paramLong)
  {
    this.a = paramAnimation1;
    this.b = paramAnimation2;
    paramAnimation2.setDuration(paramLong);
    paramAnimation1.setDuration(paramLong);
    paramAnimation1.setAnimationListener(this);
  }
  
  public void onAnimationEnd(Animation paramAnimation)
  {
    switch (f.d(this.c).getDisplayedChild())
    {
    default: 
      return;
    case 0: 
      f.a(this.c, c.J(f.g(this.c)));
      return;
    }
    f.a(this.c, c.K(f.g(this.c)));
  }
  
  public void onAnimationRepeat(Animation paramAnimation) {}
  
  public void onAnimationStart(Animation paramAnimation) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\f$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */