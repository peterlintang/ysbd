package com.ireadercity.b2.ui.widget;

import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;

final class l
  implements Animation.AnimationListener
{
  l(SimpleReadingView paramSimpleReadingView) {}
  
  public final void onAnimationEnd(Animation paramAnimation)
  {
    new StringBuilder("onAnimationEnd =").append(paramAnimation).toString();
    paramAnimation = this.a;
    paramAnimation.c += 1;
    if (this.a.c == 1)
    {
      this.a.a.clearAnimation();
      this.a.b.clearAnimation();
      paramAnimation = this.a.a;
      this.a.a = this.a.b;
      this.a.b = paramAnimation;
      SimpleReadingView.a(this.a);
      SimpleReadingView.a(this.a, false);
      SimpleReadingView.b(this.a);
    }
  }
  
  public final void onAnimationRepeat(Animation paramAnimation) {}
  
  public final void onAnimationStart(Animation paramAnimation)
  {
    new StringBuilder("onAnimationStart =").append(paramAnimation).toString();
    SimpleReadingView.a(this.a, true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */