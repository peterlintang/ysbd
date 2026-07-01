package com.umeng.common.ufp.net;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningAppProcessInfo;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Debug;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.widget.RemoteViews;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.a.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class DownloadingService
  extends Service
{
  static final int a = 3;
  static final int b = 4;
  static final int c = 5;
  static final int d = 6;
  public static final int e = 0;
  public static final int f = 1;
  public static final int g = 2;
  public static final int h = 3;
  static final int i = 0;
  static final int j = 1;
  static final int k = 100;
  static final String l = "filename";
  public static boolean m = false;
  private static final String o = DownloadingService.class.getName();
  private static final int q = 3;
  private static final long u = 8000L;
  private static Map<a.a, Messenger> v = new HashMap();
  private static Map<Integer, DownloadingService.d> w = new HashMap();
  private static Boolean y = Boolean.valueOf(false);
  final Messenger n = new Messenger(new DownloadingService.c(this));
  private NotificationManager p;
  private Context r;
  private Handler s;
  private DownloadingService.a t;
  private BroadcastReceiver x;
  
  public static int a(a.a parama)
  {
    return Math.abs((int)((parama.b.hashCode() >> 2) + (parama.c.hashCode() >> 3) + System.currentTimeMillis()));
  }
  
  private Notification a(a.a parama, int paramInt1, int paramInt2)
  {
    Context localContext = getApplicationContext();
    Notification localNotification = new Notification(17301633, "正在下载应用", 1L);
    RemoteViews localRemoteViews = new RemoteViews(localContext.getPackageName(), com.umeng.common.ufp.a.b.a(localContext));
    localRemoteViews.setProgressBar(a.c(localContext), 100, paramInt2, false);
    localRemoteViews.setTextViewText(a.b(localContext), paramInt2 + "%");
    localRemoteViews.setTextViewText(a.d(localContext), localContext.getResources().getString(com.umeng.common.ufp.a.c.g(localContext.getApplicationContext())) + parama.b);
    localRemoteViews.setTextViewText(a.a(localContext), "");
    localRemoteViews.setImageViewResource(a.e(localContext), 17301633);
    localNotification.contentView = localRemoteViews;
    localNotification.when = System.currentTimeMillis();
    localNotification.contentIntent = PendingIntent.getActivity(localContext, 0, new Intent(), 134217728);
    if (parama.g)
    {
      localNotification.flags = 2;
      parama = d.b(getApplicationContext(), d.a(paramInt1, "continue"));
      localRemoteViews.setOnClickPendingIntent(a.f(localContext), parama);
      localRemoteViews.setViewVisibility(a.f(localContext), 0);
      b(localNotification, paramInt1);
      parama = d.b(getApplicationContext(), d.a(paramInt1, "cancel"));
      localRemoteViews.setViewVisibility(a.h(localContext), 0);
      localRemoteViews.setOnClickPendingIntent(a.h(localContext), parama);
      return localNotification;
    }
    localNotification.flags = 16;
    localRemoteViews.setViewVisibility(a.f(localContext), 8);
    localRemoteViews.setViewVisibility(a.h(localContext), 8);
    return localNotification;
  }
  
  private void a(int paramInt)
  {
    DownloadingService.d locald = (DownloadingService.d)w.get(Integer.valueOf(paramInt));
    if (locald != null)
    {
      Log.c(o, "download service clear cache " + locald.e.b);
      if (locald.a != null) {
        locald.a.a(2);
      }
      this.p.cancel(locald.c);
      if (v.containsKey(locald.e)) {
        v.remove(locald.e);
      }
      locald.b();
      e();
    }
  }
  
  private void a(Notification paramNotification, int paramInt)
  {
    int i1 = a.f(this.r);
    paramNotification.contentView.setTextViewText(i1, this.r.getResources().getString(com.umeng.common.ufp.a.c.e(this.r.getApplicationContext())));
    paramNotification.contentView.setInt(i1, "setBackgroundResource", com.umeng.common.ufp.c.a(this.r).d("umeng_common_gradient_green"));
    this.p.notify(paramInt, paramNotification);
  }
  
  private void a(a.a parama, long paramLong1, long paramLong2, long paramLong3)
  {
    if (parama.f != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("dsize", String.valueOf(paramLong1));
      localHashMap.put("dtime", com.umeng.common.ufp.util.g.a().split(" ")[1]);
      float f1 = 0.0F;
      if (paramLong2 > 0L) {
        f1 = (float)paramLong1 / (float)paramLong2;
      }
      localHashMap.put("dpcent", String.valueOf((int)(f1 * 100.0F)));
      localHashMap.put("ptimes", String.valueOf(paramLong3));
      b(localHashMap, false, parama.f);
    }
  }
  
  /* Error */
  private boolean a(Context paramContext, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 394	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   4: ldc_w 396
    //   7: invokevirtual 401	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   10: ldc_w 403
    //   13: invokevirtual 374	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   16: astore_2
    //   17: aload_2
    //   18: iconst_0
    //   19: aaload
    //   20: invokestatic 406	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   23: istore_3
    //   24: aload_2
    //   25: iconst_1
    //   26: aaload
    //   27: invokevirtual 409	java/lang/String:trim	()Ljava/lang/String;
    //   30: astore 10
    //   32: iload_3
    //   33: ifeq +280 -> 313
    //   36: aload 10
    //   38: invokestatic 415	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   41: ifne +272 -> 313
    //   44: getstatic 76	com/umeng/common/ufp/net/DownloadingService:w	Ljava/util/Map;
    //   47: iload_3
    //   48: invokestatic 274	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: invokeinterface 312 2 0
    //   56: ifeq +257 -> 313
    //   59: getstatic 76	com/umeng/common/ufp/net/DownloadingService:w	Ljava/util/Map;
    //   62: iload_3
    //   63: invokestatic 274	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: invokeinterface 280 2 0
    //   71: checkcast 282	com/umeng/common/ufp/net/DownloadingService$d
    //   74: astore_2
    //   75: aload_2
    //   76: getfield 298	com/umeng/common/ufp/net/DownloadingService$d:a	Lcom/umeng/common/ufp/net/DownloadingService$b;
    //   79: astore 11
    //   81: ldc -19
    //   83: aload 10
    //   85: invokevirtual 418	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   88: ifeq +132 -> 220
    //   91: aload 11
    //   93: ifnonnull +96 -> 189
    //   96: getstatic 65	com/umeng/common/ufp/net/DownloadingService:o	Ljava/lang/String;
    //   99: ldc_w 420
    //   102: invokestatic 295	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: aload_1
    //   106: ldc_w 422
    //   109: invokestatic 427	com/umeng/common/ufp/b:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   112: ifeq +34 -> 146
    //   115: aload_1
    //   116: invokestatic 430	com/umeng/common/ufp/b:z	(Landroid/content/Context;)Z
    //   119: ifne +27 -> 146
    //   122: aload_1
    //   123: aload_1
    //   124: invokevirtual 189	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   127: aload_1
    //   128: invokevirtual 190	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   131: invokestatic 431	com/umeng/common/ufp/a/c:a	(Landroid/content/Context;)I
    //   134: invokevirtual 200	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   137: iconst_1
    //   138: invokestatic 437	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   141: invokevirtual 440	android/widget/Toast:show	()V
    //   144: iconst_0
    //   145: ireturn
    //   146: new 300	com/umeng/common/ufp/net/DownloadingService$b
    //   149: dup
    //   150: aload_0
    //   151: aload_1
    //   152: aload_2
    //   153: getfield 290	com/umeng/common/ufp/net/DownloadingService$d:e	Lcom/umeng/common/ufp/net/a$a;
    //   156: iload_3
    //   157: aload_2
    //   158: getfield 442	com/umeng/common/ufp/net/DownloadingService$d:d	I
    //   161: aload_0
    //   162: getfield 444	com/umeng/common/ufp/net/DownloadingService:t	Lcom/umeng/common/ufp/net/DownloadingService$a;
    //   165: invokespecial 447	com/umeng/common/ufp/net/DownloadingService$b:<init>	(Lcom/umeng/common/ufp/net/DownloadingService;Landroid/content/Context;Lcom/umeng/common/ufp/net/a$a;IILcom/umeng/common/ufp/net/DownloadingService$a;)V
    //   168: astore_1
    //   169: aload_2
    //   170: aload_1
    //   171: putfield 298	com/umeng/common/ufp/net/DownloadingService$d:a	Lcom/umeng/common/ufp/net/DownloadingService$b;
    //   174: aload_1
    //   175: invokevirtual 450	com/umeng/common/ufp/net/DownloadingService$b:start	()V
    //   178: aload_0
    //   179: aload_2
    //   180: getfield 453	com/umeng/common/ufp/net/DownloadingService$d:b	Landroid/app/Notification;
    //   183: iload_3
    //   184: invokespecial 257	com/umeng/common/ufp/net/DownloadingService:b	(Landroid/app/Notification;I)V
    //   187: iconst_1
    //   188: ireturn
    //   189: getstatic 65	com/umeng/common/ufp/net/DownloadingService:o	Ljava/lang/String;
    //   192: ldc_w 420
    //   195: invokestatic 295	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: aload 11
    //   200: iconst_1
    //   201: invokevirtual 302	com/umeng/common/ufp/net/DownloadingService$b:a	(I)V
    //   204: aload_2
    //   205: aconst_null
    //   206: putfield 298	com/umeng/common/ufp/net/DownloadingService$d:a	Lcom/umeng/common/ufp/net/DownloadingService$b;
    //   209: aload_0
    //   210: aload_2
    //   211: getfield 453	com/umeng/common/ufp/net/DownloadingService$d:b	Landroid/app/Notification;
    //   214: iload_3
    //   215: invokespecial 455	com/umeng/common/ufp/net/DownloadingService:a	(Landroid/app/Notification;I)V
    //   218: iconst_1
    //   219: ireturn
    //   220: ldc_w 259
    //   223: aload 10
    //   225: invokevirtual 418	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   228: ifeq +85 -> 313
    //   231: getstatic 65	com/umeng/common/ufp/net/DownloadingService:o	Ljava/lang/String;
    //   234: ldc_w 457
    //   237: invokestatic 295	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   240: aload 11
    //   242: ifnull +16 -> 258
    //   245: aload 11
    //   247: iconst_2
    //   248: invokevirtual 302	com/umeng/common/ufp/net/DownloadingService$b:a	(I)V
    //   251: aload_0
    //   252: iload_3
    //   253: invokespecial 342	com/umeng/common/ufp/net/DownloadingService:a	(I)V
    //   256: iconst_1
    //   257: ireturn
    //   258: aload_2
    //   259: getfield 460	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   262: iconst_0
    //   263: laload
    //   264: lstore 4
    //   266: aload_2
    //   267: getfield 460	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   270: iconst_1
    //   271: laload
    //   272: lstore 6
    //   274: aload_2
    //   275: getfield 460	com/umeng/common/ufp/net/DownloadingService$d:f	[J
    //   278: iconst_2
    //   279: laload
    //   280: lstore 8
    //   282: aload_0
    //   283: aload_2
    //   284: getfield 290	com/umeng/common/ufp/net/DownloadingService$d:e	Lcom/umeng/common/ufp/net/a$a;
    //   287: lload 4
    //   289: lload 6
    //   291: lload 8
    //   293: invokespecial 350	com/umeng/common/ufp/net/DownloadingService:a	(Lcom/umeng/common/ufp/net/a$a;JJJ)V
    //   296: goto -45 -> 251
    //   299: astore_1
    //   300: aload_0
    //   301: iload_3
    //   302: invokespecial 342	com/umeng/common/ufp/net/DownloadingService:a	(I)V
    //   305: goto -49 -> 256
    //   308: astore_1
    //   309: aload_1
    //   310: invokevirtual 463	java/lang/Exception:printStackTrace	()V
    //   313: iconst_0
    //   314: ireturn
    //   315: astore_1
    //   316: aload_0
    //   317: iload_3
    //   318: invokespecial 342	com/umeng/common/ufp/net/DownloadingService:a	(I)V
    //   321: aload_1
    //   322: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	323	0	this	DownloadingService
    //   0	323	1	paramContext	Context
    //   0	323	2	paramIntent	Intent
    //   23	295	3	i1	int
    //   264	24	4	l1	long
    //   272	18	6	l2	long
    //   280	12	8	l3	long
    //   30	194	10	str	String
    //   79	167	11	localb	DownloadingService.b
    // Exception table:
    //   from	to	target	type
    //   245	251	299	java/lang/Exception
    //   258	296	299	java/lang/Exception
    //   0	32	308	java/lang/Exception
    //   36	91	308	java/lang/Exception
    //   96	144	308	java/lang/Exception
    //   146	187	308	java/lang/Exception
    //   189	218	308	java/lang/Exception
    //   220	240	308	java/lang/Exception
    //   251	256	308	java/lang/Exception
    //   300	305	308	java/lang/Exception
    //   316	323	308	java/lang/Exception
    //   245	251	315	finally
    //   258	296	315	finally
  }
  
  private void b(Notification paramNotification, int paramInt)
  {
    int i1 = a.f(this.r);
    paramNotification.contentView.setTextViewText(i1, this.r.getResources().getString(com.umeng.common.ufp.a.c.d(this.r.getApplicationContext())));
    paramNotification.contentView.setInt(i1, "setBackgroundResource", com.umeng.common.ufp.c.a(this.r).d("umeng_common_gradient_orange"));
    this.p.notify(paramInt, paramNotification);
  }
  
  private static final void b(Map<String, String> paramMap, boolean paramBoolean, String[] paramArrayOfString)
  {
    new Thread(new DownloadingService.6(paramArrayOfString, paramBoolean, paramMap)).start();
  }
  
  private static boolean b(Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (localObject == null) {
      return false;
    }
    paramContext = paramContext.getPackageName();
    localObject = ((List)localObject).iterator();
    while (((Iterator)localObject).hasNext())
    {
      ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
      if ((localRunningAppProcessInfo.importance == 100) && (localRunningAppProcessInfo.processName.equals(paramContext))) {
        return true;
      }
    }
    return false;
  }
  
  private void c(a.a parama)
  {
    Log.c(o, "startDownload([mComponentName:" + parama.a + " mTitle:" + parama.b + " mUrl:" + parama.c + "])");
    int i1 = a(parama);
    Object localObject = new DownloadingService.b(this, getApplicationContext(), parama, i1, 0, this.t);
    parama = new DownloadingService.d(parama, i1);
    parama.a();
    parama.a = ((DownloadingService.b)localObject);
    ((DownloadingService.b)localObject).start();
    e();
    if (m)
    {
      parama = w.keySet().iterator();
      while (parama.hasNext())
      {
        localObject = (Integer)parama.next();
        localObject = (DownloadingService.d)w.get(localObject);
        Log.c(o, "Running task " + ((DownloadingService.d)localObject).e.b);
      }
    }
  }
  
  private void d()
  {
    IntentFilter localIntentFilter = new IntentFilter("com.umeng.intent.DOWNLOAD");
    this.x = new DownloadingService.3(this);
    registerReceiver(this.x, localIntentFilter);
  }
  
  private static boolean d(a.a parama)
  {
    a.a locala;
    if (m)
    {
      int i1 = new Random().nextInt(1000);
      if (v != null)
      {
        localIterator = v.keySet().iterator();
        while (localIterator.hasNext())
        {
          locala = (a.a)localIterator.next();
          Log.c(o, "_" + i1 + " downling  " + locala.b + "   " + locala.c);
        }
      }
      Log.c(o, "_" + i1 + "downling  null");
    }
    if (v == null) {
      return false;
    }
    Iterator localIterator = v.keySet().iterator();
    while (localIterator.hasNext())
    {
      locala = (a.a)localIterator.next();
      if ((parama.e != null) && (parama.e.equals(locala.e))) {
        return true;
      }
      if (locala.c.equals(parama.c)) {
        return true;
      }
    }
    return false;
  }
  
  private void e()
  {
    if (m)
    {
      int i1 = v.size();
      int i2 = w.size();
      Log.a(o, "Client size =" + i1 + "   cacheSize = " + i2);
      if (i1 != i2) {
        throw new RuntimeException("Client size =" + i1 + "   cacheSize = " + i2);
      }
    }
  }
  
  public void a(String paramString)
  {
    synchronized (y)
    {
      if (!y.booleanValue())
      {
        Log.c(o, "show single toast.[" + paramString + "]");
        y = Boolean.valueOf(true);
        this.s.post(new DownloadingService.4(this, paramString));
        this.s.postDelayed(new DownloadingService.5(this), 1200L);
      }
      return;
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    Log.c(o, "onBind ");
    return this.n.getBinder();
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (m)
    {
      Log.LOG = true;
      Debug.waitForDebugger();
    }
    Log.c(o, "onCreate ");
    this.p = ((NotificationManager)getSystemService("notification"));
    this.r = this;
    this.s = new DownloadingService.1(this);
    this.t = new DownloadingService.2(this);
  }
  
  public void onDestroy()
  {
    try
    {
      b.a(getApplicationContext()).a(259200);
      b.a(getApplicationContext()).finalize();
      if (this.x != null) {
        unregisterReceiver(this.x);
      }
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.b(o, localException.getMessage());
      }
    }
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    Log.c(o, "onStart ");
    a(getApplicationContext(), paramIntent);
    super.onStart(paramIntent, paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\DownloadingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */