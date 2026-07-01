package com.umeng.newxp.common.c;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningServiceInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

public class j
{
  public static String a()
  {
    Object localObject2 = null;
    String str2 = null;
    Object localObject1 = localObject2;
    for (;;)
    {
      try
      {
        localFileReader = new FileReader("/proc/cpuinfo");
        str1 = str2;
        localObject1 = localObject2;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        FileReader localFileReader;
        String str1;
        BufferedReader localBufferedReader;
        localFileNotFoundException.toString();
        continue;
      }
      try
      {
        localBufferedReader = new BufferedReader(localFileReader, 1024);
        str1 = str2;
        localObject1 = localObject2;
        str2 = localBufferedReader.readLine();
        str1 = str2;
        localObject1 = str2;
        localBufferedReader.close();
        str1 = str2;
        localObject1 = str2;
        localFileReader.close();
        localObject1 = str2;
      }
      catch (IOException localIOException)
      {
        localObject1 = str1;
        localIOException.toString();
        localObject1 = str1;
      }
    }
    if (localObject1 != null) {
      return ((String)localObject1).substring(((String)localObject1).indexOf(':') + 1).trim();
    }
    return "";
  }
  
  public static boolean a(Context paramContext)
  {
    paramContext = (TelephonyManager)paramContext.getSystemService("phone");
    if (paramContext != null)
    {
      paramContext = paramContext.getDeviceId();
      if ((paramContext == null) || (paramContext.equals("000000000000000"))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    if (paramContext != null)
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      if (paramContext != null)
      {
        paramContext = paramContext.getRunningServices(30).iterator();
        while (paramContext.hasNext()) {
          if (((ActivityManager.RunningServiceInfo)paramContext.next()).service.getClassName().contains(paramString)) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public static int b()
  {
    try
    {
      i = Build.VERSION.class.getField("SDK_INT").getInt(null);
      return i;
    }
    catch (Exception localException1)
    {
      try
      {
        int i = Integer.parseInt((String)Build.VERSION.class.getField("SDK").get(null));
        return i;
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
      }
    }
    return 2;
  }
  
  public static int b(Context paramContext)
  {
    if (paramContext != null)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      return localDisplayMetrics.widthPixels;
    }
    return 0;
  }
  
  public static int c(Context paramContext)
  {
    if (paramContext != null)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      return localDisplayMetrics.heightPixels;
    }
    return 0;
  }
  
  public static boolean d(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      if (paramContext != null)
      {
        paramContext = h.b(paramContext, "isScreenOn");
        if (((paramContext instanceof Boolean)) && (!((Boolean)paramContext).booleanValue())) {
          return true;
        }
      }
    }
    return false;
  }
  
  public static boolean e(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = (PowerManager)paramContext.getSystemService("power");
      if (paramContext != null)
      {
        paramContext = h.b(paramContext, "isScreenOn");
        if (((paramContext instanceof Boolean)) && (((Boolean)paramContext).booleanValue())) {
          return true;
        }
      }
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */