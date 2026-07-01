package com.umeng.newxp.view.common;

import android.content.Context;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import com.umeng.common.ufp.util.i;
import com.umeng.newxp.a.a;
import com.umeng.newxp.a.b;

public class e
{
  private ViewGroup a;
  private Context b;
  private ImageView c;
  private RelativeLayout d;
  private boolean e;
  
  public e(Context paramContext, ViewGroup paramViewGroup)
  {
    this.a = paramViewGroup;
    this.b = paramContext;
    this.c = new ImageView(this.b);
    this.c.setImageDrawable(this.b.getResources().getDrawable(b.a(this.b)));
    this.e = false;
    new i(this.b);
    int i = i.a(60.0F);
    paramContext = new RelativeLayout.LayoutParams(i, i);
    paramContext.addRule(13);
    this.d = new RelativeLayout(this.b);
    this.d.addView(this.c, paramContext);
  }
  
  public void a()
  {
    if (this.e) {
      return;
    }
    this.e = true;
    Object localObject = new ViewGroup.LayoutParams(-1, -1);
    this.a.addView(this.d, (ViewGroup.LayoutParams)localObject);
    this.d.setVisibility(0);
    localObject = AnimationUtils.loadAnimation(this.b, a.c(this.b));
    ((Animation)localObject).setInterpolator(new LinearInterpolator());
    ((Animation)localObject).setAnimationListener(new e.1(this));
    this.c.startAnimation((Animation)localObject);
  }
  
  public void b()
  {
    if (!this.e) {
      return;
    }
    this.e = false;
    this.a.removeView(this.d);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */