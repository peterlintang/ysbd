package com.taobao.munion.ewall.test;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.ewall.ui.fragments.FavGroupFragment;
import com.taobao.munion.ewall.ui.fragments.GoodsDetailFragment;

class TestFragment$1
  implements AdapterView.OnItemClickListener
{
  TestFragment$1(TestFragment paramTestFragment) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    new Bundle();
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      FragmentPageManager.getInstance().pushPage(GoodsDetailFragment.class.getName(), null);
      return;
    }
    FragmentPageManager.getInstance().pushPage(FavGroupFragment.class.getName(), null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\test\TestFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */