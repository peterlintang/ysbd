package com.umeng.socialize.view;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import android.widget.TextView;

public class a
  extends LinearLayout
{
  public a(Context paramContext)
  {
    super(paramContext);
  }
  
  protected int a(int paramInt, float paramFloat)
  {
    int i = paramInt;
    if (paramInt != 0) {
      i = (int)(paramInt * paramFloat);
    }
    return i;
  }
  
  public void a(Activity paramActivity)
  {
    Object localObject = new DisplayMetrics();
    paramActivity.getWindowManager().getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
    int i = a(4, ((DisplayMetrics)localObject).density);
    paramActivity = new LinearLayout.LayoutParams(-1, a(48, ((DisplayMetrics)localObject).density));
    setLayoutParams(paramActivity);
    setOrientation(0);
    localObject = new ProgressBar(getContext(), null, 16842873);
    ((ProgressBar)localObject).setPadding(i, i, i, i);
    TextView localTextView = new TextView(getContext());
    localTextView.setTextColor(-7829368);
    localTextView.setTextSize(1, 14.0F);
    localTextView.setText("Loading...");
    localTextView.setPadding(i, i, i, i);
    LinearLayout.LayoutParams localLayoutParams1 = new LinearLayout.LayoutParams(-2, -2);
    localLayoutParams1.gravity = 17;
    localLayoutParams1.weight = 0.0F;
    LinearLayout.LayoutParams localLayoutParams2 = new LinearLayout.LayoutParams(-1, -1);
    localLayoutParams2.gravity = 19;
    localLayoutParams2.weight = 1.0F;
    localLayoutParams2.setMargins(0, 0, 0, 0);
    setLayoutParams(paramActivity);
    ((ProgressBar)localObject).setLayoutParams(localLayoutParams1);
    localTextView.setLayoutParams(localLayoutParams2);
    localTextView.setGravity(19);
    addView((View)localObject);
    addView(localTextView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */