package com.umeng.newxp.view.common;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

class WapActivity$7
  extends WebViewClient
{
  WapActivity$7(WapActivity paramWapActivity) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    WapActivity.d(this.a).setVisibility(4);
    if (WapActivity.e(this.a).a) {
      this.a.a();
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    WapActivity.d(this.a).setVisibility(0);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Toast.makeText(WapActivity.f(this.a), "Oh no! " + paramString1, 0).show();
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\WapActivity$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */