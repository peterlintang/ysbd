package com.umeng.newxp.common;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.widget.ImageView;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.b;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.b.a;
import com.umeng.newxp.controller.ExchangeDataService;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c
  extends b
{
  private static Map<String, String> d;
  private static boolean e = false;
  
  public static String K(Context paramContext)
  {
    if (!TextUtils.isEmpty(ExchangeConstants.CHANNEL)) {
      return ExchangeConstants.CHANNEL;
    }
    try
    {
      paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
      if ((paramContext == null) || (paramContext.metaData == null)) {
        break label73;
      }
      paramContext = paramContext.metaData.get("UMENG_CHANNEL");
      if (paramContext == null) {
        break label73;
      }
      paramContext = paramContext.toString();
      if (paramContext == null) {
        break label73;
      }
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext.printStackTrace();
        paramContext = "";
      }
    }
    ExchangeConstants.CHANNEL = paramContext;
    return paramContext;
  }
  
  public static void L(Context paramContext)
  {
    if (e) {}
    CookieManager localCookieManager;
    do
    {
      return;
      e = true;
      CookieSyncManager.createInstance(paramContext);
      localCookieManager = CookieManager.getInstance();
    } while (localCookieManager == null);
    localCookieManager.setAcceptCookie(true);
    try
    {
      String str = a.a(paramContext).a();
      long l = System.currentTimeMillis();
      StringBuilder localStringBuilder = new StringBuilder("utsid=");
      localStringBuilder.append(str);
      localStringBuilder.append("_");
      localStringBuilder.append("21570058");
      localStringBuilder.append("_");
      localStringBuilder.append(l);
      localCookieManager.setCookie("taobao.com", localStringBuilder.toString() + ";domain=taobao.com;path=/");
      localCookieManager.setCookie("etao.com", localStringBuilder.toString() + ";domain=etao.com;path=/");
      localCookieManager.setCookie("tmall.com", localStringBuilder.toString() + ";domain=tmall.com;path=/");
      localCookieManager.setCookie("mmstat.com", localStringBuilder.toString() + ";domain=mmstat.com;path=/");
      str = b.o(paramContext);
      paramContext = b.H(paramContext);
      localStringBuilder = new StringBuilder("utkey=umengappkey=");
      localStringBuilder.append(paramContext);
      localStringBuilder.append("-");
      localStringBuilder.append(str);
      localCookieManager.setCookie("taobao.com", localStringBuilder.toString() + ";domain=taobao.com;path=/");
      localCookieManager.setCookie("etao.com", localStringBuilder.toString() + ";domain=etao.com;path=/");
      localCookieManager.setCookie("tmall.com", localStringBuilder.toString() + ";domain=tmall.com;path=/");
      localCookieManager.setCookie("mmstat.com", localStringBuilder.toString() + ";domain=mmstat.com;path=/");
      CookieSyncManager.getInstance().sync();
      return;
    }
    catch (Exception paramContext) {}
  }
  
  public static int a(Context paramContext, String paramString1, String paramString2)
  {
    Resources localResources = paramContext.getResources();
    paramContext = paramContext.getPackageName();
    int i = localResources.getIdentifier(paramString2, paramString1, paramContext);
    if (i <= 0) {
      throw new RuntimeException("获取资源ID失败:(packageName=" + paramContext + " type=" + paramString1 + " name=" + paramString2);
    }
    return i;
  }
  
  public static String a(Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    Object localObject = null;
    if ((paramExchangeDataService != null) && (!TextUtils.isEmpty(paramExchangeDataService.appkey))) {
      paramContext = paramExchangeDataService.appkey;
    }
    for (;;)
    {
      return paramContext;
      if (!TextUtils.isEmpty(ExchangeConstants.APPKEY)) {
        return ExchangeConstants.APPKEY;
      }
      try
      {
        paramExchangeDataService = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        paramContext = (Context)localObject;
        if (paramExchangeDataService != null)
        {
          paramContext = paramExchangeDataService.metaData.get("UMENG_APPKEY");
          if (paramContext != null) {
            return paramContext.toString();
          }
          Log.a(ExchangeConstants.LOG_TAG, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
          return null;
        }
      }
      catch (Exception paramContext)
      {
        Log.a(ExchangeConstants.LOG_TAG, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.", paramContext);
      }
    }
    return null;
  }
  
  public static <T> List<T> a(List<T> paramList)
  {
    if (paramList == null) {
      return null;
    }
    ArrayList localArrayList = new ArrayList();
    localArrayList.addAll(paramList);
    return localArrayList;
  }
  
  public static <T extends Promoter> List<T> a(List<T> paramList1, List<T> paramList2)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = paramList2.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Promoter)((Iterator)localObject1).next();
      if (!a(((Promoter)localObject2).app_package_name, paramList1)) {
        localArrayList.add(localObject2);
      }
    }
    if (ExchangeConstants.DEBUG_MODE)
    {
      paramList1 = new StringBuilder();
      localObject1 = new StringBuilder();
      localObject2 = localArrayList.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        paramList1.append(((Promoter)((Iterator)localObject2).next()).title);
        paramList1.append(", ");
      }
      paramList2 = paramList2.iterator();
      while (paramList2.hasNext())
      {
        ((StringBuilder)localObject1).append(((Promoter)paramList2.next()).title);
        ((StringBuilder)localObject1).append(", ");
      }
      Log.c(ExchangeConstants.LOG_TAG, "Showing next page data, before filtered: " + ((StringBuilder)localObject1).toString());
      Log.c(ExchangeConstants.LOG_TAG, "Showing next page data, after filtered: " + paramList1.toString());
    }
    return localArrayList;
  }
  
  public static void a(ImageView paramImageView, Context paramContext, ExchangeDataService paramExchangeDataService, c.a parama)
  {
    paramExchangeDataService.requestDataAsyn(paramContext, new c.1(parama, paramExchangeDataService, paramContext, paramImageView), true);
  }
  
  public static boolean a(Activity paramActivity)
  {
    try
    {
      ComponentName localComponentName = ((ActivityManager.RunningTaskInfo)((ActivityManager)paramActivity.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity;
      paramActivity = paramActivity.getClass().getName();
      Log.c(ExchangeConstants.LOG_TAG, localComponentName.getClassName() + "    " + paramActivity);
      boolean bool = paramActivity.equalsIgnoreCase(localComponentName.getClassName());
      return bool;
    }
    catch (Exception paramActivity) {}
    return false;
  }
  
  private static boolean a(String paramString, List<? extends Promoter> paramList)
  {
    if ((paramString == null) || (paramList == null) || (paramList.size() <= 0)) {
      return false;
    }
    paramList = paramList.iterator();
    while (paramList.hasNext())
    {
      Promoter localPromoter = (Promoter)paramList.next();
      if ((!TextUtils.isEmpty(localPromoter.app_package_name)) && (paramString.equalsIgnoreCase(localPromoter.app_package_name))) {
        return true;
      }
    }
    return false;
  }
  
  public static boolean a(String paramString, boolean paramBoolean, String[] paramArrayOfString)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramArrayOfString == null) || (paramArrayOfString.length <= 0) || (paramString == null))
    {
      bool1 = false;
      return bool1;
    }
    int j = paramArrayOfString.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        break label80;
      }
      String str = paramArrayOfString[i];
      if (paramBoolean)
      {
        bool1 = bool2;
        if (str.equalsIgnoreCase(paramString)) {
          break;
        }
      }
      if (!paramBoolean)
      {
        bool1 = bool2;
        if (str.equals(paramString)) {
          break;
        }
      }
      i += 1;
    }
    label80:
    return false;
  }
  
  public static String c(String paramString)
  {
    String str = paramString;
    if (paramString.contains("/")) {
      str = paramString.replace("/", "^$^");
    }
    return str;
  }
  
  public static String d(String paramString)
  {
    String str = paramString;
    if (paramString.contains("^$^")) {
      str = paramString.replace("^$^", "/");
    }
    return str;
  }
  
  public static Map<String, String> i()
  {
    if ((d == null) || (d.size() <= 0))
    {
      HashMap localHashMap = new HashMap();
      d = localHashMap;
      localHashMap.put("Accept-Encoding", "gzip");
    }
    return d;
  }
  
  public static int j()
  {
    try
    {
      int i = Integer.valueOf(Build.VERSION.SDK).intValue();
      return i;
    }
    catch (NumberFormatException localNumberFormatException)
    {
      Log.b(ExchangeConstants.LOG_TAG, localNumberFormatException.toString());
    }
    return 0;
  }
  
  public static boolean k()
  {
    try
    {
      boolean bool = ((Boolean)Class.forName("com.umeng.xp.view.handler.ListDialog").getDeclaredMethod("showInWindow", new Class[0]).invoke(null, new Object[0])).booleanValue();
      return bool;
    }
    catch (Exception localException) {}
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */