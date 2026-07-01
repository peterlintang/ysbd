package com.umeng.socialize.view;

import android.os.Handler;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

class az
  extends WebChromeClient
{
  az(at paramat) {}
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    super.onProgressChanged(paramWebView, paramInt);
    if (paramInt < 90)
    {
      at.b(this.a).setVisibility(0);
      return;
    }
    at.c(this.a).sendEmptyMessage(1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\az.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */