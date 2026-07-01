package com.umeng.newxp.view.common.actionbar;

import android.app.Dialog;
import android.content.Context;
import android.view.View;
import com.taobao.munion.common.fragment.BaseFragment;

public class e
  extends ActionBar.b
{
  private Context a;
  private String b;
  private BaseFragment c;
  private Dialog d;
  
  public e(Context paramContext)
  {
    super(c.e("umeng_xp_cm_title_back"));
  }
  
  public e(Context paramContext, int paramInt)
  {
    super(paramInt);
  }
  
  public e(Context paramContext, Dialog paramDialog)
  {
    super(c.e("umeng_xp_cm_title_back"));
    this.d = paramDialog;
  }
  
  public e(Context paramContext, View paramView, boolean paramBoolean)
  {
    super(paramView, paramBoolean);
  }
  
  public e(Context paramContext, String paramString)
  {
    super(c.e("umeng_xp_cm_title_back"));
    this.b = paramString;
  }
  
  public e(BaseFragment paramBaseFragment)
  {
    super(c.e("umeng_xp_cm_title_back"));
    this.c = paramBaseFragment;
  }
  
  public void a(View paramView)
  {
    if (this.d != null) {
      this.d.onBackPressed();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\actionbar\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */