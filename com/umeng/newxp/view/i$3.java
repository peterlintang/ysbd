package com.umeng.newxp.view;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import com.taobao.munion.common.fragment.UMFragmentPageManager;

class i$3
  implements View.OnClickListener
{
  i$3(i parami) {}
  
  public void onClick(View paramView)
  {
    if (this.a.d == -3) {
      this.a.e.hideSoftInputFromWindow(this.a.getActivity().getWindow().peekDecorView().getWindowToken(), 0);
    }
    UMFragmentPageManager.getInstance().popToBack();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\i$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */