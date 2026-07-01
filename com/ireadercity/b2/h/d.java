package com.ireadercity.b2.h;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.AsyncTask;
import java.io.File;

public final class d
  extends AsyncTask<Boolean, Boolean, Boolean>
{
  private String a = null;
  private ProgressDialog b = null;
  private Context c = null;
  private String d = null;
  
  public d(Context paramContext)
  {
    this.c = paramContext;
  }
  
  /* Error */
  private Boolean b()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore 5
    //   3: aload_0
    //   4: getfield 23	com/ireadercity/b2/h/d:c	Landroid/content/Context;
    //   7: astore 4
    //   9: new 39	java/lang/StringBuilder
    //   12: dup
    //   13: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   16: astore 4
    //   18: aload 4
    //   20: ldc 42
    //   22: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   25: pop
    //   26: getstatic 51	com/ireadercity/b2/h/r:a	Ljava/util/Map;
    //   29: invokeinterface 57 1 0
    //   34: invokeinterface 63 1 0
    //   39: astore 6
    //   41: iconst_0
    //   42: istore_1
    //   43: aload 6
    //   45: invokeinterface 69 1 0
    //   50: ifeq +499 -> 549
    //   53: aload 6
    //   55: invokeinterface 73 1 0
    //   60: checkcast 75	java/lang/String
    //   63: astore 7
    //   65: iload_1
    //   66: iconst_1
    //   67: iadd
    //   68: istore_2
    //   69: aload 4
    //   71: new 39	java/lang/StringBuilder
    //   74: dup
    //   75: ldc 77
    //   77: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   80: aload 7
    //   82: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   85: ldc 82
    //   87: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   90: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   93: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   96: pop
    //   97: getstatic 51	com/ireadercity/b2/h/r:a	Ljava/util/Map;
    //   100: aload 7
    //   102: invokeinterface 90 2 0
    //   107: checkcast 53	java/util/Map
    //   110: astore 7
    //   112: aload 7
    //   114: ifnull +397 -> 511
    //   117: aload 7
    //   119: invokeinterface 57 1 0
    //   124: invokeinterface 63 1 0
    //   129: astore 8
    //   131: iconst_0
    //   132: istore_1
    //   133: aload 8
    //   135: invokeinterface 69 1 0
    //   140: ifeq +371 -> 511
    //   143: aload 8
    //   145: invokeinterface 73 1 0
    //   150: checkcast 75	java/lang/String
    //   153: astore 9
    //   155: iload_1
    //   156: iconst_1
    //   157: iadd
    //   158: istore_1
    //   159: aload 4
    //   161: new 39	java/lang/StringBuilder
    //   164: dup
    //   165: ldc 77
    //   167: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   170: aload 9
    //   172: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   175: ldc 82
    //   177: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   180: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   183: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   186: pop
    //   187: aload 7
    //   189: aload 9
    //   191: invokeinterface 90 2 0
    //   196: checkcast 92	java/util/ArrayList
    //   199: astore 9
    //   201: aload 9
    //   203: ifnull +275 -> 478
    //   206: aload 4
    //   208: ldc 94
    //   210: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   213: pop
    //   214: aload 9
    //   216: invokevirtual 95	java/util/ArrayList:iterator	()Ljava/util/Iterator;
    //   219: astore 10
    //   221: iconst_0
    //   222: istore_3
    //   223: aload 10
    //   225: invokeinterface 69 1 0
    //   230: ifeq +248 -> 478
    //   233: aload 10
    //   235: invokeinterface 73 1 0
    //   240: checkcast 75	java/lang/String
    //   243: astore 11
    //   245: iload_3
    //   246: iconst_1
    //   247: iadd
    //   248: istore_3
    //   249: iload_3
    //   250: iconst_1
    //   251: if_icmpne +11 -> 262
    //   254: aload 4
    //   256: ldc 77
    //   258: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   261: pop
    //   262: iload_3
    //   263: aload 9
    //   265: invokevirtual 99	java/util/ArrayList:size	()I
    //   268: if_icmpne +181 -> 449
    //   271: aload 4
    //   273: new 39	java/lang/StringBuilder
    //   276: dup
    //   277: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   280: aload 11
    //   282: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   285: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   288: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   291: pop
    //   292: aload 4
    //   294: ldc 77
    //   296: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   299: pop
    //   300: goto -77 -> 223
    //   303: astore 4
    //   305: aload 4
    //   307: invokevirtual 102	java/lang/Exception:printStackTrace	()V
    //   310: new 39	java/lang/StringBuilder
    //   313: dup
    //   314: ldc 104
    //   316: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   319: aload_0
    //   320: getfield 23	com/ireadercity/b2/h/d:c	Landroid/content/Context;
    //   323: invokevirtual 109	android/content/Context:getPackageName	()Ljava/lang/String;
    //   326: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   329: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   332: pop
    //   333: new 39	java/lang/StringBuilder
    //   336: dup
    //   337: ldc 111
    //   339: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   342: getstatic 116	com/ireadercity/b2/a:y	Ljava/lang/String;
    //   345: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   348: ldc 118
    //   350: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   353: getstatic 121	com/ireadercity/b2/a:R	Ljava/lang/String;
    //   356: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   359: ldc 123
    //   361: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   364: getstatic 127	com/ireadercity/b2/a:Q	I
    //   367: invokevirtual 130	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   370: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   373: astore 6
    //   375: new 132	org/apache/http/client/methods/HttpGet
    //   378: dup
    //   379: aload 6
    //   381: invokespecial 133	org/apache/http/client/methods/HttpGet:<init>	(Ljava/lang/String;)V
    //   384: astore 4
    //   386: new 135	org/apache/http/impl/client/DefaultHttpClient
    //   389: dup
    //   390: invokespecial 136	org/apache/http/impl/client/DefaultHttpClient:<init>	()V
    //   393: aload 4
    //   395: invokevirtual 140	org/apache/http/impl/client/DefaultHttpClient:execute	(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
    //   398: invokeinterface 146 1 0
    //   403: invokestatic 151	org/apache/http/util/EntityUtils:toString	(Lorg/apache/http/HttpEntity;)Ljava/lang/String;
    //   406: astore 4
    //   408: new 39	java/lang/StringBuilder
    //   411: dup
    //   412: ldc -103
    //   414: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   417: aload 4
    //   419: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   422: ldc -101
    //   424: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   427: aload 6
    //   429: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   432: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   435: pop
    //   436: aload 4
    //   438: invokestatic 160	com/ireadercity/b2/h/y:d	(Ljava/lang/String;)Z
    //   441: ifeq +252 -> 693
    //   444: iconst_0
    //   445: invokestatic 166	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   448: areturn
    //   449: aload 4
    //   451: new 39	java/lang/StringBuilder
    //   454: dup
    //   455: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   458: aload 11
    //   460: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   463: ldc -88
    //   465: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   468: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   471: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   474: pop
    //   475: goto -252 -> 223
    //   478: iload_1
    //   479: aload 7
    //   481: invokeinterface 169 1 0
    //   486: if_icmpne +14 -> 500
    //   489: aload 4
    //   491: ldc -85
    //   493: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   496: pop
    //   497: goto -364 -> 133
    //   500: aload 4
    //   502: ldc -83
    //   504: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   507: pop
    //   508: goto -375 -> 133
    //   511: iload_2
    //   512: getstatic 51	com/ireadercity/b2/h/r:a	Ljava/util/Map;
    //   515: invokeinterface 169 1 0
    //   520: if_icmpne +16 -> 536
    //   523: aload 4
    //   525: ldc -85
    //   527: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   530: pop
    //   531: iload_2
    //   532: istore_1
    //   533: goto -490 -> 43
    //   536: aload 4
    //   538: ldc -83
    //   540: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   543: pop
    //   544: iload_2
    //   545: istore_1
    //   546: goto -503 -> 43
    //   549: aload 4
    //   551: ldc -81
    //   553: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   556: pop
    //   557: aload 4
    //   559: new 39	java/lang/StringBuilder
    //   562: dup
    //   563: invokespecial 40	java/lang/StringBuilder:<init>	()V
    //   566: getstatic 177	com/ireadercity/b2/h/r:c	Ljava/lang/String;
    //   569: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   572: ldc 77
    //   574: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   577: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   580: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   583: pop
    //   584: aload 4
    //   586: ldc -85
    //   588: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   591: pop
    //   592: aload 4
    //   594: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   597: invokestatic 181	com/ireadercity/b2/h/p:a	(Ljava/lang/String;)Z
    //   600: ifeq -290 -> 310
    //   603: getstatic 51	com/ireadercity/b2/h/r:a	Ljava/util/Map;
    //   606: invokeinterface 184 1 0
    //   611: goto -301 -> 310
    //   614: astore 4
    //   616: aload 4
    //   618: invokevirtual 102	java/lang/Exception:printStackTrace	()V
    //   621: new 39	java/lang/StringBuilder
    //   624: dup
    //   625: ldc -103
    //   627: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   630: aconst_null
    //   631: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   634: ldc -101
    //   636: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   639: aload 6
    //   641: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   644: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   647: pop
    //   648: aconst_null
    //   649: astore 4
    //   651: goto -215 -> 436
    //   654: astore 4
    //   656: new 39	java/lang/StringBuilder
    //   659: dup
    //   660: ldc -103
    //   662: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   665: aconst_null
    //   666: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   669: ldc -101
    //   671: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   674: aload 6
    //   676: invokevirtual 46	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   679: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   682: pop
    //   683: aload 4
    //   685: athrow
    //   686: astore 4
    //   688: iconst_0
    //   689: invokestatic 166	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   692: areturn
    //   693: new 186	org/json/JSONObject
    //   696: dup
    //   697: aload 4
    //   699: invokespecial 187	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   702: astore 4
    //   704: aload 4
    //   706: ifnull +12 -> 718
    //   709: aload 4
    //   711: ldc -67
    //   713: invokevirtual 193	org/json/JSONObject:getJSONObject	(Ljava/lang/String;)Lorg/json/JSONObject;
    //   716: astore 5
    //   718: aload 5
    //   720: ifnull +160 -> 880
    //   723: aload 5
    //   725: ldc -61
    //   727: invokevirtual 199	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   730: astore 4
    //   732: aload_0
    //   733: getfield 23	com/ireadercity/b2/h/d:c	Landroid/content/Context;
    //   736: invokestatic 205	android/preference/PreferenceManager:getDefaultSharedPreferences	(Landroid/content/Context;)Landroid/content/SharedPreferences;
    //   739: invokeinterface 211 1 0
    //   744: ldc -43
    //   746: aload 4
    //   748: invokeinterface 219 3 0
    //   753: invokeinterface 222 1 0
    //   758: pop
    //   759: aload 5
    //   761: ldc -32
    //   763: invokevirtual 228	org/json/JSONObject:getInt	(Ljava/lang/String;)I
    //   766: istore_1
    //   767: aload_0
    //   768: aload 5
    //   770: ldc -26
    //   772: invokevirtual 199	org/json/JSONObject:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   775: putfield 19	com/ireadercity/b2/h/d:a	Ljava/lang/String;
    //   778: aload_0
    //   779: getfield 23	com/ireadercity/b2/h/d:c	Landroid/content/Context;
    //   782: invokevirtual 234	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   785: aload_0
    //   786: getfield 23	com/ireadercity/b2/h/d:c	Landroid/content/Context;
    //   789: invokevirtual 109	android/content/Context:getPackageName	()Ljava/lang/String;
    //   792: iconst_0
    //   793: invokevirtual 240	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   796: getfield 245	android/content/pm/PackageInfo:versionCode	I
    //   799: istore_2
    //   800: new 39	java/lang/StringBuilder
    //   803: dup
    //   804: ldc -9
    //   806: invokespecial 80	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   809: iload_2
    //   810: invokevirtual 130	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   813: invokevirtual 86	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   816: pop
    //   817: iload_1
    //   818: iload_2
    //   819: if_icmple +46 -> 865
    //   822: iconst_1
    //   823: invokestatic 166	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   826: areturn
    //   827: astore 4
    //   829: aload 4
    //   831: invokevirtual 248	org/json/JSONException:printStackTrace	()V
    //   834: aconst_null
    //   835: astore 4
    //   837: goto -133 -> 704
    //   840: astore 4
    //   842: aload 4
    //   844: invokevirtual 248	org/json/JSONException:printStackTrace	()V
    //   847: aconst_null
    //   848: areturn
    //   849: aload 4
    //   851: invokevirtual 248	org/json/JSONException:printStackTrace	()V
    //   854: goto -76 -> 778
    //   857: aload 4
    //   859: invokevirtual 249	android/content/pm/PackageManager$NameNotFoundException:printStackTrace	()V
    //   862: goto -45 -> 817
    //   865: iconst_0
    //   866: invokestatic 166	java/lang/Boolean:valueOf	(Z)Ljava/lang/Boolean;
    //   869: areturn
    //   870: astore 4
    //   872: goto -15 -> 857
    //   875: astore 4
    //   877: goto -28 -> 849
    //   880: iconst_0
    //   881: istore_1
    //   882: goto -104 -> 778
    //   885: astore 4
    //   887: iconst_0
    //   888: istore_1
    //   889: goto -40 -> 849
    //   892: astore 4
    //   894: iconst_1
    //   895: istore_2
    //   896: goto -39 -> 857
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	899	0	this	d
    //   42	847	1	i	int
    //   68	828	2	j	int
    //   222	47	3	k	int
    //   7	286	4	localObject1	Object
    //   303	3	4	localException1	Exception
    //   384	209	4	localObject2	Object
    //   614	3	4	localException2	Exception
    //   649	1	4	localObject3	Object
    //   654	30	4	localObject4	Object
    //   686	12	4	localException3	Exception
    //   702	45	4	localObject5	Object
    //   827	3	4	localJSONException1	org.json.JSONException
    //   835	1	4	localObject6	Object
    //   840	18	4	localJSONException2	org.json.JSONException
    //   870	1	4	localNameNotFoundException1	android.content.pm.PackageManager.NameNotFoundException
    //   875	1	4	localJSONException3	org.json.JSONException
    //   885	1	4	localJSONException4	org.json.JSONException
    //   892	1	4	localNameNotFoundException2	android.content.pm.PackageManager.NameNotFoundException
    //   1	768	5	localJSONObject	org.json.JSONObject
    //   39	636	6	localObject7	Object
    //   63	417	7	localObject8	Object
    //   129	15	8	localIterator1	java.util.Iterator
    //   153	111	9	localObject9	Object
    //   219	15	10	localIterator2	java.util.Iterator
    //   243	216	11	str	String
    // Exception table:
    //   from	to	target	type
    //   3	41	303	java/lang/Exception
    //   43	65	303	java/lang/Exception
    //   69	112	303	java/lang/Exception
    //   117	131	303	java/lang/Exception
    //   133	155	303	java/lang/Exception
    //   159	201	303	java/lang/Exception
    //   206	221	303	java/lang/Exception
    //   223	245	303	java/lang/Exception
    //   254	262	303	java/lang/Exception
    //   262	300	303	java/lang/Exception
    //   449	475	303	java/lang/Exception
    //   478	497	303	java/lang/Exception
    //   500	508	303	java/lang/Exception
    //   511	531	303	java/lang/Exception
    //   536	544	303	java/lang/Exception
    //   549	611	303	java/lang/Exception
    //   386	408	614	java/lang/Exception
    //   386	408	654	finally
    //   616	621	654	finally
    //   310	386	686	java/lang/Exception
    //   408	436	686	java/lang/Exception
    //   436	444	686	java/lang/Exception
    //   621	648	686	java/lang/Exception
    //   656	686	686	java/lang/Exception
    //   693	704	686	java/lang/Exception
    //   709	718	686	java/lang/Exception
    //   723	767	686	java/lang/Exception
    //   767	778	686	java/lang/Exception
    //   778	800	686	java/lang/Exception
    //   800	817	686	java/lang/Exception
    //   822	827	686	java/lang/Exception
    //   829	834	686	java/lang/Exception
    //   842	847	686	java/lang/Exception
    //   849	854	686	java/lang/Exception
    //   857	862	686	java/lang/Exception
    //   693	704	827	org/json/JSONException
    //   709	718	840	org/json/JSONException
    //   800	817	870	android/content/pm/PackageManager$NameNotFoundException
    //   767	778	875	org/json/JSONException
    //   723	767	885	org/json/JSONException
    //   778	800	892	android/content/pm/PackageManager$NameNotFoundException
  }
  
  final void a()
  {
    this.b.cancel();
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.fromFile(new File(this.d)), "application/vnd.android.package-archive");
    this.c.startActivity(localIntent);
  }
  
  final void a(String paramString)
  {
    this.b.show();
    new h(this, paramString).start();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */