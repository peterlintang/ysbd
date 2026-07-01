package com.umeng.socialize.view;

import android.graphics.Bitmap;
import android.os.Handler;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.umeng.socialize.common.m;
import com.umeng.socom.Log;

class at$a
  extends WebViewClient
{
  private at$a(at paramat) {}
  
  private void a(String paramString)
  {
    Log.c(at.a(), "OauthDialog " + paramString);
    at.a(this.b, 1);
    at.a(this.b, m.a(paramString));
    m.a(this.b);
  }
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    at.c(this.b).sendEmptyMessage(1);
    super.onPageFinished(paramWebView, paramString);
    if ((at.d(this.b) == 0) && (paramString.startsWith(at.a(this.b)))) {
      a(paramString);
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Log.b(at.a(), "onReceivedError: " + paramString2 + "\nerrCode: " + paramInt + " description:" + paramString1);
    if (at.b(this.b).getVisibility() == 0) {
      at.b(this.b).setVisibility(8);
    }
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
    m.a(this.b);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Log.a(at.a(), "current : " + paramString);
    if (paramString.startsWith(at.a(this.b))) {
      a(paramString);
    }
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\at$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */