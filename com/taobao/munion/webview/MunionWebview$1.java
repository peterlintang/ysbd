package com.taobao.munion.webview;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

class MunionWebview$1
  implements DownloadListener
{
  MunionWebview$1(MunionWebview paramMunionWebview) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
    this.a.a.startActivity(paramString1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\webview\MunionWebview$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */