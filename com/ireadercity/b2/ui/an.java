package com.ireadercity.b2.ui;

import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

final class an
  extends WebChromeClient
{
  an(AboutUsActivity paramAboutUsActivity) {}
  
  public final void onProgressChanged(WebView paramWebView, int paramInt)
  {
    if (paramInt == 100) {
      AboutUsActivity.a(this.a).setVisibility(8);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */