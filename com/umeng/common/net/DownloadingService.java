package com.umeng.common.net;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Messenger;
import com.umeng.common.Log;
import com.umeng.common.b.g;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.StatusLine;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;

public class DownloadingService
  extends Service
{
  static final int a = 3;
  static final int b = 4;
  static final int c = 5;
  static final int d = 0;
  static final int e = 1;
  static final int f = 100;
  static final String g = "filename";
  private static final String i = DownloadingService.class.getName();
  private static Map<a.a, Messenger> l = new HashMap();
  final Messenger h = new Messenger(new DownloadingService.b(this));
  private NotificationManager j;
  private String[] k;
  
  private void b(a.a parama)
  {
    Log.c(i, "startDownload([mComponentName:" + parama.a + " mTitle:" + parama.b + " mUrl:" + parama.c + "])");
    new DownloadingService.a(this, getApplicationContext(), parama).start();
  }
  
  private static final void b(String[] paramArrayOfString)
  {
    n = new Random().nextInt(1000);
    if (paramArrayOfString == null)
    {
      paramArrayOfString = i;
      new StringBuilder().append(n).append("service report: urls is null").toString();
    }
    label273:
    for (;;)
    {
      return;
      int i1 = paramArrayOfString.length;
      int m = 0;
      for (;;)
      {
        if (m >= i1) {
          break label273;
        }
        str1 = paramArrayOfString[m];
        Object localObject2 = g.a();
        Object localObject1 = localObject2.split(" ")[0];
        localObject2 = localObject2.split(" ")[1];
        str1 = str1 + "&data=" + (String)localObject1 + "&time=" + (String)localObject2;
        try
        {
          localObject1 = i;
          new StringBuilder().append(n).append(": service report:\tget: ").append(str1).toString();
          localObject1 = new HttpGet(str1);
          localObject2 = new BasicHttpParams();
          HttpConnectionParams.setConnectionTimeout((HttpParams)localObject2, 10000);
          HttpConnectionParams.setSoTimeout((HttpParams)localObject2, 20000);
          localObject1 = new DefaultHttpClient((HttpParams)localObject2).execute((HttpUriRequest)localObject1);
          localObject2 = i;
          new StringBuilder().append(n).append(": service report:status code:  ").append(((HttpResponse)localObject1).getStatusLine().getStatusCode()).toString();
          int i2 = ((HttpResponse)localObject1).getStatusLine().getStatusCode();
          if (i2 == 200) {
            break;
          }
        }
        catch (ClientProtocolException localClientProtocolException)
        {
          for (;;)
          {
            String str2 = i;
            new StringBuilder().append(n).append(": service report:\tClientProtocolException,Failed to send message.").append(str1).toString();
          }
        }
        catch (IOException localIOException)
        {
          for (;;)
          {
            String str3 = i;
            new StringBuilder().append(n).append(": service report:\tIOException,Failed to send message.").append(str1).toString();
          }
        }
        m += 1;
      }
    }
  }
  
  private static boolean b(Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (localObject == null) {
      return false;
    }
    paramContext = paramContext.getPackageName();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if ((localRunningAppProcessInfo.importance == 100) && (localRunningAppProcessInfo.processName.equals(paramContext))) {
        return true;
      }
    }
    return false;
  }
  
  private static boolean c(a.a parama)
  {
    if (l == null) {
      return false;
    }
    Iterator localIterator = l.keySet().iterator();
    while (localIterator.hasNext()) {
      if (((a.a)localIterator.next()).c.equals(parama.c)) {
        return true;
      }
    }
    return false;
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    Log.c(i, "onBind ");
    paramIntent = paramIntent.getExtras();
    if (paramIntent != null) {
      this.k = paramIntent.getStringArray("reporturls");
    }
    return this.h.getBinder();
  }
  
  public void onCreate()
  {
    super.onCreate();
    Log.c(i, "onCreate ");
    this.j = ((NotificationManager)getSystemService("notification"));
  }
  
  public void onDestroy()
  {
    try
    {
      c.a(getApplicationContext()).a(259200);
      c.a(getApplicationContext()).finalize();
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.b(i, localException.getMessage());
      }
    }
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    Log.c(i, "onStart ");
    super.onStart(paramIntent, paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\DownloadingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */