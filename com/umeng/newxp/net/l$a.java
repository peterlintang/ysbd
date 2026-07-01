package com.umeng.newxp.net;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.b;
import com.umeng.common.ufp.net.c;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.e;
import com.umeng.newxp.common.ExchangeConstants;

public class l$a
  implements c
{
  private String b;
  private b c;
  
  public l$a(l paraml)
  {
    this.b = l.a(paraml).url;
    this.c = b.a(l.b(paraml));
  }
  
  public void a()
  {
    Log.c(l.b(), "XpDownloadListener.onStart");
    if (ExchangeConstants.TIPS_DOWNLOAD) {
      Toast.makeText(l.b(this.a), l.b(this.a).getResources().getString(e.l(l.b(this.a))) + l.a(this.a).title, 0).show();
    }
    if (l.c(this.a) != null) {
      new XpReportClient(l.b(this.a)).sendAsync(l.c(this.a), null);
    }
    this.c.a("xp", this.b);
  }
  
  public void a(int paramInt)
  {
    Log.c(l.b(), "XpDownloadListener.onProgressUpdate");
  }
  
  public void a(int paramInt1, int paramInt2, String paramString)
  {
    Log.c(l.b(), "XpDownloadListener.onEndresult = " + paramInt1 + " file = " + paramString);
    if (paramInt1 == 1) {
      this.c.e("xp", this.b);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\l$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */