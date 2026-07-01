package com.umeng.newxp.view.common;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

class WapActivity$4
  implements View.OnClickListener
{
  WapActivity$4(WapActivity paramWapActivity) {}
  
  public void onClick(View paramView)
  {
    if (WapActivity.b(this.a).canGoBack()) {
      WapActivity.b(this.a).goBack();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\WapActivity$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */