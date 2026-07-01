package com.umeng.xp.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.ImageView;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.xp.Promoter;
import com.umeng.xp.controller.ExchangeDataService;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class g
{
  private static Map<String, String> a;
  
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
  
  public static String a(Context paramContext)
  {
    if (!TextUtils.isEmpty(ExchangeConstants.APPKEY)) {
      paramContext = ExchangeConstants.APPKEY;
    }
    for (;;)
    {
      return paramContext;
      Object localObject = null;
      try
      {
        ApplicationInfo localApplicationInfo = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        paramContext = (Context)localObject;
        if (localApplicationInfo != null)
        {
          paramContext = localApplicationInfo.metaData.get("UMENG_APPKEY");
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
  
  public static String a(Context paramContext, String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder("http://ex.mobmore.com/api/wap?sdk_version=" + b.d(paramContext));
    if (!TextUtils.isEmpty(paramString)) {
      localStringBuilder.append("&slot_id=" + paramString);
    }
    for (;;)
    {
      return localStringBuilder.toString();
      if (TextUtils.isEmpty(a(paramContext))) {
        break;
      }
      localStringBuilder.append("&app_key=" + a(paramContext));
    }
    return null;
  }
  
  public static String a(Date paramDate)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(paramDate);
  }
  
  public static Date a(String paramString)
  {
    try
    {
      paramString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static List<Promoter> a(List<Promoter> paramList1, List<Promoter> paramList2)
  {
    ArrayList localArrayList = new ArrayList();
    Object localObject1 = paramList2.iterator();
    Object localObject2;
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (Promoter)((Iterator)localObject1).next();
      if ((((Promoter)localObject2).display_type != 1) && (!a(((Promoter)localObject2).app_package_name, paramList1))) {
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
  
  public static Map<String, String> a()
  {
    if ((a == null) || (a.size() <= 0))
    {
      HashMap localHashMap = new HashMap();
      a = localHashMap;
      localHashMap.put("Accept-Encoding", "gzip");
    }
    return a;
  }
  
  public static void a(ImageView paramImageView, Context paramContext, ExchangeDataService paramExchangeDataService, g.a parama)
  {
    paramImageView.setVisibility(8);
    paramImageView.setClickable(false);
    paramExchangeDataService.requestDataAsyn(paramContext, new h(parama, paramExchangeDataService, paramImageView, paramContext));
  }
  
  private static boolean a(String paramString, List<Promoter> paramList)
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
  
  public static String b(Context paramContext)
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
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\common\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */