package com.umeng.xp.view;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.DownloadListener;

class aM
  implements DownloadListener
{
  aM(aE paramaE) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    if ((!TextUtils.isEmpty(paramString1)) && (paramLong > 0L))
    {
      paramString1 = new Intent("android.intent.action.VIEW", Uri.parse(paramString1));
      aE.f(this.a).startActivity(paramString1);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aM.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */