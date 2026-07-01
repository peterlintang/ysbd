package com.umeng.common.ufp.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.b;
import com.umeng.common.ufp.util.DeltaUpdate;
import java.io.File;

class DownloadingService$1
  extends Handler
{
  DownloadingService$1(DownloadingService paramDownloadingService) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 5: 
      locala = (a.a)paramMessage.obj;
      i = paramMessage.arg2;
      try
      {
        paramMessage = paramMessage.getData().getString("filename");
        Log.c(DownloadingService.a(), "Cancel old notification....");
        localObject1 = new Notification(17301634, "下载完成，请点击安装", System.currentTimeMillis());
        localObject2 = new Intent("android.intent.action.VIEW");
        ((Intent)localObject2).addFlags(268435456);
        ((Intent)localObject2).setDataAndType(Uri.fromFile(new File(paramMessage)), "application/vnd.android.package-archive");
        PendingIntent localPendingIntent = PendingIntent.getActivity(DownloadingService.a(this.a), 0, (Intent)localObject2, 134217728);
        ((Notification)localObject1).setLatestEventInfo(DownloadingService.a(this.a), locala.b, "下载完成，请点击安装", localPendingIntent);
        ((Notification)localObject1).flags = 16;
        DownloadingService.a(this.a, (NotificationManager)this.a.getSystemService("notification"));
        DownloadingService.b(this.a).notify(i + 1, (Notification)localObject1);
        Log.c(DownloadingService.a(), "Show new  notification....");
        boolean bool = DownloadingService.a(DownloadingService.a(this.a));
        Log.c(DownloadingService.a(), String.format("isAppOnForeground = %1$B", new Object[] { Boolean.valueOf(bool) }));
        if (bool)
        {
          DownloadingService.b(this.a).cancel(i + 1);
          DownloadingService.a(this.a).startActivity((Intent)localObject2);
        }
        Log.a(DownloadingService.a(), String.format("%1$10s downloaded. Saved to: %2$s", new Object[] { locala.b, paramMessage }));
        return;
      }
      catch (Exception paramMessage)
      {
        Log.b(DownloadingService.a(), "can not install. " + paramMessage.getMessage());
        DownloadingService.b(this.a).cancel(i + 1);
        return;
      }
    }
    a.a locala = (a.a)paramMessage.obj;
    int i = paramMessage.arg2;
    paramMessage = paramMessage.getData().getString("filename");
    DownloadingService.b(this.a).cancel(i);
    Object localObject1 = new Notification(17301633, "正在更新安装包", System.currentTimeMillis());
    Object localObject2 = PendingIntent.getActivity(DownloadingService.a(this.a), 0, new Intent(), 134217728);
    ((Notification)localObject1).setLatestEventInfo(DownloadingService.a(this.a), b.I(DownloadingService.a(this.a)), "正在更新安装包", (PendingIntent)localObject2);
    DownloadingService.b(this.a).notify(i + 1, (Notification)localObject1);
    localObject1 = paramMessage.replace(".patch", ".apk");
    localObject2 = DeltaUpdate.a(this.a);
    new DownloadingService.e(this.a, i, locala, (String)localObject1).execute(new String[] { localObject2, localObject1, paramMessage });
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\DownloadingService$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */