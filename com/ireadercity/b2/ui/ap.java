package com.ireadercity.b2.ui;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.ireadercity.b2.a;

final class ap
  extends WebViewClient
{
  ap(AboutUsActivity paramAboutUsActivity) {}
  
  public final void onLoadResource(WebView paramWebView, String paramString)
  {
    super.onLoadResource(paramWebView, paramString);
    new StringBuilder("onLoadResource").append(paramString).toString();
    if ((!paramString.startsWith("http://" + a.y)) && (!paramString.contains("hiapk")) && (!paramString.endsWith(".js"))) {}
    try
    {
      paramWebView = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      this.a.startActivity(paramWebView);
      return;
    }
    catch (ActivityNotFoundException paramWebView)
    {
      paramWebView.printStackTrace();
      return;
    }
    catch (Exception paramWebView)
    {
      paramWebView.printStackTrace();
    }
  }
  
  public final void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    new StringBuilder("onpageStarted").append(paramString).toString();
    if (!paramString.startsWith("http://" + a.y))
    {
      AboutUsActivity.b(this.a).stopLoading();
      Intent localIntent = new Intent("android.intent.action.VIEW", Uri.parse(paramString));
      this.a.startActivity(localIntent);
    }
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public final void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    Toast.makeText(this.a, "加载失败！", 1).show();
    AboutUsActivity.a(this.a).setVisibility(8);
  }
  
  public final boolean shouldOverrideUrlLoading(WebView paramWebView, String paramString)
  {
    new StringBuilder("shouldOverrideUrlLoading").append(paramString).toString();
    return super.shouldOverrideUrlLoading(paramWebView, paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */