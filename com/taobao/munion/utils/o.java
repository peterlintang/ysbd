package com.taobao.munion.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.taobao.munion.common.MunionConfigManager;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;
import java.util.Random;

public class o
{
  public static final String a = "imei";
  public static final String b = "imsi";
  public static final String c = "mac_address";
  private static DisplayMetrics d = null;
  private static int e = 0;
  private static double f = 0.0D;
  
  public static String a()
  {
    SharedPreferences localSharedPreferences = MunionConfigManager.getInstance().getContext().getSharedPreferences("imei", 0);
    Object localObject2 = localSharedPreferences.getString("imei", null);
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject2 = ((TelephonyManager)MunionConfigManager.getInstance().getContext().getSystemService("phone")).getDeviceId();
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 0) {}
      }
      else
      {
        localObject1 = q();
      }
      for (localObject1 = ((String)localObject1).replaceAll(" ", "").trim(); ((String)localObject1).length() < 15; localObject1 = "0" + (String)localObject1) {}
      localObject2 = localSharedPreferences.edit();
      ((SharedPreferences.Editor)localObject2).putString("imei", (String)localObject1);
      ((SharedPreferences.Editor)localObject2).commit();
    }
    return ((String)localObject1).trim();
  }
  
  public static String b()
  {
    SharedPreferences localSharedPreferences = MunionConfigManager.getInstance().getContext().getSharedPreferences("imei", 0);
    Object localObject2 = localSharedPreferences.getString("imsi", null);
    Object localObject1;
    if (localObject2 != null)
    {
      localObject1 = localObject2;
      if (((String)localObject2).length() != 0) {}
    }
    else
    {
      localObject2 = ((TelephonyManager)MunionConfigManager.getInstance().getContext().getSystemService("phone")).getSubscriberId();
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((String)localObject2).length() != 0) {}
      }
      else
      {
        localObject1 = q();
      }
      for (localObject1 = ((String)localObject1).replaceAll(" ", "").trim(); ((String)localObject1).length() < 15; localObject1 = "0" + (String)localObject1) {}
      localObject2 = localSharedPreferences.edit();
      ((SharedPreferences.Editor)localObject2).putString("imsi", (String)localObject1);
      ((SharedPreferences.Editor)localObject2).commit();
    }
    return (String)localObject1;
  }
  
  public static String c()
  {
    String str = ((WifiManager)MunionConfigManager.getInstance().getContext().getSystemService("wifi")).getConnectionInfo().getMacAddress();
    if ((str == null) || ("".equals(str))) {
      return MunionConfigManager.getInstance().getContext().getSharedPreferences("mac_address", 0).getString("mac_address", "");
    }
    SharedPreferences.Editor localEditor = MunionConfigManager.getInstance().getContext().getSharedPreferences("mac_address", 0).edit();
    localEditor.putString("mac_address", str);
    localEditor.commit();
    return str;
  }
  
  public static String d()
  {
    String str2 = ((TelephonyManager)MunionConfigManager.getInstance().getContext().getSystemService("phone")).getDeviceId();
    String str1 = str2;
    if (str2 != null) {
      str1 = str2.trim();
    }
    return str1;
  }
  
  public static String e()
  {
    String str2 = ((TelephonyManager)MunionConfigManager.getInstance().getContext().getSystemService("phone")).getSubscriberId();
    String str1 = str2;
    if (str2 != null) {
      str1 = str2.trim();
    }
    return str1;
  }
  
  public static String f()
  {
    try
    {
      Object localObject = Class.forName("android.os.SystemProperties");
      localObject = (String)((Class)localObject).getMethod("get", new Class[] { String.class, String.class }).invoke(localObject, new Object[] { "ro.serialno", "unknown" });
      return (String)localObject;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public static String g()
  {
    return Settings.Secure.getString(MunionConfigManager.getInstance().getContext().getContentResolver(), "android_id");
  }
  
  public static float h()
  {
    if (d == null)
    {
      Object localObject = (WindowManager)MunionConfigManager.getInstance().getContext().getSystemService("window");
      if (localObject != null)
      {
        localObject = ((WindowManager)localObject).getDefaultDisplay();
        d = new DisplayMetrics();
        ((Display)localObject).getMetrics(d);
      }
    }
    return d.density;
  }
  
  public static String i()
  {
    return Build.MODEL;
  }
  
  public static String j()
  {
    return "android " + Build.VERSION.RELEASE;
  }
  
  public static PackageInfo k()
  {
    try
    {
      PackageInfo localPackageInfo = MunionConfigManager.getInstance().getContext().getPackageManager().getPackageInfo(MunionConfigManager.getInstance().getContext().getPackageName(), 0);
      return localPackageInfo;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      localNameNotFoundException.printStackTrace();
    }
    return null;
  }
  
  public static int l()
  {
    WindowManager localWindowManager = (WindowManager)MunionConfigManager.getInstance().getContext().getSystemService("window");
    if (localWindowManager != null) {
      return localWindowManager.getDefaultDisplay().getWidth();
    }
    return 0;
  }
  
  public static int m()
  {
    WindowManager localWindowManager = (WindowManager)MunionConfigManager.getInstance().getContext().getSystemService("window");
    if (localWindowManager != null) {
      return localWindowManager.getDefaultDisplay().getHeight();
    }
    return 0;
  }
  
  public static int n()
  {
    if (e == 0)
    {
      if ((d == null) || (d.density == 0.0F)) {
        break label45;
      }
      e = (int)(d.widthPixels / d.density);
    }
    for (;;)
    {
      return e;
      label45:
      Object localObject = (WindowManager)MunionConfigManager.getInstance().getContext().getSystemService("window");
      if (localObject != null)
      {
        localObject = ((WindowManager)localObject).getDefaultDisplay();
        d = new DisplayMetrics();
        ((Display)localObject).getMetrics(d);
        if (d.density != 0.0F) {
          e = (int)(d.widthPixels / d.density);
        }
      }
    }
  }
  
  public static double o()
  {
    if (f == 0.0D)
    {
      if (d == null) {
        break label67;
      }
      f = Math.sqrt(Math.pow(d.widthPixels / d.xdpi, 2.0D) + Math.pow(d.heightPixels / d.ydpi, 2.0D));
    }
    for (;;)
    {
      return f;
      label67:
      Object localObject = (WindowManager)MunionConfigManager.getInstance().getContext().getSystemService("window");
      if (localObject != null)
      {
        localObject = ((WindowManager)localObject).getDefaultDisplay();
        d = new DisplayMetrics();
        ((Display)localObject).getMetrics(d);
        f = Math.sqrt(Math.pow(d.widthPixels / d.xdpi, 2.0D) + Math.pow(d.heightPixels / d.ydpi, 2.0D));
      }
    }
  }
  
  public static String p()
  {
    try
    {
      InetAddress localInetAddress;
      do
      {
        localObject = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration;
        while (!localEnumeration.hasMoreElements())
        {
          if (!((Enumeration)localObject).hasMoreElements()) {
            break;
          }
          localEnumeration = ((NetworkInterface)((Enumeration)localObject).nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration.nextElement();
      } while (localInetAddress.isLoopbackAddress());
      Object localObject = localInetAddress.getHostAddress().toString();
      return (String)localObject;
    }
    catch (SocketException localSocketException)
    {
      k.b(localSocketException.toString());
    }
    return null;
  }
  
  private static String q()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    long l = System.currentTimeMillis();
    Object localObject = Long.toString(l);
    localStringBuffer.append(((String)localObject).substring(((String)localObject).length() - 5));
    localObject = new StringBuffer();
    ((StringBuffer)localObject).append(Build.MODEL.replaceAll(" ", ""));
    while (((StringBuffer)localObject).length() < 6) {
      ((StringBuffer)localObject).append('0');
    }
    localStringBuffer.append(((StringBuffer)localObject).substring(0, 6));
    localObject = new Random(l);
    for (l = 0L; l < 4096L; l = ((Random)localObject).nextLong()) {}
    localStringBuffer.append(Long.toHexString(l).substring(0, 4));
    return localStringBuffer.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */