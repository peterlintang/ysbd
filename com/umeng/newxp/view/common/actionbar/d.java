package com.umeng.newxp.view.common.actionbar;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.taobao.munion.common.fragment.UMFragmentPageManager;
import com.umeng.newxp.view.handler.umwall.UMWall;
import com.umeng.newxp.view.i;

public class d
  extends ActionBar.b
{
  private Activity a;
  
  public d(int paramInt)
  {
    super(paramInt);
  }
  
  public d(Activity paramActivity, int paramInt)
  {
    super(paramInt);
    this.a = paramActivity;
  }
  
  public void a(View paramView)
  {
    if ((this.a instanceof UMWall))
    {
      paramView = ((UMWall)this.a).h;
      if (paramView != null)
      {
        Bundle localBundle = new Bundle();
        localBundle.putParcelable("category", paramView);
        i.a = UMWall.b;
        UMFragmentPageManager.getInstance().pushPage(i.class.getName(), localBundle);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\actionbar\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */