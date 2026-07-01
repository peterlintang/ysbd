package com.umeng.newxp.controller;

import android.app.Activity;
import android.content.Context;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.UBroadcastReceiver;
import com.umeng.newxp.a;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.i;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.net.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class ExchangeDataService
{
  public static int DEBUG_NEW_TIPS = -1;
  protected static final int e = 0;
  protected static final int f = 1;
  private static String i;
  private static final String y = "EXCHANGE_PRELOAD_ADS";
  protected boolean a = true;
  public String appkey = "";
  public int autofill = 1;
  protected int b = 0;
  public boolean broadcast = false;
  protected long c = -1L;
  public boolean cacheLiveData = false;
  protected final boolean d = false;
  public int displayStyle = 0;
  public String displayType = "bigImg";
  public String entryStr = "";
  public String filterPromoter;
  private final String g = ExchangeDataService.class.getName();
  private com.taobao.munion.model.b h;
  public XpListenersCenter.InitializeListener initializeListener;
  private int j;
  private String k = "";
  private String l = "";
  public String landingUrl = "";
  public String landing_image = "";
  public int layoutType = -1;
  private boolean m = false;
  public Context mContext;
  public XpListenersCenter.ExchangeDataRequestListener mDataReceiverListener = null;
  public a module = a.a;
  private String n;
  public int newTips = -1;
  private String o = "";
  public long oid;
  public String opensize = "";
  private String p;
  public int page_index = -1;
  public boolean pagination = false;
  public String psid = "";
  private final String q = "PROMOTERS_FIRST_PAGE_";
  private final String r = "PROMOTERS_NEXT_PAGE_";
  public int require_desc = 1;
  public com.umeng.newxp.b resType;
  private String s = "";
  public String sessionId = "";
  public boolean show_progress_wheel = true;
  public String slot_act_params = "";
  public String slot_id = "";
  private String t = "";
  public String tabId = "";
  public com.umeng.newxp.c template;
  public long[] timeLine = new long[4];
  private String u = "";
  public String urlParams;
  private String v = "";
  private d w;
  private Class<? extends Promoter> x;
  private String z;
  
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
  
  private void a(XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, int paramInt)
  {
    if (paramInt == 1)
    {
      b(paramExchangeDataRequestListener, paramInt);
      return;
    }
    new g(this, paramExchangeDataRequestListener, 0, null, this.cacheLiveData).a(g.c, new Void[0]);
  }
  
  private void b(XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, int paramInt)
  {
    if (TextUtils.isEmpty(this.sessionId)) {}
    for (boolean bool = true;; bool = false)
    {
      new g(this, new ExchangeDataService.3(this, paramExchangeDataRequestListener, bool), 1, null, false).a(g.c, new Void[0]);
      return;
    }
  }
  
  public void clickOnPromoter(Activity paramActivity, Promoter paramPromoter)
  {
    b.a(paramPromoter, paramActivity, this, false);
  }
  
  public void consumeCredit(int paramInt, XpListenersCenter.UMCreditListener paramUMCreditListener)
  {
    if ((TextUtils.isEmpty(this.slot_id)) || (TextUtils.isEmpty(this.o))) {
      throw new RuntimeException("params error");
    }
    new ExchangeDataService.5(this, paramInt, paramUMCreditListener).execute(new Void[0]);
  }
  
  protected int filter(List<Promoter> paramList)
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
      Promoter localPromoter = (Promoter)paramList.get(i2);
      if ((localPromoter == null) || (!localPromoter.filterInstalledApp) || (!this.a) || (!com.umeng.common.ufp.b.a(localPromoter.app_package_name, this.mContext))) {
        break label279;
      }
      Log.a(ExchangeConstants.LOG_TAG, "Installed: " + ((Promoter)paramList.get(i2)).title + ". Remove from the list.");
      localPromoter = (Promoter)paramList.remove(i2);
      localArrayList.add(localPromoter);
      if (localPromoter.new_tip != 1) {
        break label279;
      }
      i1 += 1;
    }
    label279:
    for (;;)
    {
      i2 -= 1;
      break label28;
      i2 = i1;
      if (localArrayList.size() <= 0) {
        break;
      }
      paramList = new m.a(this.mContext).a(-1).b(-1).d(-1).c(this.layoutType).a((Promoter[])localArrayList.toArray(new Promoter[0])).g(getTimeConsuming()).a(this.sessionId, this.psid).f(com.umeng.newxp.common.c.a(this.mContext, this)).a(this.slot_id).a();
      new XpReportClient(this.mContext).sendAsync(paramList, null);
      return i1;
    }
  }
  
  public String getBroadCastAction(Context paramContext)
  {
    String str;
    if (TextUtils.isEmpty(this.z))
    {
      str = com.umeng.newxp.common.c.a(paramContext, this);
      if (!TextUtils.isEmpty(this.slot_id)) {
        break label94;
      }
    }
    for (;;)
    {
      str = com.umeng.common.ufp.util.g.a(str);
      this.z = (com.umeng.common.ufp.b.H(paramContext) + "." + str);
      Log.c(this.g, "Get BroadcastAction " + this.z);
      return this.z;
      label94:
      str = this.slot_id;
    }
  }
  
  public String getCreditUID()
  {
    return this.o;
  }
  
  public com.taobao.munion.model.b getEWallMainBean()
  {
    if (this.h == null)
    {
      this.h = new com.taobao.munion.model.b(new JSONObject());
      this.h.a(this.slot_id);
      this.h.a(this.page_index);
      this.h.b(getTimeConsuming());
      this.h.b(this.layoutType);
      this.h.e = this.psid;
      this.h.n = this.slot_act_params;
    }
    return this.h;
  }
  
  public String getKeywords()
  {
    return this.k;
  }
  
  public int getLandingType()
  {
    return this.j;
  }
  
  public d getPreloadData()
  {
    return this.w;
  }
  
  /* Error */
  protected Map<String, Object> getRequestInput()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: new 432	java/util/HashMap
    //   5: dup
    //   6: invokespecial 433	java/util/HashMap:<init>	()V
    //   9: astore 8
    //   11: aload_0
    //   12: getfield 122	com/umeng/newxp/controller/ExchangeDataService:layoutType	I
    //   15: bipush 10
    //   17: if_icmpne +37 -> 54
    //   20: aload_0
    //   21: getfield 162	com/umeng/newxp/controller/ExchangeDataService:o	Ljava/lang/String;
    //   24: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   27: ifeq +27 -> 54
    //   30: iconst_1
    //   31: istore 4
    //   33: iload 4
    //   35: putstatic 436	com/umeng/newxp/common/ExchangeConstants:DEBUG_MODE	Z
    //   38: iload 4
    //   40: ifeq +20 -> 60
    //   43: new 243	java/lang/RuntimeException
    //   46: dup
    //   47: ldc_w 438
    //   50: invokespecial 246	java/lang/RuntimeException:<init>	(Ljava/lang/String;)V
    //   53: athrow
    //   54: iconst_0
    //   55: istore 4
    //   57: goto -24 -> 33
    //   60: aload 8
    //   62: ldc_w 440
    //   65: getstatic 442	com/umeng/newxp/common/ExchangeConstants:sdk_version	Ljava/lang/String;
    //   68: invokeinterface 448 3 0
    //   73: pop
    //   74: aload 8
    //   76: ldc_w 450
    //   79: getstatic 452	com/umeng/newxp/common/ExchangeConstants:protocol_version	Ljava/lang/String;
    //   82: invokeinterface 448 3 0
    //   87: pop
    //   88: aload_0
    //   89: getfield 150	com/umeng/newxp/controller/ExchangeDataService:slot_id	Ljava/lang/String;
    //   92: invokestatic 455	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   95: ifne +213 -> 308
    //   98: aload 8
    //   100: ldc_w 456
    //   103: aload_0
    //   104: getfield 150	com/umeng/newxp/controller/ExchangeDataService:slot_id	Ljava/lang/String;
    //   107: invokeinterface 448 3 0
    //   112: pop
    //   113: aload_0
    //   114: getfield 458	com/umeng/newxp/controller/ExchangeDataService:filterPromoter	Ljava/lang/String;
    //   117: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   120: ifne +18 -> 138
    //   123: aload 8
    //   125: ldc_w 460
    //   128: aload_0
    //   129: getfield 458	com/umeng/newxp/controller/ExchangeDataService:filterPromoter	Ljava/lang/String;
    //   132: invokeinterface 448 3 0
    //   137: pop
    //   138: aload_0
    //   139: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   142: invokestatic 463	com/umeng/newxp/common/c:K	(Landroid/content/Context;)Ljava/lang/String;
    //   145: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   148: ifne +21 -> 169
    //   151: aload 8
    //   153: ldc_w 465
    //   156: aload_0
    //   157: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   160: invokestatic 463	com/umeng/newxp/common/c:K	(Landroid/content/Context;)Ljava/lang/String;
    //   163: invokeinterface 448 3 0
    //   168: pop
    //   169: aload 8
    //   171: ldc_w 467
    //   174: aload_0
    //   175: getfield 122	com/umeng/newxp/controller/ExchangeDataService:layoutType	I
    //   178: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   181: invokeinterface 448 3 0
    //   186: pop
    //   187: aload_0
    //   188: getfield 132	com/umeng/newxp/controller/ExchangeDataService:k	Ljava/lang/String;
    //   191: ifnull +33 -> 224
    //   194: ldc 89
    //   196: aload_0
    //   197: getfield 132	com/umeng/newxp/controller/ExchangeDataService:k	Ljava/lang/String;
    //   200: invokevirtual 478	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   203: ifne +21 -> 224
    //   206: aload 8
    //   208: ldc_w 480
    //   211: aload_0
    //   212: getfield 132	com/umeng/newxp/controller/ExchangeDataService:k	Ljava/lang/String;
    //   215: invokestatic 482	com/umeng/newxp/common/c:d	(Ljava/lang/String;)Ljava/lang/String;
    //   218: invokeinterface 448 3 0
    //   223: pop
    //   224: aload_0
    //   225: getfield 152	com/umeng/newxp/controller/ExchangeDataService:slot_act_params	Ljava/lang/String;
    //   228: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   231: ifne +201 -> 432
    //   234: aload_0
    //   235: getfield 152	com/umeng/newxp/controller/ExchangeDataService:slot_act_params	Ljava/lang/String;
    //   238: ldc_w 484
    //   241: invokevirtual 488	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   244: astore 9
    //   246: new 432	java/util/HashMap
    //   249: dup
    //   250: invokespecial 433	java/util/HashMap:<init>	()V
    //   253: astore 7
    //   255: aload 9
    //   257: arraylength
    //   258: istore_3
    //   259: iconst_0
    //   260: istore_1
    //   261: iload_1
    //   262: iload_3
    //   263: if_icmpge +109 -> 372
    //   266: aload 9
    //   268: iload_1
    //   269: aaload
    //   270: ldc_w 490
    //   273: invokevirtual 488	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   276: astore 10
    //   278: aload 10
    //   280: arraylength
    //   281: iconst_2
    //   282: if_icmpne +19 -> 301
    //   285: aload 7
    //   287: aload 10
    //   289: iconst_0
    //   290: aaload
    //   291: aload 10
    //   293: iconst_1
    //   294: aaload
    //   295: invokeinterface 448 3 0
    //   300: pop
    //   301: iload_1
    //   302: iconst_1
    //   303: iadd
    //   304: istore_1
    //   305: goto -44 -> 261
    //   308: aload_0
    //   309: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   312: aload_0
    //   313: invokestatic 359	com/umeng/newxp/common/c:a	(Landroid/content/Context;Lcom/umeng/newxp/controller/ExchangeDataService;)Ljava/lang/String;
    //   316: astore 7
    //   318: aload 7
    //   320: invokestatic 455	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   323: ifne +38 -> 361
    //   326: aload 8
    //   328: ldc_w 492
    //   331: aload 7
    //   333: invokeinterface 448 3 0
    //   338: pop
    //   339: goto -226 -> 113
    //   342: astore 7
    //   344: aload 7
    //   346: invokevirtual 495	java/lang/Exception:printStackTrace	()V
    //   349: getstatic 290	com/umeng/newxp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   352: ldc_w 497
    //   355: invokestatic 499	com/umeng/common/ufp/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   358: aload 8
    //   360: areturn
    //   361: getstatic 290	com/umeng/newxp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   364: ldc_w 501
    //   367: invokestatic 503	com/umeng/common/ufp/Log:b	(Ljava/lang/String;Ljava/lang/String;)V
    //   370: aconst_null
    //   371: areturn
    //   372: aload 7
    //   374: invokeinterface 507 1 0
    //   379: invokeinterface 513 1 0
    //   384: astore 9
    //   386: aload 9
    //   388: invokeinterface 519 1 0
    //   393: ifeq +39 -> 432
    //   396: aload 9
    //   398: invokeinterface 523 1 0
    //   403: checkcast 475	java/lang/String
    //   406: astore 10
    //   408: aload 8
    //   410: aload 10
    //   412: aload 7
    //   414: aload 10
    //   416: invokeinterface 526 2 0
    //   421: invokeinterface 448 3 0
    //   426: pop
    //   427: goto -41 -> 386
    //   430: astore 7
    //   432: aload_0
    //   433: getfield 528	com/umeng/newxp/controller/ExchangeDataService:urlParams	Ljava/lang/String;
    //   436: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   439: ifne +18 -> 457
    //   442: aload 8
    //   444: ldc_w 530
    //   447: aload_0
    //   448: getfield 528	com/umeng/newxp/controller/ExchangeDataService:urlParams	Ljava/lang/String;
    //   451: invokeinterface 448 3 0
    //   456: pop
    //   457: aload_0
    //   458: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   461: invokestatic 534	com/umeng/newxp/view/common/actionbar/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   464: astore 7
    //   466: aload 7
    //   468: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   471: ifne +48 -> 519
    //   474: ldc_w 536
    //   477: aload 7
    //   479: invokevirtual 478	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   482: ifne +37 -> 519
    //   485: aload 8
    //   487: ldc_w 538
    //   490: new 292	java/lang/StringBuilder
    //   493: dup
    //   494: ldc_w 540
    //   497: invokespecial 295	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   500: aload_0
    //   501: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   504: invokestatic 534	com/umeng/newxp/view/common/actionbar/b:a	(Landroid/content/Context;)Ljava/lang/String;
    //   507: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   510: invokevirtual 307	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   513: invokeinterface 448 3 0
    //   518: pop
    //   519: aload_0
    //   520: getfield 134	com/umeng/newxp/controller/ExchangeDataService:l	Ljava/lang/String;
    //   523: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   526: ifne +18 -> 544
    //   529: aload 8
    //   531: ldc_w 542
    //   534: aload_0
    //   535: getfield 134	com/umeng/newxp/controller/ExchangeDataService:l	Ljava/lang/String;
    //   538: invokeinterface 448 3 0
    //   543: pop
    //   544: aload_0
    //   545: getfield 114	com/umeng/newxp/controller/ExchangeDataService:autofill	I
    //   548: iconst_1
    //   549: if_icmpeq +21 -> 570
    //   552: aload 8
    //   554: ldc_w 543
    //   557: aload_0
    //   558: getfield 114	com/umeng/newxp/controller/ExchangeDataService:autofill	I
    //   561: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   564: invokeinterface 448 3 0
    //   569: pop
    //   570: aload_0
    //   571: getfield 130	com/umeng/newxp/controller/ExchangeDataService:require_desc	I
    //   574: iconst_1
    //   575: if_icmpeq +21 -> 596
    //   578: aload 8
    //   580: ldc_w 544
    //   583: aload_0
    //   584: getfield 130	com/umeng/newxp/controller/ExchangeDataService:require_desc	I
    //   587: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   590: invokeinterface 448 3 0
    //   595: pop
    //   596: aload_0
    //   597: getfield 116	com/umeng/newxp/controller/ExchangeDataService:sessionId	Ljava/lang/String;
    //   600: invokestatic 455	com/umeng/common/ufp/util/g:d	(Ljava/lang/String;)Z
    //   603: ifne +64 -> 667
    //   606: aload_0
    //   607: getfield 164	com/umeng/newxp/controller/ExchangeDataService:page_index	I
    //   610: iflt +57 -> 667
    //   613: aload 8
    //   615: ldc_w 546
    //   618: aload_0
    //   619: getfield 116	com/umeng/newxp/controller/ExchangeDataService:sessionId	Ljava/lang/String;
    //   622: invokeinterface 448 3 0
    //   627: pop
    //   628: getstatic 290	com/umeng/newxp/common/ExchangeConstants:LOG_TAG	Ljava/lang/String;
    //   631: new 292	java/lang/StringBuilder
    //   634: dup
    //   635: ldc_w 548
    //   638: invokespecial 295	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   641: aload_0
    //   642: getfield 116	com/umeng/newxp/controller/ExchangeDataService:sessionId	Ljava/lang/String;
    //   645: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   648: ldc_w 550
    //   651: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   654: aload_0
    //   655: getfield 164	com/umeng/newxp/controller/ExchangeDataService:page_index	I
    //   658: invokevirtual 553	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   661: invokevirtual 307	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   664: invokestatic 394	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   667: aload_0
    //   668: getfield 118	com/umeng/newxp/controller/ExchangeDataService:psid	Ljava/lang/String;
    //   671: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   674: ifne +18 -> 692
    //   677: aload 8
    //   679: ldc_w 554
    //   682: aload_0
    //   683: getfield 118	com/umeng/newxp/controller/ExchangeDataService:psid	Ljava/lang/String;
    //   686: invokeinterface 448 3 0
    //   691: pop
    //   692: aload_0
    //   693: getfield 156	com/umeng/newxp/controller/ExchangeDataService:pagination	Z
    //   696: iconst_1
    //   697: if_icmpne +18 -> 715
    //   700: aload 8
    //   702: ldc_w 556
    //   705: iconst_1
    //   706: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   709: invokeinterface 448 3 0
    //   714: pop
    //   715: getstatic 559	com/umeng/newxp/common/ExchangeConstants:DETAIL_PAGE	Z
    //   718: ifeq +911 -> 1629
    //   721: iload_2
    //   722: istore_1
    //   723: aload 8
    //   725: ldc_w 561
    //   728: iload_1
    //   729: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   732: invokeinterface 448 3 0
    //   737: pop
    //   738: aload 8
    //   740: ldc_w 563
    //   743: iconst_1
    //   744: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   747: invokeinterface 448 3 0
    //   752: pop
    //   753: aload_0
    //   754: getfield 565	com/umeng/newxp/controller/ExchangeDataService:resType	Lcom/umeng/newxp/b;
    //   757: ifnonnull +774 -> 1531
    //   760: ldc 89
    //   762: astore 7
    //   764: aload 8
    //   766: ldc_w 567
    //   769: aload 7
    //   771: invokeinterface 448 3 0
    //   776: pop
    //   777: aload_0
    //   778: getfield 569	com/umeng/newxp/controller/ExchangeDataService:template	Lcom/umeng/newxp/c;
    //   781: ifnull +57 -> 838
    //   784: new 292	java/lang/StringBuilder
    //   787: dup
    //   788: invokespecial 385	java/lang/StringBuilder:<init>	()V
    //   791: aload_0
    //   792: getfield 569	com/umeng/newxp/controller/ExchangeDataService:template	Lcom/umeng/newxp/c;
    //   795: invokevirtual 572	com/umeng/newxp/c:toString	()Ljava/lang/String;
    //   798: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   801: astore 9
    //   803: aload_0
    //   804: getfield 573	com/umeng/newxp/controller/ExchangeDataService:n	Ljava/lang/String;
    //   807: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   810: ifeq +733 -> 1543
    //   813: ldc 89
    //   815: astore 7
    //   817: aload 8
    //   819: ldc_w 574
    //   822: aload 9
    //   824: aload 7
    //   826: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   829: invokevirtual 307	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   832: invokeinterface 448 3 0
    //   837: pop
    //   838: getstatic 576	com/umeng/newxp/controller/ExchangeDataService:i	Ljava/lang/String;
    //   841: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   844: istore 4
    //   846: iload 4
    //   848: ifeq +19 -> 867
    //   851: aload_0
    //   852: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   855: invokevirtual 582	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   858: invokestatic 587	com/umeng/newxp/common/b/a:a	(Landroid/content/Context;)Lcom/umeng/newxp/common/b/a;
    //   861: invokevirtual 589	com/umeng/newxp/common/b/a:a	()Ljava/lang/String;
    //   864: putstatic 576	com/umeng/newxp/controller/ExchangeDataService:i	Ljava/lang/String;
    //   867: aload 8
    //   869: ldc_w 591
    //   872: getstatic 576	com/umeng/newxp/controller/ExchangeDataService:i	Ljava/lang/String;
    //   875: invokeinterface 448 3 0
    //   880: pop
    //   881: aload_0
    //   882: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   885: invokestatic 593	com/umeng/common/ufp/b:q	(Landroid/content/Context;)Ljava/lang/String;
    //   888: astore 7
    //   890: aload 8
    //   892: ldc_w 595
    //   895: aload 7
    //   897: invokeinterface 448 3 0
    //   902: pop
    //   903: aload 8
    //   905: ldc_w 597
    //   908: aload 7
    //   910: invokestatic 384	com/umeng/common/ufp/util/g:a	(Ljava/lang/String;)Ljava/lang/String;
    //   913: invokeinterface 448 3 0
    //   918: pop
    //   919: aload 8
    //   921: ldc_w 599
    //   924: getstatic 604	android/os/Build:MODEL	Ljava/lang/String;
    //   927: invokeinterface 448 3 0
    //   932: pop
    //   933: aload 8
    //   935: ldc_w 606
    //   938: ldc_w 608
    //   941: invokeinterface 448 3 0
    //   946: pop
    //   947: aload_0
    //   948: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   951: invokestatic 611	com/umeng/common/ufp/b:D	(Landroid/content/Context;)Ljava/lang/String;
    //   954: astore 7
    //   956: aload 7
    //   958: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   961: ifne +16 -> 977
    //   964: aload 8
    //   966: ldc_w 613
    //   969: aload 7
    //   971: invokeinterface 448 3 0
    //   976: pop
    //   977: aload 8
    //   979: ldc_w 615
    //   982: getstatic 620	android/os/Build$VERSION:RELEASE	Ljava/lang/String;
    //   985: invokeinterface 448 3 0
    //   990: pop
    //   991: aload_0
    //   992: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   995: invokevirtual 624	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   998: invokevirtual 630	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   1001: astore 7
    //   1003: aload 7
    //   1005: ifnull +574 -> 1579
    //   1008: aload 7
    //   1010: getfield 636	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   1013: ifnull +566 -> 1579
    //   1016: aload 8
    //   1018: ldc_w 637
    //   1021: aload 7
    //   1023: getfield 636	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   1026: invokevirtual 642	java/util/Locale:getDisplayName	()Ljava/lang/String;
    //   1029: invokeinterface 448 3 0
    //   1034: pop
    //   1035: aload 8
    //   1037: ldc_w 644
    //   1040: aload 7
    //   1042: getfield 636	android/content/res/Configuration:locale	Ljava/util/Locale;
    //   1045: invokevirtual 645	java/util/Locale:toString	()Ljava/lang/String;
    //   1048: invokeinterface 448 3 0
    //   1053: pop
    //   1054: aload 8
    //   1056: ldc_w 647
    //   1059: aload_0
    //   1060: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1063: invokestatic 651	com/umeng/common/ufp/b:A	(Landroid/content/Context;)I
    //   1066: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1069: invokeinterface 448 3 0
    //   1074: pop
    //   1075: aload 8
    //   1077: ldc_w 653
    //   1080: aload_0
    //   1081: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1084: invokestatic 655	com/umeng/common/ufp/b:v	(Landroid/content/Context;)Ljava/lang/String;
    //   1087: invokeinterface 448 3 0
    //   1092: pop
    //   1093: aload_0
    //   1094: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1097: invokestatic 658	com/umeng/common/ufp/b:w	(Landroid/content/Context;)[Ljava/lang/String;
    //   1100: astore 7
    //   1102: aload 8
    //   1104: ldc_w 660
    //   1107: aload 7
    //   1109: iconst_0
    //   1110: aaload
    //   1111: invokeinterface 448 3 0
    //   1116: pop
    //   1117: ldc_w 662
    //   1120: aload 7
    //   1122: iconst_0
    //   1123: aaload
    //   1124: invokevirtual 478	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   1127: ifeq +18 -> 1145
    //   1130: aload 8
    //   1132: ldc_w 664
    //   1135: aload 7
    //   1137: iconst_1
    //   1138: aaload
    //   1139: invokeinterface 448 3 0
    //   1144: pop
    //   1145: aload 8
    //   1147: ldc_w 666
    //   1150: aload_0
    //   1151: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1154: invokestatic 668	com/umeng/common/ufp/b:s	(Landroid/content/Context;)Ljava/lang/String;
    //   1157: invokeinterface 448 3 0
    //   1162: pop
    //   1163: aload_0
    //   1164: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1167: invokestatic 671	com/umeng/common/ufp/b:y	(Landroid/content/Context;)Landroid/location/Location;
    //   1170: astore 7
    //   1172: aload 7
    //   1174: ifnull +80 -> 1254
    //   1177: aload 8
    //   1179: ldc_w 673
    //   1182: aload 7
    //   1184: invokevirtual 679	android/location/Location:getLatitude	()D
    //   1187: invokestatic 682	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   1190: invokeinterface 448 3 0
    //   1195: pop
    //   1196: aload 8
    //   1198: ldc_w 684
    //   1201: aload 7
    //   1203: invokevirtual 687	android/location/Location:getLongitude	()D
    //   1206: invokestatic 682	java/lang/String:valueOf	(D)Ljava/lang/String;
    //   1209: invokeinterface 448 3 0
    //   1214: pop
    //   1215: aload 7
    //   1217: invokevirtual 690	android/location/Location:getTime	()J
    //   1220: lstore 5
    //   1222: aload 8
    //   1224: ldc_w 692
    //   1227: aload 7
    //   1229: invokevirtual 695	android/location/Location:getProvider	()Ljava/lang/String;
    //   1232: invokeinterface 448 3 0
    //   1237: pop
    //   1238: aload 8
    //   1240: ldc_w 697
    //   1243: lload 5
    //   1245: invokestatic 700	java/lang/String:valueOf	(J)Ljava/lang/String;
    //   1248: invokeinterface 448 3 0
    //   1253: pop
    //   1254: aload 8
    //   1256: ldc_w 702
    //   1259: invokestatic 704	com/umeng/common/ufp/b:f	()Ljava/lang/String;
    //   1262: invokeinterface 448 3 0
    //   1267: pop
    //   1268: invokestatic 705	com/umeng/common/ufp/util/g:a	()Ljava/lang/String;
    //   1271: astore 9
    //   1273: aload 9
    //   1275: ldc_w 707
    //   1278: invokevirtual 488	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1281: iconst_0
    //   1282: aaload
    //   1283: astore 7
    //   1285: aload 9
    //   1287: ldc_w 707
    //   1290: invokevirtual 488	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   1293: iconst_1
    //   1294: aaload
    //   1295: astore 9
    //   1297: aload 8
    //   1299: ldc_w 709
    //   1302: aload 7
    //   1304: invokeinterface 448 3 0
    //   1309: pop
    //   1310: aload 8
    //   1312: ldc_w 711
    //   1315: aload 9
    //   1317: invokeinterface 448 3 0
    //   1322: pop
    //   1323: aload 8
    //   1325: ldc_w 713
    //   1328: getstatic 716	android/os/Build:MANUFACTURER	Ljava/lang/String;
    //   1331: invokeinterface 448 3 0
    //   1336: pop
    //   1337: aload 8
    //   1339: ldc_w 647
    //   1342: aload_0
    //   1343: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1346: invokestatic 651	com/umeng/common/ufp/b:A	(Landroid/content/Context;)I
    //   1349: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1352: invokeinterface 448 3 0
    //   1357: pop
    //   1358: aload_0
    //   1359: getfield 162	com/umeng/newxp/controller/ExchangeDataService:o	Ljava/lang/String;
    //   1362: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1365: ifne +18 -> 1383
    //   1368: aload 8
    //   1370: ldc_w 718
    //   1373: aload_0
    //   1374: getfield 162	com/umeng/newxp/controller/ExchangeDataService:o	Ljava/lang/String;
    //   1377: invokeinterface 448 3 0
    //   1382: pop
    //   1383: aload_0
    //   1384: getfield 424	com/umeng/newxp/controller/ExchangeDataService:j	I
    //   1387: ifle +21 -> 1408
    //   1390: aload 8
    //   1392: ldc_w 720
    //   1395: aload_0
    //   1396: getfield 424	com/umeng/newxp/controller/ExchangeDataService:j	I
    //   1399: invokestatic 473	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   1402: invokeinterface 448 3 0
    //   1407: pop
    //   1408: aload_0
    //   1409: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1412: invokestatic 388	com/umeng/common/ufp/b:H	(Landroid/content/Context;)Ljava/lang/String;
    //   1415: astore 7
    //   1417: aload 7
    //   1419: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1422: ifne +16 -> 1438
    //   1425: aload 8
    //   1427: ldc_w 722
    //   1430: aload 7
    //   1432: invokeinterface 448 3 0
    //   1437: pop
    //   1438: aload_0
    //   1439: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1442: invokestatic 724	com/umeng/common/ufp/b:o	(Landroid/content/Context;)Ljava/lang/String;
    //   1445: astore 7
    //   1447: aload 7
    //   1449: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1452: ifne +16 -> 1468
    //   1455: aload 8
    //   1457: ldc_w 726
    //   1460: aload 7
    //   1462: invokeinterface 448 3 0
    //   1467: pop
    //   1468: aload_0
    //   1469: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1472: invokestatic 728	com/umeng/common/ufp/b:n	(Landroid/content/Context;)Ljava/lang/String;
    //   1475: astore 7
    //   1477: aload 7
    //   1479: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1482: ifne +16 -> 1498
    //   1485: aload 8
    //   1487: ldc_w 730
    //   1490: aload 7
    //   1492: invokeinterface 448 3 0
    //   1497: pop
    //   1498: aload_0
    //   1499: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   1502: invokestatic 732	com/umeng/common/ufp/b:p	(Landroid/content/Context;)Ljava/lang/String;
    //   1505: astore 9
    //   1507: aload 7
    //   1509: invokestatic 225	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   1512: ifne -1154 -> 358
    //   1515: aload 8
    //   1517: ldc_w 734
    //   1520: aload 9
    //   1522: invokeinterface 448 3 0
    //   1527: pop
    //   1528: goto -1170 -> 358
    //   1531: aload_0
    //   1532: getfield 565	com/umeng/newxp/controller/ExchangeDataService:resType	Lcom/umeng/newxp/b;
    //   1535: invokevirtual 737	com/umeng/newxp/b:toString	()Ljava/lang/String;
    //   1538: astore 7
    //   1540: goto -776 -> 764
    //   1543: new 292	java/lang/StringBuilder
    //   1546: dup
    //   1547: ldc_w 390
    //   1550: invokespecial 295	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   1553: aload_0
    //   1554: getfield 573	com/umeng/newxp/controller/ExchangeDataService:n	Ljava/lang/String;
    //   1557: invokevirtual 302	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1560: invokevirtual 307	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   1563: astore 7
    //   1565: goto -748 -> 817
    //   1568: astore 7
    //   1570: aload_0
    //   1571: getfield 110	com/umeng/newxp/controller/ExchangeDataService:g	Ljava/lang/String;
    //   1574: astore 7
    //   1576: goto -709 -> 867
    //   1579: aload 8
    //   1581: ldc_w 637
    //   1584: ldc_w 739
    //   1587: invokeinterface 448 3 0
    //   1592: pop
    //   1593: aload 8
    //   1595: ldc_w 644
    //   1598: ldc_w 739
    //   1601: invokeinterface 448 3 0
    //   1606: pop
    //   1607: goto -553 -> 1054
    //   1610: astore 7
    //   1612: aload 8
    //   1614: ldc_w 660
    //   1617: ldc_w 741
    //   1620: invokeinterface 448 3 0
    //   1625: pop
    //   1626: goto -481 -> 1145
    //   1629: iconst_0
    //   1630: istore_1
    //   1631: goto -908 -> 723
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1634	0	this	ExchangeDataService
    //   260	1371	1	i1	int
    //   1	721	2	i2	int
    //   258	6	3	i3	int
    //   31	816	4	bool	boolean
    //   1220	24	5	l1	long
    //   253	79	7	localObject1	Object
    //   342	71	7	localException1	Exception
    //   430	1	7	localException2	Exception
    //   464	1100	7	localObject2	Object
    //   1568	1	7	localException3	Exception
    //   1574	1	7	str	String
    //   1610	1	7	localException4	Exception
    //   9	1604	8	localHashMap	java.util.HashMap
    //   244	1277	9	localObject3	Object
    //   276	139	10	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   60	113	342	java/lang/Exception
    //   113	138	342	java/lang/Exception
    //   138	169	342	java/lang/Exception
    //   169	224	342	java/lang/Exception
    //   224	246	342	java/lang/Exception
    //   308	339	342	java/lang/Exception
    //   361	370	342	java/lang/Exception
    //   432	457	342	java/lang/Exception
    //   457	519	342	java/lang/Exception
    //   519	544	342	java/lang/Exception
    //   544	570	342	java/lang/Exception
    //   570	596	342	java/lang/Exception
    //   596	667	342	java/lang/Exception
    //   667	692	342	java/lang/Exception
    //   692	715	342	java/lang/Exception
    //   715	721	342	java/lang/Exception
    //   723	760	342	java/lang/Exception
    //   764	813	342	java/lang/Exception
    //   817	838	342	java/lang/Exception
    //   838	846	342	java/lang/Exception
    //   867	977	342	java/lang/Exception
    //   977	1003	342	java/lang/Exception
    //   1008	1054	342	java/lang/Exception
    //   1054	1093	342	java/lang/Exception
    //   1145	1172	342	java/lang/Exception
    //   1177	1254	342	java/lang/Exception
    //   1254	1383	342	java/lang/Exception
    //   1383	1408	342	java/lang/Exception
    //   1408	1438	342	java/lang/Exception
    //   1438	1468	342	java/lang/Exception
    //   1468	1498	342	java/lang/Exception
    //   1498	1528	342	java/lang/Exception
    //   1531	1540	342	java/lang/Exception
    //   1543	1565	342	java/lang/Exception
    //   1570	1576	342	java/lang/Exception
    //   1579	1607	342	java/lang/Exception
    //   1612	1626	342	java/lang/Exception
    //   246	259	430	java/lang/Exception
    //   266	301	430	java/lang/Exception
    //   372	386	430	java/lang/Exception
    //   386	427	430	java/lang/Exception
    //   851	867	1568	java/lang/Exception
    //   1093	1145	1610	java/lang/Exception
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
  
  public String getWapUrl(Context paramContext)
  {
    this.mContext = paramContext;
    Map localMap = getRequestInput();
    StringBuilder localStringBuilder = new StringBuilder("http://w.m.taobao.com/api/wap?");
    Iterator localIterator = localMap.keySet().iterator();
    if (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramContext = localMap.get(str);
      if (paramContext == null) {}
      for (paramContext = "";; paramContext = paramContext.toString())
      {
        localStringBuilder.append(str + "=" + paramContext + "&");
        break;
      }
    }
    localStringBuilder.deleteCharAt(localStringBuilder.length() - 1);
    return localStringBuilder.toString();
  }
  
  public boolean isFilterInstalledApp()
  {
    return this.a;
  }
  
  public List<String> onUpload()
  {
    return null;
  }
  
  protected List<Promoter> parseResponse(o paramo)
  {
    boolean bool2 = false;
    label34:
    Object localObject;
    label52:
    label92:
    label312:
    StringBuilder localStringBuilder;
    if (!this.m)
    {
      if (paramo.c == 1)
      {
        bool1 = true;
        this.a = bool1;
      }
    }
    else
    {
      if (paramo.b != 1) {
        break label504;
      }
      bool1 = true;
      ExchangeConstants.show_size = bool1;
      if (!TextUtils.isEmpty(paramo.j)) {
        break label509;
      }
      localObject = "";
      this.opensize = ((String)localObject);
      if (paramo.l != null) {
        this.template = paramo.l;
      }
      if ((!ExchangeConstants.DEBUG_MODE) || (DEBUG_NEW_TIPS < 0)) {
        break label518;
      }
      this.newTips = DEBUG_NEW_TIPS;
      if (!com.umeng.common.ufp.util.g.d(paramo.d)) {
        this.sessionId = paramo.d;
      }
      if (!TextUtils.isEmpty(paramo.e)) {
        this.psid = paramo.e;
      }
      if ((paramo.f > 3) && (!ExchangeConstants.IGNORE_SERVER_INTERVAL)) {
        ExchangeConstants.REFRESH_INTERVAL = paramo.f * 1000;
      }
      this.resType = paramo.r;
      if (!TextUtils.isEmpty(paramo.n)) {
        this.slot_act_params = paramo.n;
      }
      localObject = this.mContext.getSharedPreferences(this.p, 0);
      if (((SharedPreferences)localObject).getInt(this.v, 0) != paramo.h)
      {
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putInt(this.v, paramo.h);
        ((SharedPreferences.Editor)localObject).commit();
        Log.c(this.g, "Change the " + this.v + "   " + paramo.h);
      }
      if (paramo.t != null)
      {
        if (!TextUtils.isEmpty(this.slot_id)) {
          break label529;
        }
        localObject = com.umeng.newxp.common.c.a(this.mContext, this);
        f.a(this.mContext, (String)localObject).a(paramo.t);
      }
      this.module = paramo.s;
      this.displayType = paramo.x;
      if (!TextUtils.isEmpty(paramo.v)) {
        this.entryStr = paramo.v;
      }
      this.b = paramo.m;
      this.c = paramo.o;
      if (!TextUtils.isEmpty(paramo.i)) {
        this.landing_image = paramo.i;
      }
      if (!TextUtils.isEmpty(paramo.w)) {
        this.landingUrl = paramo.w;
      }
      if (10 == this.layoutType) {
        com.umeng.newxp.view.common.actionbar.b.a(this.mContext, paramo.u);
      }
      localObject = this.g;
      localStringBuilder = new StringBuilder("if developer set de Promoter class? ");
      if (this.x != null) {
        break label538;
      }
    }
    label504:
    label509:
    label518:
    label529:
    label538:
    for (boolean bool1 = bool2;; bool1 = true)
    {
      Log.c((String)localObject, bool1);
      if (this.x != null) {
        break label543;
      }
      return paramo.a(Promoter.getAdapterPromoterClz(paramo.l, paramo.r));
      bool1 = false;
      break;
      bool1 = false;
      break label34;
      localObject = paramo.j;
      break label52;
      this.newTips = paramo.k;
      break label92;
      localObject = this.slot_id;
      break label312;
    }
    label543:
    return paramo.a(this.x);
  }
  
  public void preloadData(Context paramContext, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener, int paramInt)
  {
    preloadData(paramContext, null, paramNTipsChangedListener, paramInt);
  }
  
  public void preloadData(Context paramContext, List<Promoter> paramList, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener, int paramInt)
  {
    preloadData(paramContext, paramList, paramNTipsChangedListener, paramInt, null);
  }
  
  public void preloadData(Context paramContext, List<Promoter> paramList, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener, int paramInt, Class<? extends Promoter> paramClass)
  {
    if ((this.layoutType >= 0) && (this.layoutType != paramInt))
    {
      Log.e(this.g, "sorry  type is no match ");
      return;
    }
    this.layoutType = paramInt;
    if (this.w == null) {
      this.w = new d(paramContext, this, paramNTipsChangedListener);
    }
    while ((paramList != null) && (paramList.size() > 0))
    {
      this.w.a(paramList);
      return;
      this.w.a(paramNTipsChangedListener);
    }
    this.w.a(paramClass);
  }
  
  protected void preparedAsync() {}
  
  public void queryCredits(XpListenersCenter.UMCreditQueryListener paramUMCreditQueryListener)
  {
    if ((TextUtils.isEmpty(this.slot_id)) || (TextUtils.isEmpty(this.o))) {
      throw new RuntimeException("params error");
    }
    new ExchangeDataService.4(this, paramUMCreditQueryListener).execute(new Void[0]);
  }
  
  public void registerBroadcast(Context paramContext, UBroadcastReceiver paramUBroadcastReceiver)
  {
    this.broadcast = true;
    IntentFilter localIntentFilter = new IntentFilter(getBroadCastAction(paramContext));
    localIntentFilter.setPriority(1000);
    paramContext.registerReceiver(paramUBroadcastReceiver, localIntentFilter);
  }
  
  public void removeCache()
  {
    Log.a(this.g, "remove cache....[" + this.p + "]");
    synchronized (this.mContext.getSharedPreferences(this.p, 0))
    {
      SharedPreferences.Editor localEditor = ???.edit();
      localEditor.remove(this.s);
      localEditor.remove(this.u);
      localEditor.remove(this.t);
      localEditor.commit();
      return;
    }
  }
  
  public void reportImpression(Promoter... paramVarArgs)
  {
    int i1 = 0;
    if ((paramVarArgs == null) || (paramVarArgs.length == 0))
    {
      String str = this.g;
      StringBuilder localStringBuilder = new StringBuilder("unable send impression report.[promoters=");
      if (paramVarArgs == null) {}
      for (;;)
      {
        Log.e(str, i1 + "]");
        return;
        i1 = paramVarArgs.length;
      }
    }
    paramVarArgs = new m.a(this.mContext).a(0).b(0).d(3).c(this.layoutType).a(paramVarArgs).f(com.umeng.newxp.common.c.a(this.mContext, this)).a(this.slot_id).g(getTimeConsuming()).a(this.sessionId, this.psid).a();
    new XpReportClient(this.mContext).sendAsync(paramVarArgs, null);
  }
  
  /* Error */
  public List<Promoter> requestCache(boolean paramBoolean1, boolean paramBoolean2)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore_3
    //   2: aload_0
    //   3: getfield 280	com/umeng/newxp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   6: aload_0
    //   7: getfield 232	com/umeng/newxp/controller/ExchangeDataService:p	Ljava/lang/String;
    //   10: iconst_0
    //   11: invokevirtual 795	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   14: astore 7
    //   16: iload_1
    //   17: ifeq +182 -> 199
    //   20: aload_0
    //   21: getfield 110	com/umeng/newxp/controller/ExchangeDataService:g	Ljava/lang/String;
    //   24: ldc_w 929
    //   27: invokestatic 394	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   30: aload 7
    //   32: aload_0
    //   33: getfield 180	com/umeng/newxp/controller/ExchangeDataService:t	Ljava/lang/String;
    //   36: lconst_0
    //   37: invokeinterface 933 4 0
    //   42: lstore 4
    //   44: invokestatic 98	java/lang/System:currentTimeMillis	()J
    //   47: lload 4
    //   49: invokestatic 938	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   52: invokevirtual 941	java/lang/Long:longValue	()J
    //   55: lsub
    //   56: ldc2_w 942
    //   59: ldiv
    //   60: ldc2_w 944
    //   63: lcmp
    //   64: ifle +5 -> 69
    //   67: iconst_1
    //   68: istore_3
    //   69: iload_3
    //   70: ifeq +19 -> 89
    //   73: aload_0
    //   74: invokevirtual 947	com/umeng/newxp/controller/ExchangeDataService:removeCache	()V
    //   77: aload_0
    //   78: getfield 110	com/umeng/newxp/controller/ExchangeDataService:g	Ljava/lang/String;
    //   81: ldc_w 949
    //   84: invokestatic 499	com/umeng/common/ufp/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   87: aconst_null
    //   88: areturn
    //   89: aload_0
    //   90: getfield 178	com/umeng/newxp/controller/ExchangeDataService:s	Ljava/lang/String;
    //   93: astore 6
    //   95: aload 7
    //   97: aload 6
    //   99: aconst_null
    //   100: invokeinterface 953 3 0
    //   105: astore 8
    //   107: aload 8
    //   109: ifnull +124 -> 233
    //   112: iload_2
    //   113: ifeq +46 -> 159
    //   116: aload 7
    //   118: monitorenter
    //   119: aload 7
    //   121: invokeinterface 807 1 0
    //   126: astore 9
    //   128: aload 9
    //   130: aload 6
    //   132: invokeinterface 921 2 0
    //   137: pop
    //   138: aload 9
    //   140: invokeinterface 816 1 0
    //   145: pop
    //   146: aload_0
    //   147: getfield 110	com/umeng/newxp/controller/ExchangeDataService:g	Ljava/lang/String;
    //   150: ldc_w 955
    //   153: invokestatic 312	com/umeng/common/ufp/Log:a	(Ljava/lang/String;Ljava/lang/String;)V
    //   156: aload 7
    //   158: monitorexit
    //   159: aload_0
    //   160: new 767	com/umeng/newxp/net/o
    //   163: dup
    //   164: new 403	org/json/JSONObject
    //   167: dup
    //   168: aload 8
    //   170: invokespecial 956	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   173: invokespecial 957	com/umeng/newxp/net/o:<init>	(Lorg/json/JSONObject;)V
    //   176: invokevirtual 959	com/umeng/newxp/controller/ExchangeDataService:parseResponse	(Lcom/umeng/newxp/net/o;)Ljava/util/List;
    //   179: astore 6
    //   181: aload 6
    //   183: ifnull +50 -> 233
    //   186: aload 6
    //   188: invokeinterface 266 1 0
    //   193: ifle +40 -> 233
    //   196: aload 6
    //   198: areturn
    //   199: aload_0
    //   200: getfield 110	com/umeng/newxp/controller/ExchangeDataService:g	Ljava/lang/String;
    //   203: ldc_w 961
    //   206: invokestatic 394	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: aload_0
    //   210: getfield 182	com/umeng/newxp/controller/ExchangeDataService:u	Ljava/lang/String;
    //   213: astore 6
    //   215: goto -120 -> 95
    //   218: astore 6
    //   220: aload 7
    //   222: monitorexit
    //   223: aload 6
    //   225: athrow
    //   226: astore 6
    //   228: aload 6
    //   230: invokevirtual 495	java/lang/Exception:printStackTrace	()V
    //   233: aconst_null
    //   234: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	235	0	this	ExchangeDataService
    //   0	235	1	paramBoolean1	boolean
    //   0	235	2	paramBoolean2	boolean
    //   1	69	3	i1	int
    //   42	6	4	l1	long
    //   93	121	6	localObject1	Object
    //   218	6	6	localObject2	Object
    //   226	3	6	localException	Exception
    //   14	207	7	localSharedPreferences	SharedPreferences
    //   105	64	8	str	String
    //   126	13	9	localEditor	SharedPreferences.Editor
    // Exception table:
    //   from	to	target	type
    //   119	159	218	finally
    //   2	16	226	java/lang/Exception
    //   20	44	226	java/lang/Exception
    //   44	67	226	java/lang/Exception
    //   73	87	226	java/lang/Exception
    //   89	95	226	java/lang/Exception
    //   95	107	226	java/lang/Exception
    //   116	119	226	java/lang/Exception
    //   159	181	226	java/lang/Exception
    //   186	196	226	java/lang/Exception
    //   199	215	226	java/lang/Exception
    //   220	226	226	java/lang/Exception
  }
  
  public void requestDataAsyn(Context paramContext, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener)
  {
    this.mContext = paramContext;
    String str;
    StringBuilder localStringBuilder;
    if (TextUtils.isEmpty(this.slot_id))
    {
      str = com.umeng.newxp.common.c.a(this.mContext, this);
      f.a(this.mContext, str).b();
      i.a(paramContext);
      preparedAsync();
      com.umeng.newxp.common.c.L(paramContext);
      str = this.g;
      localStringBuilder = new StringBuilder("current preload info : ");
      if (this.w != null) {
        break label178;
      }
    }
    label178:
    for (paramContext = "null";; paramContext = this.w.toString() + "   available=" + this.w.b())
    {
      Log.a(str, paramContext);
      if ((this.w == null) || (!this.w.b()) || (!TextUtils.isEmpty(this.sessionId))) {
        break label218;
      }
      paramContext = this.w.a();
      Log.a(this.g, "get data form preloadData." + paramContext.size());
      if ((paramContext == null) || (paramExchangeDataRequestListener == null)) {
        break label218;
      }
      paramExchangeDataRequestListener.dataReceived(1, paramContext);
      return;
      str = this.slot_id;
      break;
    }
    label218:
    Log.a(this.g, "get data form requestData.");
    requestExternalData(this.mContext, paramExchangeDataRequestListener);
  }
  
  public void requestDataAsyn(Context paramContext, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.sessionId = "";
      this.psid = "";
      this.page_index = -1;
      this.resType = null;
      this.template = null;
    }
    for (;;)
    {
      requestDataAsyn(paramContext, paramExchangeDataRequestListener);
      return;
      if (!TextUtils.isEmpty(this.sessionId)) {
        this.page_index += 1;
      }
    }
  }
  
  protected void requestExternalData(Context paramContext, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener)
  {
    this.mContext = paramContext;
    i.a(paramContext);
    paramExchangeDataRequestListener = new ExchangeDataService.2(this, TextUtils.isEmpty(this.sessionId), paramContext, paramExchangeDataRequestListener);
    this.p = ("EXCHANGE_PRELOAD_ADS_" + this.k + "_" + this.autofill);
    String str;
    if ((TextUtils.isEmpty(this.v)) || (TextUtils.isEmpty(this.s)) || (TextUtils.isEmpty(this.u)) || (TextUtils.isEmpty(this.t)))
    {
      if (!TextUtils.isEmpty(this.slot_id)) {
        break label271;
      }
      str = com.umeng.newxp.common.c.a(paramContext, this);
      if (!TextUtils.isEmpty(str)) {
        break label186;
      }
      Log.b(this.g, "No found Slot_id or Appkey!!!!!");
    }
    while ((ExchangeConstants.ONLY_CHINESE) && (!com.umeng.common.ufp.b.k(paramContext)))
    {
      Log.b(ExchangeConstants.LOG_TAG, "English os can not show ads");
      paramExchangeDataRequestListener.dataReceived(0, null);
      if (this.mDataReceiverListener != null) {
        this.mDataReceiverListener.dataReceived(0, null);
      }
      return;
      label186:
      this.v = ("PRELOAD_KEY_" + str);
      this.s = ("PROMOTERS_FIRST_PAGE_" + str);
      this.u = ("PROMOTERS_NEXT_PAGE_" + str);
      this.t = ("PRELOAD_UPDATE_DATE_" + str);
      continue;
      label271:
      this.v = ("PRELOAD_KEY_" + this.slot_id);
      this.s = ("PROMOTERS_FIRST_PAGE_" + this.slot_id);
      this.u = ("PROMOTERS_NEXT_PAGE_" + this.slot_id);
      this.t = ("PRELOAD_UPDATE_DATE_" + this.slot_id);
    }
    a(paramExchangeDataRequestListener, paramContext.getSharedPreferences(this.p, 0).getInt(this.v, 0));
  }
  
  public void requestRichImageDataAsyn(Context paramContext, int paramInt, XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, boolean paramBoolean)
  {
    this.layoutType = paramInt;
    requestDataAsyn(paramContext, new ExchangeDataService.1(this, paramExchangeDataRequestListener), paramBoolean);
  }
  
  protected boolean saveCache(boolean paramBoolean, JSONObject paramJSONObject)
  {
    SharedPreferences localSharedPreferences = this.mContext.getSharedPreferences(this.p, 0);
    if (paramJSONObject != null)
    {
      Log.a(this.g, "save json to cache....");
      try
      {
        SharedPreferences.Editor localEditor = localSharedPreferences.edit();
        localEditor.putLong(this.t, System.currentTimeMillis());
        if (paramBoolean)
        {
          localEditor.putString(this.s, paramJSONObject.toString());
          localEditor.commit();
        }
        for (;;)
        {
          return true;
          localEditor.putString(this.u, paramJSONObject.toString());
          localEditor.commit();
        }
        return false;
      }
      finally {}
    }
  }
  
  public void setCreditUID(String paramString)
  {
    this.o = paramString;
  }
  
  public void setFilterInstalledApp(boolean paramBoolean)
  {
    this.m = true;
    this.a = paramBoolean;
  }
  
  public void setKeywords(String paramString)
  {
    this.k = paramString;
  }
  
  public void setLandingType(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void setPreloadData(d paramd)
  {
    this.w = paramd;
    if (this.w != null) {
      this.w.a = this;
    }
  }
  
  public void setSpecificPromoterClz(Class<? extends Promoter> paramClass)
  {
    this.x = paramClass;
  }
  
  public void setTag(String paramString)
  {
    this.l = paramString;
  }
  
  public void setTemplateAttrs(String paramString)
  {
    this.n = paramString;
  }
  
  public void setupEWallMainBean(ExchangeDataService paramExchangeDataService, o paramo)
  {
    if ((paramo == null) || (paramo.q == null)) {
      return;
    }
    this.h = new com.taobao.munion.model.b(paramo.q);
    this.h.a(this.slot_id);
    this.h.a(this.page_index);
    this.h.b(getTimeConsuming());
    this.h.b(this.layoutType);
    paramExchangeDataService = paramo.q.optJSONArray("promoters");
    try
    {
      this.h.a(paramExchangeDataService);
      return;
    }
    catch (JSONException paramExchangeDataService)
    {
      paramExchangeDataService.printStackTrace();
    }
  }
  
  public void unregisterBroadcast(Context paramContext, UBroadcastReceiver paramUBroadcastReceiver)
  {
    paramContext.unregisterReceiver(paramUBroadcastReceiver);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\ExchangeDataService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */