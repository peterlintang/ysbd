package com.taobao.munion.utils;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.net.Proxy;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import org.apache.http.HttpHost;

public class m
{
  public static final int a = 1;
  public static final int b = 2;
  public static final int c = 3;
  public static final int d = 0;
  public static final int e = -1;
  public static final int f = -2;
  public static boolean g = false;
  public static final String h = "wifi";
  public static final String i = "gprs";
  public static final String j = "none";
  
  /* Error */
  public static java.util.HashMap<String, String> a(Context paramContext, android.net.Uri paramUri)
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_3
    //   2: aload_0
    //   3: invokestatic 43	com/taobao/munion/utils/m:b	(Landroid/content/Context;)Ljava/lang/String;
    //   6: astore 4
    //   8: new 45	java/util/HashMap
    //   11: dup
    //   12: invokespecial 46	java/util/HashMap:<init>	()V
    //   15: astore 5
    //   17: aload 4
    //   19: ifnonnull +5 -> 24
    //   22: aconst_null
    //   23: areturn
    //   24: aload 4
    //   26: ldc 48
    //   28: invokevirtual 54	java/lang/String:indexOf	(Ljava/lang/String;)I
    //   31: iconst_m1
    //   32: if_icmpne +13 -> 45
    //   35: aload 4
    //   37: ldc 56
    //   39: invokevirtual 59	java/lang/String:compareToIgnoreCase	(Ljava/lang/String;)I
    //   42: ifne +6 -> 48
    //   45: aload 5
    //   47: areturn
    //   48: aload_0
    //   49: invokevirtual 65	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   52: aload_1
    //   53: aconst_null
    //   54: ldc 67
    //   56: aconst_null
    //   57: aconst_null
    //   58: invokevirtual 73	android/content/ContentResolver:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   61: astore_0
    //   62: aload_0
    //   63: invokeinterface 79 1 0
    //   68: ifeq +104 -> 172
    //   71: aload_0
    //   72: invokeinterface 83 1 0
    //   77: ifle +84 -> 161
    //   80: aload 5
    //   82: ldc 85
    //   84: aload_0
    //   85: aload_0
    //   86: ldc 87
    //   88: invokeinterface 90 2 0
    //   93: invokeinterface 94 2 0
    //   98: invokevirtual 98	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   101: pop
    //   102: aload 5
    //   104: ldc 100
    //   106: aload_0
    //   107: aload_0
    //   108: ldc 100
    //   110: invokeinterface 90 2 0
    //   115: invokeinterface 94 2 0
    //   120: invokevirtual 98	java/util/HashMap:put	(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   123: pop
    //   124: aload 4
    //   126: aload_0
    //   127: aload_0
    //   128: ldc 102
    //   130: invokeinterface 90 2 0
    //   135: invokeinterface 94 2 0
    //   140: invokevirtual 106	java/lang/String:contains	(Ljava/lang/CharSequence;)Z
    //   143: istore_2
    //   144: iload_2
    //   145: ifeq +16 -> 161
    //   148: aload_0
    //   149: ifnull +9 -> 158
    //   152: aload_0
    //   153: invokeinterface 109 1 0
    //   158: aload 5
    //   160: areturn
    //   161: aload_0
    //   162: invokeinterface 112 1 0
    //   167: istore_2
    //   168: iload_2
    //   169: ifne -98 -> 71
    //   172: aload_0
    //   173: ifnull +9 -> 182
    //   176: aload_0
    //   177: invokeinterface 109 1 0
    //   182: aconst_null
    //   183: areturn
    //   184: astore_1
    //   185: aload_3
    //   186: astore_0
    //   187: aload_0
    //   188: ifnull +9 -> 197
    //   191: aload_0
    //   192: invokeinterface 109 1 0
    //   197: aload_1
    //   198: athrow
    //   199: astore_0
    //   200: aconst_null
    //   201: astore_0
    //   202: aload_0
    //   203: ifnull -21 -> 182
    //   206: goto -30 -> 176
    //   209: astore_1
    //   210: goto -23 -> 187
    //   213: astore_1
    //   214: goto -12 -> 202
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	217	0	paramContext	Context
    //   0	217	1	paramUri	android.net.Uri
    //   143	26	2	bool	boolean
    //   1	185	3	localObject	Object
    //   6	119	4	str	String
    //   15	144	5	localHashMap	java.util.HashMap
    // Exception table:
    //   from	to	target	type
    //   48	62	184	finally
    //   48	62	199	java/lang/Exception
    //   62	71	209	finally
    //   71	144	209	finally
    //   161	168	209	finally
    //   62	71	213	java/lang/Exception
    //   71	144	213	java/lang/Exception
    //   161	168	213	java/lang/Exception
  }
  
  public static boolean a(Context paramContext)
  {
    boolean bool = false;
    if (b(paramContext) != null) {
      bool = true;
    }
    return bool;
  }
  
  public static String b(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null) {
      return null;
    }
    paramContext = paramContext.getAllNetworkInfo();
    if (paramContext != null)
    {
      int k = 0;
      while (k < paramContext.length)
      {
        if (paramContext[k] != null)
        {
          Object localObject = paramContext[k].getState();
          if ((localObject == NetworkInfo.State.CONNECTED) || (localObject == NetworkInfo.State.CONNECTING))
          {
            localObject = paramContext[k].getExtraInfo();
            return paramContext[k].getTypeName() + " " + paramContext[k].getSubtypeName() + (String)localObject;
          }
        }
        k += 1;
      }
    }
    return null;
  }
  
  public static int c(Context paramContext)
  {
    int k = ((TelephonyManager)paramContext.getSystemService("phone")).getSimState();
    if (k == 5) {
      return 0;
    }
    if (k == 1) {
      return -1;
    }
    return -2;
  }
  
  public static int d(Context paramContext)
  {
    if (c(paramContext) == 0)
    {
      Object localObject = (TelephonyManager)paramContext.getSystemService("phone");
      paramContext = ((TelephonyManager)localObject).getNetworkOperatorName().replaceAll(" ", "");
      localObject = ((TelephonyManager)localObject).getNetworkOperator();
      if (localObject == null) {
        break label255;
      }
      paramContext = (Context)localObject;
    }
    label255:
    for (;;)
    {
      if ((paramContext == null) || (paramContext.length() == 0)) {
        return -2;
      }
      if ((paramContext.compareToIgnoreCase("中国移动") == 0) || (paramContext.compareToIgnoreCase("CMCC") == 0) || (paramContext.compareToIgnoreCase("ChinaMobile") == 0) || (paramContext.compareToIgnoreCase("46000") == 0)) {
        return 1;
      }
      if ((paramContext.compareToIgnoreCase("中国电信") == 0) || (paramContext.compareToIgnoreCase("ChinaTelecom") == 0) || (paramContext.compareToIgnoreCase("46003") == 0) || (paramContext.compareToIgnoreCase("ChinaTelcom") == 0) || (paramContext.compareToIgnoreCase("460003") == 0)) {
        return 3;
      }
      if ((paramContext.compareToIgnoreCase("中国联通") == 0) || (paramContext.compareToIgnoreCase("ChinaUnicom") == 0) || (paramContext.compareToIgnoreCase("46001") == 0) || (paramContext.compareToIgnoreCase("CU-GSM") == 0) || (paramContext.compareToIgnoreCase("CHN-CUGSM") == 0) || (paramContext.compareToIgnoreCase("CHNUnicom") == 0)) {
        return 2;
      }
      paramContext = o.b();
      if ((paramContext.startsWith("46000")) || (paramContext.startsWith("46002")) || (paramContext.startsWith("46007"))) {
        return 1;
      }
      if (paramContext.startsWith("46001")) {
        return 2;
      }
      if (paramContext.startsWith("46003")) {
        return 3;
      }
      return -2;
      return -1;
    }
  }
  
  public static HttpHost e(Context paramContext)
  {
    Object localObject = null;
    if (Build.VERSION.SDK_INT < 11)
    {
      try
      {
        paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
        if ((paramContext == null) || (!paramContext.isAvailable()) || (paramContext.getType() != 0)) {
          break label113;
        }
        paramContext = Proxy.getDefaultHost();
        int k = Proxy.getDefaultPort();
        if (paramContext == null) {
          break label113;
        }
        return new HttpHost(paramContext, k);
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          paramContext.printStackTrace();
          paramContext = null;
        }
      }
    }
    else
    {
      String str1 = System.getProperty("https.proxyHost");
      String str2 = System.getProperty("https.proxyPort");
      paramContext = (Context)localObject;
      if (!TextUtils.isEmpty(str1)) {
        paramContext = new HttpHost(str1, Integer.parseInt(str2));
      }
      return paramContext;
    }
    label113:
    return null;
  }
  
  public static String f(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext == null) {
      return "none";
    }
    Object localObject = paramContext.getNetworkInfo(1);
    if (localObject != null)
    {
      localObject = ((NetworkInfo)localObject).getState();
      if (NetworkInfo.State.CONNECTED == localObject) {
        return "wifi";
      }
    }
    paramContext = paramContext.getNetworkInfo(0);
    if (paramContext != null)
    {
      paramContext = paramContext.getState();
      if (NetworkInfo.State.CONNECTED == paramContext) {
        return "gprs";
      }
    }
    return "none";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */