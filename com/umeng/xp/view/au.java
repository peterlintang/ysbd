package com.umeng.xp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.umeng.xp.a.a;
import com.umeng.xp.a.c;

public class au
{
  private Context a;
  private int b;
  private View c;
  
  public au(Context paramContext, int paramInt)
  {
    this.a = paramContext;
    this.b = paramInt;
    paramContext = (LayoutInflater)this.a.getSystemService("layout_inflater");
    try
    {
      this.c = paramContext.inflate(this.b, null);
      if (this.c == null) {
        throw new Exception("Failed to inflate " + this.b);
      }
    }
    catch (Exception paramContext)
    {
      throw paramContext;
    }
  }
  
  public View a()
  {
    return this.c;
  }
  
  public void a(View.OnClickListener paramOnClickListener)
  {
    this.c.setOnClickListener(paramOnClickListener);
  }
  
  public void b()
  {
    ImageView localImageView = (ImageView)this.c.findViewById(c.z(this.a));
    if (localImageView == null) {
      return;
    }
    localImageView.setVisibility(0);
    Animation localAnimation = AnimationUtils.loadAnimation(this.a, a.d(this.a));
    localAnimation.setInterpolator(new LinearInterpolator());
    localAnimation.setAnimationListener(new av(this));
    localImageView.startAnimation(localAnimation);
  }
  
  void c()
  {
    ImageView localImageView = (ImageView)this.c.findViewById(c.z(this.a));
    if (localImageView == null) {
      return;
    }
    localImageView.setVisibility(8);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */