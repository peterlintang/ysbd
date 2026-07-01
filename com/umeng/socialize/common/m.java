package com.umeng.socialize.common;

import android.app.Dialog;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore.Images.Media;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.view.WindowManager.BadTokenException;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.controller.RequestType;
import com.umeng.socialize.controller.UMServiceFactory;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socialize.media.UMRichMedia;
import com.umeng.socialize.media.UMediaObject;
import com.umeng.socialize.media.UMediaObject.MediaType;
import com.umeng.socialize.media.UMusic;
import com.umeng.socom.Log;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class m
{
  protected static final String a = m.class.getName();
  private static String b;
  private static String c;
  private static String d;
  private static Pattern e = null;
  private static int f = 0;
  
  public static Uri a(Context paramContext, String paramString)
  {
    try
    {
      paramContext = Uri.parse(MediaStore.Images.Media.insertImage(paramContext.getContentResolver(), paramString, "umeng_social_shareimg", null));
      return paramContext;
    }
    catch (IllegalArgumentException paramContext)
    {
      Log.b("SOCIAL", "", paramContext);
      return null;
    }
    catch (Exception paramContext)
    {
      Log.b("SOCIAL", "", paramContext);
    }
    return null;
  }
  
  public static Bundle a(String paramString)
  {
    try
    {
      paramString = new URL(paramString);
      Bundle localBundle = b(paramString.getQuery());
      localBundle.putAll(b(paramString.getRef()));
      return localBundle;
    }
    catch (MalformedURLException paramString) {}
    return new Bundle();
  }
  
  public static String a(Context paramContext)
  {
    String str = SocializeConstants.APPKEY;
    if (TextUtils.isEmpty(str)) {
      try
      {
        paramContext = paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128);
        if (paramContext != null)
        {
          paramContext = paramContext.metaData.get("UMENG_APPKEY");
          if (paramContext != null) {
            return paramContext.toString();
          }
          Log.a("SOCIAL", "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.");
          return str;
        }
      }
      catch (Exception paramContext)
      {
        Log.a("SOCIAL", "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml.", paramContext);
      }
    }
    return str;
  }
  
  public static String a(Context paramContext, long paramLong)
  {
    long l2 = (System.currentTimeMillis() - paramLong) / 1000L;
    long l1 = l2;
    if (l2 < 0L) {
      l1 = 0L;
    }
    if ((TextUtils.isEmpty(b)) || (TextUtils.isEmpty(c)) || (TextUtils.isEmpty(d)))
    {
      b = paramContext.getResources().getString(b.a(paramContext, b.a.e, "umeng_socialize_msg_sec"));
      c = paramContext.getResources().getString(b.a(paramContext, b.a.e, "umeng_socialize_msg_min"));
      d = paramContext.getResources().getString(b.a(paramContext, b.a.e, "umeng_socialize_msg_hor"));
    }
    if (l1 / 60L == 0L) {
      paramContext = l1 + b;
    }
    for (;;)
    {
      Object localObject = paramContext;
      if (paramContext == null) {
        localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm").format(Long.valueOf(paramLong));
      }
      return (String)localObject;
      if (l1 / 3600L == 0L) {
        paramContext = l1 / 60L + c;
      } else if (l1 / 86400L == 0L) {
        paramContext = l1 / 3600L + d;
      } else {
        paramContext = null;
      }
    }
  }
  
  public static void a(Dialog paramDialog)
  {
    if (paramDialog != null) {}
    try
    {
      paramDialog.dismiss();
      return;
    }
    catch (WindowManager.BadTokenException paramDialog)
    {
      Log.b(a, "dialog dismiss error", paramDialog);
    }
  }
  
  public static void a(Dialog paramDialog, boolean paramBoolean)
  {
    if (paramDialog != null) {}
    try
    {
      if (!paramDialog.isShowing()) {
        paramDialog.show();
      }
      return;
    }
    catch (WindowManager.BadTokenException paramDialog)
    {
      do
      {
        Log.b(a, "dialog show error", paramDialog);
      } while (!paramBoolean);
      throw new SocializeException("", paramDialog);
    }
  }
  
  public static void a(Context paramContext, String paramString1, String paramString2, UMediaObject paramUMediaObject, String paramString3)
  {
    paramString1 = UMServiceFactory.getUMSocialService(paramString1, RequestType.ANALYTICS);
    UMShareMsg localUMShareMsg = new UMShareMsg();
    if ((paramUMediaObject != null) && (paramUMediaObject.isUrlMedia()))
    {
      UMRichMedia localUMRichMedia = new UMRichMedia(paramUMediaObject.toUrl(), paramUMediaObject.getMediaType());
      if (paramUMediaObject.getMediaType() == UMediaObject.MediaType.MUSIC)
      {
        paramUMediaObject = (UMusic)paramUMediaObject;
        localUMRichMedia.setAuthor(paramUMediaObject.getAuthor());
        localUMRichMedia.setTitle(paramUMediaObject.getTitle());
      }
      localUMShareMsg.setMediaData(localUMRichMedia);
    }
    for (;;)
    {
      localUMShareMsg.text = paramString2;
      paramString1.postShareByCustomPlatform(paramContext, null, paramString3, localUMShareMsg, null);
      return;
      if (paramUMediaObject != null) {
        localUMShareMsg.setMediaData(new UMRichMedia(paramUMediaObject.toByte(), UMediaObject.MediaType.IMAGE));
      }
    }
  }
  
  public static boolean a()
  {
    try
    {
      Class.forName("com.google.android.maps.MapActivity");
      return true;
    }
    catch (Exception localException)
    {
      Log.e(a, "The device has no google map lib!");
    }
    return false;
  }
  
  /* Error */
  public static byte[] a(android.app.Activity paramActivity, Uri paramUri)
  {
    // Byte code:
    //   0: aload_1
    //   1: ifnull +82 -> 83
    //   4: ldc 60
    //   6: aload_1
    //   7: invokevirtual 327	android/net/Uri:toString	()Ljava/lang/String;
    //   10: invokevirtual 331	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   13: ifne +70 -> 83
    //   16: aload_1
    //   17: invokevirtual 334	android/net/Uri:getScheme	()Ljava/lang/String;
    //   20: astore 4
    //   22: aload 4
    //   24: ldc_w 336
    //   27: invokevirtual 331	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   30: ifeq +55 -> 85
    //   33: new 338	java/io/File
    //   36: dup
    //   37: aload_1
    //   38: invokevirtual 341	android/net/Uri:getPath	()Ljava/lang/String;
    //   41: invokespecial 342	java/io/File:<init>	(Ljava/lang/String;)V
    //   44: astore_1
    //   45: aload_1
    //   46: ifnull +37 -> 83
    //   49: aload_1
    //   50: invokevirtual 345	java/io/File:length	()J
    //   53: ldc2_w 346
    //   56: lcmp
    //   57: iflt +26 -> 83
    //   60: new 324	java/lang/RuntimeException
    //   63: dup
    //   64: ldc_w 349
    //   67: invokespecial 350	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   70: athrow
    //   71: astore_1
    //   72: aload_0
    //   73: ldc_w 352
    //   76: iconst_0
    //   77: invokestatic 358	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   80: invokevirtual 359	android/widget/Toast:show	()V
    //   83: aconst_null
    //   84: areturn
    //   85: aload 4
    //   87: ldc_w 361
    //   90: invokevirtual 331	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   93: istore_3
    //   94: iload_3
    //   95: ifeq +394 -> 489
    //   98: aload_0
    //   99: aload_1
    //   100: iconst_1
    //   101: anewarray 182	java/lang/String
    //   104: dup
    //   105: iconst_0
    //   106: ldc_w 363
    //   109: aastore
    //   110: aconst_null
    //   111: aconst_null
    //   112: aconst_null
    //   113: invokevirtual 369	android/app/Activity:managedQuery	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;
    //   116: astore_1
    //   117: aload_1
    //   118: ldc_w 363
    //   121: invokeinterface 375 2 0
    //   126: istore_2
    //   127: aload_1
    //   128: invokeinterface 378 1 0
    //   133: pop
    //   134: new 338	java/io/File
    //   137: dup
    //   138: aload_1
    //   139: iload_2
    //   140: invokeinterface 379 2 0
    //   145: invokespecial 342	java/io/File:<init>	(Ljava/lang/String;)V
    //   148: astore_1
    //   149: aload_1
    //   150: invokevirtual 382	java/io/File:exists	()Z
    //   153: ifne +16 -> 169
    //   156: aload_0
    //   157: ldc_w 384
    //   160: iconst_0
    //   161: invokestatic 358	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   164: invokevirtual 359	android/widget/Toast:show	()V
    //   167: aconst_null
    //   168: areturn
    //   169: new 386	java/io/ByteArrayOutputStream
    //   172: dup
    //   173: invokespecial 387	java/io/ByteArrayOutputStream:<init>	()V
    //   176: astore 4
    //   178: new 389	java/io/FileInputStream
    //   181: dup
    //   182: aload_1
    //   183: invokespecial 392	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   186: astore_1
    //   187: aload_1
    //   188: astore 6
    //   190: aload 4
    //   192: astore 5
    //   194: sipush 1024
    //   197: newarray <illegal type>
    //   199: astore 7
    //   201: aload_1
    //   202: astore 6
    //   204: aload 4
    //   206: astore 5
    //   208: aload_1
    //   209: aload 7
    //   211: invokevirtual 398	java/io/InputStream:read	([B)I
    //   214: istore_2
    //   215: iload_2
    //   216: iconst_m1
    //   217: if_icmpne +45 -> 262
    //   220: aload_1
    //   221: astore 6
    //   223: aload 4
    //   225: astore 5
    //   227: aload 4
    //   229: invokevirtual 401	java/io/ByteArrayOutputStream:flush	()V
    //   232: aload_1
    //   233: astore 6
    //   235: aload 4
    //   237: astore 5
    //   239: aload 4
    //   241: invokevirtual 404	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   244: astore 7
    //   246: aload 4
    //   248: invokevirtual 407	java/io/ByteArrayOutputStream:close	()V
    //   251: aload_1
    //   252: invokevirtual 408	java/io/InputStream:close	()V
    //   255: aload 7
    //   257: areturn
    //   258: astore_0
    //   259: aload 7
    //   261: areturn
    //   262: aload_1
    //   263: astore 6
    //   265: aload 4
    //   267: astore 5
    //   269: aload 4
    //   271: aload 7
    //   273: iconst_0
    //   274: iload_2
    //   275: invokevirtual 412	java/io/ByteArrayOutputStream:write	([BII)V
    //   278: goto -77 -> 201
    //   281: astore 7
    //   283: aload_1
    //   284: astore 6
    //   286: aload 4
    //   288: astore 5
    //   290: getstatic 23	com/umeng/socialize/common/m:a	Ljava/lang/String;
    //   293: aload 7
    //   295: invokevirtual 413	java/lang/Exception:toString	()Ljava/lang/String;
    //   298: invokestatic 415	com/umeng/socom/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   301: aload 4
    //   303: ifnull +16 -> 319
    //   306: aload 4
    //   308: invokevirtual 407	java/io/ByteArrayOutputStream:close	()V
    //   311: aload_1
    //   312: ifnull +7 -> 319
    //   315: aload_1
    //   316: invokevirtual 408	java/io/InputStream:close	()V
    //   319: aconst_null
    //   320: areturn
    //   321: astore 4
    //   323: aload_1
    //   324: invokevirtual 408	java/io/InputStream:close	()V
    //   327: aload 7
    //   329: areturn
    //   330: astore_0
    //   331: aload 7
    //   333: areturn
    //   334: astore 4
    //   336: aload_1
    //   337: invokevirtual 408	java/io/InputStream:close	()V
    //   340: aload 4
    //   342: athrow
    //   343: astore 4
    //   345: aload_1
    //   346: ifnull -27 -> 319
    //   349: aload_1
    //   350: invokevirtual 408	java/io/InputStream:close	()V
    //   353: goto -34 -> 319
    //   356: astore_0
    //   357: goto -38 -> 319
    //   360: astore 4
    //   362: aload_1
    //   363: ifnull +7 -> 370
    //   366: aload_1
    //   367: invokevirtual 408	java/io/InputStream:close	()V
    //   370: aload 4
    //   372: athrow
    //   373: astore_1
    //   374: aconst_null
    //   375: astore 6
    //   377: aconst_null
    //   378: astore 4
    //   380: aload 4
    //   382: ifnull +18 -> 400
    //   385: aload 4
    //   387: invokevirtual 407	java/io/ByteArrayOutputStream:close	()V
    //   390: aload 6
    //   392: ifnull +8 -> 400
    //   395: aload 6
    //   397: invokevirtual 408	java/io/InputStream:close	()V
    //   400: aload_1
    //   401: athrow
    //   402: astore 4
    //   404: aload 6
    //   406: ifnull -6 -> 400
    //   409: aload 6
    //   411: invokevirtual 408	java/io/InputStream:close	()V
    //   414: goto -14 -> 400
    //   417: astore 4
    //   419: goto -19 -> 400
    //   422: astore_1
    //   423: aload 6
    //   425: ifnull +8 -> 433
    //   428: aload 6
    //   430: invokevirtual 408	java/io/InputStream:close	()V
    //   433: aload_1
    //   434: athrow
    //   435: astore_1
    //   436: goto -96 -> 340
    //   439: astore_1
    //   440: goto -70 -> 370
    //   443: astore_0
    //   444: goto -125 -> 319
    //   447: astore 4
    //   449: goto -16 -> 433
    //   452: astore 4
    //   454: goto -54 -> 400
    //   457: astore_1
    //   458: aconst_null
    //   459: astore 6
    //   461: goto -81 -> 380
    //   464: astore_1
    //   465: aload 5
    //   467: astore 4
    //   469: goto -89 -> 380
    //   472: astore 7
    //   474: aconst_null
    //   475: astore_1
    //   476: aconst_null
    //   477: astore 4
    //   479: goto -196 -> 283
    //   482: astore 7
    //   484: aconst_null
    //   485: astore_1
    //   486: goto -203 -> 283
    //   489: aconst_null
    //   490: astore_1
    //   491: goto -446 -> 45
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	494	0	paramActivity	android.app.Activity
    //   0	494	1	paramUri	Uri
    //   126	149	2	i	int
    //   93	2	3	bool	boolean
    //   20	287	4	localObject1	Object
    //   321	1	4	localIOException1	java.io.IOException
    //   334	7	4	localObject2	Object
    //   343	1	4	localIOException2	java.io.IOException
    //   360	11	4	localObject3	Object
    //   378	8	4	localObject4	Object
    //   402	1	4	localIOException3	java.io.IOException
    //   417	1	4	localIOException4	java.io.IOException
    //   447	1	4	localIOException5	java.io.IOException
    //   452	1	4	localIOException6	java.io.IOException
    //   467	11	4	localObject5	Object
    //   192	274	5	localObject6	Object
    //   188	272	6	localUri	Uri
    //   199	73	7	arrayOfByte	byte[]
    //   281	51	7	localException1	Exception
    //   472	1	7	localException2	Exception
    //   482	1	7	localException3	Exception
    // Exception table:
    //   from	to	target	type
    //   4	45	71	java/lang/RuntimeException
    //   49	71	71	java/lang/RuntimeException
    //   85	94	71	java/lang/RuntimeException
    //   251	255	71	java/lang/RuntimeException
    //   315	319	71	java/lang/RuntimeException
    //   323	327	71	java/lang/RuntimeException
    //   336	340	71	java/lang/RuntimeException
    //   340	343	71	java/lang/RuntimeException
    //   349	353	71	java/lang/RuntimeException
    //   366	370	71	java/lang/RuntimeException
    //   370	373	71	java/lang/RuntimeException
    //   395	400	71	java/lang/RuntimeException
    //   400	402	71	java/lang/RuntimeException
    //   409	414	71	java/lang/RuntimeException
    //   428	433	71	java/lang/RuntimeException
    //   433	435	71	java/lang/RuntimeException
    //   251	255	258	java/io/IOException
    //   194	201	281	java/lang/Exception
    //   208	215	281	java/lang/Exception
    //   227	232	281	java/lang/Exception
    //   239	246	281	java/lang/Exception
    //   269	278	281	java/lang/Exception
    //   246	251	321	java/io/IOException
    //   323	327	330	java/io/IOException
    //   246	251	334	finally
    //   306	311	343	java/io/IOException
    //   349	353	356	java/io/IOException
    //   306	311	360	finally
    //   98	167	373	finally
    //   169	178	373	finally
    //   385	390	402	java/io/IOException
    //   409	414	417	java/io/IOException
    //   385	390	422	finally
    //   336	340	435	java/io/IOException
    //   366	370	439	java/io/IOException
    //   315	319	443	java/io/IOException
    //   428	433	447	java/io/IOException
    //   395	400	452	java/io/IOException
    //   178	187	457	finally
    //   194	201	464	finally
    //   208	215	464	finally
    //   227	232	464	finally
    //   239	246	464	finally
    //   269	278	464	finally
    //   290	301	464	finally
    //   98	167	472	java/lang/Exception
    //   169	178	472	java/lang/Exception
    //   178	187	482	java/lang/Exception
  }
  
  public static Bundle b(String paramString)
  {
    Bundle localBundle = new Bundle();
    int j;
    int i;
    if (paramString != null)
    {
      paramString = paramString.split("&");
      j = paramString.length;
      i = 0;
    }
    for (;;)
    {
      if (i >= j) {
        return localBundle;
      }
      String[] arrayOfString = paramString[i].split("=");
      localBundle.putString(URLDecoder.decode(arrayOfString[0]), URLDecoder.decode(arrayOfString[1]));
      i += 1;
    }
  }
  
  private static Pattern b()
  {
    if (e == null) {
      e = Pattern.compile("[^\\x00-\\xff]");
    }
    return e;
  }
  
  public static Object[] b(Context paramContext)
  {
    Object[] arrayOfObject;
    try
    {
      arrayOfObject = new Object[3];
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      arrayOfObject[0] = Boolean.valueOf(false);
      switch (paramContext.getSimState())
      {
      case 1: 
        arrayOfObject[1] = "无卡";
      }
    }
    catch (Exception paramContext)
    {
      Log.b(a, "cannot read SIM card. [" + paramContext.toString() + "]");
      return null;
    }
    arrayOfObject[0] = Boolean.valueOf(true);
    arrayOfObject[1] = "未知状态";
    break label140;
    arrayOfObject[0] = Boolean.valueOf(true);
    arrayOfObject[1] = "良好";
    for (;;)
    {
      label140:
      return arrayOfObject;
      arrayOfObject[1] = "需要NetworkPIN解锁";
      continue;
      arrayOfObject[1] = "需要PIN解锁";
      continue;
      arrayOfObject[1] = "需要PUK解锁";
    }
  }
  
  public static int c(String paramString)
  {
    paramString = paramString.trim();
    int i = 0;
    Matcher localMatcher = b().matcher(paramString);
    int j;
    for (;;)
    {
      if (!localMatcher.find())
      {
        j = paramString.length() - i;
        if (j % 2 == 0) {
          break;
        }
        return i + (j + 1) / 2;
      }
      i += 1;
    }
    return i + j / 2;
  }
  
  public static int[] c(Context paramContext)
  {
    return new int[] { (int)paramContext.getResources().getDimension(b.a(paramContext, b.a.g, "umeng_socialize_pad_window_width")), (int)paramContext.getResources().getDimension(b.a(paramContext, b.a.g, "umeng_socialize_pad_window_height")) };
  }
  
  public static int d(String paramString)
  {
    paramString = e(paramString);
    int m = "http://".length();
    int k = paramString.indexOf("http://", 0);
    if (k != -1)
    {
      int i = 0;
      if (k == -1) {}
      int j;
      for (;;)
      {
        return paramString.length() + i;
        j = i + k;
        if (k + m != paramString.length()) {
          break;
        }
        paramString = paramString.substring(k);
        i = j;
      }
      i = k + m;
      k = paramString.charAt(i);
      label78:
      if (((k > 90) || (k < 65)) && ((k > 122) || (k < 97)) && ((k > 57) || (k < 48)) && (k != 95) && (k != 46) && (k != 63) && (k != 47) && (k != 37) && (k != 38) && (k != 58) && (k != 61) && (k != 45)) {}
      for (;;)
      {
        j += 10;
        paramString = paramString.substring(i);
        k = paramString.indexOf("http://", 0);
        i = j;
        break;
        i += 1;
        if (i < paramString.length())
        {
          k = paramString.charAt(i);
          break label78;
        }
        i -= 1;
        j -= 1;
      }
    }
    return paramString.length();
  }
  
  public static boolean d(Context paramContext)
  {
    if (SocializeConstants.SUPPORT_PAD)
    {
      WindowManager localWindowManager;
      Object localObject;
      int i;
      if (f == 0)
      {
        localWindowManager = (WindowManager)paramContext.getSystemService("window");
        localObject = localWindowManager.getDefaultDisplay();
        i = ((Display)localObject).getWidth();
        int j = ((Display)localObject).getHeight();
        if (i <= j) {
          break label114;
        }
        i = j;
      }
      label114:
      for (;;)
      {
        localObject = new DisplayMetrics();
        localWindowManager.getDefaultDisplay().getMetrics((DisplayMetrics)localObject);
        f = (int)(i / ((DisplayMetrics)localObject).density + 0.5F);
        if (((paramContext.getResources().getConfiguration().screenLayout & 0xF) < 3) || (f < 550)) {
          break;
        }
        return true;
      }
    }
    return false;
  }
  
  public static String e(String paramString)
  {
    return g(f(paramString.replaceAll("<(?!br|img)[^>]+>", "").trim())).trim();
  }
  
  public static String f(String paramString)
  {
    String[] arrayOfString = paramString.split(";");
    paramString = "";
    int i = 0;
    if (i >= arrayOfString.length) {
      return paramString;
    }
    int j = arrayOfString[i].indexOf("&#");
    String str3 = arrayOfString[i];
    String str1;
    char c1;
    if (j >= 0)
    {
      String str2 = str3;
      str1 = paramString;
      if (j > 0)
      {
        str1 = str3.substring(0, j);
        str1 = paramString + str1;
        str2 = str3.substring(j);
      }
      c1 = (char)Integer.parseInt(str2.replace("&#", ""));
    }
    for (paramString = str1 + c1;; paramString = paramString + arrayOfString[i])
    {
      i += 1;
      break;
    }
  }
  
  public static String g(String paramString)
  {
    String str2 = "";
    int i = paramString.indexOf("<img src=", 0);
    String str1 = paramString;
    if (i != -1) {
      str1 = str2;
    }
    for (;;)
    {
      if (i == -1)
      {
        str1 = str1 + paramString;
        return str1;
      }
      str1 = str1 + paramString.substring(0, i);
      int j = paramString.indexOf(">", "<img src=".length() + i);
      paramString.substring(i + 10, j - 1);
      paramString = paramString.substring(j + 1);
      i = paramString.indexOf("<img src=");
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\common\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */