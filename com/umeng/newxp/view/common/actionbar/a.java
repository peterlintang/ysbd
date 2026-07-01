package com.umeng.newxp.view.common.actionbar;

import android.app.Activity;
import android.view.View;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.UMFragmentPageManager;
import com.umeng.newxp.view.handler.umwall.UMWall;

public class a
  extends ActionBar.b
{
  private Activity a;
  private String b;
  private BaseFragment c;
  
  public a(Activity paramActivity)
  {
    super(c.e("umeng_xp_cm_title_back"));
    this.a = paramActivity;
  }
  
  public a(Activity paramActivity, int paramInt)
  {
    super(paramInt);
    this.a = paramActivity;
  }
  
  public a(Activity paramActivity, View paramView, boolean paramBoolean)
  {
    super(paramView, paramBoolean);
    this.a = paramActivity;
  }
  
  public a(Activity paramActivity, String paramString)
  {
    super(c.e("umeng_xp_cm_title_back"));
    this.a = paramActivity;
    this.b = paramString;
  }
  
  public a(BaseFragment paramBaseFragment)
  {
    super(c.e("umeng_xp_cm_title_back"));
    this.c = paramBaseFragment;
  }
  
  public void a(View paramView)
  {
    if (this.c != null)
    {
      UMFragmentPageManager.getInstance().popToBack();
      return;
    }
    if ((this.a instanceof UMWall)) {
      ((UMWall)this.a).staticBackEvent();
    }
    this.a.finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\actionbar\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */