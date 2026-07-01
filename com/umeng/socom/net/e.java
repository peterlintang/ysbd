package com.umeng.socom.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.umeng.socom.Log;
import com.umeng.socom.a.a;
import java.util.Map;

class e
  implements DownloadingService.a
{
  e(DownloadingService paramDownloadingService) {}
  
  public void a(int paramInt)
  {
    int j = 0;
    if (DownloadingService.c().containsKey(Integer.valueOf(paramInt)))
    {
      DownloadingService.d locald = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(paramInt));
      Object localObject = locald.f;
      int i = j;
      if (localObject != null)
      {
        i = j;
        if (localObject[1] > 0L)
        {
          j = (int)((float)localObject[0] / (float)localObject[1] * 100.0F);
          i = j;
          if (j > 100) {
            i = 99;
          }
        }
      }
      localObject = DownloadingService.a(this.a, locald.e, paramInt, i);
      locald.b = ((Notification)localObject);
      DownloadingService.b(this.a).notify(paramInt, (Notification)localObject);
    }
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    if (DownloadingService.c().containsKey(Integer.valueOf(paramInt1)))
    {
      Object localObject = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(paramInt1));
      a.a locala = ((DownloadingService.d)localObject).e;
      localObject = ((DownloadingService.d)localObject).b;
      ((Notification)localObject).contentView.setProgressBar(a.c(DownloadingService.a(this.a)), 100, paramInt2, false);
      ((Notification)localObject).contentView.setTextViewText(a.b(DownloadingService.a(this.a)), String.valueOf(paramInt2) + "%");
      DownloadingService.b(this.a).notify(paramInt1, (Notification)localObject);
      Log.c(DownloadingService.a(), String.format("%3$10s Notification: mNotificationId = %1$15s\t|\tprogress = %2$15s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), locala.b }));
    }
  }
  
  public void a(int paramInt, Exception paramException)
  {
    if (DownloadingService.c().containsKey(Integer.valueOf(paramInt)))
    {
      Object localObject = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(paramInt));
      paramException = ((DownloadingService.d)localObject).e;
      localObject = ((DownloadingService.d)localObject).b;
      ((Notification)localObject).contentView.setTextViewText(a.d(DownloadingService.a(this.a)), paramException.b + " 下载失败，请检查网络。");
      DownloadingService.b(this.a).notify(paramInt, (Notification)localObject);
      DownloadingService.a(this.a, paramInt);
    }
  }
  
  public void a(int paramInt, String paramString)
  {
    a.a locala;
    if (DownloadingService.c().containsKey(Integer.valueOf(paramInt)))
    {
      Object localObject = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        locala = ((DownloadingService.d)localObject).e;
        ((DownloadingService.d)localObject).b.contentView.setTextViewText(a.b(DownloadingService.a(this.a)), String.valueOf(100) + "%");
        c.a(DownloadingService.a(this.a)).a(locala.a, locala.c, 100);
        localObject = new Bundle();
        ((Bundle)localObject).putString("filename", paramString);
        paramString = Message.obtain();
        paramString.what = 5;
        paramString.arg1 = 1;
        paramString.obj = locala;
        paramString.arg2 = paramInt;
        paramString.setData((Bundle)localObject);
        DownloadingService.c(this.a).sendMessage(paramString);
        paramString = Message.obtain();
        paramString.what = 5;
        paramString.arg1 = 1;
        paramString.setData((Bundle)localObject);
      }
    }
    try
    {
      if (DownloadingService.b().get(locala) != null) {
        ((Messenger)DownloadingService.b().get(locala)).send(paramString);
      }
      DownloadingService.a(this.a, paramInt);
      return;
    }
    catch (RemoteException paramString)
    {
      DownloadingService.a(this.a, paramInt);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */