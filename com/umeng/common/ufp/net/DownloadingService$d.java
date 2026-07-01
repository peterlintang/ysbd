package com.umeng.common.ufp.net;

import android.app.Notification;
import java.util.Map;

class DownloadingService$d
{
  DownloadingService.b a;
  Notification b;
  int c;
  int d;
  a.a e;
  long[] f = new long[3];
  
  public DownloadingService$d(a.a parama, int paramInt)
  {
    this.c = paramInt;
    this.e = parama;
  }
  
  public void a()
  {
    DownloadingService.c().put(Integer.valueOf(this.c), this);
  }
  
  public void b()
  {
    if (DownloadingService.c().containsKey(Integer.valueOf(this.c))) {
      DownloadingService.c().remove(Integer.valueOf(this.c));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\DownloadingService$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */