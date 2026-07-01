package com.ireadercity.b2;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.ireadercity.b2.b.q;
import com.ireadercity.b2.bean.j;
import com.ireadercity.b2.h.m;
import com.ireadercity.b2.h.u;
import com.ireadercity.b2.h.y;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public final class a
{
  public static String A = "http://www." + y + "/GoodBooks";
  public static String B = "http://d." + y + "/GoodBooks";
  public static final Boolean C = Boolean.valueOf(true);
  public static int D;
  public static int E;
  public static String F;
  public static String G = "Android";
  public static String H = "com.youloft.glsc";
  public static String I = "books by AireaderCity_1234567890";
  public static int J = 60000;
  public static int K = 80;
  public static int L = 50;
  public static int M = 1;
  public static int N = 1;
  public static String O = "e69dfe940a46ee64200a0768e93bd2da";
  public static String P = "3aa3e6644ad3451a9c943a3e27eb3b47";
  public static int Q = 0;
  public static String R = "";
  public static boolean S;
  public static int T = 20;
  public static int U;
  public static float V = D / 320.0F;
  public static float W = E / 480.0F;
  public static boolean X = false;
  public static boolean Y = false;
  public static int Z = 120;
  public static boolean a = true;
  public static int aa = 80;
  public static int ab = 140;
  public static int ac = 200;
  public static int ad = 94;
  public static int ae = 133;
  public static boolean af = false;
  public static Activity ag;
  public static String ah = "yjf:易积分:1:1:1:::wp:万普:1:1:1";
  public static boolean ai = true;
  public static boolean aj = false;
  public static int ak;
  public static String al = "http://www.youloft.com/iOPDS/OPDSList_Android.txt";
  public static ArrayList<com.ireadercity.b2.opds.b> am = new ArrayList();
  static long an = new Date().getTime();
  static long ao = Build.VERSION.SDK_INT;
  static long ap = 0L;
  public static boolean aq = false;
  public static boolean ar = false;
  public static String[] as = { "xiaoyan", "nannan", "xiaojing", "xiaofeng" };
  public static String[] at = { "晓燕-普通话(女)", "楠楠-普通话(女童)", "晓婧-普通话(女)", "晓峰-普通话(男)" };
  public static boolean au = false;
  public static boolean av = false;
  public static String b = "54380";
  public static String c = "54328";
  public static String d = "54726";
  public static boolean e = false;
  public static int f = 50;
  public static int g = 1;
  public static int h = 5;
  public static boolean i = true;
  public static long j = 300000L;
  public static String k;
  public static final String l = Environment.getExternalStorageDirectory() + "/AIReader/b2";
  public static final String m = Environment.getExternalStorageDirectory() + "/AIReader";
  public static final String n = l + "/.temp";
  public static final String o = l + "/.cover";
  public static final String p = m + "/.temp_cover";
  public static final String q = l + "/.keydir/";
  public static final String r = l + "/.opds_cover";
  public static final String s = l + "/wallpaper/";
  public static final String t = l + "/fonts/";
  public static String u = l + "/.remembers/score_file.bin";
  public static String v = l + "/.remembers/date.txt";
  public static String w = l + "/.remembers/number.txt";
  public static String x = l + "/.remembers/clouddata.txt";
  public static String y = "ireadercity.com";
  public static String z = "https://www." + y + "/GoodBooks";
  
  public static int a(Context paramContext, float paramFloat)
  {
    return (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
  }
  
  /* Error */
  public static void a()
  {
    // Byte code:
    //   0: getstatic 292	com/ireadercity/b2/a:aj	Z
    //   3: ifeq +107 -> 110
    //   6: getstatic 296	com/ireadercity/b2/a:al	Ljava/lang/String;
    //   9: astore_1
    //   10: getstatic 188	com/ireadercity/b2/a:x	Ljava/lang/String;
    //   13: astore_0
    //   14: aload_1
    //   15: invokestatic 382	com/ireadercity/b2/opds/a:a	(Ljava/lang/String;)Ljava/io/InputStream;
    //   18: astore_1
    //   19: new 384	java/io/File
    //   22: dup
    //   23: aload_0
    //   24: invokespecial 385	java/io/File:<init>	(Ljava/lang/String;)V
    //   27: astore_2
    //   28: new 387	java/io/FileOutputStream
    //   31: dup
    //   32: aload_2
    //   33: invokespecial 390	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   36: astore_3
    //   37: sipush 4096
    //   40: newarray <illegal type>
    //   42: astore 4
    //   44: aload_1
    //   45: aload 4
    //   47: invokevirtual 396	java/io/InputStream:read	([B)I
    //   50: iconst_m1
    //   51: if_icmpeq +18 -> 69
    //   54: aload_3
    //   55: aload 4
    //   57: invokevirtual 400	java/io/FileOutputStream:write	([B)V
    //   60: goto -16 -> 44
    //   63: astore_0
    //   64: aload_0
    //   65: invokevirtual 403	java/net/MalformedURLException:printStackTrace	()V
    //   68: return
    //   69: aload_3
    //   70: invokevirtual 406	java/io/FileOutputStream:flush	()V
    //   73: aload_3
    //   74: invokevirtual 409	java/io/FileOutputStream:close	()V
    //   77: aload_2
    //   78: invokevirtual 413	java/io/File:exists	()Z
    //   81: ifeq -13 -> 68
    //   84: aload_0
    //   85: invokestatic 418	com/ireadercity/b2/b/q:c	(Ljava/lang/String;)Ljava/lang/String;
    //   88: invokestatic 420	com/ireadercity/b2/a:a	(Ljava/lang/String;)V
    //   91: return
    //   92: astore_0
    //   93: aload_0
    //   94: invokevirtual 421	java/io/FileNotFoundException:printStackTrace	()V
    //   97: return
    //   98: astore_0
    //   99: aload_0
    //   100: invokevirtual 422	java/lang/Exception:printStackTrace	()V
    //   103: return
    //   104: astore_0
    //   105: aload_0
    //   106: invokevirtual 423	java/io/IOException:printStackTrace	()V
    //   109: return
    //   110: new 384	java/io/File
    //   113: dup
    //   114: getstatic 188	com/ireadercity/b2/a:x	Ljava/lang/String;
    //   117: invokespecial 385	java/io/File:<init>	(Ljava/lang/String;)V
    //   120: invokevirtual 413	java/io/File:exists	()Z
    //   123: ifeq +13 -> 136
    //   126: getstatic 188	com/ireadercity/b2/a:x	Ljava/lang/String;
    //   129: invokestatic 418	com/ireadercity/b2/b/q:c	(Ljava/lang/String;)Ljava/lang/String;
    //   132: invokestatic 420	com/ireadercity/b2/a:a	(Ljava/lang/String;)V
    //   135: return
    //   136: ldc -4
    //   138: invokestatic 420	com/ireadercity/b2/a:a	(Ljava/lang/String;)V
    //   141: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   13	11	0	str	String
    //   63	22	0	localMalformedURLException	MalformedURLException
    //   92	2	0	localFileNotFoundException	java.io.FileNotFoundException
    //   98	2	0	localException	Exception
    //   104	2	0	localIOException	IOException
    //   9	36	1	localObject	Object
    //   27	51	2	localFile	File
    //   36	38	3	localFileOutputStream	java.io.FileOutputStream
    //   42	14	4	arrayOfByte	byte[]
    // Exception table:
    //   from	to	target	type
    //   14	44	63	java/net/MalformedURLException
    //   44	60	63	java/net/MalformedURLException
    //   69	91	63	java/net/MalformedURLException
    //   14	44	92	java/io/FileNotFoundException
    //   44	60	92	java/io/FileNotFoundException
    //   69	91	92	java/io/FileNotFoundException
    //   6	14	98	java/lang/Exception
    //   14	44	98	java/lang/Exception
    //   44	60	98	java/lang/Exception
    //   64	68	98	java/lang/Exception
    //   69	91	98	java/lang/Exception
    //   93	97	98	java/lang/Exception
    //   105	109	98	java/lang/Exception
    //   14	44	104	java/io/IOException
    //   44	60	104	java/io/IOException
    //   69	91	104	java/io/IOException
  }
  
  public static void a(Activity paramActivity)
  {
    if (y.a(paramActivity.getApplicationContext()).booleanValue())
    {
      aj = true;
      paramActivity = ag;
      int i1 = com.ireadercity.b2.f.a.a();
      try
      {
        paramActivity = new URL("http://www.bjtime.cn").openConnection();
        paramActivity.connect();
        paramActivity = new Date(paramActivity.getDate());
        if (paramActivity != null)
        {
          int i2 = paramActivity.getYear();
          int i3 = paramActivity.getMonth();
          i2 = paramActivity.getDay() + (i2 * 10000 + i3 * 100);
          if (i2 != i1)
          {
            ak = i2;
            ai = false;
          }
        }
        else
        {
          return;
        }
      }
      catch (MalformedURLException paramActivity)
      {
        for (;;)
        {
          paramActivity.printStackTrace();
          paramActivity = null;
        }
      }
      catch (IOException paramActivity)
      {
        for (;;)
        {
          paramActivity.printStackTrace();
          paramActivity = null;
        }
        ai = true;
        return;
      }
    }
    aj = false;
  }
  
  public static void a(Context paramContext)
  {
    if (Q == 0) {}
    try
    {
      R = paramContext.getPackageName();
      Q = paramContext.getPackageManager().getPackageInfo(R, 0).versionCode;
      new StringBuilder("appPackageName=").append(R).append(" appVersion=").append(Q).toString();
      return;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  private static void a(String paramString)
  {
    if (am == null)
    {
      am = new ArrayList();
      if ((!"".equals(paramString)) && (!"99".equals(paramString))) {
        break label153;
      }
      am.add(new com.ireadercity.b2.opds.b("云端书库，您的专属书库", ""));
      am.add(new com.ireadercity.b2.opds.b("Feedbooks", "http://www.feedbooks.com/catalog.atom"));
      am.add(new com.ireadercity.b2.opds.b("书仓，你的数字书房", "http://www.shucang.org/s/index.php"));
      am.add(new com.ireadercity.b2.opds.b("Gutenberg", "http://m.gutenberg.org/ebooks/?format=opds"));
      am.add(new com.ireadercity.b2.opds.b("CBETA 電子佛典", "http://www.cbeta.org/opds"));
    }
    for (;;)
    {
      return;
      if (am.size() <= 0) {
        break;
      }
      am.clear();
      break;
      label153:
      am.add(new com.ireadercity.b2.opds.b("云端书库，您的专属书库", ""));
      paramString = paramString.split("\r\n");
      int i1 = 0;
      while (i1 < paramString.length)
      {
        String[] arrayOfString = paramString[i1].split("::");
        am.add(new com.ireadercity.b2.opds.b(arrayOfString[0], arrayOfString[1]));
        i1 += 1;
      }
    }
  }
  
  public static ArrayList<com.ireadercity.b2.opds.b> b()
  {
    if (am.size() == 0)
    {
      if (new File(x).exists()) {
        a(q.c(x));
      }
      for (;;)
      {
        return am;
        a("");
      }
    }
    return am;
  }
  
  public static void b(Activity paramActivity)
  {
    ag = paramActivity;
    Object localObject = paramActivity.getWindowManager().getDefaultDisplay();
    D = ((Display)localObject).getWidth();
    E = ((Display)localObject).getHeight();
    V = D / 320.0F;
    W = E / 480.0F;
    S = y.a(paramActivity).booleanValue();
    localObject = paramActivity.getSharedPreferences("MacroInfo", 0);
    if ((F == null) || (F.length() < 32))
    {
      F = ((SharedPreferences)localObject).getString("DEVICEID", null);
      if (y.c() == null) {
        y.f(F);
      }
    }
    if ((F == null) || (F.length() < 32))
    {
      F = y.c();
      new StringBuilder("******getSDCardDeviceID=").append(F).toString();
    }
    if ((F == null) || (F.length() < 32))
    {
      F = m.a(paramActivity);
      localObject = ((SharedPreferences)localObject).edit();
      ((SharedPreferences.Editor)localObject).putString("DEVICEID", F);
      ((SharedPreferences.Editor)localObject).commit();
      y.f(F);
    }
    U = Build.VERSION.SDK_INT;
    k = "ok";
    new StringBuilder("DEVICEID=").append(F).append(" ISCONNECTED=").append(S).append(" DEVICESDKVERSION=").append(U).append(" Secure.ANDROID_ID=android_id SCREENWIDTH=").append(D).append(" SCREENHEIGHT=").append(E).toString();
    Y = u.a(paramActivity);
    Y = u.b(paramActivity);
    j.p = j.a(paramActivity);
    Z = a(paramActivity, 100.0F);
    aa = a(paramActivity, 75.0F);
    ab = a(paramActivity, 200.0F);
    ac = a(paramActivity, 140.0F);
    ad = a(paramActivity, 100.0F);
    ae = a(paramActivity, 70.0F);
    localObject = PreferenceManager.getDefaultSharedPreferences(paramActivity).getString("Domain", "");
    if ((localObject != null) && (((String)localObject).length() > 0))
    {
      y = (String)localObject;
      z = z.replaceAll("ireadercity.com", (String)localObject);
      A = A.replaceAll("ireadercity.com", (String)localObject);
      B = B.replaceAll("ireadercity.com", (String)localObject);
    }
    K = a(paramActivity, L);
  }
  
  public static String c()
  {
    return n + "/" + UUID.randomUUID().toString() + ".apk";
  }
  
  public static void d()
  {
    if (new Date().getTime() - an < ap) {
      return;
    }
    b localb = new b();
    localb.start();
    new StringBuilder().append(localb.getId()).append(" Macro.GC send").toString();
    an = new Date().getTime();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */