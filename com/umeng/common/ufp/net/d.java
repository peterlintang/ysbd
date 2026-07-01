package com.umeng.common.ufp.net;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;

public class d
{
  public static final String a = "pause";
  public static final String b = "continue";
  public static final String c = "cancel";
  public static final String d = "com.umeng.intent.DOWNLOAD";
  public static final String e = "com.umeng.broadcast.download.msg";
  
  public static int a(a.a parama)
  {
    int j = (int)System.currentTimeMillis();
    int i = j;
    if (j < 0) {
      i = -j;
    }
    return i;
  }
  
  public static PendingIntent a(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent("com.umeng.intent.DOWNLOAD");
    localIntent.addFlags(1073741824);
    localIntent.putExtra("com.umeng.broadcast.download.msg", paramString);
    return PendingIntent.getBroadcast(paramContext, paramString.hashCode(), localIntent, 134217728);
  }
  
  public static String a(int paramInt, String paramString)
  {
    if (paramInt == 0) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder(paramInt);
    localStringBuilder.append(":");
    localStringBuilder.append(paramString);
    return localStringBuilder.toString();
  }
  
  public static PendingIntent b(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent(paramContext, DownloadingService.class);
    localIntent.putExtra("com.umeng.broadcast.download.msg", paramString);
    return PendingIntent.getService(paramContext, paramString.hashCode(), localIntent, 134217728);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */