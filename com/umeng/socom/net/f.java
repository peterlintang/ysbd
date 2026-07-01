package com.umeng.socom.net;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

class f
  extends BroadcastReceiver
{
  f(DownloadingService paramDownloadingService) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    DownloadingService.a(this.a, paramContext, paramIntent);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */