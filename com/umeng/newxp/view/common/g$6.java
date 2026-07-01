package com.umeng.newxp.view.common;

import android.text.TextUtils;
import android.webkit.DownloadListener;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.a;

class g$6
  implements DownloadListener
{
  g$6(g paramg) {}
  
  public void onDownloadStart(String paramString1, String paramString2, String paramString3, String paramString4, long paramLong)
  {
    if (!TextUtils.isEmpty(paramString1))
    {
      Log.a(g.c(), "start downlaod url " + paramString1);
      new a(this.a.a, "xp", "", paramString1, null).a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\g$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */