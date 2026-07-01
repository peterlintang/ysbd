package com.taobao.munion.actionbar;

import android.app.Activity;
import android.view.View;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.BaseFragment.OnFragmentFinishListener;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.ewall.ui.fragments.MyMunionFragment;
import com.taobao.munion.ewall.ui.fragments.OauthFragment;
import com.taobao.munion.utils.l;

public class a
  extends ActionBar.a
{
  Activity a;
  BaseFragment.OnFragmentFinishListener b;
  
  public a(Activity paramActivity)
  {
    super(com.taobao.munion.restool.a.e("munion_actionbar_account_unlogin_selector"));
    this.a = paramActivity;
  }
  
  public a(Activity paramActivity, BaseFragment.OnFragmentFinishListener paramOnFragmentFinishListener)
  {
    super(com.taobao.munion.restool.a.e("munion_actionbar_account_unlogin_selector"));
    this.a = paramActivity;
    this.b = paramOnFragmentFinishListener;
  }
  
  public void a(View paramView)
  {
    if (l.b(MunionConfigManager.getInstance().getUserName()))
    {
      FragmentPageManager.getInstance().pushPageForResult(OauthFragment.class.getName(), 2, this.b);
      return;
    }
    FragmentPageManager.getInstance().pushPageForResult(MyMunionFragment.class.getName(), 3, this.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\actionbar\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */