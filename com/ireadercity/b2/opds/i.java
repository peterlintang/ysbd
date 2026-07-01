package com.ireadercity.b2.opds;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.RelativeLayout;

final class i
  extends WebViewClient
{
  i(OnlineBook_Shupeng paramOnlineBook_Shupeng) {}
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    this.a.b.setVisibility(4);
    super.onPageFinished(paramWebView, paramString);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    this.a.b.setVisibility(0);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */