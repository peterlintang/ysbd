package com.umeng.socialize.controller;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import com.umeng.socialize.bean.APP_PLATFORM;
import com.umeng.socialize.bean.CustomPlatform;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.common.m;
import com.umeng.socialize.media.UMImage;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socom.Log;
import java.util.Iterator;
import java.util.List;

public abstract class a
{
  private static CustomPlatform a = null;
  private static CustomPlatform b = null;
  private static CustomPlatform c = null;
  private static final String d = "facebook";
  private static final String e = "twitter";
  private static final String f = "googleplus";
  
  public static CustomPlatform a(Context paramContext, APP_PLATFORM paramAPP_PLATFORM, String paramString)
  {
    switch (a()[paramAPP_PLATFORM.ordinal()])
    {
    default: 
      return null;
    case 1: 
      paramAPP_PLATFORM = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paramAPP_PLATFORM = "Facebook";
      }
      return c(paramContext.getApplicationContext(), "Facebook", paramAPP_PLATFORM);
    case 2: 
      paramAPP_PLATFORM = paramString;
      if (TextUtils.isEmpty(paramString)) {
        paramAPP_PLATFORM = "Twitter";
      }
      return b(paramContext.getApplicationContext(), "Twitter", paramAPP_PLATFORM);
    }
    paramAPP_PLATFORM = paramString;
    if (TextUtils.isEmpty(paramString)) {
      paramAPP_PLATFORM = "Google+";
    }
    return a(paramContext.getApplicationContext(), "Google+", paramAPP_PLATFORM);
  }
  
  private static CustomPlatform a(Context paramContext, String paramString1, String paramString2)
  {
    if (c == null)
    {
      int i = com.umeng.socialize.common.b.a(paramContext, b.a.c, "umeng_socialize_google");
      paramString1 = new CustomPlatform(paramString1, i);
      c = paramString1;
      paramString1.tag = APP_PLATFORM.GOOGLE.toString();
      c.grayIcon = i;
      c.clickListener = new b(paramContext, paramString2);
    }
    return c;
  }
  
  private static Intent b(Context paramContext, APP_PLATFORM paramAPP_PLATFORM, Intent paramIntent)
  {
    for (;;)
    {
      try
      {
        Iterator localIterator = paramContext.getPackageManager().queryIntentActivities(paramIntent, 0).iterator();
        if (!localIterator.hasNext())
        {
          paramContext = null;
          if (paramContext != null)
          {
            paramIntent.setClassName(paramContext.activityInfo.packageName, paramContext.activityInfo.name);
            return paramIntent;
          }
        }
        else
        {
          paramContext = (ResolveInfo)localIterator.next();
          if (paramAPP_PLATFORM != APP_PLATFORM.FACEBOOK) {
            break label104;
          }
          if (!paramContext.activityInfo.packageName.equals("com.facebook.katana")) {
            continue;
          }
          paramIntent.setFlags(270532608);
          continue;
        }
        return null;
      }
      catch (Exception paramContext)
      {
        Log.e("SOCIAL", "", paramContext);
      }
      label104:
      if (paramAPP_PLATFORM == APP_PLATFORM.TWITTER)
      {
        if (paramContext.activityInfo.packageName.equals("com.twitter.android")) {
          paramIntent.setFlags(270532608);
        }
      }
      else if ((paramAPP_PLATFORM == APP_PLATFORM.GOOGLE) && (paramContext.activityInfo.packageName.equals("com.google.android.apps.plus"))) {
        paramIntent.setFlags(268435456);
      }
    }
  }
  
  private static Intent b(Context paramContext, String paramString, UMediaObject paramUMediaObject)
  {
    Intent localIntent = new Intent("android.intent.action.SEND");
    localIntent.setType("image/png;text/plain");
    if (!TextUtils.isEmpty(paramString)) {
      localIntent.putExtra("android.intent.extra.TEXT", paramString);
    }
    if ((paramUMediaObject instanceof UMImage))
    {
      paramString = ((UMImage)paramUMediaObject).getImageCachePath();
      if (paramString != null)
      {
        paramContext = m.a(paramContext, paramString);
        if (paramContext != null) {
          localIntent.putExtra("android.intent.extra.STREAM", paramContext);
        }
      }
    }
    return localIntent;
  }
  
  private static CustomPlatform b(Context paramContext, String paramString1, String paramString2)
  {
    if (b == null)
    {
      int i = com.umeng.socialize.common.b.a(paramContext, b.a.c, "umeng_socialize_twitter");
      paramString1 = new CustomPlatform(paramString1, i);
      b = paramString1;
      paramString1.tag = APP_PLATFORM.TWITTER.toString();
      b.grayIcon = i;
      b.clickListener = new c(paramContext, paramString2);
    }
    return b;
  }
  
  private static CustomPlatform c(Context paramContext, String paramString1, String paramString2)
  {
    if (a == null)
    {
      int i = com.umeng.socialize.common.b.a(paramContext, b.a.c, "umeng_socialize_facebook");
      paramString1 = new CustomPlatform(paramString1, i);
      a = paramString1;
      paramString1.tag = APP_PLATFORM.FACEBOOK.toString();
      a.grayIcon = i;
      a.clickListener = new d(paramContext, paramString2);
    }
    return a;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */