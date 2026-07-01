package com.umeng.xp.view;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

class aK
  extends WebChromeClient
{
  aK(aE paramaE) {}
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    aE.c(this.a).setProgress(paramInt);
    super.onProgressChanged(paramWebView, paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aK.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */