package com.umeng.common.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.Log;
import java.io.File;

class d
  extends Handler
{
  d(DownloadingService.a parama) {}
  
  public void handleMessage(Message paramMessage)
  {
    try
    {
      paramMessage = paramMessage.getData().getString("filename");
      DownloadingService.a(this.a.a).cancel(DownloadingService.a.a(this.a));
      Log.c(DownloadingService.a(), "Cancel old notification....");
      Notification localNotification = new Notification(17301634, "下载完成，请点击安装", System.currentTimeMillis());
      Intent localIntent = new Intent("android.intent.action.VIEW");
      localIntent.addFlags(268435456);
      localIntent.setDataAndType(Uri.fromFile(new File(paramMessage)), "application/vnd.android.package-archive");
      PendingIntent localPendingIntent = PendingIntent.getActivity(DownloadingService.a.b(this.a), 0, localIntent, 134217728);
      localNotification.setLatestEventInfo(DownloadingService.a.b(this.a), DownloadingService.a.c(this.a).b, "下载完成，请点击安装", localPendingIntent);
      localNotification.flags = 16;
      DownloadingService.a(this.a.a, (NotificationManager)this.a.a.getSystemService("notification"));
      DownloadingService.a(this.a.a).notify(DownloadingService.a.a(this.a), localNotification);
      Log.c(DownloadingService.a(), "Show new  notification....");
      boolean bool = DownloadingService.a(DownloadingService.a.b(this.a));
      Log.c(DownloadingService.a(), String.format("isAppOnForeground = %1$B", new Object[] { Boolean.valueOf(bool) }));
      if (bool)
      {
        DownloadingService.a(this.a.a).cancel(DownloadingService.a.a(this.a));
        DownloadingService.a.b(this.a).startActivity(localIntent);
      }
      Log.a(DownloadingService.a(), String.format("%1$10s downloaded. Saved to: %2$s", new Object[] { DownloadingService.a.c(this.a).b, paramMessage }));
      return;
    }
    catch (Exception paramMessage)
    {
      Log.b(DownloadingService.a(), "can not install. " + paramMessage.getMessage());
      DownloadingService.a(this.a.a).cancel(DownloadingService.a.a(this.a));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */