package com.umeng.newxp.view.widget.pulltorefresh.internal;

import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.View;

public class ViewCompat
{
  public static void a(View paramView, int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 11) {
      ViewCompat.SDK11.a(paramView, paramInt);
    }
  }
  
  public static void a(View paramView, Drawable paramDrawable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      ViewCompat.SDK16.a(paramView, paramDrawable);
      return;
    }
    paramView.setBackgroundDrawable(paramDrawable);
  }
  
  public static void a(View paramView, Runnable paramRunnable)
  {
    if (Build.VERSION.SDK_INT >= 16)
    {
      ViewCompat.SDK16.a(paramView, paramRunnable);
      return;
    }
    paramView.postDelayed(paramRunnable, 16L);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\widget\pulltorefresh\internal\ViewCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */