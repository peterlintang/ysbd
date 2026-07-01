package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.common.fragment.FragmentPageManager;

class MyMunionFragment$1
  implements View.OnClickListener
{
  MyMunionFragment$1(MyMunionFragment paramMyMunionFragment) {}
  
  public void onClick(View paramView)
  {
    MyMunionFragment.access$000(this.this$0);
    MunionConfigManager.getInstance().clearUserInfo();
    FragmentPageManager.getInstance().pushPageForResult(OauthFragment.class.getName(), 2, this.this$0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\MyMunionFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */