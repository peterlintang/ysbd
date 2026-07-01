package com.umeng.xp.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;

class aI
  implements View.OnClickListener
{
  aI(aE paramaE) {}
  
  public void onClick(View paramView)
  {
    if (aE.b(this.a).canGoBack()) {
      aE.b(this.a).goBack();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */