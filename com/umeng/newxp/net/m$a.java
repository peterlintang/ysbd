package com.umeng.newxp.net;

import android.content.Context;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.b;
import com.umeng.common.ufp.util.g;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.common.c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class m$a
{
  private static final Random B = new Random();
  private static final int C = 32767;
  private String A;
  private int D;
  private String E;
  private int F = 0;
  private String G = "";
  private int H = 1;
  Context a;
  List<Promoter> b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private int l;
  private long m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private int s;
  private int t;
  private int u;
  private int v;
  private String w;
  private String x;
  private String y;
  private String z;
  
  public m$a(Context paramContext)
  {
    this.a = paramContext;
    this.b = new ArrayList();
  }
  
  /* Error */
  private Map<String, Object> a(Context paramContext)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_2
    //   2: new 81	java/util/HashMap
    //   5: dup
    //   6: invokespecial 82	java/util/HashMap:<init>	()V
    //   9: astore 5
    //   11: aload_0
    //   12: getfield 84	com/umeng/newxp/net/m$a:d	Ljava/lang/String;
    //   15: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   18: ifne +231 -> 249
    //   21: aload 5
    //   23: ldc 91
    //   25: aload_0
    //   26: getfield 84	com/umeng/newxp/net/m$a:d	Ljava/lang/String;
    //   29: invokeinterface 97 3 0
    //   34: pop
    //   35: aload_0
    //   36: getfield 99	com/umeng/newxp/net/m$a:y	Ljava/lang/String;
    //   39: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   42: ifne +17 -> 59
    //   45: aload 5
    //   47: ldc 101
    //   49: aload_0
    //   50: getfield 99	com/umeng/newxp/net/m$a:y	Ljava/lang/String;
    //   53: invokeinterface 97 3 0
    //   58: pop
    //   59: aload_0
    //   60: getfield 103	com/umeng/newxp/net/m$a:z	Ljava/lang/String;
    //   63: invokestatic 109	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   66: ifne +17 -> 83
    //   69: aload 5
    //   71: ldc 111
    //   73: aload_0
    //   74: getfield 103	com/umeng/newxp/net/m$a:z	Ljava/lang/String;
    //   77: invokeinterface 97 3 0
    //   82: pop
    //   83: aload_0
    //   84: getfield 113	com/umeng/newxp/net/m$a:A	Ljava/lang/String;
    //   87: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   90: ifne +17 -> 107
    //   93: aload 5
    //   95: ldc 115
    //   97: aload_0
    //   98: getfield 113	com/umeng/newxp/net/m$a:A	Ljava/lang/String;
    //   101: invokeinterface 97 3 0
    //   106: pop
    //   107: aload 5
    //   109: ldc 117
    //   111: aload_0
    //   112: getfield 119	com/umeng/newxp/net/m$a:e	Ljava/lang/String;
    //   115: invokeinterface 97 3 0
    //   120: pop
    //   121: aload 5
    //   123: ldc 121
    //   125: aload_0
    //   126: getfield 123	com/umeng/newxp/net/m$a:f	Ljava/lang/String;
    //   129: invokeinterface 97 3 0
    //   134: pop
    //   135: aload 5
    //   137: ldc 125
    //   139: aload_0
    //   140: getfield 127	com/umeng/newxp/net/m$a:m	J
    //   143: invokestatic 133	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   146: invokeinterface 97 3 0
    //   151: pop
    //   152: aload 5
    //   154: ldc -121
    //   156: getstatic 140	android/os/Build:MODEL	Ljava/lang/String;
    //   159: invokeinterface 97 3 0
    //   164: pop
    //   165: aload_0
    //   166: getfield 64	com/umeng/newxp/net/m$a:G	Ljava/lang/String;
    //   169: invokestatic 109	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   172: istore 4
    //   174: iload 4
    //   176: ifne +178 -> 354
    //   179: aload_0
    //   180: getfield 64	com/umeng/newxp/net/m$a:G	Ljava/lang/String;
    //   183: ldc -114
    //   185: invokevirtual 148	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   188: astore 7
    //   190: new 81	java/util/HashMap
    //   193: dup
    //   194: invokespecial 82	java/util/HashMap:<init>	()V
    //   197: astore 6
    //   199: aload 7
    //   201: arraylength
    //   202: istore_3
    //   203: iload_2
    //   204: iload_3
    //   205: if_icmpge +89 -> 294
    //   208: aload 7
    //   210: iload_2
    //   211: aaload
    //   212: ldc -106
    //   214: invokevirtual 148	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   217: astore 8
    //   219: aload 8
    //   221: arraylength
    //   222: iconst_2
    //   223: if_icmpne +19 -> 242
    //   226: aload 6
    //   228: aload 8
    //   230: iconst_0
    //   231: aaload
    //   232: aload 8
    //   234: iconst_1
    //   235: aaload
    //   236: invokeinterface 97 3 0
    //   241: pop
    //   242: iload_2
    //   243: iconst_1
    //   244: iadd
    //   245: istore_2
    //   246: goto -43 -> 203
    //   249: aload_0
    //   250: getfield 152	com/umeng/newxp/net/m$a:c	Ljava/lang/String;
    //   253: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   256: ifne +28 -> 284
    //   259: aload 5
    //   261: ldc -102
    //   263: aload_0
    //   264: getfield 152	com/umeng/newxp/net/m$a:c	Ljava/lang/String;
    //   267: invokeinterface 97 3 0
    //   272: pop
    //   273: goto -238 -> 35
    //   276: astore_1
    //   277: aload_1
    //   278: invokevirtual 157	java/lang/Exception:printStackTrace	()V
    //   281: aload 5
    //   283: areturn
    //   284: getstatic 162	com/umeng/newxp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   287: ldc -92
    //   289: invokestatic 169	com/umeng/common/ufp/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   292: aconst_null
    //   293: areturn
    //   294: aload 6
    //   296: invokeinterface 173 1 0
    //   301: invokeinterface 179 1 0
    //   306: astore 7
    //   308: aload 7
    //   310: invokeinterface 185 1 0
    //   315: ifeq +39 -> 354
    //   318: aload 7
    //   320: invokeinterface 189 1 0
    //   325: checkcast 144	java/lang/String
    //   328: astore 8
    //   330: aload 5
    //   332: aload 8
    //   334: aload 6
    //   336: aload 8
    //   338: invokeinterface 193 2 0
    //   343: invokeinterface 97 3 0
    //   348: pop
    //   349: goto -41 -> 308
    //   352: astore 6
    //   354: aload_1
    //   355: invokestatic 198	com/umeng/common/ufp/b:D	(Landroid/content/Context;)Ljava/lang/String;
    //   358: astore 6
    //   360: aload 6
    //   362: invokestatic 109	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   365: ifne +15 -> 380
    //   368: aload 5
    //   370: ldc -56
    //   372: aload 6
    //   374: invokeinterface 97 3 0
    //   379: pop
    //   380: aload 5
    //   382: ldc -54
    //   384: aload_1
    //   385: invokestatic 204	com/umeng/common/ufp/b:s	(Landroid/content/Context;)Ljava/lang/String;
    //   388: invokeinterface 97 3 0
    //   393: pop
    //   394: aload_0
    //   395: getfield 206	com/umeng/newxp/net/m$a:x	Ljava/lang/String;
    //   398: invokestatic 109	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   401: ifne +17 -> 418
    //   404: aload 5
    //   406: ldc -48
    //   408: aload_0
    //   409: getfield 206	com/umeng/newxp/net/m$a:x	Ljava/lang/String;
    //   412: invokeinterface 97 3 0
    //   417: pop
    //   418: aload 5
    //   420: ldc -46
    //   422: getstatic 215	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   425: invokeinterface 97 3 0
    //   430: pop
    //   431: aload 5
    //   433: ldc -39
    //   435: ldc -37
    //   437: invokeinterface 97 3 0
    //   442: pop
    //   443: aload 5
    //   445: ldc -35
    //   447: aload_0
    //   448: getfield 223	com/umeng/newxp/net/m$a:D	I
    //   451: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   454: invokeinterface 97 3 0
    //   459: pop
    //   460: aload 5
    //   462: ldc -26
    //   464: aload_1
    //   465: invokevirtual 236	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   468: invokestatic 241	com/umeng/newxp/common/b/a:a	(Landroid/content/Context;)Lcom/umeng/newxp/common/b/a;
    //   471: invokevirtual 244	com/umeng/newxp/common/b/a:a	()Ljava/lang/String;
    //   474: invokeinterface 97 3 0
    //   479: pop
    //   480: aload 5
    //   482: ldc -10
    //   484: aload_0
    //   485: getfield 248	com/umeng/newxp/net/m$a:q	Ljava/lang/String;
    //   488: invokeinterface 97 3 0
    //   493: pop
    //   494: aload_0
    //   495: getfield 250	com/umeng/newxp/net/m$a:r	Ljava/lang/String;
    //   498: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   501: ifne +17 -> 518
    //   504: aload 5
    //   506: ldc -4
    //   508: aload_0
    //   509: getfield 250	com/umeng/newxp/net/m$a:r	Ljava/lang/String;
    //   512: invokeinterface 97 3 0
    //   517: pop
    //   518: aload_0
    //   519: getfield 254	com/umeng/newxp/net/m$a:E	Ljava/lang/String;
    //   522: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   525: ifne +18 -> 543
    //   528: aload 5
    //   530: ldc_w 256
    //   533: aload_0
    //   534: getfield 254	com/umeng/newxp/net/m$a:E	Ljava/lang/String;
    //   537: invokeinterface 97 3 0
    //   542: pop
    //   543: aload_0
    //   544: getfield 258	com/umeng/newxp/net/m$a:g	Ljava/lang/String;
    //   547: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   550: ifne +18 -> 568
    //   553: aload 5
    //   555: ldc_w 260
    //   558: aload_0
    //   559: getfield 258	com/umeng/newxp/net/m$a:g	Ljava/lang/String;
    //   562: invokeinterface 97 3 0
    //   567: pop
    //   568: aload_0
    //   569: getfield 262	com/umeng/newxp/net/m$a:h	Ljava/lang/String;
    //   572: invokestatic 109	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   575: ifne +18 -> 593
    //   578: aload 5
    //   580: ldc_w 264
    //   583: aload_0
    //   584: getfield 262	com/umeng/newxp/net/m$a:h	Ljava/lang/String;
    //   587: invokeinterface 97 3 0
    //   592: pop
    //   593: aload_0
    //   594: getfield 266	com/umeng/newxp/net/m$a:i	Ljava/lang/String;
    //   597: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   600: ifne +36 -> 636
    //   603: aload 5
    //   605: ldc_w 268
    //   608: aload_0
    //   609: getfield 266	com/umeng/newxp/net/m$a:i	Ljava/lang/String;
    //   612: invokeinterface 97 3 0
    //   617: pop
    //   618: aload 5
    //   620: ldc_w 270
    //   623: aload_0
    //   624: getfield 266	com/umeng/newxp/net/m$a:i	Ljava/lang/String;
    //   627: invokestatic 273	com/umeng/common/ufp/util/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   630: invokeinterface 97 3 0
    //   635: pop
    //   636: aload_1
    //   637: invokestatic 276	com/umeng/common/ufp/b:y	(Landroid/content/Context;)Landroid/location/Location;
    //   640: astore_1
    //   641: aload_1
    //   642: ifnull +57 -> 699
    //   645: aload 5
    //   647: ldc_w 278
    //   650: aload_1
    //   651: invokevirtual 284	android/location/Location:getLatitude	()D
    //   654: invokestatic 287	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   657: invokeinterface 97 3 0
    //   662: pop
    //   663: aload 5
    //   665: ldc_w 289
    //   668: aload_1
    //   669: invokevirtual 292	android/location/Location:getLongitude	()D
    //   672: invokestatic 287	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   675: invokeinterface 97 3 0
    //   680: pop
    //   681: aload 5
    //   683: ldc_w 294
    //   686: aload_1
    //   687: invokevirtual 298	android/location/Location:getTime	()J
    //   690: invokestatic 301	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   693: invokeinterface 97 3 0
    //   698: pop
    //   699: aload 5
    //   701: ldc_w 303
    //   704: aload_0
    //   705: getfield 305	com/umeng/newxp/net/m$a:j	Ljava/lang/String;
    //   708: invokeinterface 97 3 0
    //   713: pop
    //   714: aload 5
    //   716: ldc_w 307
    //   719: aload_0
    //   720: getfield 309	com/umeng/newxp/net/m$a:k	Ljava/lang/String;
    //   723: invokeinterface 97 3 0
    //   728: pop
    //   729: aload 5
    //   731: ldc_w 311
    //   734: aload_0
    //   735: getfield 313	com/umeng/newxp/net/m$a:l	I
    //   738: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   741: invokeinterface 97 3 0
    //   746: pop
    //   747: aload 5
    //   749: ldc_w 315
    //   752: aload_0
    //   753: getfield 317	com/umeng/newxp/net/m$a:n	Ljava/lang/String;
    //   756: invokeinterface 97 3 0
    //   761: pop
    //   762: aload_0
    //   763: getfield 76	com/umeng/newxp/net/m$a:o	Ljava/lang/String;
    //   766: ifnull +265 -> 1031
    //   769: aload_0
    //   770: getfield 76	com/umeng/newxp/net/m$a:o	Ljava/lang/String;
    //   773: astore_1
    //   774: aload 5
    //   776: ldc_w 319
    //   779: aload_1
    //   780: invokeinterface 97 3 0
    //   785: pop
    //   786: aload 5
    //   788: ldc_w 321
    //   791: aload_0
    //   792: getfield 323	com/umeng/newxp/net/m$a:p	Ljava/lang/String;
    //   795: invokeinterface 97 3 0
    //   800: pop
    //   801: aload 5
    //   803: ldc_w 325
    //   806: aload_0
    //   807: getfield 327	com/umeng/newxp/net/m$a:s	I
    //   810: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   813: invokeinterface 97 3 0
    //   818: pop
    //   819: aload 5
    //   821: ldc_w 329
    //   824: aload_0
    //   825: getfield 331	com/umeng/newxp/net/m$a:t	I
    //   828: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   831: invokeinterface 97 3 0
    //   836: pop
    //   837: aload 5
    //   839: ldc_w 333
    //   842: aload_0
    //   843: getfield 335	com/umeng/newxp/net/m$a:u	I
    //   846: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   849: invokeinterface 97 3 0
    //   854: pop
    //   855: aload 5
    //   857: ldc_w 337
    //   860: aload_0
    //   861: getfield 339	com/umeng/newxp/net/m$a:v	I
    //   864: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   867: invokeinterface 97 3 0
    //   872: pop
    //   873: aload_0
    //   874: getfield 341	com/umeng/newxp/net/m$a:w	Ljava/lang/String;
    //   877: invokestatic 89	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   880: ifne +18 -> 898
    //   883: aload 5
    //   885: ldc_w 343
    //   888: aload_0
    //   889: getfield 341	com/umeng/newxp/net/m$a:w	Ljava/lang/String;
    //   892: invokeinterface 97 3 0
    //   897: pop
    //   898: aload_0
    //   899: getfield 60	com/umeng/newxp/net/m$a:F	I
    //   902: ifeq +21 -> 923
    //   905: aload 5
    //   907: ldc_w 345
    //   910: aload_0
    //   911: getfield 60	com/umeng/newxp/net/m$a:F	I
    //   914: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   917: invokeinterface 97 3 0
    //   922: pop
    //   923: aload 5
    //   925: ldc_w 347
    //   928: aload_0
    //   929: getfield 66	com/umeng/newxp/net/m$a:H	I
    //   932: invokestatic 228	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   935: invokeinterface 97 3 0
    //   940: pop
    //   941: aload_0
    //   942: getfield 84	com/umeng/newxp/net/m$a:d	Ljava/lang/String;
    //   945: invokestatic 109	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   948: ifeq +75 -> 1023
    //   951: aload_0
    //   952: getfield 152	com/umeng/newxp/net/m$a:c	Ljava/lang/String;
    //   955: astore_1
    //   956: new 349	com/umeng/newxp/controller/h
    //   959: dup
    //   960: aload_0
    //   961: getfield 68	com/umeng/newxp/net/m$a:a	Landroid/content/Context;
    //   964: aload_1
    //   965: invokespecial 352	com/umeng/newxp/controller/h:<init>	(Landroid/content/Context;Ljava/lang/String;)V
    //   968: astore_1
    //   969: aload_1
    //   970: invokevirtual 354	com/umeng/newxp/controller/h:b	()Z
    //   973: ifeq -692 -> 281
    //   976: aload_1
    //   977: invokevirtual 356	com/umeng/newxp/controller/h:c	()Ljava/lang/String;
    //   980: astore_1
    //   981: aload_1
    //   982: ifnull -701 -> 281
    //   985: aload 5
    //   987: ldc_w 358
    //   990: aload_1
    //   991: invokeinterface 97 3 0
    //   996: pop
    //   997: goto -716 -> 281
    //   1000: astore_1
    //   1001: getstatic 162	com/umeng/newxp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   1004: ldc 62
    //   1006: aload_1
    //   1007: invokestatic 361	com/umeng/common/ufp/Log:b	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V
    //   1010: goto -729 -> 281
    //   1013: astore 6
    //   1015: getstatic 162	com/umeng/newxp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   1018: astore 6
    //   1020: goto -540 -> 480
    //   1023: aload_0
    //   1024: getfield 84	com/umeng/newxp/net/m$a:d	Ljava/lang/String;
    //   1027: astore_1
    //   1028: goto -72 -> 956
    //   1031: ldc 62
    //   1033: astore_1
    //   1034: goto -260 -> 774
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1037	0	this	a
    //   0	1037	1	paramContext	Context
    //   1	245	2	i1	int
    //   202	4	3	i2	int
    //   172	3	4	bool	boolean
    //   9	977	5	localHashMap1	java.util.HashMap
    //   197	138	6	localHashMap2	java.util.HashMap
    //   352	1	6	localException1	Exception
    //   358	15	6	str1	String
    //   1013	1	6	localException2	Exception
    //   1018	1	6	str2	String
    //   188	131	7	localObject1	Object
    //   217	120	8	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   11	35	276	java/lang/Exception
    //   35	59	276	java/lang/Exception
    //   59	83	276	java/lang/Exception
    //   83	107	276	java/lang/Exception
    //   107	174	276	java/lang/Exception
    //   249	273	276	java/lang/Exception
    //   284	292	276	java/lang/Exception
    //   354	380	276	java/lang/Exception
    //   380	418	276	java/lang/Exception
    //   418	460	276	java/lang/Exception
    //   480	518	276	java/lang/Exception
    //   518	543	276	java/lang/Exception
    //   543	568	276	java/lang/Exception
    //   568	593	276	java/lang/Exception
    //   593	636	276	java/lang/Exception
    //   636	641	276	java/lang/Exception
    //   645	699	276	java/lang/Exception
    //   699	774	276	java/lang/Exception
    //   774	898	276	java/lang/Exception
    //   898	923	276	java/lang/Exception
    //   923	956	276	java/lang/Exception
    //   1001	1010	276	java/lang/Exception
    //   1015	1020	276	java/lang/Exception
    //   1023	1028	276	java/lang/Exception
    //   179	203	352	java/lang/Exception
    //   208	242	352	java/lang/Exception
    //   294	308	352	java/lang/Exception
    //   308	349	352	java/lang/Exception
    //   956	981	1000	java/lang/Exception
    //   985	997	1000	java/lang/Exception
    //   460	480	1013	java/lang/Exception
  }
  
  private boolean a(Map<String, Object> paramMap)
  {
    boolean bool1 = true;
    if (m.e == null) {
      m.e = new String[] { "category", "sid", "device_id", "idmd5", "mc", "action_type", "action_index", "layout_type", "time", "date", "access", "access_subtype" };
    }
    boolean bool2;
    if ((paramMap == null) || (paramMap.size() == 0))
    {
      bool2 = false;
      return bool2;
    }
    String[] arrayOfString = m.e;
    int i2 = arrayOfString.length;
    int i1 = 0;
    for (;;)
    {
      bool2 = bool1;
      if (i1 >= i2) {
        break;
      }
      String str = arrayOfString[i1];
      if (!paramMap.containsKey(str))
      {
        Log.e(ExchangeConstants.LOG_TAG, "Report params has no required param [" + str + "]");
        bool1 = false;
      }
      i1 += 1;
    }
  }
  
  public a a(int paramInt)
  {
    this.s = paramInt;
    return this;
  }
  
  public a a(String paramString)
  {
    this.d = paramString;
    return this;
  }
  
  public a a(String paramString1, String paramString2)
  {
    this.g = paramString1;
    this.h = paramString2;
    return this;
  }
  
  public a a(Promoter... paramVarArgs)
  {
    int i2 = 0;
    int i3 = paramVarArgs.length;
    int i1 = 0;
    Object localObject;
    while (i1 < i3)
    {
      localObject = paramVarArgs[i1];
      this.b.add(localObject);
      i1 += 1;
    }
    if ((this.b != null) && (this.b.size() > 0))
    {
      i3 = this.b.size();
      try
      {
        paramVarArgs = (Promoter)this.b.get(0);
        if (this.b.size() == 1)
        {
          this.G = paramVarArgs.prom_act_pams;
          Log.a(m.f(), "set promoter act_pams to report act_params. [" + this.G + "]");
        }
        for (;;)
        {
          paramVarArgs = new StringBuffer();
          localObject = new StringBuffer();
          i1 = i2;
          while (i1 < i3)
          {
            Promoter localPromoter = (Promoter)this.b.get(i1);
            paramVarArgs.append(localPromoter.promoter + ",");
            ((StringBuffer)localObject).append(localPromoter.category + ",");
            i1 += 1;
          }
          this.G = paramVarArgs.slot_act_pams;
          Log.a(m.f(), "set slot act_pams to report act_params. [" + this.G + "]");
        }
      }
      catch (NullPointerException paramVarArgs)
      {
        for (;;) {}
        paramVarArgs.deleteCharAt(paramVarArgs.length() - 1);
        this.o = paramVarArgs.toString();
        this.p = ((StringBuffer)localObject).toString();
      }
    }
    return this;
  }
  
  public m a()
  {
    return new m(b());
  }
  
  public a b(int paramInt)
  {
    this.t = paramInt;
    return this;
  }
  
  public a b(String paramString)
  {
    this.x = paramString;
    return this;
  }
  
  public Map<String, Object> b()
  {
    this.e = ExchangeConstants.sdk_version;
    this.f = ExchangeConstants.protocol_version;
    this.i = b.q(this.a);
    Object localObject = g.a();
    this.j = localObject.split(" ")[0];
    this.k = localObject.split(" ")[1];
    this.m = System.currentTimeMillis();
    this.l = b.A(this.a);
    if (b.m(this.a)) {
      localObject = "0";
    }
    for (;;)
    {
      this.n = ((String)localObject);
      this.w = c.K(this.a);
      this.D = B.nextInt(32767);
      try
      {
        localObject = b.w(this.a);
        this.q = localObject[0];
        if ("2G/3G".equals(localObject[0])) {
          this.r = localObject[1];
        }
        localObject = a(this.a);
        if ((ExchangeConstants.DEBUG_MODE) && (!a((Map)localObject))) {
          Log.e(ExchangeConstants.LOG_TAG, "Report params verify failed...");
        }
        return (Map<String, Object>)localObject;
        localObject = "1";
      }
      catch (Exception localException)
      {
        for (;;)
        {
          this.q = "Unknown";
        }
      }
    }
  }
  
  public a c(int paramInt)
  {
    this.u = paramInt;
    return this;
  }
  
  public a c(String paramString)
  {
    this.z = paramString;
    return this;
  }
  
  public String c()
  {
    return this.z;
  }
  
  public a d(int paramInt)
  {
    this.v = paramInt;
    return this;
  }
  
  public a d(String paramString)
  {
    this.y = paramString;
    return this;
  }
  
  public a e(int paramInt)
  {
    this.H = paramInt;
    return this;
  }
  
  public a e(String paramString)
  {
    this.A = paramString;
    return this;
  }
  
  public a f(int paramInt)
  {
    this.F = paramInt;
    return this;
  }
  
  public a f(String paramString)
  {
    this.c = paramString;
    return this;
  }
  
  public a g(String paramString)
  {
    this.E = paramString;
    return this;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\m$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */