package com.umeng.newxp.view.widget.pulltorefresh.internal;

import android.graphics.drawable.Drawable;
import android.view.View;

class ViewCompat$SDK16
{
  public static void a(View paramView, Drawable paramDrawable)
  {
    paramView.setBackground(paramDrawable);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    paramView.postOnAnimation(paramRunnable);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\internal\ViewCompat$SDK16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */