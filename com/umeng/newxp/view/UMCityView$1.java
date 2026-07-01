package com.umeng.newxp.view;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.taobao.munion.common.fragment.BaseFragment;
import com.taobao.munion.common.fragment.UMFragmentPageManager;
import com.umeng.newxp.view.common.actionbar.b;
import com.umeng.newxp.view.widget.indexlist.AlphabetIndexAdapter;
import com.umeng.newxp.view.widget.indexlist.City;

class UMCityView$1
  implements AdapterView.OnItemClickListener
{
  UMCityView$1(UMCityView paramUMCityView) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (City)UMCityView.a(this.a).getItem(paramInt);
    if (!b.a(UMCityView.b(this.a)).equals(paramAdapterView.d()))
    {
      b.a(UMCityView.b(this.a), paramAdapterView.d());
      paramView = new Intent();
      paramView.putExtra("data", paramAdapterView.d());
      if (this.a.c != null) {
        this.a.c.setResult(-1, paramView);
      }
    }
    for (;;)
    {
      UMCityView.b(this.a).getWindowManager().removeView(this.a.e);
      if (this.a.c == null) {
        break;
      }
      UMFragmentPageManager.getInstance().popToBack();
      return;
      UMCityView.b(this.a).setResult(-1, paramView);
      continue;
      if (this.a.c != null) {
        this.a.c.setResult(0);
      } else {
        UMCityView.b(this.a).setResult(0);
      }
    }
    UMCityView.b(this.a).finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMCityView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */