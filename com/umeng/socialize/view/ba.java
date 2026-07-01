package com.umeng.socialize.view;

import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;

class ba
  extends at.a
{
  ba(at paramat)
  {
    super(paramat, null);
  }
  
  public void a(WebView paramWebView, SslErrorHandler paramSslErrorHandler, SslError paramSslError)
  {
    paramSslErrorHandler.proceed();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */