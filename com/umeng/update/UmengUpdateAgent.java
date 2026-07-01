package com.umeng.update;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.Log;
import com.umeng.common.net.e;

public class UmengUpdateAgent
{
  public static final String a = "1.3.0.20120822";
  private static boolean b = true;
  private static boolean c = true;
  private static String d = "update";
  private static final String e = "update";
  private static UmengUpdateListener f = null;
  private static final String g = "umeng_last_update_time";
  private static final String h = "umeng_update_internal";
  private static final String[] i = { "http://au.umeng.com/api/check_app_update", "http://au.umeng.co/api/check_app_update" };
  private static UmengUpdateAgent j = null;
  private static UmengDownloadListener k;
  private static e l = new a();
  private static Handler m = new b();
  
  private static SharedPreferences a(Context paramContext)
  {
    StringBuffer localStringBuffer = new StringBuffer();
    localStringBuffer.append("umeng_analytic_online_setting_");
    localStringBuffer.append(com.umeng.common.b.u(paramContext));
    return paramContext.getSharedPreferences(localStringBuffer.toString(), 0);
  }
  
  private static void b(int paramInt, UpdateResponse paramUpdateResponse)
  {
    if (f != null)
    {
      Message localMessage = new Message();
      localMessage.what = paramInt;
      localMessage.obj = paramUpdateResponse;
      m.sendMessage(localMessage);
    }
  }
  
  public static void destroy()
  {
    j = null;
  }
  
  private static UmengUpdateAgent h()
  {
    if (j == null) {
      j = new UmengUpdateAgent();
    }
    return j;
  }
  
  public static void setOnDownloadListener(UmengDownloadListener paramUmengDownloadListener)
  {
    k = paramUmengDownloadListener;
  }
  
  public static void setUpdateAutoPopup(boolean paramBoolean)
  {
    c = paramBoolean;
  }
  
  public static void setUpdateListener(UmengUpdateListener paramUmengUpdateListener)
  {
    f = paramUmengUpdateListener;
  }
  
  public static void setUpdateOnlyWifi(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public static void showUpdateDialog(Context paramContext, UpdateResponse paramUpdateResponse)
  {
    Object localObject = "";
    try
    {
      if (!com.umeng.common.b.k(paramContext)) {
        localObject = paramContext.getString(com.umeng.common.c.a(paramContext).f("UMGprsCondition")) + "\n";
      }
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append((String)localObject);
      localStringBuffer.append(paramContext.getString(com.umeng.common.c.a(paramContext).f("UMNewVersion")));
      localStringBuffer.append(paramUpdateResponse.version);
      localStringBuffer.append("\n");
      localStringBuffer.append(paramUpdateResponse.updateLog);
      localObject = new AlertDialog.Builder(paramContext);
      ((AlertDialog.Builder)localObject).setTitle(paramContext.getString(com.umeng.common.c.a(paramContext).f("UMUpdateTitle"))).setMessage(localStringBuffer.toString()).setPositiveButton(paramContext.getString(com.umeng.common.c.a(paramContext).f("UMUpdateNow")), new d(paramContext, paramUpdateResponse)).setNegativeButton(paramContext.getString(com.umeng.common.c.a(paramContext).f("UMNotNow")), new c());
      ((AlertDialog.Builder)localObject).create().show();
      return;
    }
    catch (Exception paramContext)
    {
      Log.b(d, "Fail to create update dialog box.", paramContext);
    }
  }
  
  public static void update(Context paramContext)
  {
    try
    {
      if ((b) && (!com.umeng.common.b.k(paramContext)))
      {
        b(2, null);
        return;
      }
      if (paramContext == null)
      {
        b(1, null);
        Log.b(d, "unexpected null context in update");
        return;
      }
    }
    catch (Exception paramContext)
    {
      Log.b(d, "Exception occurred in Mobclick.update(). ", paramContext);
      return;
    }
    UmengUpdateAgent localUmengUpdateAgent = h();
    localUmengUpdateAgent.getClass();
    new Thread(new UmengUpdateAgent.a(localUmengUpdateAgent, paramContext)).start();
  }
  
  public static void update(Context paramContext, long paramLong)
  {
    if (paramContext == null) {
      Log.a(d, "unexpected null Context");
    }
    SharedPreferences localSharedPreferences;
    long l1;
    long l2;
    do
    {
      return;
      localSharedPreferences = a(paramContext);
      l1 = localSharedPreferences.getLong("umeng_last_update_time", 0L);
      paramLong = localSharedPreferences.getLong("umeng_update_internal", paramLong);
      l2 = System.currentTimeMillis();
    } while (l2 - l1 <= paramLong);
    update(paramContext);
    localSharedPreferences.edit().putLong("umeng_last_update_time", l2).commit();
  }
  
  public static void update(Context paramContext, String paramString)
  {
    com.umeng.common.a.m = paramString;
    update(paramContext);
  }
  
  void a(Context paramContext, String paramString)
  {
    Log.a("update", "url: " + paramString);
    new com.umeng.common.net.a(paramContext, "update", com.umeng.common.b.v(paramContext), paramString, l).a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\update\UmengUpdateAgent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */