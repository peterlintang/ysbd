package com.umeng.newxp.view.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.DownloadListener;

class g$5
  implements DownloadListener
{
  g$5(g paramg) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
    this.a.a.startActivity(paramString1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\g$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */