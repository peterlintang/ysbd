package com.umeng.xp.view;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

class aL
  extends WebViewClient
{
  aL(aE paramaE) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    aE.d(this.a).setVisibility(4);
    if (aE.e(this.a).a) {
      this.a.a();
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    aE.d(this.a).setVisibility(0);
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Toast.makeText(aE.f(this.a), "Oh no! " + paramString1, 0).show();
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    paramWebView.loadUrl(paramString);
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aL.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */