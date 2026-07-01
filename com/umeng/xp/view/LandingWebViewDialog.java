package com.umeng.xp.view;

import android.app.Dialog;
import android.content.Context;
import android.view.WindowManager.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.umeng.xp.a.a;
import com.umeng.xp.a.c;

public class LandingWebViewDialog
  extends Dialog
{
  Animation a;
  private Context b;
  
  public LandingWebViewDialog(Context paramContext, String paramString) {}
  
  private void a()
  {
    ImageView localImageView = (ImageView)findViewById(c.z(this.b));
    localImageView.setVisibility(0);
    if (this.a == null) {
      this.a = AnimationUtils.loadAnimation(this.b, a.d(this.b));
    }
    this.a.setInterpolator(new LinearInterpolator());
    this.a.setAnimationListener(new ab(this));
    localImageView.startAnimation(this.a);
  }
  
  private void b()
  {
    ImageView localImageView = (ImageView)findViewById(c.z(this.b));
    localImageView.clearAnimation();
    localImageView.setVisibility(8);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\LandingWebViewDialog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */