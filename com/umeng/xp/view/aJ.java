package com.umeng.xp.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

class aJ
  implements View.OnClickListener
{
  aJ(aE paramaE) {}
  
  public void onClick(View paramView)
  {
    if (aE.b(this.a).canGoForward()) {
      aE.b(this.a).goForward();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aJ.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */