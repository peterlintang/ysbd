package com.umeng.newxp.view.common;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.ProgressBar;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.common.ExchangeConstants;

class g$3
  extends WebChromeClient
{
  g$3(g paramg) {}
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    Log.a(ExchangeConstants.LOG_TAG, "Webview loading progress: " + paramInt);
    if (this.a.h != null)
    {
      this.a.h.setProgress(paramInt);
      if (paramInt > 90) {
        this.a.h.setVisibility(4);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\g$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */