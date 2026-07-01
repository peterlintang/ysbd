package com.ireadercity.b2.h;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

public final class v
{
  public static String a()
  {
    return new SimpleDateFormat("HH:mm").format(new Date());
  }
  
  public static String a(int paramInt1, int paramInt2, float paramFloat)
  {
    float f2 = 0.0F;
    float f1 = paramFloat;
    if (Float.isNaN(paramFloat))
    {
      System.out.println("NAN");
      f1 = 0.0F;
    }
    f1 = (paramInt2 + f1) / paramInt1;
    if (f1 < 0.0F) {
      paramFloat = f2;
    }
    for (;;)
    {
      String str = String.format("%.2f", new Object[] { Float.valueOf(paramFloat * 100.0F) });
      return "阅读进度  " + str + "%";
      paramFloat = f2;
      if (f1 <= 1.0F) {
        paramFloat = f1;
      }
    }
  }
  
  public static String a(Context paramContext)
  {
    String str = paramContext.getPackageName();
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext.printStackTrace();
    }
    return "";
  }
  
  public static String a(String paramString)
  {
    String str1 = "unknow";
    String str2;
    if (paramString.toLowerCase().endsWith("epub"))
    {
      str1 = "epub";
      str2 = str1;
      if ("unknow".endsWith(str1))
      {
        if (!paramString.toLowerCase().contains("epub")) {
          break label82;
        }
        str2 = "epub";
      }
    }
    label82:
    do
    {
      return str2;
      if (paramString.toLowerCase().endsWith("txt"))
      {
        str1 = "txt";
        break;
      }
      if (!paramString.toLowerCase().endsWith("pdf")) {
        break;
      }
      str1 = "pdf";
      break;
      if (paramString.toLowerCase().contains("txt")) {
        return "txt";
      }
      str2 = str1;
    } while (!paramString.toLowerCase().contains("pdf"));
    return "pdf";
  }
  
  public static String a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    try
    {
      if (paramString1.contains("shucang")) {
        return UUID.randomUUID().toString() + "." + paramString2;
      }
      paramString1 = paramString1.substring(paramString1.lastIndexOf('/') + 1, paramString1.length());
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static float b(Context paramContext)
  {
    paramContext = paramContext.getResources().getDisplayMetrics();
    new StringBuilder().append(paramContext.density).toString();
    return paramContext.density / 1.4F;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */