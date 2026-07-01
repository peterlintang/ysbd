package com.umeng.newxp.view.common;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;

class WapActivity$6
  extends WebChromeClient
{
  WapActivity$6(WapActivity paramWapActivity) {}
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    WapActivity.c(this.a).setProgress(paramInt);
    super.onProgressChanged(paramWebView, paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\WapActivity$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */