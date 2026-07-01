package com.umeng.fb;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.Toast;
import com.umeng.common.b;
import com.umeng.fb.b.e;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public class g
{
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
  
  public static String a()
  {
    Date localDate = new Date();
    return new SimpleDateFormat("yyyy-MM-dd").format(localDate);
  }
  
  public static String a(JSONObject paramJSONObject)
  {
    try
    {
      if (paramJSONObject.has("channel")) {
        paramJSONObject.put("channel", URLEncoder.encode(paramJSONObject.getString("channel"), "UTF-8"));
      }
      return paramJSONObject.toString();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
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
  
  public static void a(Context paramContext)
  {
    Toast.makeText(paramContext, paramContext.getString(e.A(paramContext)), 0).show();
  }
  
  public static void a(Context paramContext, Date paramDate)
  {
    paramContext = paramContext.getSharedPreferences("exchange_last_request_time", 0).edit();
    paramContext.putString("last_request_time", b.a(paramDate));
    paramContext.commit();
  }
  
  public static String b(JSONObject paramJSONObject)
  {
    int j = 0;
    for (;;)
    {
      int i;
      try
      {
        Object localObject1 = paramJSONObject.optJSONObject("header");
        if (localObject1 != null)
        {
          if (((JSONObject)localObject1).has("access_subtype")) {
            ((JSONObject)localObject1).put("access_subtype", URLEncoder.encode(((JSONObject)localObject1).getString("access_subtype"), "UTF-8"));
          }
          if (((JSONObject)localObject1).has("cpu")) {
            ((JSONObject)localObject1).put("cpu", URLEncoder.encode(((JSONObject)localObject1).getString("cpu"), "UTF-8"));
          }
          if (((JSONObject)localObject1).has("app_version")) {
            ((JSONObject)localObject1).put("app_version", URLEncoder.encode(((JSONObject)localObject1).getString("app_version"), "UTF-8"));
          }
          if (((JSONObject)localObject1).has("country")) {
            ((JSONObject)localObject1).put("country", URLEncoder.encode(((JSONObject)localObject1).getString("country"), "UTF-8"));
          }
          if (((JSONObject)localObject1).has("device_model")) {
            ((JSONObject)localObject1).put("device_model", URLEncoder.encode(((JSONObject)localObject1).getString("device_model"), "UTF-8"));
          }
          if (((JSONObject)localObject1).has("carrier")) {
            ((JSONObject)localObject1).put("carrier", URLEncoder.encode(((JSONObject)localObject1).getString("carrier"), "UTF-8"));
          }
          if (((JSONObject)localObject1).has("language")) {
            ((JSONObject)localObject1).put("language", URLEncoder.encode(((JSONObject)localObject1).getString("language"), "UTF-8"));
          }
          if (((JSONObject)localObject1).has("channel")) {
            ((JSONObject)localObject1).put("channel", URLEncoder.encode(((JSONObject)localObject1).getString("channel"), "UTF-8"));
          }
        }
        localObject1 = paramJSONObject.optJSONObject("body");
        Object localObject2 = ((JSONObject)localObject1).optJSONArray("event");
        if (localObject2 != null)
        {
          i = 0;
          if (i < ((JSONArray)localObject2).length())
          {
            JSONObject localJSONObject = ((JSONArray)localObject2).optJSONObject(i);
            if (localJSONObject == null) {
              break label413;
            }
            if (localJSONObject.has("label")) {
              localJSONObject.put("label", URLEncoder.encode(localJSONObject.getString("label")));
            }
            if (!localJSONObject.has("tag")) {
              break label413;
            }
            localJSONObject.put("tag", URLEncoder.encode(localJSONObject.getString("tag")));
            break label413;
          }
        }
        localObject1 = ((JSONObject)localObject1).optJSONArray("error");
        if (localObject1 != null)
        {
          i = j;
          if (i < ((JSONArray)localObject1).length())
          {
            localObject2 = ((JSONArray)localObject1).optJSONObject(i);
            if ((localObject2 == null) || (!((JSONObject)localObject2).has("context"))) {
              break label420;
            }
            ((JSONObject)localObject2).put("context", URLEncoder.encode(((JSONObject)localObject2).getString("context")));
            break label420;
          }
        }
        localObject1 = paramJSONObject.toString();
        return (String)localObject1;
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        return paramJSONObject.toString();
      }
      label413:
      i += 1;
      continue;
      label420:
      i += 1;
    }
  }
  
  public static Date b(Context paramContext)
  {
    return a(paramContext.getSharedPreferences("exchange_last_request_time", 0).getString("last_request_time", "1900-01-01 00:00:00"));
  }
  
  /* Error */
  public static JSONObject c(Context paramContext)
  {
    // Byte code:
    //   0: new 43	org/json/JSONObject
    //   3: dup
    //   4: invokespecial 185	org/json/JSONObject:<init>	()V
    //   7: astore 5
    //   9: aload_0
    //   10: ldc -69
    //   12: invokevirtual 191	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   15: checkcast 193	android/telephony/TelephonyManager
    //   18: astore 6
    //   20: aload_0
    //   21: invokestatic 197	com/umeng/common/b:g	(Landroid/content/Context;)Ljava/lang/String;
    //   24: astore 4
    //   26: aload 4
    //   28: ifnull +13 -> 41
    //   31: aload 4
    //   33: ldc -57
    //   35: invokevirtual 205	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   38: ifeq +9 -> 47
    //   41: getstatic 211	com/umeng/fb/f:h	Z
    //   44: istore_3
    //   45: aconst_null
    //   46: areturn
    //   47: aload 5
    //   49: ldc -43
    //   51: aload_0
    //   52: invokestatic 216	com/umeng/common/b:f	(Landroid/content/Context;)Ljava/lang/String;
    //   55: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   58: pop
    //   59: aload 5
    //   61: ldc -38
    //   63: aload 4
    //   65: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   68: pop
    //   69: aload 5
    //   71: ldc -114
    //   73: getstatic 224	android/os/Build:MODEL	Ljava/lang/String;
    //   76: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   79: pop
    //   80: aload_0
    //   81: invokestatic 227	com/umeng/common/b:p	(Landroid/content/Context;)Ljava/lang/String;
    //   84: astore 4
    //   86: aload 4
    //   88: ifnonnull +9 -> 97
    //   91: getstatic 211	com/umeng/fb/f:h	Z
    //   94: istore_3
    //   95: aconst_null
    //   96: areturn
    //   97: aload 5
    //   99: ldc -27
    //   101: aload 4
    //   103: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   106: pop
    //   107: getstatic 232	com/umeng/fb/f:m	Ljava/lang/String;
    //   110: ifnull +380 -> 490
    //   113: getstatic 232	com/umeng/fb/f:m	Ljava/lang/String;
    //   116: astore 4
    //   118: aload 5
    //   120: ldc 41
    //   122: aload 4
    //   124: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   127: pop
    //   128: aload_0
    //   129: invokevirtual 236	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   132: aload_0
    //   133: invokevirtual 239	android/content/Context:getPackageName	()Ljava/lang/String;
    //   136: iconst_0
    //   137: invokevirtual 245	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   140: astore 4
    //   142: aload 4
    //   144: getfield 250	android/content/pm/PackageInfo:versionName	Ljava/lang/String;
    //   147: astore 7
    //   149: aload 4
    //   151: getfield 254	android/content/pm/PackageInfo:versionCode	I
    //   154: istore_1
    //   155: aload 5
    //   157: ldc -118
    //   159: aload 7
    //   161: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   164: pop
    //   165: aload 5
    //   167: ldc_w 256
    //   170: iload_1
    //   171: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   174: pop
    //   175: aload 5
    //   177: ldc_w 261
    //   180: ldc_w 263
    //   183: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   186: pop
    //   187: aload 5
    //   189: ldc_w 265
    //   192: ldc_w 267
    //   195: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   198: pop
    //   199: aload 5
    //   201: ldc_w 269
    //   204: ldc_w 263
    //   207: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   210: pop
    //   211: aload 5
    //   213: ldc_w 271
    //   216: getstatic 276	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   219: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   222: pop
    //   223: new 278	android/content/res/Configuration
    //   226: dup
    //   227: invokespecial 279	android/content/res/Configuration:<init>	()V
    //   230: astore 4
    //   232: aload_0
    //   233: invokevirtual 283	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   236: aload 4
    //   238: invokestatic 289	android/provider/Settings$System:getConfiguration	(Landroid/content/ContentResolver;Landroid/content/res/Configuration;)V
    //   241: aload 4
    //   243: getfield 293	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   246: ifnull +333 -> 579
    //   249: aload 5
    //   251: ldc -116
    //   253: aload 4
    //   255: getfield 293	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   258: invokevirtual 298	java/util/Locale:getCountry	()Ljava/lang/String;
    //   261: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   264: pop
    //   265: aload 5
    //   267: ldc -110
    //   269: aload 4
    //   271: getfield 293	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   274: invokevirtual 299	java/util/Locale:toString	()Ljava/lang/String;
    //   277: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   280: pop
    //   281: aload 4
    //   283: getfield 293	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   286: invokestatic 305	java/util/Calendar:getInstance	(Ljava/util/Locale;)Ljava/util/Calendar;
    //   289: astore 4
    //   291: aload 4
    //   293: ifnull +272 -> 565
    //   296: aload 4
    //   298: invokevirtual 309	java/util/Calendar:getTimeZone	()Ljava/util/TimeZone;
    //   301: astore 4
    //   303: aload 4
    //   305: ifnull +246 -> 551
    //   308: aload 5
    //   310: ldc_w 311
    //   313: aload 4
    //   315: invokevirtual 316	java/util/TimeZone:getRawOffset	()I
    //   318: ldc_w 317
    //   321: idiv
    //   322: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   325: pop
    //   326: new 319	android/util/DisplayMetrics
    //   329: dup
    //   330: invokespecial 320	android/util/DisplayMetrics:<init>	()V
    //   333: astore 4
    //   335: aload_0
    //   336: ldc_w 322
    //   339: invokevirtual 191	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   342: checkcast 324	android/view/WindowManager
    //   345: invokeinterface 328 1 0
    //   350: aload 4
    //   352: invokevirtual 334	android/view/Display:getMetrics	(Landroid/util/DisplayMetrics;)V
    //   355: aload 4
    //   357: getfield 337	android/util/DisplayMetrics:widthPixels	I
    //   360: istore_1
    //   361: aload 4
    //   363: getfield 340	android/util/DisplayMetrics:heightPixels	I
    //   366: istore_2
    //   367: aload 5
    //   369: ldc_w 342
    //   372: new 344	java/lang/StringBuilder
    //   375: dup
    //   376: invokespecial 345	java/lang/StringBuilder:<init>	()V
    //   379: iload_2
    //   380: invokestatic 348	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   383: invokevirtual 352	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   386: ldc_w 354
    //   389: invokevirtual 352	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   392: iload_1
    //   393: invokestatic 348	java/lang/String:valueOf	(I)Ljava/lang/String;
    //   396: invokevirtual 352	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   399: invokevirtual 355	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   402: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   405: pop
    //   406: aload_0
    //   407: invokestatic 359	com/umeng/common/b:j	(Landroid/content/Context;)[Ljava/lang/String;
    //   410: astore 4
    //   412: aload 5
    //   414: ldc_w 361
    //   417: aload 4
    //   419: iconst_0
    //   420: aaload
    //   421: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   424: pop
    //   425: aload 4
    //   427: iconst_0
    //   428: aaload
    //   429: ldc_w 363
    //   432: invokevirtual 205	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   435: ifeq +15 -> 450
    //   438: aload 5
    //   440: ldc -122
    //   442: aload 4
    //   444: iconst_1
    //   445: aaload
    //   446: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   449: pop
    //   450: aload 5
    //   452: ldc -112
    //   454: aload 6
    //   456: invokevirtual 366	android/telephony/TelephonyManager:getNetworkOperatorName	()Ljava/lang/String;
    //   459: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   462: pop
    //   463: aload 5
    //   465: ldc -120
    //   467: invokestatic 368	com/umeng/common/b:a	()Ljava/lang/String;
    //   470: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   473: pop
    //   474: aload 5
    //   476: ldc_w 370
    //   479: aload_0
    //   480: invokevirtual 239	android/content/Context:getPackageName	()Ljava/lang/String;
    //   483: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   486: pop
    //   487: aload 5
    //   489: areturn
    //   490: aload_0
    //   491: invokestatic 373	com/umeng/common/b:t	(Landroid/content/Context;)Ljava/lang/String;
    //   494: astore 4
    //   496: goto -378 -> 118
    //   499: astore 4
    //   501: getstatic 211	com/umeng/fb/f:h	Z
    //   504: ifeq +8 -> 512
    //   507: aload 4
    //   509: invokevirtual 374	android/content/pm/PackageManager$NameNotFoundException:printStackTrace	()V
    //   512: aload 5
    //   514: ldc -118
    //   516: ldc_w 376
    //   519: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   522: pop
    //   523: aload 5
    //   525: ldc_w 256
    //   528: ldc_w 376
    //   531: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   534: pop
    //   535: goto -360 -> 175
    //   538: astore_0
    //   539: getstatic 211	com/umeng/fb/f:h	Z
    //   542: ifeq +7 -> 549
    //   545: aload_0
    //   546: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   549: aconst_null
    //   550: areturn
    //   551: aload 5
    //   553: ldc_w 311
    //   556: bipush 8
    //   558: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   561: pop
    //   562: goto -236 -> 326
    //   565: aload 5
    //   567: ldc_w 311
    //   570: bipush 8
    //   572: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   575: pop
    //   576: goto -250 -> 326
    //   579: invokestatic 380	java/util/Locale:getDefault	()Ljava/util/Locale;
    //   582: astore 4
    //   584: getstatic 383	com/umeng/fb/f:l	Z
    //   587: ifeq +159 -> 746
    //   590: aload 4
    //   592: ifnull +154 -> 746
    //   595: aload 4
    //   597: invokevirtual 298	java/util/Locale:getCountry	()Ljava/lang/String;
    //   600: astore 7
    //   602: aload 7
    //   604: invokestatic 389	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   607: ifne +83 -> 690
    //   610: aload 5
    //   612: ldc -116
    //   614: aload 7
    //   616: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   619: pop
    //   620: aload 4
    //   622: invokevirtual 392	java/util/Locale:getLanguage	()Ljava/lang/String;
    //   625: astore 7
    //   627: aload 7
    //   629: invokestatic 389	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   632: ifne +72 -> 704
    //   635: aload 5
    //   637: ldc -110
    //   639: aload 7
    //   641: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   644: pop
    //   645: aload 4
    //   647: invokestatic 305	java/util/Calendar:getInstance	(Ljava/util/Locale;)Ljava/util/Calendar;
    //   650: astore 4
    //   652: aload 4
    //   654: ifnull +78 -> 732
    //   657: aload 4
    //   659: invokevirtual 309	java/util/Calendar:getTimeZone	()Ljava/util/TimeZone;
    //   662: astore 4
    //   664: aload 4
    //   666: ifnull +52 -> 718
    //   669: aload 5
    //   671: ldc_w 311
    //   674: aload 4
    //   676: invokevirtual 316	java/util/TimeZone:getRawOffset	()I
    //   679: ldc_w 317
    //   682: idiv
    //   683: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   686: pop
    //   687: goto -361 -> 326
    //   690: aload 5
    //   692: ldc -116
    //   694: ldc_w 394
    //   697: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   700: pop
    //   701: goto -81 -> 620
    //   704: aload 5
    //   706: ldc -110
    //   708: ldc_w 394
    //   711: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   714: pop
    //   715: goto -70 -> 645
    //   718: aload 5
    //   720: ldc_w 311
    //   723: bipush 8
    //   725: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   728: pop
    //   729: goto -403 -> 326
    //   732: aload 5
    //   734: ldc_w 311
    //   737: bipush 8
    //   739: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   742: pop
    //   743: goto -417 -> 326
    //   746: aload 5
    //   748: ldc -116
    //   750: ldc_w 394
    //   753: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   756: pop
    //   757: aload 5
    //   759: ldc -110
    //   761: ldc_w 394
    //   764: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   767: pop
    //   768: aload 5
    //   770: ldc_w 311
    //   773: bipush 8
    //   775: invokevirtual 259	org/json/JSONObject:put	(Ljava/lang/String;I)Lorg/json/JSONObject;
    //   778: pop
    //   779: goto -453 -> 326
    //   782: astore 4
    //   784: getstatic 211	com/umeng/fb/f:h	Z
    //   787: ifeq +8 -> 795
    //   790: aload 4
    //   792: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   795: aload 5
    //   797: ldc_w 342
    //   800: ldc_w 394
    //   803: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   806: pop
    //   807: goto -401 -> 406
    //   810: astore 4
    //   812: getstatic 211	com/umeng/fb/f:h	Z
    //   815: ifeq +8 -> 823
    //   818: aload 4
    //   820: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   823: aload 5
    //   825: ldc_w 361
    //   828: ldc_w 394
    //   831: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   834: pop
    //   835: goto -385 -> 450
    //   838: astore 4
    //   840: getstatic 211	com/umeng/fb/f:h	Z
    //   843: ifeq +8 -> 851
    //   846: aload 4
    //   848: invokevirtual 69	java/lang/Exception:printStackTrace	()V
    //   851: aload 5
    //   853: ldc -112
    //   855: ldc_w 394
    //   858: invokevirtual 63	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   861: pop
    //   862: goto -399 -> 463
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	865	0	paramContext	Context
    //   154	239	1	i	int
    //   366	14	2	j	int
    //   44	51	3	bool	boolean
    //   24	471	4	localObject1	Object
    //   499	9	4	localNameNotFoundException	android.content.pm.PackageManager.NameNotFoundException
    //   582	93	4	localObject2	Object
    //   782	9	4	localException1	Exception
    //   810	9	4	localException2	Exception
    //   838	9	4	localException3	Exception
    //   7	845	5	localJSONObject	JSONObject
    //   18	437	6	localTelephonyManager	android.telephony.TelephonyManager
    //   147	493	7	str	String
    // Exception table:
    //   from	to	target	type
    //   128	175	499	android/content/pm/PackageManager$NameNotFoundException
    //   9	26	538	java/lang/Exception
    //   31	41	538	java/lang/Exception
    //   41	45	538	java/lang/Exception
    //   47	86	538	java/lang/Exception
    //   91	95	538	java/lang/Exception
    //   97	118	538	java/lang/Exception
    //   118	128	538	java/lang/Exception
    //   128	175	538	java/lang/Exception
    //   175	291	538	java/lang/Exception
    //   296	303	538	java/lang/Exception
    //   308	326	538	java/lang/Exception
    //   463	487	538	java/lang/Exception
    //   490	496	538	java/lang/Exception
    //   501	512	538	java/lang/Exception
    //   512	535	538	java/lang/Exception
    //   551	562	538	java/lang/Exception
    //   565	576	538	java/lang/Exception
    //   579	590	538	java/lang/Exception
    //   595	620	538	java/lang/Exception
    //   620	645	538	java/lang/Exception
    //   645	652	538	java/lang/Exception
    //   657	664	538	java/lang/Exception
    //   669	687	538	java/lang/Exception
    //   690	701	538	java/lang/Exception
    //   704	715	538	java/lang/Exception
    //   718	729	538	java/lang/Exception
    //   732	743	538	java/lang/Exception
    //   746	779	538	java/lang/Exception
    //   784	795	538	java/lang/Exception
    //   795	807	538	java/lang/Exception
    //   812	823	538	java/lang/Exception
    //   823	835	538	java/lang/Exception
    //   840	851	538	java/lang/Exception
    //   851	862	538	java/lang/Exception
    //   326	406	782	java/lang/Exception
    //   406	450	810	java/lang/Exception
    //   450	463	838	java/lang/Exception
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */