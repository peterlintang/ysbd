package com.ireadercity.b2.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.preference.PreferenceManager;
import com.ireadercity.b2.a;
import com.ireadercity.b2.b.t;
import com.ireadercity.b2.bean.NetBookInfo;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.methods.HttpRequestBase;
import org.apache.http.message.BasicNameValuePair;

public final class y
{
  private static String a = a.q + "DEVICE.txt";
  
  public static Boolean a(Context paramContext)
  {
    paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
    if ((paramContext != null) && (paramContext.getState() == NetworkInfo.State.CONNECTED)) {
      return Boolean.valueOf(true);
    }
    return Boolean.valueOf(false);
  }
  
  public static String a(String paramString)
  {
    if (paramString == null) {}
    int i;
    do
    {
      return paramString;
      i = paramString.indexOf(".jpg");
      if (i != -1) {
        return paramString.substring(0, i + 4);
      }
      i = paramString.indexOf(".JPG");
      if (i != -1) {
        return paramString.substring(0, i + 4);
      }
      i = paramString.indexOf(".jpeg");
      if (i != -1) {
        return paramString.substring(0, i + 5);
      }
      i = paramString.indexOf(".JPEG");
      if (i != -1) {
        return paramString.substring(0, i + 5);
      }
      i = paramString.indexOf(".png");
      if (i != -1) {
        return paramString.substring(0, i + 4);
      }
      i = paramString.indexOf(".PNG");
      if (i != -1) {
        return paramString.substring(0, i + 4);
      }
      i = paramString.indexOf(".gif");
      if (i != -1) {
        return paramString.substring(0, i + 4);
      }
      i = paramString.indexOf(".GIF");
    } while (i == -1);
    return paramString.substring(0, i + 4);
  }
  
  public static String a(String paramString, int paramInt)
  {
    String str = paramString;
    if (paramString == null) {}
    for (str = ""; str.length() < paramInt; str = " " + str) {}
    return str;
  }
  
  public static List<NameValuePair> a()
  {
    ArrayList localArrayList = new ArrayList();
    localArrayList.add(new BasicNameValuePair("deviceID", a.F));
    localArrayList.add(new BasicNameValuePair("passID", a.I));
    localArrayList.add(new BasicNameValuePair("deviceType", a.G));
    localArrayList.add(new BasicNameValuePair("appID", a.H));
    localArrayList.add(new BasicNameValuePair("ver", String.valueOf(a.Q)));
    localArrayList.add(new BasicNameValuePair("appPackageName", a.R));
    return localArrayList;
  }
  
  public static void a(HttpRequestBase paramHttpRequestBase)
  {
    paramHttpRequestBase.setHeader("User-Agent", "books by AireaderCity");
  }
  
  public static boolean a(char paramChar)
  {
    return ((paramChar >= 'A') && (paramChar <= 'Z')) || ((paramChar >= 'a') && (paramChar <= 'z')) || (paramChar == '\'');
  }
  
  public static boolean a(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {
      return false;
    }
    try
    {
      boolean bool = b(paramString1, l(paramString2));
      return bool;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return false;
  }
  
  public static Boolean b(Context paramContext)
  {
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    if (paramContext != null) {}
    for (paramContext = paramContext.getNetworkInfo(1);; paramContext = null)
    {
      if (paramContext == null) {}
      for (boolean bool = false;; bool = paramContext.isConnected()) {
        return Boolean.valueOf(bool);
      }
    }
  }
  
  public static String b(String paramString)
  {
    if (paramString == null) {
      return paramString;
    }
    int i = paramString.lastIndexOf("../");
    if (i != -1) {
      i += 3;
    }
    for (;;)
    {
      return paramString.substring(i);
      i = 0;
    }
  }
  
  public static HashMap<String, String> b()
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("User-Agent", "books by AireaderCity");
    return localHashMap;
  }
  
  /* Error */
  public static boolean b(String paramString1, String paramString2)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnull +7 -> 8
    //   4: aload_1
    //   5: ifnonnull +5 -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: new 202	java/io/File
    //   13: dup
    //   14: aload_1
    //   15: invokespecial 203	java/io/File:<init>	(Ljava/lang/String;)V
    //   18: astore_2
    //   19: aconst_null
    //   20: astore_1
    //   21: new 205	java/io/RandomAccessFile
    //   24: dup
    //   25: aload_2
    //   26: ldc -49
    //   28: invokespecial 210	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   31: astore_2
    //   32: aload_2
    //   33: astore_1
    //   34: aload_2
    //   35: aload_0
    //   36: invokevirtual 213	java/io/RandomAccessFile:writeUTF	(Ljava/lang/String;)V
    //   39: aload_2
    //   40: invokevirtual 216	java/io/RandomAccessFile:close	()V
    //   43: iconst_1
    //   44: ireturn
    //   45: astore_0
    //   46: aload_0
    //   47: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   50: goto -7 -> 43
    //   53: astore_3
    //   54: aconst_null
    //   55: astore_0
    //   56: aload_0
    //   57: astore_1
    //   58: aload_3
    //   59: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   62: aload_0
    //   63: ifnull -55 -> 8
    //   66: aload_0
    //   67: invokevirtual 216	java/io/RandomAccessFile:close	()V
    //   70: iconst_0
    //   71: ireturn
    //   72: astore_0
    //   73: aload_0
    //   74: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   77: iconst_0
    //   78: ireturn
    //   79: astore_0
    //   80: aload_1
    //   81: ifnull +7 -> 88
    //   84: aload_1
    //   85: invokevirtual 216	java/io/RandomAccessFile:close	()V
    //   88: aload_0
    //   89: athrow
    //   90: astore_1
    //   91: aload_1
    //   92: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   95: goto -7 -> 88
    //   98: astore_0
    //   99: goto -19 -> 80
    //   102: astore_3
    //   103: aload_2
    //   104: astore_0
    //   105: goto -49 -> 56
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	108	0	paramString1	String
    //   0	108	1	paramString2	String
    //   18	86	2	localObject	Object
    //   53	6	3	localException1	Exception
    //   102	1	3	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   39	43	45	java/lang/Exception
    //   21	32	53	java/lang/Exception
    //   66	70	72	java/lang/Exception
    //   21	32	79	finally
    //   84	88	90	java/lang/Exception
    //   34	39	98	finally
    //   58	62	98	finally
    //   34	39	102	java/lang/Exception
  }
  
  public static int c(String paramString)
  {
    int j = 0;
    if (paramString == null) {
      return 0;
    }
    int i = 0;
    for (;;)
    {
      j = paramString.indexOf("../", j) + 3;
      if (j == 2) {
        break;
      }
      i += 1;
    }
    return i;
  }
  
  public static String c()
  {
    try
    {
      String str = h(a);
      new StringBuilder("dataRead=").append(str).toString();
      str = t.d(str);
      return str;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return null;
  }
  
  public static void c(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    SharedPreferences.Editor localEditor = localSharedPreferences.edit();
    long l = localSharedPreferences.getLong("LastSyncDateDayly", 0L);
    new StringBuilder("lastSyncDateDayly=").append(l).append(" new Date().getTime()=").append(new Date().getTime()).toString();
    if (new Date().getTime() - l > 86400000L)
    {
      if (PreferenceManager.getDefaultSharedPreferences(paramContext).getInt("notremindversion", a.Q - 1) < a.Q) {
        new d(paramContext).execute(new Boolean[] { Boolean.valueOf(true) });
      }
      new j(paramContext).execute(new Boolean[] { Boolean.valueOf(true) });
      new i(paramContext).execute(new Boolean[] { Boolean.valueOf(true) });
      new l(paramContext).execute(new Boolean[] { Boolean.valueOf(true) });
      localEditor.putLong("LastSyncDateDayly", new Date().getTime());
    }
    l = localSharedPreferences.getLong("lastSyncDateHourly", 0L);
    if (new Date().getTime() - l > 3600000L)
    {
      new c(paramContext).execute(new Boolean[] { Boolean.valueOf(true) });
      localEditor.putLong("lastSyncDateHourly", new Date().getTime());
    }
    localEditor.commit();
  }
  
  public static void d(Context paramContext)
  {
    new k(paramContext).execute(new Boolean[] { Boolean.valueOf(true) });
  }
  
  public static boolean d(String paramString)
  {
    return (paramString == null) || (paramString.trim().length() == 0);
  }
  
  public static String e(String paramString)
  {
    int i = 0;
    char[] arrayOfChar = new char[16];
    char[] tmp10_8 = arrayOfChar;
    tmp10_8[0] = 48;
    char[] tmp16_10 = tmp10_8;
    tmp16_10[1] = 49;
    char[] tmp22_16 = tmp16_10;
    tmp22_16[2] = 50;
    char[] tmp28_22 = tmp22_16;
    tmp28_22[3] = 51;
    char[] tmp34_28 = tmp28_22;
    tmp34_28[4] = 52;
    char[] tmp40_34 = tmp34_28;
    tmp40_34[5] = 53;
    char[] tmp46_40 = tmp40_34;
    tmp46_40[6] = 54;
    char[] tmp53_46 = tmp46_40;
    tmp53_46[7] = 55;
    char[] tmp60_53 = tmp53_46;
    tmp60_53[8] = 56;
    char[] tmp67_60 = tmp60_53;
    tmp67_60[9] = 57;
    char[] tmp74_67 = tmp67_60;
    tmp74_67[10] = 97;
    char[] tmp81_74 = tmp74_67;
    tmp81_74[11] = 98;
    char[] tmp88_81 = tmp81_74;
    tmp88_81[12] = 99;
    char[] tmp95_88 = tmp88_81;
    tmp95_88[13] = 100;
    char[] tmp102_95 = tmp95_88;
    tmp102_95[14] = 101;
    char[] tmp109_102 = tmp102_95;
    tmp109_102[15] = 102;
    tmp109_102;
    for (;;)
    {
      Object localObject;
      int k;
      int j;
      try
      {
        paramString = paramString.getBytes();
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString);
        paramString = ((MessageDigest)localObject).digest();
        k = paramString.length;
        localObject = new char[k * 2];
        j = 0;
      }
      catch (Exception paramString)
      {
        return null;
      }
      paramString = new String((char[])localObject);
      return paramString;
      while (i < k)
      {
        int m = paramString[i];
        int n = j + 1;
        localObject[j] = arrayOfChar[(m >>> 4 & 0xF)];
        j = n + 1;
        localObject[n] = arrayOfChar[(m & 0xF)];
        i += 1;
      }
    }
  }
  
  public static void e(Context paramContext)
  {
    SharedPreferences localSharedPreferences = PreferenceManager.getDefaultSharedPreferences(paramContext);
    a.N = localSharedPreferences.getInt("AdsFree", 1);
    a.M = localSharedPreferences.getInt("AdsPlatForm", 0);
    a.O = localSharedPreferences.getString("AdsGuoHeadID", a.O);
    a.P = localSharedPreferences.getString("AdsMogoID", a.P);
    a.i = localSharedPreferences.getBoolean("useumeng", true);
    if (localSharedPreferences.getInt("AdsFree", -1) == -1) {
      new c(paramContext).execute(new Boolean[] { Boolean.valueOf(true) });
    }
  }
  
  public static boolean f(String paramString)
  {
    if (paramString == null) {
      return false;
    }
    try
    {
      boolean bool = b(t.c(paramString), a);
      return bool;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return false;
  }
  
  public static String g(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    try
    {
      paramString = h(l(paramString));
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  /* Error */
  public static String h(String paramString)
  {
    // Byte code:
    //   0: aload_0
    //   1: ifnonnull +5 -> 6
    //   4: aconst_null
    //   5: areturn
    //   6: new 202	java/io/File
    //   9: dup
    //   10: aload_0
    //   11: invokespecial 203	java/io/File:<init>	(Ljava/lang/String;)V
    //   14: astore_0
    //   15: aload_0
    //   16: invokevirtual 395	java/io/File:exists	()Z
    //   19: ifeq -15 -> 4
    //   22: new 205	java/io/RandomAccessFile
    //   25: dup
    //   26: aload_0
    //   27: ldc_w 397
    //   30: invokespecial 210	java/io/RandomAccessFile:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   33: astore_1
    //   34: aload_1
    //   35: astore_0
    //   36: aload_1
    //   37: invokevirtual 400	java/io/RandomAccessFile:readUTF	()Ljava/lang/String;
    //   40: astore_2
    //   41: aload_1
    //   42: invokevirtual 216	java/io/RandomAccessFile:close	()V
    //   45: aload_2
    //   46: areturn
    //   47: astore_0
    //   48: aload_0
    //   49: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   52: aload_2
    //   53: areturn
    //   54: astore_2
    //   55: aconst_null
    //   56: astore_1
    //   57: aload_1
    //   58: astore_0
    //   59: aload_2
    //   60: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   63: aload_1
    //   64: ifnull -60 -> 4
    //   67: aload_1
    //   68: invokevirtual 216	java/io/RandomAccessFile:close	()V
    //   71: aconst_null
    //   72: areturn
    //   73: astore_0
    //   74: aload_0
    //   75: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   78: aconst_null
    //   79: areturn
    //   80: astore_1
    //   81: aconst_null
    //   82: astore_0
    //   83: aload_0
    //   84: ifnull +7 -> 91
    //   87: aload_0
    //   88: invokevirtual 216	java/io/RandomAccessFile:close	()V
    //   91: aload_1
    //   92: athrow
    //   93: astore_0
    //   94: aload_0
    //   95: invokevirtual 176	java/lang/Exception:printStackTrace	()V
    //   98: goto -7 -> 91
    //   101: astore_1
    //   102: goto -19 -> 83
    //   105: astore_2
    //   106: goto -49 -> 57
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	paramString	String
    //   33	35	1	localRandomAccessFile	java.io.RandomAccessFile
    //   80	12	1	localObject1	Object
    //   101	1	1	localObject2	Object
    //   40	13	2	str	String
    //   54	6	2	localException1	Exception
    //   105	1	2	localException2	Exception
    // Exception table:
    //   from	to	target	type
    //   41	45	47	java/lang/Exception
    //   22	34	54	java/lang/Exception
    //   67	71	73	java/lang/Exception
    //   22	34	80	finally
    //   87	91	93	java/lang/Exception
    //   36	41	101	finally
    //   59	63	101	finally
    //   36	41	105	java/lang/Exception
  }
  
  public static String i(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    if (paramString.lastIndexOf("\\") >= 0) {}
    for (int i = paramString.lastIndexOf("\\");; i = paramString.lastIndexOf("/")) {
      return paramString.substring(i + 1);
    }
  }
  
  public static String j(String paramString)
  {
    paramString = i(paramString);
    if (paramString == null) {
      return null;
    }
    return a.q + paramString + ".info";
  }
  
  public static String k(String paramString)
  {
    NetBookInfo localNetBookInfo = new NetBookInfo();
    localNetBookInfo.k(paramString);
    paramString = i(localNetBookInfo.h());
    if (paramString == null) {
      return null;
    }
    return a.o + "/" + paramString + "x";
  }
  
  private static String l(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    paramString = i(paramString);
    return a.q + paramString + ".ktxt";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */