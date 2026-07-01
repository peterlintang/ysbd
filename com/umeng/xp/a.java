package com.umeng.xp;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.NTipsChangedListener;
import java.util.ArrayList;
import java.util.List;

public class a
{
  private static final String c = a.class.getName();
  public a.a a = a.a.b;
  public ExchangeDataService b;
  private List<Promoter> d = null;
  private Context e;
  private String f;
  private int g = -1;
  private XpListenersCenter.NTipsChangedListener h;
  private boolean i = false;
  
  public a(Context paramContext, ExchangeDataService paramExchangeDataService, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener)
  {
    this.e = paramContext;
    this.b = paramExchangeDataService;
    this.h = paramNTipsChangedListener;
  }
  
  private void a(List<Promoter> paramList, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      this.d = new ArrayList();
      this.d.addAll(paramList);
    }
    for (;;)
    {
      this.f = this.b.sessionId;
      this.a = a.a.a;
      return;
      this.d = paramList;
    }
  }
  
  public void a()
  {
    try
    {
      if (!TextUtils.isEmpty(this.b.sessionId)) {
        this.b.sessionId = "";
      }
      this.b.requestDataAsyn(this.e, new b(this));
      return;
    }
    finally {}
  }
  
  protected void a(int paramInt)
  {
    String str = c;
    new StringBuilder().append(this.b.oid).append("  PreloadData set tips ").append(paramInt).toString();
    int j = this.g;
    this.g = paramInt;
    if ((this.g != j) && (this.h != null)) {
      this.h.onChanged(this.g);
    }
    if ((this.i) && (this.h != null)) {
      this.h.onChanged((int)this.b.oid);
    }
  }
  
  public void a(XpListenersCenter.NTipsChangedListener paramNTipsChangedListener)
  {
    this.h = paramNTipsChangedListener;
    this.a = a.a.b;
    this.d = null;
  }
  
  /* Error */
  public void a(List<Promoter> paramList)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnull +12 -> 15
    //   6: aload_1
    //   7: invokeinterface 130 1 0
    //   12: ifgt +13 -> 25
    //   15: aload_0
    //   16: getstatic 43	com/umeng/xp/a$a:b	Lcom/umeng/xp/a$a;
    //   19: putfield 45	com/umeng/xp/a:a	Lcom/umeng/xp/a$a;
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: aload_0
    //   26: aload_1
    //   27: iconst_1
    //   28: invokespecial 59	com/umeng/xp/a:a	(Ljava/util/List;Z)V
    //   31: aload_0
    //   32: aload_0
    //   33: getfield 53	com/umeng/xp/a:b	Lcom/umeng/xp/controller/ExchangeDataService;
    //   36: getfield 133	com/umeng/xp/controller/ExchangeDataService:newTips	I
    //   39: invokevirtual 135	com/umeng/xp/a:a	(I)V
    //   42: getstatic 32	com/umeng/xp/a:c	Ljava/lang/String;
    //   45: astore_1
    //   46: new 99	java/lang/StringBuilder
    //   49: dup
    //   50: invokespecial 100	java/lang/StringBuilder:<init>	()V
    //   53: aload_0
    //   54: getfield 53	com/umeng/xp/a:b	Lcom/umeng/xp/controller/ExchangeDataService;
    //   57: getfield 104	com/umeng/xp/controller/ExchangeDataService:oid	J
    //   60: invokevirtual 108	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   63: ldc -119
    //   65: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   68: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   71: pop
    //   72: aload_0
    //   73: getfield 49	com/umeng/xp/a:i	Z
    //   76: ifeq -54 -> 22
    //   79: aload_0
    //   80: getfield 39	com/umeng/xp/a:d	Ljava/util/List;
    //   83: invokeinterface 141 1 0
    //   88: astore_1
    //   89: aload_1
    //   90: invokeinterface 147 1 0
    //   95: ifeq -73 -> 22
    //   98: aload_1
    //   99: invokeinterface 151 1 0
    //   104: checkcast 153	com/umeng/xp/Promoter
    //   107: astore_2
    //   108: getstatic 32	com/umeng/xp/a:c	Ljava/lang/String;
    //   111: astore_3
    //   112: new 99	java/lang/StringBuilder
    //   115: dup
    //   116: invokespecial 100	java/lang/StringBuilder:<init>	()V
    //   119: aload_0
    //   120: getfield 53	com/umeng/xp/a:b	Lcom/umeng/xp/controller/ExchangeDataService;
    //   123: getfield 104	com/umeng/xp/controller/ExchangeDataService:oid	J
    //   126: invokevirtual 108	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   129: ldc -101
    //   131: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   134: aload_2
    //   135: getfield 158	com/umeng/xp/Promoter:title	Ljava/lang/String;
    //   138: invokevirtual 113	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   141: invokevirtual 119	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   144: pop
    //   145: goto -56 -> 89
    //   148: astore_1
    //   149: aload_0
    //   150: monitorexit
    //   151: aload_1
    //   152: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	a
    //   0	153	1	paramList	List<Promoter>
    //   107	28	2	localPromoter	Promoter
    //   111	1	3	str	String
    // Exception table:
    //   from	to	target	type
    //   6	15	148	finally
    //   15	22	148	finally
    //   25	89	148	finally
    //   89	145	148	finally
  }
  
  public List<Promoter> b()
  {
    Object localObject = c;
    new StringBuilder().append(this.b.oid).append("  PreloadData use preload data.. ").toString();
    if (this.a == a.a.a)
    {
      localObject = this.d;
      this.a = a.a.b;
      this.d = null;
      if ((this.g != -1) && (this.h != null))
      {
        this.g = -1;
        this.h.onChanged(this.g);
      }
      if ((this.i) && (this.h != null)) {
        this.h.onChanged(this.g);
      }
      String str = c;
      new StringBuilder().append(this.b.oid).append("  EXIST preload data  ").append(((List)localObject).size()).toString();
      this.b.sessionId = this.f;
      return (List<Promoter>)localObject;
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */