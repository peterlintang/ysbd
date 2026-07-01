package com.taobao.munion.actionbar;

import android.app.Activity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.restool.a;

public class b
  extends ActionBar.a
{
  private Activity a;
  private String b;
  private FragmentManager c;
  
  public b(Activity paramActivity)
  {
    super(a.e("munion_actionbar_back_selector"));
    this.a = paramActivity;
  }
  
  public b(Activity paramActivity, int paramInt)
  {
    super(paramInt);
    this.a = paramActivity;
  }
  
  public b(Activity paramActivity, View paramView, boolean paramBoolean)
  {
    super(paramView, paramBoolean);
    this.a = paramActivity;
  }
  
  public b(Activity paramActivity, String paramString)
  {
    super(a.e("munion_actionbar_back_selector"));
    this.a = paramActivity;
    this.b = paramString;
  }
  
  public void a(View paramView)
  {
    if (FragmentPageManager.getInstance().canGoBack()) {
      FragmentPageManager.getInstance().popToBack();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\actionbar\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */