package com.umeng.xp.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.common.b;
import com.umeng.xp.Promoter;
import com.umeng.xp.a;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.common.g;
import com.umeng.xp.net.XpReportClient;
import com.umeng.xp.net.e.a;
import java.util.ArrayList;
import java.util.List;

public class ExchangeDataService
{
  public static int DEBUG_NEW_TIPS = -1;
  private static final int g = 0;
  private static final int h = 1;
  private static final String p = "EXCHANGE_PRELOAD_ADS";
  private String a = ExchangeDataService.class.getName();
  public int autofill = 1;
  private String b = "";
  private boolean c = true;
  private boolean d = false;
  public int displayStyle = 0;
  private int e = 0;
  private boolean f = false;
  private String i;
  public XpListenersCenter.InitializeListener initializeListener;
  private String j = "PROMOTERS_FIRST_PAGE_";
  private String k = "PROMOTERS_NEXT_PAGE_";
  private String l = "";
  public String landing_image = "";
  public int layoutType = -1;
  private String m = "";
  public Context mContext;
  public XpListenersCenter.ExchangeDataRequestListener mDataReceiverListener = null;
  private String n = "";
  public int newTips = -1;
  private String o = "";
  public long oid;
  public String opensize = "";
  public int page_index = -1;
  public boolean pagination = false;
  public a preloadData;
  public int require_desc = 1;
  public String sessionId = "";
  public boolean show_progress_wheel = true;
  public String slot_id = "";
  public long[] timeLine = new long[4];
  
  public ExchangeDataService()
  {
    this("");
    this.oid = System.currentTimeMillis();
  }
  
  public ExchangeDataService(String paramString)
  {
    this.slot_id = paramString;
    this.oid = System.currentTimeMillis();
  }
  
  private int a(List<Promoter> paramList)
  {
    if (paramList == null)
    {
      i2 = 0;
      return i2;
    }
    ArrayList localArrayList = new ArrayList();
    int i2 = paramList.size() - 1;
    int i1 = 0;
    label28:
    if (i2 >= 0)
    {
      if (b.a(((Promoter)paramList.get(i2)).app_package_name, this.mContext) != true) {
        break label236;
      }
      Log.a(ExchangeConstants.LOG_TAG, "Installed: " + ((Promoter)paramList.get(i2)).title + ". Remove from the list.");
      Promoter localPromoter = (Promoter)paramList.remove(i2);
      localArrayList.add(localPromoter);
      if (localPromoter.new_tip != 1) {
        break label236;
      }
      i1 += 1;
    }
    label236:
    for (;;)
    {
      i2 -= 1;
      break label28;
      i2 = i1;
      if (localArrayList.size() <= 0) {
        break;
      }
      paramList = new e.a(this.mContext).a(-1).b(-1).d(-1).c(-1).a((Promoter[])localArrayList.toArray(new Promoter[0])).c(getTimeConsuming()).b(this.sessionId).a(this.slot_id).a();
      new XpReportClient(this.mContext).sendAsync(paramList, null);
      return i1;
    }
  }
  
  /* Error */
  private java.util.Map<String, Object> a()
  {
    // Byte code:
    //   0: new 253	java/util/HashMap
    //   3: dup
    //   4: invokespecial 254	java/util/HashMap:<init>	()V
    //   7: astore_1
    //   8: aload_1
    //   9: ldc_w 256
    //   12: getstatic 258	com/umeng/xp/common/ExchangeConstants:sdk_version	Ljava/lang/String;
    //   15: invokeinterface 264 3 0
    //   20: pop
    //   21: aload_1
    //   22: ldc_w 266
    //   25: getstatic 268	com/umeng/xp/common/ExchangeConstants:protocol_version	Ljava/lang/String;
    //   28: invokeinterface 264 3 0
    //   33: pop
    //   34: aload_0
    //   35: getfield 107	com/umeng/xp/controller/ExchangeDataService:slot_id	Ljava/lang/String;
    //   38: invokestatic 273	com/umeng/common/b/g:c	(Ljava/lang/String;)Z
    //   41: ifne +629 -> 670
    //   44: aload_1
    //   45: ldc_w 274
    //   48: aload_0
    //   49: getfield 107	com/umeng/xp/controller/ExchangeDataService:slot_id	Ljava/lang/String;
    //   52: invokeinterface 264 3 0
    //   57: pop
    //   58: aload_1
    //   59: ldc_w 276
    //   62: aload_0
    //   63: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   66: invokestatic 279	com/umeng/common/b:f	(Landroid/content/Context;)Ljava/lang/String;
    //   69: invokeinterface 264 3 0
    //   74: pop
    //   75: aload_1
    //   76: ldc_w 281
    //   79: getstatic 286	android/os/Build:MODEL	Ljava/lang/String;
    //   82: invokeinterface 264 3 0
    //   87: pop
    //   88: aload_1
    //   89: ldc_w 288
    //   92: aload_0
    //   93: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   96: invokestatic 290	com/umeng/common/b:d	(Landroid/content/Context;)Ljava/lang/String;
    //   99: invokeinterface 264 3 0
    //   104: pop
    //   105: aload_1
    //   106: ldc_w 292
    //   109: ldc_w 294
    //   112: invokeinterface 264 3 0
    //   117: pop
    //   118: aload_0
    //   119: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   122: invokestatic 298	com/umeng/xp/common/g:b	(Landroid/content/Context;)Ljava/lang/String;
    //   125: invokestatic 304	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   128: ifne +20 -> 148
    //   131: aload_1
    //   132: ldc_w 306
    //   135: aload_0
    //   136: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   139: invokestatic 298	com/umeng/xp/common/g:b	(Landroid/content/Context;)Ljava/lang/String;
    //   142: invokeinterface 264 3 0
    //   147: pop
    //   148: aload_1
    //   149: ldc_w 308
    //   152: aload_0
    //   153: getfield 91	com/umeng/xp/controller/ExchangeDataService:layoutType	I
    //   156: invokestatic 314	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   159: invokeinterface 264 3 0
    //   164: pop
    //   165: aload_1
    //   166: ldc_w 316
    //   169: getstatic 321	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   172: invokeinterface 264 3 0
    //   177: pop
    //   178: aload_1
    //   179: ldc_w 306
    //   182: aload_0
    //   183: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   186: invokestatic 298	com/umeng/xp/common/g:b	(Landroid/content/Context;)Ljava/lang/String;
    //   189: invokeinterface 264 3 0
    //   194: pop
    //   195: aload_0
    //   196: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   199: invokevirtual 327	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   202: invokevirtual 333	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   205: astore_2
    //   206: aload_2
    //   207: ifnull +523 -> 730
    //   210: aload_2
    //   211: getfield 339	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   214: ifnull +516 -> 730
    //   217: aload_1
    //   218: ldc_w 340
    //   221: aload_2
    //   222: getfield 339	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   225: invokevirtual 345	java/util/Locale:getDisplayName	()Ljava/lang/String;
    //   228: invokeinterface 264 3 0
    //   233: pop
    //   234: aload_1
    //   235: ldc_w 347
    //   238: aload_2
    //   239: getfield 339	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   242: invokevirtual 348	java/util/Locale:toString	()Ljava/lang/String;
    //   245: invokeinterface 264 3 0
    //   250: pop
    //   251: aload_1
    //   252: ldc_w 350
    //   255: aload_0
    //   256: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   259: invokestatic 353	com/umeng/common/b:n	(Landroid/content/Context;)I
    //   262: invokestatic 314	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   265: invokeinterface 264 3 0
    //   270: pop
    //   271: aload_1
    //   272: ldc_w 355
    //   275: aload_0
    //   276: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   279: invokestatic 357	com/umeng/common/b:i	(Landroid/content/Context;)Ljava/lang/String;
    //   282: invokeinterface 264 3 0
    //   287: pop
    //   288: aload_0
    //   289: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   292: invokestatic 360	com/umeng/common/b:j	(Landroid/content/Context;)[Ljava/lang/String;
    //   295: astore_2
    //   296: aload_1
    //   297: ldc_w 362
    //   300: aload_2
    //   301: iconst_0
    //   302: aaload
    //   303: invokeinterface 264 3 0
    //   308: pop
    //   309: ldc_w 364
    //   312: aload_2
    //   313: iconst_0
    //   314: aaload
    //   315: invokevirtual 369	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   318: ifeq +16 -> 334
    //   321: aload_1
    //   322: ldc_w 371
    //   325: aload_2
    //   326: iconst_1
    //   327: aaload
    //   328: invokeinterface 264 3 0
    //   333: pop
    //   334: aload_1
    //   335: ldc_w 373
    //   338: aload_0
    //   339: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   342: invokestatic 375	com/umeng/common/b:h	(Landroid/content/Context;)Ljava/lang/String;
    //   345: invokeinterface 264 3 0
    //   350: pop
    //   351: aload_0
    //   352: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   355: invokestatic 378	com/umeng/common/b:l	(Landroid/content/Context;)Landroid/location/Location;
    //   358: astore_2
    //   359: aload_2
    //   360: ifnull +54 -> 414
    //   363: aload_1
    //   364: ldc_w 380
    //   367: aload_2
    //   368: invokevirtual 386	android/location/Location:getLatitude	()D
    //   371: invokestatic 389	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   374: invokeinterface 264 3 0
    //   379: pop
    //   380: aload_1
    //   381: ldc_w 391
    //   384: aload_2
    //   385: invokevirtual 394	android/location/Location:getLongitude	()D
    //   388: invokestatic 389	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   391: invokeinterface 264 3 0
    //   396: pop
    //   397: aload_1
    //   398: ldc_w 396
    //   401: aload_2
    //   402: invokevirtual 399	android/location/Location:getTime	()J
    //   405: invokestatic 402	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   408: invokeinterface 264 3 0
    //   413: pop
    //   414: aload_1
    //   415: ldc_w 404
    //   418: invokestatic 406	com/umeng/common/b:a	()Ljava/lang/String;
    //   421: invokeinterface 264 3 0
    //   426: pop
    //   427: invokestatic 407	com/umeng/common/b/g:a	()Ljava/lang/String;
    //   430: astore_3
    //   431: aload_3
    //   432: ldc_w 409
    //   435: invokevirtual 413	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   438: iconst_0
    //   439: aaload
    //   440: astore_2
    //   441: aload_3
    //   442: ldc_w 409
    //   445: invokevirtual 413	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   448: iconst_1
    //   449: aaload
    //   450: astore_3
    //   451: aload_1
    //   452: ldc_w 415
    //   455: aload_2
    //   456: invokeinterface 264 3 0
    //   461: pop
    //   462: aload_1
    //   463: ldc_w 417
    //   466: aload_3
    //   467: invokeinterface 264 3 0
    //   472: pop
    //   473: aload_1
    //   474: ldc_w 350
    //   477: aload_0
    //   478: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   481: invokestatic 353	com/umeng/common/b:n	(Landroid/content/Context;)I
    //   484: invokestatic 314	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   487: invokeinterface 264 3 0
    //   492: pop
    //   493: aload_0
    //   494: getfield 97	com/umeng/xp/controller/ExchangeDataService:b	Ljava/lang/String;
    //   497: ifnull +29 -> 526
    //   500: ldc 60
    //   502: aload_0
    //   503: getfield 97	com/umeng/xp/controller/ExchangeDataService:b	Ljava/lang/String;
    //   506: invokevirtual 369	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   509: ifne +17 -> 526
    //   512: aload_1
    //   513: ldc_w 419
    //   516: aload_0
    //   517: getfield 97	com/umeng/xp/controller/ExchangeDataService:b	Ljava/lang/String;
    //   520: invokeinterface 264 3 0
    //   525: pop
    //   526: aload_0
    //   527: getfield 85	com/umeng/xp/controller/ExchangeDataService:autofill	I
    //   530: iconst_1
    //   531: if_icmpeq +20 -> 551
    //   534: aload_1
    //   535: ldc_w 420
    //   538: aload_0
    //   539: getfield 85	com/umeng/xp/controller/ExchangeDataService:autofill	I
    //   542: invokestatic 314	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   545: invokeinterface 264 3 0
    //   550: pop
    //   551: aload_0
    //   552: getfield 95	com/umeng/xp/controller/ExchangeDataService:require_desc	I
    //   555: iconst_1
    //   556: if_icmpeq +20 -> 576
    //   559: aload_1
    //   560: ldc_w 421
    //   563: aload_0
    //   564: getfield 95	com/umeng/xp/controller/ExchangeDataService:require_desc	I
    //   567: invokestatic 314	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   570: invokeinterface 264 3 0
    //   575: pop
    //   576: aload_0
    //   577: getfield 87	com/umeng/xp/controller/ExchangeDataService:sessionId	Ljava/lang/String;
    //   580: invokestatic 273	com/umeng/common/b/g:c	(Ljava/lang/String;)Z
    //   583: ifne +63 -> 646
    //   586: aload_0
    //   587: getfield 115	com/umeng/xp/controller/ExchangeDataService:page_index	I
    //   590: iflt +56 -> 646
    //   593: aload_1
    //   594: ldc_w 423
    //   597: aload_0
    //   598: getfield 87	com/umeng/xp/controller/ExchangeDataService:sessionId	Ljava/lang/String;
    //   601: invokeinterface 264 3 0
    //   606: pop
    //   607: getstatic 170	com/umeng/xp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   610: new 172	java/lang/StringBuilder
    //   613: dup
    //   614: ldc_w 425
    //   617: invokespecial 175	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   620: aload_0
    //   621: getfield 87	com/umeng/xp/controller/ExchangeDataService:sessionId	Ljava/lang/String;
    //   624: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   627: ldc_w 427
    //   630: invokevirtual 182	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   633: aload_0
    //   634: getfield 115	com/umeng/xp/controller/ExchangeDataService:page_index	I
    //   637: invokevirtual 430	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   640: invokevirtual 187	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   643: invokestatic 432	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   646: aload_0
    //   647: getfield 109	com/umeng/xp/controller/ExchangeDataService:pagination	Z
    //   650: iconst_1
    //   651: if_icmpne +125 -> 776
    //   654: aload_1
    //   655: ldc_w 434
    //   658: iconst_1
    //   659: invokestatic 314	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   662: invokeinterface 264 3 0
    //   667: pop
    //   668: aload_1
    //   669: areturn
    //   670: aload_0
    //   671: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   674: invokestatic 436	com/umeng/xp/common/g:a	(Landroid/content/Context;)Ljava/lang/String;
    //   677: invokestatic 273	com/umeng/common/b/g:c	(Ljava/lang/String;)Z
    //   680: ifne +39 -> 719
    //   683: aload_1
    //   684: ldc_w 438
    //   687: aload_0
    //   688: getfield 160	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   691: invokestatic 436	com/umeng/xp/common/g:a	(Landroid/content/Context;)Ljava/lang/String;
    //   694: invokeinterface 264 3 0
    //   699: pop
    //   700: goto -642 -> 58
    //   703: astore_2
    //   704: aload_2
    //   705: invokevirtual 441	java/lang/Exception:printStackTrace	()V
    //   708: getstatic 170	com/umeng/xp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   711: ldc_w 443
    //   714: invokestatic 445	com/umeng/common/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   717: aload_1
    //   718: areturn
    //   719: getstatic 170	com/umeng/xp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   722: ldc_w 447
    //   725: invokestatic 449	com/umeng/common/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   728: aconst_null
    //   729: areturn
    //   730: aload_1
    //   731: ldc_w 340
    //   734: ldc_w 451
    //   737: invokeinterface 264 3 0
    //   742: pop
    //   743: aload_1
    //   744: ldc_w 347
    //   747: ldc_w 451
    //   750: invokeinterface 264 3 0
    //   755: pop
    //   756: goto -505 -> 251
    //   759: astore_2
    //   760: aload_1
    //   761: ldc_w 362
    //   764: ldc_w 453
    //   767: invokeinterface 264 3 0
    //   772: pop
    //   773: goto -439 -> 334
    //   776: aload_1
    //   777: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	778	0	this	ExchangeDataService
    //   7	770	1	localHashMap	java.util.HashMap
    //   205	251	2	localObject	Object
    //   703	2	2	localException1	Exception
    //   759	1	2	localException2	Exception
    //   430	37	3	str	String
    // Exception table:
    //   from	to	target	type
    //   8	58	703	java/lang/Exception
    //   58	148	703	java/lang/Exception
    //   148	206	703	java/lang/Exception
    //   210	251	703	java/lang/Exception
    //   251	288	703	java/lang/Exception
    //   334	359	703	java/lang/Exception
    //   363	414	703	java/lang/Exception
    //   414	526	703	java/lang/Exception
    //   526	551	703	java/lang/Exception
    //   551	576	703	java/lang/Exception
    //   576	646	703	java/lang/Exception
    //   646	668	703	java/lang/Exception
    //   670	700	703	java/lang/Exception
    //   719	728	703	java/lang/Exception
    //   730	756	703	java/lang/Exception
    //   760	773	703	java/lang/Exception
    //   288	334	759	java/lang/Exception
  }
  
  private void a(XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, int paramInt)
  {
    if (paramInt == 1)
    {
      b(paramExchangeDataRequestListener, paramInt);
      return;
    }
    new ExchangeDataService.a(this, paramExchangeDataRequestListener, 0, null).start();
  }
  
  private void b(XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, int paramInt)
  {
    if (TextUtils.isEmpty(this.sessionId)) {}
    for (boolean bool = true;; bool = false)
    {
      new ExchangeDataService.a(this, new c(this, paramExchangeDataRequestListener, bool), 1, null).start();
      return;
    }
  }
  
  public int getTemplate()
  {
    return this.e;
  }
  
  public String getTimeConsuming()
  {
    if ((this.timeLine != null) && (this.timeLine.length == 4) && (this.timeLine[0] > 0L))
    {
      long l3 = this.timeLine[0];
      long l4 = this.timeLine[1];
      long l1 = this.timeLine[2];
      long l2 = this.timeLine[3];
      l3 = l4 - l3;
      l1 = l2 - l1;
      if ((l3 > 0L) && (l1 > 0L)) {
        return l3 + "_" + l1;
      }
    }
    return null;
  }
  
  public boolean isFilterInstalledApp()
  {
    return this.c;
  }
  
  public void preloadData(Context paramContext, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener, int paramInt)
  {
    preloadData(paramContext, null, paramNTipsChangedListener, paramInt);
  }
  
  public void preloadData(Context paramContext, List<Promoter> paramList, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener, int paramInt)
  {
    if ((this.layoutType >= 0) && (this.layoutType != paramInt))
    {
      Log.e(this.a, "sorry  type is no match ");
      return;
    }
    this.layoutType = paramInt;
    if (this.preloadData == null) {
      this.preloadData = new a(paramContext, this, paramNTipsChangedListener);
    }
    while ((paramList != null) && (paramList.size() > 0))
    {
      this.preloadData.a(paramList);
      return;
      this.preloadData.a(paramNTipsChangedListener);
    }
    this.preloadData.a();
  }
  
  public void requestDataAsyn(Context paramContext, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener)
  {
    this.i = ("EXCHANGE_PRELOAD_ADS_" + this.b + "_" + this.autofill);
    this.mContext = paramContext;
    if ((TextUtils.isEmpty(this.o)) || (TextUtils.isEmpty(this.l)) || (TextUtils.isEmpty(this.n)) || (TextUtils.isEmpty(this.m)))
    {
      if (!TextUtils.isEmpty(this.slot_id)) {
        break label264;
      }
      paramContext = g.a(this.mContext);
      if (!TextUtils.isEmpty(paramContext)) {
        break label169;
      }
      Log.b(this.a, "No found Slot_id or Appkey!!!!!");
    }
    while ((ExchangeConstants.ONLY_CHINESE) && (!b.a(this.mContext)))
    {
      Log.b(ExchangeConstants.LOG_TAG, "English os can not show ads");
      paramExchangeDataRequestListener.dataReceived(0, null);
      if (this.mDataReceiverListener != null) {
        this.mDataReceiverListener.dataReceived(0, null);
      }
      return;
      label169:
      this.o = ("PRELOAD_KEY_" + paramContext);
      this.l = (this.j + paramContext);
      this.n = (this.k + paramContext);
      this.m = ("PRELOAD_UPDATE_DATE_" + paramContext);
      continue;
      label264:
      this.o = ("PRELOAD_KEY_" + this.slot_id);
      this.l = (this.j + this.slot_id);
      this.n = (this.k + this.slot_id);
      this.m = ("PRELOAD_UPDATE_DATE_" + this.slot_id);
    }
    a(paramExchangeDataRequestListener, this.mContext.getSharedPreferences(this.i, 0).getInt(this.o, 0));
  }
  
  public void setFilterInstalledApp(boolean paramBoolean)
  {
    this.d = true;
    this.c = paramBoolean;
  }
  
  public void setKeywords(String paramString)
  {
    this.b = paramString;
  }
  
  public void setTemplate(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i1 = paramInt;
      if (paramInt > 1) {
        i1 = 1;
      }
      this.e = i1;
      this.f = true;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\controller\ExchangeDataService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */