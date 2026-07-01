package com.ireadercity.b2.ui;

import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

final class aq
  extends WebViewClient
{
  aq(AboutUsActivity paramAboutUsActivity) {}
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Toast.makeText(this.a, "加载失败！", 1).show();
    AboutUsActivity.a(this.a).setVisibility(8);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */