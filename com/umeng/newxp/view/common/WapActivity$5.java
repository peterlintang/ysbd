package com.umeng.newxp.view.common;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

class WapActivity$5
  implements View.OnClickListener
{
  WapActivity$5(WapActivity paramWapActivity) {}
  
  public void onClick(View paramView)
  {
    if (WapActivity.b(this.a).canGoForward()) {
      WapActivity.b(this.a).goForward();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\WapActivity$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */