package com.umeng.socom.net;

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
import com.umeng.socom.Log;
import com.umeng.socom.a.a;
import com.umeng.socom.a.b;
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
  static final int d = 0;
  static final int e = 1;
  static final int f = 100;
  static final String g = "filename";
  public static boolean h = false;
  private static final String j = DownloadingService.class.getName();
  private static final int l = 3;
  private static final long p = 8000L;
  private static Map<a.a, Messenger> q = new HashMap();
  private static Map<Integer, DownloadingService.d> r = new HashMap();
  private static Boolean t = Boolean.valueOf(false);
  final Messenger i = new Messenger(new DownloadingService.c(this));
  private NotificationManager k;
  private Context m;
  private Handler n;
  private DownloadingService.a o;
  private BroadcastReceiver s;
  
  public static int a(a.a parama)
  {
    return Math.abs((int)((parama.b.hashCode() >> 2) + (parama.c.hashCode() >> 3) + System.currentTimeMillis()));
  }
  
  private Notification a(a.a parama, int paramInt1, int paramInt2)
  {
    Context localContext = getApplicationContext();
    Notification localNotification = new Notification(17301633, "正在下载应用", 1L);
    RemoteViews localRemoteViews = new RemoteViews(localContext.getPackageName(), b.a(localContext));
    localRemoteViews.setProgressBar(a.c(localContext), 100, paramInt2, false);
    localRemoteViews.setTextViewText(a.b(localContext), paramInt2 + "%");
    localRemoteViews.setTextViewText(a.d(localContext), localContext.getResources().getString(com.umeng.socom.a.c.g(localContext.getApplicationContext())) + parama.b);
    localRemoteViews.setTextViewText(a.a(localContext), "");
    localRemoteViews.setImageViewResource(a.e(localContext), 17301633);
    localNotification.contentView = localRemoteViews;
    localNotification.contentIntent = PendingIntent.getActivity(localContext, 0, new Intent(), 134217728);
    if (parama.e)
    {
      localNotification.flags = 2;
      parama = l.b(getApplicationContext(), l.a(paramInt1, "continue"));
      localRemoteViews.setOnClickPendingIntent(a.f(localContext), parama);
      localRemoteViews.setViewVisibility(a.f(localContext), 0);
      b(localNotification, paramInt1);
      parama = l.b(getApplicationContext(), l.a(paramInt1, "cancel"));
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
    DownloadingService.d locald = (DownloadingService.d)r.get(Integer.valueOf(paramInt));
    Log.c(j, "download service clear cache " + locald.e.b);
    if (locald.a != null) {
      locald.a.a(2);
    }
    this.k.cancel(locald.c);
    if (q.containsKey(locald.e)) {
      q.remove(locald.e);
    }
    locald.b();
    e();
  }
  
  private void a(Notification paramNotification, int paramInt)
  {
    int i1 = a.f(this.m);
    paramNotification.contentView.setTextViewText(i1, this.m.getResources().getString(com.umeng.socom.a.c.e(this.m.getApplicationContext())));
    paramNotification.contentView.setInt(i1, "setBackgroundResource", com.umeng.socom.c.a(this.m).c("umeng_common_gradient_green"));
    this.k.notify(paramInt, paramNotification);
  }
  
  private void a(a.a parama, long paramLong1, long paramLong2, long paramLong3)
  {
    if (parama.d != null)
    {
      HashMap localHashMap = new HashMap();
      localHashMap.put("dsize", String.valueOf(paramLong1));
      localHashMap.put("dtime", com.umeng.socom.b.g.a().split(" ")[1]);
      float f1 = 0.0F;
      if (paramLong2 > 0L) {
        f1 = (float)paramLong1 / (float)paramLong2;
      }
      localHashMap.put("dpcent", String.valueOf((int)(f1 * 100.0F)));
      localHashMap.put("ptimes", String.valueOf(paramLong3));
      b(localHashMap, false, parama.d);
    }
  }
  
  /* Error */
  private boolean a(Context paramContext, Intent paramIntent)
  {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual 383	android/content/Intent:getExtras	()Landroid/os/Bundle;
    //   4: ldc_w 385
    //   7: invokevirtual 390	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   10: ldc_w 392
    //   13: invokevirtual 364	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   16: astore_2
    //   17: aload_2
    //   18: iconst_0
    //   19: aaload
    //   20: invokestatic 395	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   23: istore_3
    //   24: aload_2
    //   25: iconst_1
    //   26: aaload
    //   27: invokevirtual 398	java/lang/String:trim	()Ljava/lang/String;
    //   30: astore 10
    //   32: iload_3
    //   33: ifeq +279 -> 312
    //   36: aload 10
    //   38: invokestatic 404	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   41: ifne +271 -> 312
    //   44: getstatic 69	com/umeng/socom/net/DownloadingService:r	Ljava/util/Map;
    //   47: iload_3
    //   48: invokestatic 264	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   51: invokeinterface 301 2 0
    //   56: ifeq +256 -> 312
    //   59: getstatic 69	com/umeng/socom/net/DownloadingService:r	Ljava/util/Map;
    //   62: iload_3
    //   63: invokestatic 264	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   66: invokeinterface 270 2 0
    //   71: checkcast 272	com/umeng/socom/net/DownloadingService$d
    //   74: astore_2
    //   75: aload_2
    //   76: getfield 285	com/umeng/socom/net/DownloadingService$d:a	Lcom/umeng/socom/net/DownloadingService$b;
    //   79: astore 11
    //   81: ldc -25
    //   83: aload 10
    //   85: invokevirtual 407	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   88: ifeq +132 -> 220
    //   91: aload 11
    //   93: ifnonnull +96 -> 189
    //   96: getstatic 58	com/umeng/socom/net/DownloadingService:j	Ljava/lang/String;
    //   99: ldc_w 409
    //   102: invokestatic 282	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   105: aload_1
    //   106: ldc_w 411
    //   109: invokestatic 416	com/umeng/socom/b:a	(Landroid/content/Context;Ljava/lang/String;)Z
    //   112: ifeq +34 -> 146
    //   115: aload_1
    //   116: invokestatic 418	com/umeng/socom/b:m	(Landroid/content/Context;)Z
    //   119: ifne +27 -> 146
    //   122: aload_1
    //   123: aload_1
    //   124: invokevirtual 184	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   127: aload_1
    //   128: invokevirtual 185	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   131: invokestatic 419	com/umeng/socom/a/c:a	(Landroid/content/Context;)I
    //   134: invokevirtual 194	android/content/res/Resources:getString	(I)Ljava/lang/String;
    //   137: iconst_1
    //   138: invokestatic 425	android/widget/Toast:makeText	(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;
    //   141: invokevirtual 428	android/widget/Toast:show	()V
    //   144: iconst_0
    //   145: ireturn
    //   146: new 287	com/umeng/socom/net/DownloadingService$b
    //   149: dup
    //   150: aload_0
    //   151: aload_1
    //   152: aload_2
    //   153: getfield 277	com/umeng/socom/net/DownloadingService$d:e	Lcom/umeng/socom/net/a$a;
    //   156: iload_3
    //   157: aload_2
    //   158: getfield 430	com/umeng/socom/net/DownloadingService$d:d	I
    //   161: aload_0
    //   162: getfield 432	com/umeng/socom/net/DownloadingService:o	Lcom/umeng/socom/net/DownloadingService$a;
    //   165: invokespecial 435	com/umeng/socom/net/DownloadingService$b:<init>	(Lcom/umeng/socom/net/DownloadingService;Landroid/content/Context;Lcom/umeng/socom/net/a$a;IILcom/umeng/socom/net/DownloadingService$a;)V
    //   168: astore_1
    //   169: aload_2
    //   170: aload_1
    //   171: putfield 285	com/umeng/socom/net/DownloadingService$d:a	Lcom/umeng/socom/net/DownloadingService$b;
    //   174: aload_1
    //   175: invokevirtual 438	com/umeng/socom/net/DownloadingService$b:start	()V
    //   178: aload_0
    //   179: aload_2
    //   180: getfield 441	com/umeng/socom/net/DownloadingService$d:b	Landroid/app/Notification;
    //   183: iload_3
    //   184: invokespecial 251	com/umeng/socom/net/DownloadingService:b	(Landroid/app/Notification;I)V
    //   187: iconst_1
    //   188: ireturn
    //   189: getstatic 58	com/umeng/socom/net/DownloadingService:j	Ljava/lang/String;
    //   192: ldc_w 409
    //   195: invokestatic 282	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   198: aload 11
    //   200: iconst_1
    //   201: invokevirtual 289	com/umeng/socom/net/DownloadingService$b:a	(I)V
    //   204: aload_2
    //   205: aconst_null
    //   206: putfield 285	com/umeng/socom/net/DownloadingService$d:a	Lcom/umeng/socom/net/DownloadingService$b;
    //   209: aload_0
    //   210: aload_2
    //   211: getfield 441	com/umeng/socom/net/DownloadingService$d:b	Landroid/app/Notification;
    //   214: iload_3
    //   215: invokespecial 443	com/umeng/socom/net/DownloadingService:a	(Landroid/app/Notification;I)V
    //   218: iconst_1
    //   219: ireturn
    //   220: ldc -3
    //   222: aload 10
    //   224: invokevirtual 407	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   227: ifeq +85 -> 312
    //   230: getstatic 58	com/umeng/socom/net/DownloadingService:j	Ljava/lang/String;
    //   233: ldc_w 445
    //   236: invokestatic 282	com/umeng/socom/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   239: aload 11
    //   241: ifnull +16 -> 257
    //   244: aload 11
    //   246: iconst_2
    //   247: invokevirtual 289	com/umeng/socom/net/DownloadingService$b:a	(I)V
    //   250: aload_0
    //   251: iload_3
    //   252: invokespecial 331	com/umeng/socom/net/DownloadingService:a	(I)V
    //   255: iconst_1
    //   256: ireturn
    //   257: aload_2
    //   258: getfield 448	com/umeng/socom/net/DownloadingService$d:f	[J
    //   261: iconst_0
    //   262: laload
    //   263: lstore 4
    //   265: aload_2
    //   266: getfield 448	com/umeng/socom/net/DownloadingService$d:f	[J
    //   269: iconst_1
    //   270: laload
    //   271: lstore 6
    //   273: aload_2
    //   274: getfield 448	com/umeng/socom/net/DownloadingService$d:f	[J
    //   277: iconst_2
    //   278: laload
    //   279: lstore 8
    //   281: aload_0
    //   282: aload_2
    //   283: getfield 277	com/umeng/socom/net/DownloadingService$d:e	Lcom/umeng/socom/net/a$a;
    //   286: lload 4
    //   288: lload 6
    //   290: lload 8
    //   292: invokespecial 340	com/umeng/socom/net/DownloadingService:a	(Lcom/umeng/socom/net/a$a;JJJ)V
    //   295: goto -45 -> 250
    //   298: astore_1
    //   299: aload_0
    //   300: iload_3
    //   301: invokespecial 331	com/umeng/socom/net/DownloadingService:a	(I)V
    //   304: goto -49 -> 255
    //   307: astore_1
    //   308: aload_1
    //   309: invokevirtual 451	java/lang/Exception:printStackTrace	()V
    //   312: iconst_0
    //   313: ireturn
    //   314: astore_1
    //   315: aload_0
    //   316: iload_3
    //   317: invokespecial 331	com/umeng/socom/net/DownloadingService:a	(I)V
    //   320: aload_1
    //   321: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	322	0	this	DownloadingService
    //   0	322	1	paramContext	Context
    //   0	322	2	paramIntent	Intent
    //   23	294	3	i1	int
    //   263	24	4	l1	long
    //   271	18	6	l2	long
    //   279	12	8	l3	long
    //   30	193	10	str	String
    //   79	166	11	localb	DownloadingService.b
    // Exception table:
    //   from	to	target	type
    //   244	250	298	java/lang/Exception
    //   257	295	298	java/lang/Exception
    //   0	32	307	java/lang/Exception
    //   36	91	307	java/lang/Exception
    //   96	144	307	java/lang/Exception
    //   146	187	307	java/lang/Exception
    //   189	218	307	java/lang/Exception
    //   220	239	307	java/lang/Exception
    //   250	255	307	java/lang/Exception
    //   299	304	307	java/lang/Exception
    //   315	322	307	java/lang/Exception
    //   244	250	314	finally
    //   257	295	314	finally
  }
  
  private void b(Notification paramNotification, int paramInt)
  {
    int i1 = a.f(this.m);
    paramNotification.contentView.setTextViewText(i1, this.m.getResources().getString(com.umeng.socom.a.c.d(this.m.getApplicationContext())));
    paramNotification.contentView.setInt(i1, "setBackgroundResource", com.umeng.socom.c.a(this.m).c("umeng_common_gradient_orange"));
    this.k.notify(paramInt, paramNotification);
  }
  
  private static final void b(Map<String, String> paramMap, boolean paramBoolean, String[] paramArrayOfString)
  {
    new Thread(new i(paramArrayOfString, paramBoolean, paramMap)).start();
  }
  
  private static boolean b(Context paramContext)
  {
    Object localObject = ((ActivityManager)paramContext.getSystemService("activity")).getRunningAppProcesses();
    if (localObject == null) {
      return false;
    }
    paramContext = paramContext.getPackageName();
    localObject = ((List)localObject).iterator();
    ActivityManager.RunningAppProcessInfo localRunningAppProcessInfo;
    do
    {
      if (!((Iterator)localObject).hasNext()) {
        return false;
      }
      localRunningAppProcessInfo = (ActivityManager.RunningAppProcessInfo)((Iterator)localObject).next();
    } while ((localRunningAppProcessInfo.importance != 100) || (!localRunningAppProcessInfo.processName.equals(paramContext)));
    return true;
  }
  
  private void c(a.a parama)
  {
    Log.c(j, "startDownload([mComponentName:" + parama.a + " mTitle:" + parama.b + " mUrl:" + parama.c + "])");
    int i1 = a(parama);
    Object localObject = new DownloadingService.b(this, getApplicationContext(), parama, i1, 0, this.o);
    parama = new DownloadingService.d(parama, i1);
    parama.a();
    parama.a = ((DownloadingService.b)localObject);
    ((DownloadingService.b)localObject).start();
    e();
    if (h) {
      parama = r.keySet().iterator();
    }
    for (;;)
    {
      if (!parama.hasNext()) {
        return;
      }
      localObject = (Integer)parama.next();
      localObject = (DownloadingService.d)r.get(localObject);
      Log.c(j, "Running task " + ((DownloadingService.d)localObject).e.b);
    }
  }
  
  private void d()
  {
    IntentFilter localIntentFilter = new IntentFilter("com.umeng.intent.DOWNLOAD");
    this.s = new f(this);
    registerReceiver(this.s, localIntentFilter);
  }
  
  private static boolean d(a.a parama)
  {
    int i1;
    if (h)
    {
      i1 = new Random().nextInt(1000);
      if (q == null) {
        break label119;
      }
      localIterator = q.keySet().iterator();
      if (localIterator.hasNext()) {
        break label57;
      }
    }
    for (;;)
    {
      if (q != null) {
        break label151;
      }
      return false;
      label57:
      a.a locala = (a.a)localIterator.next();
      Log.c(j, "_" + i1 + " downling  " + locala.b + "   " + locala.c);
      break;
      label119:
      Log.c(j, "_" + i1 + "downling  null");
    }
    label151:
    Iterator localIterator = q.keySet().iterator();
    do
    {
      if (!localIterator.hasNext()) {
        return false;
      }
    } while (!((a.a)localIterator.next()).c.equals(parama.c));
    return true;
  }
  
  private void e()
  {
    if (h)
    {
      int i1 = q.size();
      int i2 = r.size();
      Log.a(j, "Client size =" + i1 + "   cacheSize = " + i2);
      if (i1 != i2) {
        throw new RuntimeException("Client size =" + i1 + "   cacheSize = " + i2);
      }
    }
  }
  
  public void a(String paramString)
  {
    synchronized (t)
    {
      if (!t.booleanValue())
      {
        Log.c(j, "show single toast.[" + paramString + "]");
        t = Boolean.valueOf(true);
        this.n.post(new g(this, paramString));
        this.n.postDelayed(new h(this), 1200L);
      }
      return;
    }
  }
  
  public IBinder onBind(Intent paramIntent)
  {
    Log.c(j, "onBind ");
    return this.i.getBinder();
  }
  
  public void onCreate()
  {
    super.onCreate();
    if (h)
    {
      Log.LOG = true;
      Debug.waitForDebugger();
    }
    Log.c(j, "onCreate ");
    this.k = ((NotificationManager)getSystemService("notification"));
    this.m = this;
    this.n = new d(this);
    this.o = new e(this);
  }
  
  public void onDestroy()
  {
    try
    {
      c.a(getApplicationContext()).a(259200);
      c.a(getApplicationContext()).finalize();
      if (this.s != null) {
        unregisterReceiver(this.s);
      }
      super.onDestroy();
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Log.b(j, localException.getMessage());
      }
    }
  }
  
  public void onStart(Intent paramIntent, int paramInt)
  {
    Log.c(j, "onStart ");
    a(getApplicationContext(), paramIntent);
    super.onStart(paramIntent, paramInt);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\DownloadingService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */