package com.umeng.common.ufp.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.b;
import com.umeng.common.ufp.util.DeltaUpdate;
import com.umeng.common.ufp.util.g;
import java.io.File;
import java.util.Map;

class DownloadingService$e
  extends AsyncTask<String, Void, Integer>
{
  public int a;
  public String b;
  private a.a d;
  
  public DownloadingService$e(DownloadingService paramDownloadingService, int paramInt, a.a parama, String paramString)
  {
    this.a = paramInt;
    this.d = parama;
    this.b = paramString;
  }
  
  protected Integer a(String... paramVarArgs)
  {
    int i = DeltaUpdate.a(paramVarArgs[0], paramVarArgs[1], paramVarArgs[2]) + 1;
    new File(paramVarArgs[2]).delete();
    if (i == 1)
    {
      if (!g.a(new File(paramVarArgs[1])).equalsIgnoreCase(this.d.e))
      {
        Log.a(DownloadingService.a(), "file patch error");
        return Integer.valueOf(0);
      }
      Log.a(DownloadingService.a(), "file patch success");
    }
    for (;;)
    {
      return Integer.valueOf(i);
      Log.a(DownloadingService.a(), "file patch error");
    }
  }
  
  protected void a(Integer paramInteger)
  {
    if (paramInteger.intValue() == 1)
    {
      paramInteger = new Notification(17301634, "更新完成，请点击安装", System.currentTimeMillis());
      localObject = new Intent("android.intent.action.VIEW");
      ((Intent)localObject).addFlags(268435456);
      ((Intent)localObject).setDataAndType(Uri.fromFile(new File(this.b)), "application/vnd.android.package-archive");
      PendingIntent localPendingIntent = PendingIntent.getActivity(DownloadingService.a(this.c), 0, (Intent)localObject, 134217728);
      paramInteger.setLatestEventInfo(DownloadingService.a(this.c), b.I(DownloadingService.a(this.c)), "更新完成，请点击安装", localPendingIntent);
      paramInteger.flags = 16;
      DownloadingService.b(this.c).notify(this.a + 1, paramInteger);
      if (DownloadingService.a(DownloadingService.a(this.c)))
      {
        DownloadingService.b(this.c).cancel(this.a + 1);
        DownloadingService.a(this.c).startActivity((Intent)localObject);
      }
      paramInteger = new Bundle();
      paramInteger.putString("filename", this.b);
      localObject = Message.obtain();
      ((Message)localObject).what = 5;
      ((Message)localObject).arg1 = 1;
      ((Message)localObject).arg2 = this.a;
      ((Message)localObject).setData(paramInteger);
      try
      {
        if (DownloadingService.b().get(this.d) != null) {
          ((Messenger)DownloadingService.b().get(this.d)).send((Message)localObject);
        }
        DownloadingService.a(this.c, this.a);
        return;
      }
      catch (RemoteException paramInteger)
      {
        DownloadingService.a(this.c, this.a);
        return;
      }
    }
    DownloadingService.b(this.c).cancel(this.a + 1);
    paramInteger = new Bundle();
    paramInteger.putString("filename", this.b);
    Object localObject = Message.obtain();
    ((Message)localObject).what = 5;
    ((Message)localObject).arg1 = 3;
    ((Message)localObject).arg2 = this.a;
    ((Message)localObject).setData(paramInteger);
    try
    {
      if (DownloadingService.b().get(this.d) != null) {
        ((Messenger)DownloadingService.b().get(this.d)).send((Message)localObject);
      }
      DownloadingService.a(this.c, this.a);
      return;
    }
    catch (RemoteException paramInteger)
    {
      DownloadingService.a(this.c, this.a);
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\DownloadingService$e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */