package com.umeng.socom.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.socom.Log;
import java.io.File;

class d
  extends Handler
{
  d(DownloadingService paramDownloadingService) {}
  
  public void handleMessage(Message paramMessage)
  {
    a.a locala = (a.a)paramMessage.obj;
    int i = paramMessage.arg2;
    try
    {
      paramMessage = paramMessage.getData().getString("filename");
      Log.c(DownloadingService.a(), "Cancel old notification....");
      Notification localNotification = new Notification(17301634, "下载完成，请点击安装", System.currentTimeMillis());
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setDataAndType(Uri.fromFile(new File(paramMessage)), "application/vnd.android.package-archive");
      PendingIntent localPendingIntent = PendingIntent.getActivity(DownloadingService.a(this.a), 0, localIntent, 134217728);
      localNotification.setLatestEventInfo(DownloadingService.a(this.a), locala.b, "下载完成，请点击安装", localPendingIntent);
      localNotification.flags = 16;
      DownloadingService.a(this.a, (NotificationManager)this.a.getSystemService("notification"));
      DownloadingService.b(this.a).notify(i + 1, localNotification);
      Log.c(DownloadingService.a(), "Show new  notification....");
      boolean bool = DownloadingService.a(DownloadingService.a(this.a));
      Log.c(DownloadingService.a(), String.format("isAppOnForeground = %1$B", new Object[] { Boolean.valueOf(bool) }));
      if (bool)
      {
        DownloadingService.b(this.a).cancel(i + 1);
        DownloadingService.a(this.a).startActivity(localIntent);
      }
      Log.a(DownloadingService.a(), String.format("%1$10s downloaded. Saved to: %2$s", new Object[] { locala.b, paramMessage }));
      return;
    }
    catch (Exception paramMessage)
    {
      Log.b(DownloadingService.a(), "can not install. " + paramMessage.getMessage());
      DownloadingService.b(this.a).cancel(i + 1);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */