package com.umeng.newxp.view.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;

class g$4
  extends WebViewClient
{
  g$4(g paramg) {}
  
  public void onReceivedError(WebView paramWebView, int paramInt, String paramString1, String paramString2)
  {
    try
    {
      paramWebView = Uri.parse(paramString2);
      paramString1 = paramWebView.getScheme();
      if ((!paramString1.equals("http")) && (!paramString1.equals("https")))
      {
        paramString1 = new Intent();
        paramString1.setData(paramWebView);
        this.a.getContext().startActivity(paramString1);
      }
      return;
    }
    catch (Exception paramWebView)
    {
      paramWebView.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\g$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */