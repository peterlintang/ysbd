package com.ireadercity.b2.ui;

import android.graphics.Bitmap;
import android.os.Handler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.ireadercity.b2.ui.widget.CustomerWebView;

final class fu
  extends WebViewClient
{
  fu(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    new StringBuilder("onLoadResource url=").append(paramString).toString();
  }
  
  public final void onPageFinished(WebView paramWebView, String paramString)
  {
    new StringBuilder("onPageFinished getContentHeight=").append(ShowContentScrollUpAndDown.e(this.a).getContentHeight()).append("url=").append(paramString).toString();
    paramWebView = ShowContentScrollUpAndDown.f(this.a).obtainMessage();
    paramWebView.what = ShowContentScrollUpAndDown.e(this.a).getContentHeight();
    ShowContentScrollUpAndDown.f(this.a).dispatchMessage(paramWebView);
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    new StringBuilder("webView.onPageStarted view.getWidth()=").append(paramWebView.getWidth()).append("view.getHeight()=").append(paramWebView.getHeight()).toString();
    ShowContentScrollUpAndDown.e(this.a).setVisibility(4);
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    new StringBuilder("shouldOverrideUrlLoading").append(paramString).toString();
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */