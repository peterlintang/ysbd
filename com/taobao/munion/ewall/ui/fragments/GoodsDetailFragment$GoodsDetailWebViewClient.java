package com.taobao.munion.ewall.ui.fragments;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.taobao.munion.webview.a;

class GoodsDetailFragment$GoodsDetailWebViewClient
  extends a
{
  GoodsDetailFragment$GoodsDetailWebViewClient(GoodsDetailFragment paramGoodsDetailFragment) {}
  
  public void onPageFinished(WebView paramWebView, String paramString)
  {
    if (this.this$0.isAdded()) {
      GoodsDetailFragment.access$300(this.this$0, paramString);
    }
    super.onPageFinished(paramWebView, paramString);
  }
  
  public void onPageStarted(WebView paramWebView, String paramString, Bitmap paramBitmap)
  {
    super.onPageStarted(paramWebView, paramString, paramBitmap);
  }
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    if (this.this$0.isAdded())
    {
      this.this$0.stopFailedStatus();
      this.this$0.showErrorView();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\GoodsDetailFragment$GoodsDetailWebViewClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */