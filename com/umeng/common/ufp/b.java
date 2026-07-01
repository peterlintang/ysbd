package com.umeng.common.ufp;

import android.app.ActivityManager;
import android.app.ActivityManager.MemoryInfo;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.location.Location;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.provider.Settings.Secure;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;
import android.telephony.CellInfo;
import android.telephony.CellInfoGsm;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.WindowManager;
import com.taobao.munion.utils.q;
import com.umeng.common.ufp.util.g;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import javax.microedition.khronos.opengles.GL10;

public class b
{
  public static final int a = 8;
  protected static final String b = b.class.getName();
  protected static final String c = "Unknown";
  private static final String d = "2G/3G";
  private static final String e = "Wi-Fi";
  
  public static int A(Context paramContext)
  {
    int j = 8;
    int i = j;
    if (paramContext != null) {}
    try
    {
      paramContext = Calendar.getInstance(K(paramContext));
      i = j;
      if (paramContext != null) {
        i = paramContext.getTimeZone().getRawOffset() / 3600000;
      }
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext = b;
    }
    return 8;
  }
  
  public static String[] B(Context paramContext)
  {
    String[] arrayOfString = new String[2];
    if (paramContext != null) {}
    try
    {
      paramContext = K(paramContext);
      if (paramContext != null)
      {
        arrayOfString[0] = paramContext.getCountry();
        arrayOfString[1] = paramContext.getLanguage();
      }
      if (TextUtils.isEmpty(arrayOfString[0])) {
        arrayOfString[0] = "Unknown";
      }
      if (TextUtils.isEmpty(arrayOfString[1])) {
        arrayOfString[1] = "Unknown";
      }
      return arrayOfString;
    }
    catch (Exception paramContext)
    {
      paramContext = b;
    }
    return arrayOfString;
  }
  
  public static String C(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if (paramContext != null)
        {
          paramContext = paramContext.metaData.getString("UMENG_APPKEY");
          if (paramContext != null) {
            return paramContext.trim();
          }
          paramContext = b;
          return null;
        }
      }
      catch (Exception paramContext)
      {
        paramContext = b;
      }
    }
    return null;
  }
  
  public static String D(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        localObject = (WifiManager)paramContext.getSystemService("wifi");
        if (a(paramContext, "android.permission.ACCESS_WIFI_STATE")) {
          return ((WifiManager)localObject).getConnectionInfo().getMacAddress();
        }
        paramContext = b;
        return null;
      }
      catch (Exception paramContext)
      {
        Object localObject = b;
        new StringBuilder("Could not get mac address.").append(paramContext.toString()).toString();
      }
    }
    return null;
  }
  
  public static String E(Context paramContext)
  {
    if (paramContext != null) {}
    for (;;)
    {
      int i;
      try
      {
        localDisplayMetrics = new DisplayMetrics();
        ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
        i = 0;
        if ((paramContext.getApplicationInfo().flags & 0x2000) != 0) {
          break label121;
        }
        j = a(localDisplayMetrics, "noncompatWidthPixels");
        i = a(localDisplayMetrics, "noncompatHeightPixels");
      }
      catch (Exception paramContext)
      {
        DisplayMetrics localDisplayMetrics;
        paramContext = b;
      }
      int j = localDisplayMetrics.widthPixels;
      int k = localDisplayMetrics.heightPixels;
      paramContext = new StringBuffer();
      paramContext.append(j);
      paramContext.append("*");
      paramContext.append(k);
      paramContext = paramContext.toString();
      return paramContext;
      return "Unknown";
      label121:
      j = -1;
      if (j != -1)
      {
        k = i;
        if (i != -1) {}
      }
    }
  }
  
  public static String F(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
        return paramContext;
      }
      catch (Exception paramContext)
      {
        paramContext = b;
      }
    }
    return "Unknown";
  }
  
  public static String G(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if ((paramContext != null) && (paramContext.metaData != null))
        {
          paramContext = paramContext.metaData.get("UMENG_CHANNEL");
          if (paramContext != null)
          {
            paramContext = paramContext.toString();
            if (paramContext != null) {
              return paramContext;
            }
            paramContext = b;
          }
        }
        return "Unknown";
      }
      catch (Exception paramContext)
      {
        paramContext = b;
      }
    }
    return "Unknown";
  }
  
  public static String H(Context paramContext)
  {
    if (paramContext != null) {
      return paramContext.getPackageName();
    }
    return "";
  }
  
  public static String I(Context paramContext)
  {
    if (paramContext != null) {
      return paramContext.getPackageManager().getApplicationLabel(paramContext.getApplicationInfo()).toString();
    }
    return "";
  }
  
  public static boolean J(Context paramContext)
  {
    boolean bool = false;
    try
    {
      int i = paramContext.getApplicationInfo().flags;
      if ((i & 0x2) != 0) {
        bool = true;
      }
      return bool;
    }
    catch (Exception paramContext) {}
    return false;
  }
  
  private static Locale K(Context paramContext)
  {
    Object localObject1 = null;
    Object localObject2 = null;
    if (paramContext != null) {}
    try
    {
      localObject1 = new Configuration();
      Settings.System.getConfiguration(paramContext.getContentResolver(), (Configuration)localObject1);
      paramContext = ((Configuration)localObject1).locale;
      localObject1 = paramContext;
      if (paramContext == null) {
        localObject1 = Locale.getDefault();
      }
      return (Locale)localObject1;
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        paramContext = b;
        paramContext = (Context)localObject2;
      }
    }
  }
  
  public static double a(double paramDouble)
  {
    int i = (int)paramDouble;
    return new BigDecimal(Double.toString(paramDouble)).subtract(new BigDecimal(Integer.toString(i))).floatValue();
  }
  
  private static int a(Object paramObject, String paramString)
  {
    try
    {
      paramString = DisplayMetrics.class.getDeclaredField(paramString);
      paramString.setAccessible(true);
      int i = paramString.getInt(paramObject);
      return i;
    }
    catch (Exception paramObject)
    {
      ((Exception)paramObject).printStackTrace();
    }
    return -1;
  }
  
  public static int a(Date paramDate1, Date paramDate2)
  {
    Date localDate;
    if (paramDate1.after(paramDate2))
    {
      localDate = paramDate2;
      paramDate2 = paramDate1;
    }
    for (;;)
    {
      long l = localDate.getTime();
      return (int)((paramDate2.getTime() - l) / 1000L);
      localDate = paramDate1;
    }
  }
  
  public static int a(byte[] paramArrayOfByte)
  {
    int j = -1;
    int i = j;
    if (paramArrayOfByte != null)
    {
      i = j;
      if (paramArrayOfByte.length >= 4) {
        i = paramArrayOfByte[0] & 0xFF | paramArrayOfByte[1] << 8 & 0xFF00 | paramArrayOfByte[2] << 16 & 0xFF0000 | paramArrayOfByte[3] << 24 & 0xFF000000;
      }
    }
    return i;
  }
  
  public static String a()
  {
    String str = q.b().a().substring(10, 14);
    Random localRandom = new Random();
    return str + System.currentTimeMillis() + localRandom.nextInt(1000);
  }
  
  public static String a(Context paramContext)
  {
    String str = null;
    if (paramContext != null) {
      str = ((TelephonyManager)paramContext.getSystemService("phone")).getSubscriberId();
    }
    return str;
  }
  
  public static String a(String paramString)
  {
    String str = null;
    if (paramString != null) {
      str = paramString.replace("\r\n", "").replace("\r", "").replace("\n", "");
    }
    return str;
  }
  
  public static String a(Date paramDate)
  {
    return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(paramDate);
  }
  
  public static boolean a(Context paramContext, String paramString)
  {
    return (paramContext != null) && (paramContext.getPackageManager().checkPermission(paramString, paramContext.getPackageName()) == 0);
  }
  
  public static boolean a(String paramString, Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = paramContext.getPackageManager();
      try
      {
        paramContext.getPackageInfo(paramString, 1);
        return true;
      }
      catch (PackageManager.NameNotFoundException paramString)
      {
        return false;
      }
    }
    return false;
  }
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int j;
    int i;
    if ((paramArrayOfByte1 != null) && (paramArrayOfByte2 != null) && (paramArrayOfByte1.length == paramArrayOfByte2.length))
    {
      j = paramArrayOfByte1.length;
      i = 0;
    }
    while (i < j)
    {
      if (paramArrayOfByte1[i] != paramArrayOfByte2[i]) {
        return false;
      }
      i += 1;
    }
    return true;
  }
  
  public static int[] a(View paramView)
  {
    int[] arrayOfInt = new int[2];
    int[] tmp5_4 = arrayOfInt;
    tmp5_4[0] = -1;
    int[] tmp9_5 = tmp5_4;
    tmp9_5[1] = -1;
    tmp9_5;
    if (paramView != null)
    {
      paramView.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
      arrayOfInt[0] = paramView.getMeasuredWidth();
      arrayOfInt[1] = paramView.getMeasuredHeight();
    }
    return arrayOfInt;
  }
  
  public static String[] a(GL10 paramGL10)
  {
    try
    {
      String str = paramGL10.glGetString(7936);
      paramGL10 = paramGL10.glGetString(7937);
      return new String[] { str, paramGL10 };
    }
    catch (Exception paramGL10)
    {
      paramGL10 = b;
    }
    return new String[0];
  }
  
  public static int b(Context paramContext)
  {
    int i = -1;
    if (paramContext != null)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      i = localDisplayMetrics.widthPixels;
    }
    return i;
  }
  
  public static String b()
  {
    return Build.MODEL;
  }
  
  public static Date b(String paramString)
  {
    try
    {
      paramString = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static int c()
  {
    return Build.VERSION.SDK_INT & 0xFF | 0x100;
  }
  
  public static int c(Context paramContext)
  {
    int i = -1;
    if (paramContext != null)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      i = localDisplayMetrics.heightPixels;
    }
    return i;
  }
  
  public static int d()
  {
    return (int)(System.currentTimeMillis() / 1000L);
  }
  
  public static int d(Context paramContext)
  {
    int i = -1;
    if (paramContext != null)
    {
      DisplayMetrics localDisplayMetrics = new DisplayMetrics();
      ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
      i = localDisplayMetrics.densityDpi;
    }
    return i;
  }
  
  public static int e(Context paramContext)
  {
    int i = 0;
    if (paramContext != null) {}
    try
    {
      i = Settings.System.getInt(paramContext.getContentResolver(), "screen_brightness");
      return i;
    }
    catch (Settings.SettingNotFoundException paramContext)
    {
      String str = b;
      new StringBuilder("Get screen bright exception,info:").append(paramContext.toString()).toString();
    }
    return 0;
  }
  
  public static String e()
  {
    String str2 = Build.MANUFACTURER;
    String str1 = str2;
    if (str2 != null)
    {
      str1 = str2;
      if (str2.length() > 32) {
        str1 = str2.substring(0, 32);
      }
    }
    return str1;
  }
  
  public static int f(Context paramContext)
  {
    if (paramContext != null)
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null)
      {
        if (paramContext.getType() == 1) {
          return 1;
        }
        if (paramContext.getType() == 0)
        {
          if ((paramContext.getSubtype() == 2) || (paramContext.getSubtype() == 1) || (paramContext.getSubtype() == 4)) {
            return 2;
          }
          return 3;
        }
      }
    }
    return 0;
  }
  
  public static String f()
  {
    Object localObject4 = null;
    String str2 = null;
    Object localObject1 = localObject4;
    for (;;)
    {
      try
      {
        localFileReader = new FileReader("/proc/cpuinfo");
        localObject3 = str2;
        localObject1 = localObject4;
      }
      catch (FileNotFoundException localFileNotFoundException)
      {
        FileReader localFileReader;
        Object localObject3;
        BufferedReader localBufferedReader;
        Object localObject2;
        String str1 = b;
        continue;
      }
      try
      {
        localBufferedReader = new BufferedReader(localFileReader, 1024);
        localObject3 = str2;
        localObject1 = localObject4;
        str2 = localBufferedReader.readLine();
        localObject3 = str2;
        localObject1 = str2;
        localBufferedReader.close();
        localObject3 = str2;
        localObject1 = str2;
        localFileReader.close();
        localObject1 = str2;
      }
      catch (IOException localIOException)
      {
        localObject2 = localObject3;
        str2 = b;
        localObject2 = localObject3;
      }
    }
    localObject3 = localObject1;
    if (localObject1 != null) {
      localObject3 = ((String)localObject1).substring(((String)localObject1).indexOf(':') + 1);
    }
    if (localObject3 != null) {
      return ((String)localObject3).trim();
    }
    return "";
  }
  
  public static int g(Context paramContext)
  {
    int i = 0;
    if (paramContext != null) {
      i = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkType();
    }
    return i;
  }
  
  public static boolean g()
  {
    return Environment.getExternalStorageState().equals("mounted");
  }
  
  /* Error */
  public static int h(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: iconst_m1
    //   3: istore_2
    //   4: new 442	java/io/FileReader
    //   7: dup
    //   8: ldc_w 481
    //   11: invokespecial 445	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   14: astore_0
    //   15: new 447	java/io/BufferedReader
    //   18: dup
    //   19: aload_0
    //   20: sipush 1024
    //   23: invokespecial 450	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   26: astore_3
    //   27: aload_3
    //   28: astore 4
    //   30: aload_0
    //   31: astore 5
    //   33: aload_3
    //   34: invokevirtual 453	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   37: astore 6
    //   39: iload_2
    //   40: istore_1
    //   41: aload 6
    //   43: ifnull +49 -> 92
    //   46: iload_2
    //   47: istore_1
    //   48: aload_3
    //   49: astore 4
    //   51: aload_0
    //   52: astore 5
    //   54: aload 6
    //   56: invokevirtual 109	java/lang/String:trim	()Ljava/lang/String;
    //   59: invokevirtual 419	java/lang/String:length	()I
    //   62: ifle +30 -> 92
    //   65: aload_3
    //   66: astore 4
    //   68: aload_0
    //   69: astore 5
    //   71: aload 6
    //   73: ldc_w 483
    //   76: invokevirtual 487	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   79: iconst_1
    //   80: aaload
    //   81: invokestatic 491	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   84: invokevirtual 494	java/lang/Integer:intValue	()I
    //   87: sipush 1024
    //   90: idiv
    //   91: istore_1
    //   92: aload_3
    //   93: invokevirtual 456	java/io/BufferedReader:close	()V
    //   96: aload_0
    //   97: invokevirtual 457	java/io/FileReader:close	()V
    //   100: iload_1
    //   101: ireturn
    //   102: astore_3
    //   103: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   106: astore 4
    //   108: new 134	java/lang/StringBuilder
    //   111: dup
    //   112: ldc_w 496
    //   115: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   118: aload_3
    //   119: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   122: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   125: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   128: pop
    //   129: goto -33 -> 96
    //   132: astore_0
    //   133: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   136: astore_3
    //   137: new 134	java/lang/StringBuilder
    //   140: dup
    //   141: ldc_w 499
    //   144: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   147: aload_0
    //   148: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   151: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   154: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   157: pop
    //   158: iload_1
    //   159: ireturn
    //   160: astore 4
    //   162: aconst_null
    //   163: astore_0
    //   164: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   167: astore 5
    //   169: new 134	java/lang/StringBuilder
    //   172: dup
    //   173: ldc_w 501
    //   176: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   179: aload 4
    //   181: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   184: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   187: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   190: pop
    //   191: aload_0
    //   192: ifnull +7 -> 199
    //   195: aload_0
    //   196: invokevirtual 456	java/io/BufferedReader:close	()V
    //   199: iload_2
    //   200: istore_1
    //   201: aload_3
    //   202: ifnull -102 -> 100
    //   205: aload_3
    //   206: invokevirtual 457	java/io/FileReader:close	()V
    //   209: iconst_m1
    //   210: ireturn
    //   211: astore_0
    //   212: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   215: astore_3
    //   216: new 134	java/lang/StringBuilder
    //   219: dup
    //   220: ldc_w 499
    //   223: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   226: aload_0
    //   227: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   230: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   233: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   236: pop
    //   237: iconst_m1
    //   238: ireturn
    //   239: astore_0
    //   240: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   243: astore 4
    //   245: new 134	java/lang/StringBuilder
    //   248: dup
    //   249: ldc_w 496
    //   252: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   255: aload_0
    //   256: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   259: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   262: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   265: pop
    //   266: goto -67 -> 199
    //   269: astore 6
    //   271: aconst_null
    //   272: astore_3
    //   273: aconst_null
    //   274: astore_0
    //   275: aload_3
    //   276: astore 4
    //   278: aload_0
    //   279: astore 5
    //   281: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   284: astore 7
    //   286: aload_3
    //   287: astore 4
    //   289: aload_0
    //   290: astore 5
    //   292: new 134	java/lang/StringBuilder
    //   295: dup
    //   296: ldc_w 501
    //   299: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   302: aload 6
    //   304: invokevirtual 142	java/lang/Exception:toString	()Ljava/lang/String;
    //   307: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   310: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   313: pop
    //   314: aload_3
    //   315: ifnull +7 -> 322
    //   318: aload_3
    //   319: invokevirtual 456	java/io/BufferedReader:close	()V
    //   322: iload_2
    //   323: istore_1
    //   324: aload_0
    //   325: ifnull -225 -> 100
    //   328: aload_0
    //   329: invokevirtual 457	java/io/FileReader:close	()V
    //   332: iconst_m1
    //   333: ireturn
    //   334: astore_0
    //   335: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   338: astore_3
    //   339: new 134	java/lang/StringBuilder
    //   342: dup
    //   343: ldc_w 499
    //   346: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   349: aload_0
    //   350: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   353: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   356: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   359: pop
    //   360: iconst_m1
    //   361: ireturn
    //   362: astore_3
    //   363: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   366: astore 4
    //   368: new 134	java/lang/StringBuilder
    //   371: dup
    //   372: ldc_w 496
    //   375: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   378: aload_3
    //   379: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   382: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   388: pop
    //   389: goto -67 -> 322
    //   392: astore_3
    //   393: aconst_null
    //   394: astore 4
    //   396: aconst_null
    //   397: astore_0
    //   398: aload 4
    //   400: ifnull +8 -> 408
    //   403: aload 4
    //   405: invokevirtual 456	java/io/BufferedReader:close	()V
    //   408: aload_0
    //   409: ifnull +7 -> 416
    //   412: aload_0
    //   413: invokevirtual 457	java/io/FileReader:close	()V
    //   416: aload_3
    //   417: athrow
    //   418: astore 4
    //   420: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   423: astore 5
    //   425: new 134	java/lang/StringBuilder
    //   428: dup
    //   429: ldc_w 496
    //   432: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   435: aload 4
    //   437: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   440: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   443: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   446: pop
    //   447: goto -39 -> 408
    //   450: astore_0
    //   451: getstatic 28	com/umeng/common/ufp/b:b	Ljava/lang/String;
    //   454: astore 4
    //   456: new 134	java/lang/StringBuilder
    //   459: dup
    //   460: ldc_w 499
    //   463: invokespecial 139	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   466: aload_0
    //   467: invokevirtual 497	java/io/IOException:toString	()Ljava/lang/String;
    //   470: invokevirtual 146	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   473: invokevirtual 147	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   476: pop
    //   477: goto -61 -> 416
    //   480: astore_3
    //   481: aconst_null
    //   482: astore 4
    //   484: goto -86 -> 398
    //   487: astore_3
    //   488: aload 5
    //   490: astore_0
    //   491: goto -93 -> 398
    //   494: astore 4
    //   496: aload_3
    //   497: astore 5
    //   499: aload 4
    //   501: astore_3
    //   502: aload_0
    //   503: astore 4
    //   505: aload 5
    //   507: astore_0
    //   508: goto -110 -> 398
    //   511: astore 6
    //   513: aconst_null
    //   514: astore_3
    //   515: goto -240 -> 275
    //   518: astore 6
    //   520: goto -245 -> 275
    //   523: astore 4
    //   525: aconst_null
    //   526: astore 5
    //   528: aload_0
    //   529: astore_3
    //   530: aload 5
    //   532: astore_0
    //   533: goto -369 -> 164
    //   536: astore 4
    //   538: aload_0
    //   539: astore 5
    //   541: aload_3
    //   542: astore_0
    //   543: aload 5
    //   545: astore_3
    //   546: goto -382 -> 164
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	549	0	paramContext	Context
    //   40	284	1	i	int
    //   3	320	2	j	int
    //   1	92	3	localBufferedReader	BufferedReader
    //   102	17	3	localIOException1	IOException
    //   136	203	3	str1	String
    //   362	17	3	localIOException2	IOException
    //   392	25	3	localObject1	Object
    //   480	1	3	localObject2	Object
    //   487	10	3	localObject3	Object
    //   501	45	3	localObject4	Object
    //   28	79	4	localObject5	Object
    //   160	20	4	localIOException3	IOException
    //   243	161	4	str2	String
    //   418	18	4	localIOException4	IOException
    //   454	29	4	str3	String
    //   494	6	4	localObject6	Object
    //   503	1	4	localContext	Context
    //   523	1	4	localIOException5	IOException
    //   536	1	4	localIOException6	IOException
    //   31	513	5	localObject7	Object
    //   37	35	6	str4	String
    //   269	34	6	localException1	Exception
    //   511	1	6	localException2	Exception
    //   518	1	6	localException3	Exception
    //   284	1	7	str5	String
    // Exception table:
    //   from	to	target	type
    //   92	96	102	java/io/IOException
    //   96	100	132	java/io/IOException
    //   4	15	160	java/io/IOException
    //   205	209	211	java/io/IOException
    //   195	199	239	java/io/IOException
    //   4	15	269	java/lang/Exception
    //   328	332	334	java/io/IOException
    //   318	322	362	java/io/IOException
    //   4	15	392	finally
    //   403	408	418	java/io/IOException
    //   412	416	450	java/io/IOException
    //   15	27	480	finally
    //   33	39	487	finally
    //   54	65	487	finally
    //   71	92	487	finally
    //   281	286	487	finally
    //   292	314	487	finally
    //   164	191	494	finally
    //   15	27	511	java/lang/Exception
    //   33	39	518	java/lang/Exception
    //   54	65	518	java/lang/Exception
    //   71	92	518	java/lang/Exception
    //   15	27	523	java/io/IOException
    //   33	39	536	java/io/IOException
    //   54	65	536	java/io/IOException
    //   71	92	536	java/io/IOException
  }
  
  public static String h()
  {
    Date localDate = new Date();
    return new SimpleDateFormat("yyyy-MM-dd").format(localDate);
  }
  
  public static int i(Context paramContext)
  {
    int i = -1;
    if (paramContext != null)
    {
      paramContext = (ActivityManager)paramContext.getSystemService("activity");
      ActivityManager.MemoryInfo localMemoryInfo = new ActivityManager.MemoryInfo();
      paramContext.getMemoryInfo(localMemoryInfo);
      i = new Long(localMemoryInfo.availMem / 1048576L).intValue();
    }
    return i;
  }
  
  /* Error */
  public static int j(Context paramContext)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_0
    //   2: iconst_m1
    //   3: istore_2
    //   4: iconst_0
    //   5: istore_3
    //   6: lconst_0
    //   7: lstore 4
    //   9: new 442	java/io/FileReader
    //   12: dup
    //   13: ldc_w 530
    //   16: invokespecial 445	java/io/FileReader:<init>	(Ljava/lang/String;)V
    //   19: astore 7
    //   21: new 447	java/io/BufferedReader
    //   24: dup
    //   25: aload 7
    //   27: sipush 1024
    //   30: invokespecial 450	java/io/BufferedReader:<init>	(Ljava/io/Reader;I)V
    //   33: astore 6
    //   35: aload 6
    //   37: invokevirtual 453	java/io/BufferedReader:readLine	()Ljava/lang/String;
    //   40: astore_0
    //   41: aload_0
    //   42: ifnull +69 -> 111
    //   45: iload_3
    //   46: iconst_2
    //   47: if_icmpge +64 -> 111
    //   50: aload_0
    //   51: ldc_w 532
    //   54: invokevirtual 535	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   57: iconst_m1
    //   58: if_icmpne +14 -> 72
    //   61: aload_0
    //   62: ldc_w 537
    //   65: invokevirtual 535	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   68: iconst_m1
    //   69: if_icmpeq -34 -> 35
    //   72: aload_0
    //   73: ldc_w 539
    //   76: invokevirtual 487	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   79: astore_0
    //   80: lload 4
    //   82: aload_0
    //   83: iconst_1
    //   84: aaload
    //   85: invokestatic 542	java/lang/Long:valueOf	(Ljava/lang/String;)Ljava/lang/Long;
    //   88: invokevirtual 545	java/lang/Long:longValue	()J
    //   91: ladd
    //   92: aload_0
    //   93: iconst_2
    //   94: aaload
    //   95: invokestatic 542	java/lang/Long:valueOf	(Ljava/lang/String;)Ljava/lang/Long;
    //   98: invokevirtual 545	java/lang/Long:longValue	()J
    //   101: ladd
    //   102: lstore 4
    //   104: iload_3
    //   105: iconst_1
    //   106: iadd
    //   107: istore_3
    //   108: goto -73 -> 35
    //   111: iload_2
    //   112: istore_1
    //   113: iload_3
    //   114: iconst_2
    //   115: if_icmpne +20 -> 135
    //   118: new 518	java/lang/Long
    //   121: dup
    //   122: lload 4
    //   124: ldc2_w 546
    //   127: ldiv
    //   128: invokespecial 526	java/lang/Long:<init>	(J)V
    //   131: invokevirtual 527	java/lang/Long:intValue	()I
    //   134: istore_1
    //   135: aload 6
    //   137: invokevirtual 456	java/io/BufferedReader:close	()V
    //   140: aload 7
    //   142: invokevirtual 457	java/io/FileReader:close	()V
    //   145: iload_1
    //   146: ireturn
    //   147: astore_0
    //   148: aload_0
    //   149: invokevirtual 548	java/io/IOException:printStackTrace	()V
    //   152: goto -12 -> 140
    //   155: astore_0
    //   156: aload_0
    //   157: invokevirtual 548	java/io/IOException:printStackTrace	()V
    //   160: iload_1
    //   161: ireturn
    //   162: astore 7
    //   164: aconst_null
    //   165: astore 6
    //   167: aload 7
    //   169: invokevirtual 548	java/io/IOException:printStackTrace	()V
    //   172: aload 6
    //   174: ifnull +8 -> 182
    //   177: aload 6
    //   179: invokevirtual 456	java/io/BufferedReader:close	()V
    //   182: iload_2
    //   183: istore_1
    //   184: aload_0
    //   185: ifnull -40 -> 145
    //   188: aload_0
    //   189: invokevirtual 457	java/io/FileReader:close	()V
    //   192: iconst_m1
    //   193: ireturn
    //   194: astore_0
    //   195: aload_0
    //   196: invokevirtual 548	java/io/IOException:printStackTrace	()V
    //   199: iconst_m1
    //   200: ireturn
    //   201: astore 6
    //   203: aload 6
    //   205: invokevirtual 548	java/io/IOException:printStackTrace	()V
    //   208: goto -26 -> 182
    //   211: astore_0
    //   212: aconst_null
    //   213: astore 6
    //   215: aconst_null
    //   216: astore 7
    //   218: aload 6
    //   220: ifnull +8 -> 228
    //   223: aload 6
    //   225: invokevirtual 456	java/io/BufferedReader:close	()V
    //   228: aload 7
    //   230: ifnull +8 -> 238
    //   233: aload 7
    //   235: invokevirtual 457	java/io/FileReader:close	()V
    //   238: aload_0
    //   239: athrow
    //   240: astore 6
    //   242: aload 6
    //   244: invokevirtual 548	java/io/IOException:printStackTrace	()V
    //   247: goto -19 -> 228
    //   250: astore 6
    //   252: aload 6
    //   254: invokevirtual 548	java/io/IOException:printStackTrace	()V
    //   257: goto -19 -> 238
    //   260: astore_0
    //   261: aconst_null
    //   262: astore 6
    //   264: goto -46 -> 218
    //   267: astore_0
    //   268: goto -50 -> 218
    //   271: astore 8
    //   273: aload_0
    //   274: astore 7
    //   276: aload 8
    //   278: astore_0
    //   279: goto -61 -> 218
    //   282: astore 8
    //   284: aconst_null
    //   285: astore 6
    //   287: aload 7
    //   289: astore_0
    //   290: aload 8
    //   292: astore 7
    //   294: goto -127 -> 167
    //   297: astore 8
    //   299: aload 7
    //   301: astore_0
    //   302: aload 8
    //   304: astore 7
    //   306: goto -139 -> 167
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	309	0	paramContext	Context
    //   112	72	1	i	int
    //   3	180	2	j	int
    //   5	111	3	k	int
    //   7	116	4	l	long
    //   33	145	6	localBufferedReader	BufferedReader
    //   201	3	6	localIOException1	IOException
    //   213	11	6	localObject1	Object
    //   240	3	6	localIOException2	IOException
    //   250	3	6	localIOException3	IOException
    //   262	24	6	localObject2	Object
    //   19	122	7	localFileReader	FileReader
    //   162	6	7	localIOException4	IOException
    //   216	89	7	localObject3	Object
    //   271	6	8	localObject4	Object
    //   282	9	8	localIOException5	IOException
    //   297	6	8	localIOException6	IOException
    // Exception table:
    //   from	to	target	type
    //   135	140	147	java/io/IOException
    //   140	145	155	java/io/IOException
    //   9	21	162	java/io/IOException
    //   188	192	194	java/io/IOException
    //   177	182	201	java/io/IOException
    //   9	21	211	finally
    //   223	228	240	java/io/IOException
    //   233	238	250	java/io/IOException
    //   21	35	260	finally
    //   35	41	267	finally
    //   50	72	267	finally
    //   72	104	267	finally
    //   118	135	267	finally
    //   167	172	271	finally
    //   21	35	282	java/io/IOException
    //   35	41	297	java/io/IOException
    //   50	72	297	java/io/IOException
    //   72	104	297	java/io/IOException
    //   118	135	297	java/io/IOException
  }
  
  public static boolean k(Context paramContext)
  {
    boolean bool = false;
    if (paramContext != null) {
      bool = paramContext.getResources().getConfiguration().locale.toString().equals(Locale.CHINA.toString());
    }
    return bool;
  }
  
  public static Set<String> l(Context paramContext)
  {
    HashSet localHashSet = new HashSet();
    if (paramContext != null)
    {
      paramContext = paramContext.getPackageManager().getInstalledPackages(0);
      int i = 0;
      while (i < paramContext.size())
      {
        localHashSet.add(((PackageInfo)paramContext.get(i)).packageName);
        i += 1;
      }
    }
    return localHashSet;
  }
  
  public static boolean m(Context paramContext)
  {
    return (paramContext != null) && (paramContext.getResources().getConfiguration().orientation == 1);
  }
  
  public static String n(Context paramContext)
  {
    String str = "Unknown";
    if (paramContext != null) {}
    try
    {
      int i = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionCode;
      str = String.valueOf(i);
      return str;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return "Unknown";
  }
  
  public static String o(Context paramContext)
  {
    String str = null;
    if (paramContext != null) {}
    try
    {
      str = paramContext.getPackageManager().getPackageInfo(paramContext.getPackageName(), 0).versionName;
      return str;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      str = b;
      new StringBuilder("Get app version exception,info:").append(paramContext.toString()).toString();
    }
    return "Unknown";
  }
  
  public static String p(Context paramContext)
  {
    Object localObject = "";
    if (paramContext != null) {
      localObject = paramContext.getPackageManager();
    }
    try
    {
      paramContext = ((PackageManager)localObject).getApplicationInfo(paramContext.getPackageName(), 0);
      if (paramContext != null)
      {
        paramContext = ((PackageManager)localObject).getApplicationLabel(paramContext);
        localObject = (String)paramContext;
        return (String)localObject;
      }
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      for (;;)
      {
        paramContext = null;
        continue;
        paramContext = "";
      }
    }
  }
  
  public static String q(Context paramContext)
  {
    String str3 = "";
    String str1 = str3;
    TelephonyManager localTelephonyManager;
    if (paramContext != null)
    {
      localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
      str1 = str3;
      if (localTelephonyManager == null) {}
    }
    try
    {
      if (a(paramContext, "android.permission.READ_PHONE_STATE"))
      {
        str1 = localTelephonyManager.getDeviceId();
        if (!TextUtils.isEmpty(str1)) {
          return str1;
        }
        str1 = b;
        str3 = D(paramContext);
        str1 = str3;
        if (TextUtils.isEmpty(str3))
        {
          str1 = b;
          str1 = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
          paramContext = b;
          new StringBuilder("getDeviceId: Secure.ANDROID_ID: ").append(str1).toString();
        }
        return str1;
      }
    }
    catch (Exception localException)
    {
      String str2;
      for (;;)
      {
        str2 = b;
        str2 = "";
      }
      return str2;
    }
  }
  
  public static String r(Context paramContext)
  {
    if (paramContext != null) {
      return g.b(q(paramContext));
    }
    return "";
  }
  
  public static String s(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        paramContext = ((TelephonyManager)paramContext.getSystemService("phone")).getNetworkOperatorName();
        return paramContext;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
    return "Unknown";
  }
  
  public static int[] t(Context paramContext)
  {
    int[] arrayOfInt = new int[8];
    int[] tmp6_5 = arrayOfInt;
    tmp6_5[0] = -1;
    int[] tmp10_6 = tmp6_5;
    tmp10_6[1] = -1;
    int[] tmp14_10 = tmp10_6;
    tmp14_10[2] = -1;
    int[] tmp18_14 = tmp14_10;
    tmp18_14[3] = -1;
    int[] tmp22_18 = tmp18_14;
    tmp22_18[4] = -1;
    int[] tmp26_22 = tmp22_18;
    tmp26_22[5] = -1;
    int[] tmp30_26 = tmp26_22;
    tmp30_26[6] = -1;
    int[] tmp35_30 = tmp30_26;
    tmp35_30[7] = -1;
    tmp35_30;
    if (paramContext != null) {
      for (;;)
      {
        try
        {
          paramContext = (TelephonyManager)paramContext.getSystemService("phone");
          Object localObject = paramContext.getCellLocation();
          if ((localObject instanceof GsmCellLocation))
          {
            localObject = (GsmCellLocation)localObject;
            arrayOfInt[0] = ((GsmCellLocation)localObject).getLac();
            arrayOfInt[1] = ((GsmCellLocation)localObject).getCid();
            if (Build.VERSION.SDK_INT <= 16) {
              break;
            }
            paramContext = paramContext.getAllCellInfo();
            if (paramContext != null)
            {
              paramContext = paramContext.iterator();
              if (paramContext.hasNext())
              {
                localObject = (CellInfo)paramContext.next();
                if (!(localObject instanceof CellInfoGsm)) {
                  continue;
                }
                paramContext = (CellInfoGsm)localObject;
                if ((paramContext == null) || (paramContext.getCellSignalStrength() == null)) {
                  break;
                }
                arrayOfInt[2] = paramContext.getCellSignalStrength().getDbm();
                return arrayOfInt;
              }
            }
          }
          else
          {
            if (!(localObject instanceof CdmaCellLocation)) {
              continue;
            }
            localObject = (CdmaCellLocation)localObject;
            arrayOfInt[3] = ((CdmaCellLocation)localObject).getSystemId();
            arrayOfInt[4] = ((CdmaCellLocation)localObject).getNetworkId();
            arrayOfInt[5] = ((CdmaCellLocation)localObject).getBaseStationId();
            arrayOfInt[6] = ((CdmaCellLocation)localObject).getBaseStationLongitude();
            arrayOfInt[7] = ((CdmaCellLocation)localObject).getBaseStationLatitude();
            continue;
          }
          paramContext = null;
        }
        catch (Exception paramContext)
        {
          paramContext.printStackTrace();
          return arrayOfInt;
        }
      }
    }
    return arrayOfInt;
  }
  
  public static String u(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        localObject = (WifiManager)paramContext.getSystemService("wifi");
        if (a(paramContext, "android.permission.ACCESS_WIFI_STATE")) {
          return ((WifiManager)localObject).getConnectionInfo().getSSID();
        }
        paramContext = b;
        return "-1";
      }
      catch (Exception paramContext)
      {
        Object localObject = b;
        new StringBuilder("Could not get mac address.").append(paramContext.toString()).toString();
      }
    }
    return "-1";
  }
  
  public static String v(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        DisplayMetrics localDisplayMetrics = new DisplayMetrics();
        ((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getMetrics(localDisplayMetrics);
        int i = localDisplayMetrics.widthPixels;
        int j = localDisplayMetrics.heightPixels;
        paramContext = String.valueOf(j) + "*" + String.valueOf(i);
        return paramContext;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
    return "Unknown";
  }
  
  public static String[] w(Context paramContext)
  {
    String[] arrayOfString = new String[2];
    arrayOfString[0] = "Unknown";
    arrayOfString[1] = "Unknown";
    if (paramContext != null)
    {
      if (paramContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", paramContext.getPackageName()) != 0)
      {
        arrayOfString[0] = "Unknown";
        return arrayOfString;
      }
      paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
      if (paramContext == null)
      {
        arrayOfString[0] = "Unknown";
        return arrayOfString;
      }
      if (paramContext.getNetworkInfo(1).getState() == NetworkInfo.State.CONNECTED)
      {
        arrayOfString[0] = "Wi-Fi";
        return arrayOfString;
      }
      paramContext = paramContext.getNetworkInfo(0);
      if (paramContext.getState() == NetworkInfo.State.CONNECTED)
      {
        arrayOfString[0] = "2G/3G";
        arrayOfString[1] = paramContext.getSubtypeName();
        return arrayOfString;
      }
    }
    return arrayOfString;
  }
  
  public static boolean x(Context paramContext)
  {
    boolean bool = false;
    if (paramContext != null) {
      bool = "Wi-Fi".equals(w(paramContext)[0]);
    }
    return bool;
  }
  
  public static Location y(Context paramContext)
  {
    if (paramContext != null) {
      try
      {
        LocationManager localLocationManager = (LocationManager)paramContext.getSystemService("location");
        if (a(paramContext, "android.permission.ACCESS_FINE_LOCATION"))
        {
          localObject = localLocationManager.getLastKnownLocation("gps");
          if (localObject != null)
          {
            paramContext = b;
            new StringBuilder("get location from gps:").append(((Location)localObject).getLatitude()).append(",").append(((Location)localObject).getLongitude()).toString();
            return (Location)localObject;
          }
        }
        if (a(paramContext, "android.permission.ACCESS_COARSE_LOCATION"))
        {
          paramContext = localLocationManager.getLastKnownLocation("network");
          if (paramContext != null)
          {
            localObject = b;
            new StringBuilder("get location from network:").append(paramContext.getLatitude()).append(",").append(paramContext.getLongitude()).toString();
            return paramContext;
          }
        }
      }
      catch (Exception paramContext)
      {
        Object localObject = b;
        paramContext.getMessage();
      }
    }
    for (;;)
    {
      return null;
      paramContext = b;
    }
  }
  
  public static boolean z(Context paramContext)
  {
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext != null)
      {
        boolean bool = paramContext.isConnectedOrConnecting();
        return bool;
      }
    }
    catch (Exception paramContext) {}
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */