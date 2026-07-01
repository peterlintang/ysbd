package com.ireadercity.b2.opds;

import android.os.Handler;
import android.os.Message;

final class f
  implements Runnable
{
  Handler a;
  String b;
  
  public f(OnlineBookStore paramOnlineBookStore, Handler paramHandler, String paramString)
  {
    this.a = paramHandler;
    this.b = paramString;
  }
  
  public final void run()
  {
    if ("".equals(this.b))
    {
      this.c.s = false;
      this.c.t = true;
      OnlineBookStore.a(this.c, this.b);
    }
    for (;;)
    {
      this.a.sendEmptyMessage(0);
      return;
      if (this.b.startsWith("http://shucang.org"))
      {
        Message localMessage = new Message();
        localMessage.obj = this.b;
        localMessage.what = 1;
        this.a.sendMessage(localMessage);
      }
      else if (this.b != null)
      {
        this.c.s = true;
        this.c.t = false;
        OnlineBookStore.b(this.c, this.b);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */