package com.umeng.xp.view;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.umeng.common.Log;

class P
  extends WebViewClient
{
  P(N paramN) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    if (!N.d(this.a))
    {
      this.a.a(N.e(this.a));
      N.a(this.a, true);
    }
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Toast.makeText(N.c(this.a), "Oh no! " + paramString1, 0).show();
    super.onReceivedError(paramWebView, paramInt, paramString1, paramString2);
  }
  
  public boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    Log.c(N.a(), "OverrideUrl: " + paramString);
    paramWebView = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
    N.c(this.a).startActivity(paramWebView);
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\P.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */