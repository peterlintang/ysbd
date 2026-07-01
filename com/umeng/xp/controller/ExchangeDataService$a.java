package com.umeng.xp.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.umeng.common.Log;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.net.b;
import com.umeng.xp.net.f;
import java.util.List;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

class ExchangeDataService$a
  extends Thread
{
  private XpListenersCenter.ExchangeDataRequestListener b;
  private int c;
  private Map<String, Object> d;
  private Handler e = new e(this);
  
  public ExchangeDataService$a(XpListenersCenter.ExchangeDataRequestListener paramExchangeDataRequestListener, int paramInt, Map<String, Object> paramMap)
  {
    this.b = paramInt;
    this.c = paramMap;
    Map localMap;
    this.d = localMap;
  }
  
  private List<Promoter> a()
  {
    int j = new Random().nextInt(1000);
    if (this.d != null) {}
    for (??? = this.d; ??? == null; ??? = ExchangeDataService.d(this.a)) {
      return null;
    }
    int i;
    if (((Map)???).containsKey("sid")) {
      if (TextUtils.isEmpty((String)((Map)???).get("sid"))) {
        i = 1;
      }
    }
    List localList;
    for (;;)
    {
      com.umeng.xp.net.g localg = new b().a(new f((Map)???));
      if ((localg == null) || (localg.m == null))
      {
        return null;
        i = 0;
      }
      else
      {
        Log.c(ExchangeConstants.LOG_TAG, "\trequestLive get resStr:\t" + localg.m.toString());
        try
        {
          localList = a(localg);
          if ((localList == null) || (localList.size() <= 0)) {
            break;
          }
          if (this.b != null) {
            break label343;
          }
          synchronized (this.a.mContext.getSharedPreferences(ExchangeDataService.b(this.a), 0))
          {
            SharedPreferences.Editor localEditor = ((SharedPreferences)???).edit();
            localEditor.putLong(ExchangeDataService.f(this.a), System.currentTimeMillis());
            if (i != 0)
            {
              localEditor.putString(ExchangeDataService.g(this.a), localg.m.toString());
              localEditor.commit();
              break label343;
            }
            localEditor.putString(ExchangeDataService.c(this.a), localg.m.toString());
            localEditor.commit();
          }
          i = 1;
        }
        catch (Exception localException)
        {
          Log.b(ExchangeDataService.a(this.a), j + "  request from network error:", localException);
          return null;
        }
      }
    }
    return null;
    label343:
    return localList;
  }
  
  private List<Promoter> a(com.umeng.xp.net.g paramg)
  {
    boolean bool2 = true;
    Object localObject;
    boolean bool1;
    if (!ExchangeDataService.h(this.a))
    {
      localObject = this.a;
      if (paramg.c == 1)
      {
        bool1 = true;
        ExchangeDataService.a((ExchangeDataService)localObject, bool1);
      }
    }
    else
    {
      if (paramg.b != 1) {
        break label321;
      }
      bool1 = bool2;
      label45:
      ExchangeConstants.show_size = bool1;
      ExchangeDataService localExchangeDataService = this.a;
      if (!TextUtils.isEmpty(paramg.i)) {
        break label326;
      }
      localObject = "";
      label69:
      localExchangeDataService.opensize = ((String)localObject);
      if (!ExchangeDataService.i(this.a)) {
        ExchangeDataService.a(this.a, paramg.k);
      }
      if ((!ExchangeConstants.DEBUG_MODE) || (ExchangeDataService.DEBUG_NEW_TIPS < 0)) {
        break label335;
      }
    }
    label321:
    label326:
    label335:
    for (this.a.newTips = ExchangeDataService.DEBUG_NEW_TIPS;; this.a.newTips = paramg.j)
    {
      if (!com.umeng.common.b.g.c(paramg.d)) {
        this.a.sessionId = paramg.d;
      }
      if ((paramg.e > 3) && (!ExchangeConstants.IGNORE_SERVER_INTERVAL)) {
        ExchangeConstants.REFRESH_INTERVAL = paramg.e * 1000;
      }
      localObject = this.a.mContext.getSharedPreferences(ExchangeDataService.b(this.a), 0);
      if (((SharedPreferences)localObject).getInt(ExchangeDataService.j(this.a), 0) != paramg.g)
      {
        localObject = ((SharedPreferences)localObject).edit();
        ((SharedPreferences.Editor)localObject).putInt(ExchangeDataService.j(this.a), paramg.g);
        ((SharedPreferences.Editor)localObject).commit();
        Log.c(ExchangeDataService.a(this.a), "Change the " + ExchangeDataService.j(this.a) + "   " + paramg.g);
      }
      if (!com.umeng.common.b.g.c(paramg.h)) {
        this.a.landing_image = paramg.h;
      }
      return paramg.l;
      bool1 = false;
      break;
      bool1 = false;
      break label45;
      localObject = paramg.i;
      break label69;
    }
  }
  
  /* Error */
  private List<Promoter> b()
  {
    // Byte code:
    //   0: iconst_1
    //   1: istore_2
    //   2: aload_0
    //   3: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   6: getfield 133	com/umeng/xp/controller/ExchangeDataService:mContext	Landroid/content/Context;
    //   9: aload_0
    //   10: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   13: invokestatic 136	com/umeng/xp/controller/ExchangeDataService:b	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   16: iconst_0
    //   17: invokevirtual 142	android/content/Context:getSharedPreferences	(Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   20: astore 6
    //   22: aload_0
    //   23: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   26: getfield 237	com/umeng/xp/controller/ExchangeDataService:sessionId	Ljava/lang/String;
    //   29: invokestatic 74	android/text/TextUtils:isEmpty	(Ljava/lang/CharSequence;)Z
    //   32: ifeq +300 -> 332
    //   35: iconst_1
    //   36: istore_1
    //   37: iload_1
    //   38: ifeq +259 -> 297
    //   41: aload_0
    //   42: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   45: invokestatic 178	com/umeng/xp/controller/ExchangeDataService:a	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   48: ldc_w 276
    //   51: invokestatic 120	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   54: aload 6
    //   56: aload_0
    //   57: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   60: invokestatic 151	com/umeng/xp/controller/ExchangeDataService:f	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   63: lconst_0
    //   64: invokeinterface 280 4 0
    //   69: lstore_3
    //   70: invokestatic 157	java/lang/System:currentTimeMillis	()J
    //   73: lload_3
    //   74: invokestatic 286	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   77: invokevirtual 289	java/lang/Long:longValue	()J
    //   80: lsub
    //   81: ldc2_w 290
    //   84: ldiv
    //   85: ldc2_w 292
    //   88: lcmp
    //   89: ifle +248 -> 337
    //   92: iload_2
    //   93: istore_1
    //   94: iload_1
    //   95: ifeq +103 -> 198
    //   98: aload 6
    //   100: monitorenter
    //   101: aload 6
    //   103: invokeinterface 148 1 0
    //   108: astore 5
    //   110: aload 5
    //   112: aload_0
    //   113: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   116: invokestatic 166	com/umeng/xp/controller/ExchangeDataService:g	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   119: invokeinterface 297 2 0
    //   124: pop
    //   125: aload 5
    //   127: aload_0
    //   128: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   131: invokestatic 176	com/umeng/xp/controller/ExchangeDataService:c	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   134: invokeinterface 297 2 0
    //   139: pop
    //   140: aload 5
    //   142: aload_0
    //   143: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   146: invokestatic 151	com/umeng/xp/controller/ExchangeDataService:f	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   149: invokeinterface 297 2 0
    //   154: pop
    //   155: aload 5
    //   157: invokeinterface 174 1 0
    //   162: pop
    //   163: aload 6
    //   165: monitorexit
    //   166: aload_0
    //   167: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   170: invokestatic 178	com/umeng/xp/controller/ExchangeDataService:a	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   173: ldc_w 299
    //   176: invokestatic 301	com/umeng/common/Log:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   179: aconst_null
    //   180: areturn
    //   181: astore 5
    //   183: aload 6
    //   185: monitorexit
    //   186: aload 5
    //   188: athrow
    //   189: astore 5
    //   191: aload 5
    //   193: invokevirtual 304	java/lang/Exception:printStackTrace	()V
    //   196: aconst_null
    //   197: areturn
    //   198: aload_0
    //   199: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   202: invokestatic 166	com/umeng/xp/controller/ExchangeDataService:g	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   205: astore 5
    //   207: aload 6
    //   209: aload 5
    //   211: aconst_null
    //   212: invokeinterface 308 3 0
    //   217: astore 7
    //   219: aload 7
    //   221: ifnull +109 -> 330
    //   224: aload 6
    //   226: monitorenter
    //   227: aload 6
    //   229: invokeinterface 148 1 0
    //   234: astore 8
    //   236: aload 8
    //   238: aload 5
    //   240: invokeinterface 297 2 0
    //   245: pop
    //   246: aload 8
    //   248: invokeinterface 174 1 0
    //   253: pop
    //   254: aload 6
    //   256: monitorexit
    //   257: aload_0
    //   258: new 87	com/umeng/xp/net/g
    //   261: dup
    //   262: new 106	org/json/JSONObject
    //   265: dup
    //   266: aload 7
    //   268: invokespecial 309	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   271: invokespecial 312	com/umeng/xp/net/g:<init>	(Lorg/json/JSONObject;)V
    //   274: invokespecial 123	com/umeng/xp/controller/ExchangeDataService$a:a	(Lcom/umeng/xp/net/g;)Ljava/util/List;
    //   277: astore 5
    //   279: aload 5
    //   281: ifnull +49 -> 330
    //   284: aload 5
    //   286: invokeinterface 129 1 0
    //   291: ifle +39 -> 330
    //   294: aload 5
    //   296: areturn
    //   297: aload_0
    //   298: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   301: invokestatic 178	com/umeng/xp/controller/ExchangeDataService:a	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   304: ldc_w 314
    //   307: invokestatic 120	com/umeng/common/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   310: aload_0
    //   311: getfield 19	com/umeng/xp/controller/ExchangeDataService$a:a	Lcom/umeng/xp/controller/ExchangeDataService;
    //   314: invokestatic 176	com/umeng/xp/controller/ExchangeDataService:c	(Lcom/umeng/xp/controller/ExchangeDataService;)Ljava/lang/String;
    //   317: astore 5
    //   319: goto -112 -> 207
    //   322: astore 5
    //   324: aload 6
    //   326: monitorexit
    //   327: aload 5
    //   329: athrow
    //   330: aconst_null
    //   331: areturn
    //   332: iconst_0
    //   333: istore_1
    //   334: goto -297 -> 37
    //   337: iconst_0
    //   338: istore_1
    //   339: goto -245 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	342	0	this	a
    //   36	303	1	i	int
    //   1	92	2	j	int
    //   69	5	3	l	long
    //   108	48	5	localEditor1	SharedPreferences.Editor
    //   181	6	5	localObject1	Object
    //   189	3	5	localException	Exception
    //   205	113	5	localObject2	Object
    //   322	6	5	localObject3	Object
    //   20	305	6	localSharedPreferences	SharedPreferences
    //   217	50	7	str	String
    //   234	13	8	localEditor2	SharedPreferences.Editor
    // Exception table:
    //   from	to	target	type
    //   101	166	181	finally
    //   2	35	189	java/lang/Exception
    //   41	92	189	java/lang/Exception
    //   98	101	189	java/lang/Exception
    //   166	179	189	java/lang/Exception
    //   183	189	189	java/lang/Exception
    //   198	207	189	java/lang/Exception
    //   207	219	189	java/lang/Exception
    //   224	227	189	java/lang/Exception
    //   257	279	189	java/lang/Exception
    //   284	294	189	java/lang/Exception
    //   297	319	189	java/lang/Exception
    //   324	330	189	java/lang/Exception
    //   227	257	322	finally
  }
  
  public void run()
  {
    boolean bool = TextUtils.isEmpty(this.a.sessionId);
    if (bool) {
      this.a.timeLine[0] = System.currentTimeMillis();
    }
    if (this.c == 1) {}
    for (List localList = b();; localList = a())
    {
      if (bool) {
        this.a.timeLine[1] = System.currentTimeMillis();
      }
      Message localMessage = new Message();
      localMessage.obj = localList;
      this.e.sendMessage(localMessage);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\controller\ExchangeDataService$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */