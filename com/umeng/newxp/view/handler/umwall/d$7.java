package com.umeng.newxp.view.handler.umwall;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.ewall.ui.fragments.FavGroupFragment;

class d$7
  implements View.OnClickListener
{
  d$7(d paramd) {}
  
  public void onClick(View paramView)
  {
    FragmentPageManager.getInstance().setFragmentManager(this.a.b.getSupportFragmentManager());
    FragmentPageManager.getInstance().pushPage(FavGroupFragment.class.getName());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\d$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */