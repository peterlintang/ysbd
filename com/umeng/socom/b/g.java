package com.umeng.socom.b;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class g
{
  public static final String a = System.getProperty("line.separator");
  private static final String b = "helper";
  
  public static String a()
  {
    return a(new Date());
  }
  
  public static String a(Context paramContext, long paramLong)
  {
    if (paramLong < 1000L) {
      return (int)paramLong + "B";
    }
    if (paramLong < 1000000L) {
      return Math.round((float)paramLong / 1000.0D) + "K";
    }
    if (paramLong < 1000000000L) {
      return new DecimalFormat("#0.0").format((float)paramLong / 1000000.0D) + "M";
    }
    return new DecimalFormat("#0.00").format((float)paramLong / 1.0E9D) + "G";
  }
  
  public static String a(String paramString)
  {
    int i = 0;
    if (paramString == null) {
      return null;
    }
    try
    {
      byte[] arrayOfByte = paramString.getBytes();
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).reset();
      ((MessageDigest)localObject).update(arrayOfByte);
      arrayOfByte = ((MessageDigest)localObject).digest();
      localObject = new StringBuffer();
      for (;;)
      {
        if (i >= arrayOfByte.length) {
          return ((StringBuffer)localObject).toString();
        }
        ((StringBuffer)localObject).append(String.format("%02X", new Object[] { Byte.valueOf(arrayOfByte[i]) }));
        i += 1;
      }
      return paramString.replaceAll("[^[a-z][A-Z][0-9][.][_]]", "");
    }
    catch (Exception localException) {}
  }
  
  public static String a(Date paramDate)
  {
    if (paramDate == null) {
      return "";
    }
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(paramDate);
  }
  
  public static void a(Context paramContext, String paramString)
  {
    paramContext.startActivity(paramContext.getPackageManager().getLaunchIntentForPackage(paramString));
  }
  
  public static String b(String paramString)
  {
    try
    {
      Object localObject = MessageDigest.getInstance("MD5");
      ((MessageDigest)localObject).update(paramString.getBytes());
      paramString = ((MessageDigest)localObject).digest();
      localObject = new StringBuffer();
      int i = 0;
      for (;;)
      {
        if (i >= paramString.length) {
          return ((StringBuffer)localObject).toString();
        }
        ((StringBuffer)localObject).append(Integer.toHexString(paramString[i] & 0xFF));
        i += 1;
      }
      return "";
    }
    catch (NoSuchAlgorithmException paramString) {}
  }
  
  public static boolean b(Context paramContext, String paramString)
  {
    try
    {
      paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)));
      return true;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return false;
  }
  
  public static boolean c(String paramString)
  {
    return (paramString == null) || (paramString.length() == 0);
  }
  
  public static boolean d(String paramString)
  {
    if (c(paramString)) {}
    do
    {
      return false;
      paramString = paramString.trim().toLowerCase();
    } while ((!paramString.startsWith("http://")) && (!paramString.startsWith("https://")));
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */