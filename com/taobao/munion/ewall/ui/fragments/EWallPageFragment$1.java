package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.common.fragment.FragmentPageManager;

class EWallPageFragment$1
  implements View.OnClickListener
{
  EWallPageFragment$1(EWallPageFragment paramEWallPageFragment) {}
  
  public void onClick(View paramView)
  {
    FragmentPageManager.getInstance().pushPage(FavGroupFragment.class.getName());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */