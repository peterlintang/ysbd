package com.umeng.socialize.common;

import android.content.Context;
import com.umeng.socialize.a.c;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.SocializeConfig;
import com.umeng.socialize.bean.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class l
{
  public static final String a = "sina";
  public static final String b = "tencent";
  public static final String c = "renren";
  public static final String d = "douban";
  public static final String e = "qzone";
  
  private static int a(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    switch (a()[paramSHARE_MEDIA.ordinal()])
    {
    default: 
      return -1;
    case 2: 
      return b.a(paramContext, b.a.c, "umeng_socialize_tx_on");
    case 1: 
      return b.a(paramContext, b.a.c, "umeng_socialize_sina_on");
    case 3: 
      return b.a(paramContext, b.a.c, "umeng_socialize_renren_on");
    case 4: 
      return b.a(paramContext, b.a.c, "umeng_socialize_douban_on");
    }
    return b.a(paramContext, b.a.c, "umeng_socialize_qzone_on");
  }
  
  public static String a(SHARE_MEDIA paramSHARE_MEDIA)
  {
    switch (a()[paramSHARE_MEDIA.ordinal()])
    {
    default: 
      return "";
    case 2: 
      return "腾讯微博";
    case 1: 
      return "新浪微博";
    case 3: 
      return "人人网";
    case 4: 
      return "豆瓣";
    }
    return "QQ空间";
  }
  
  public static List<n> a(Context paramContext, SocializeConfig paramSocializeConfig)
  {
    Object localObject = paramSocializeConfig.getPlatforms();
    paramSocializeConfig = new ArrayList();
    SHARE_MEDIA localSHARE_MEDIA1 = c.b(paramContext);
    localObject = ((List)localObject).iterator();
    int i = 0;
    for (;;)
    {
      if (!((Iterator)localObject).hasNext()) {
        return paramSocializeConfig;
      }
      SHARE_MEDIA localSHARE_MEDIA2 = (SHARE_MEDIA)((Iterator)localObject).next();
      n localn = new n();
      localn.a = localSHARE_MEDIA2.toString();
      localn.c = a(paramContext, localSHARE_MEDIA2);
      localn.d = b(paramContext, localSHARE_MEDIA2);
      localn.b = a(localSHARE_MEDIA2);
      try
      {
        if (d.a(paramContext, localSHARE_MEDIA2))
        {
          localn.e = true;
          localn.g = d.b(paramContext, localSHARE_MEDIA2);
        }
        if ((localSHARE_MEDIA1 != null) && (localSHARE_MEDIA1 == localSHARE_MEDIA2)) {
          localn.f = true;
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
      localn.i = i;
      paramSocializeConfig.add(localn);
      i += 1;
    }
  }
  
  private static int b(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    switch (a()[paramSHARE_MEDIA.ordinal()])
    {
    default: 
      return -1;
    case 2: 
      return b.a(paramContext, b.a.c, "umeng_socialize_tx_off");
    case 1: 
      return b.a(paramContext, b.a.c, "umeng_socialize_sina_off");
    case 3: 
      return b.a(paramContext, b.a.c, "umeng_socialize_renren_off");
    case 4: 
      return b.a(paramContext, b.a.c, "umeng_socialize_douban_off");
    }
    return b.a(paramContext, b.a.c, "umeng_socialize_qzone_off");
  }
  
  public static String b(SHARE_MEDIA paramSHARE_MEDIA)
  {
    switch (a()[paramSHARE_MEDIA.ordinal()])
    {
    default: 
      return null;
    case 1: 
      return "sina";
    case 2: 
      return "tencent";
    case 3: 
      return "renren";
    case 4: 
      return "douban";
    }
    return "qzone";
  }
  
  public static boolean c(SHARE_MEDIA paramSHARE_MEDIA)
  {
    return (paramSHARE_MEDIA != SHARE_MEDIA.DOUBAN) && (paramSHARE_MEDIA != SHARE_MEDIA.QZONE);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\common\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */