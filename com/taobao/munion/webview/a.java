package com.taobao.munion.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.taobao.munion.utils.k;

public class a
  extends WebViewClient
{
  private b filter = null;
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    super.onPageFinished(paramWebView, paramString);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    if ((this.filter != null) && (this.filter.doFilter(paramString))) {
      return;
    }
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedSslError(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    if (paramSslErrorHandler != null) {
      paramSslErrorHandler.proceed();
    }
  }
  
  public void seUrlFilter(b paramb)
  {
    this.filter = paramb;
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    k.a("shouldOverrideUrlLoading " + paramString);
    if ((this.filter != null) && (this.filter.doFilter(paramString))) {
      return true;
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\webview\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */