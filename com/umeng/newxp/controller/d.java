package com.umeng.newxp.controller;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.b;
import com.umeng.newxp.c;
import com.umeng.newxp.common.ExchangeConstants;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class d
{
  private static final String b = d.class.getName();
  public ExchangeDataService a;
  private List<Promoter> c = new ArrayList();
  private Context d;
  private String e;
  private String f;
  private String g;
  private b h;
  private c i;
  private d.a j = d.a.b;
  private int k = -1;
  private XpListenersCenter.NTipsChangedListener l;
  private final boolean m = false;
  private boolean n = false;
  private int o;
  private int p;
  
  public d(Context paramContext, ExchangeDataService paramExchangeDataService, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener)
  {
    this.d = paramContext;
    this.a = paramExchangeDataService;
    this.l = paramNTipsChangedListener;
    if (ExchangeConstants.PRELOAD_REPEAT_COUNT > 0) {}
    for (int i1 = ExchangeConstants.PRELOAD_REPEAT_COUNT;; i1 = 1)
    {
      this.o = i1;
      return;
    }
  }
  
  private void a(List<Promoter> paramList, boolean paramBoolean, int paramInt)
  {
    Log.a(b, this.a.oid + " PreloadData setPromoters " + paramList.size());
    if (paramBoolean)
    {
      this.c.clear();
      this.c.addAll(paramList);
    }
    for (;;)
    {
      this.p = paramInt;
      this.e = this.a.sessionId;
      this.f = this.a.psid;
      this.g = this.a.opensize;
      this.h = this.a.resType;
      this.i = this.a.template;
      this.j = d.a.a;
      return;
      this.c = paramList;
    }
  }
  
  public int a(String paramString1, String paramString2)
  {
    int i2;
    if (d.a.b != this.j)
    {
      paramString1 = Promoter.class.getDeclaredField(paramString1);
      paramString1.setAccessible(true);
      Iterator localIterator = this.c.iterator();
      int i1 = 0;
      i2 = i1;
      if (!localIterator.hasNext()) {
        break label98;
      }
      Object localObject = paramString1.get((Promoter)localIterator.next());
      if ((localObject == null) || (TextUtils.isEmpty(paramString2)) || (!paramString2.equals(localObject.toString()))) {
        break label101;
      }
      i1 += 1;
    }
    label98:
    label101:
    for (;;)
    {
      break;
      i2 = 0;
      return i2;
    }
  }
  
  public List<Promoter> a()
  {
    Log.c(b, this.a.oid + "  PreloadData use preload data.. (used=" + this.p + ")");
    if ((this.j == d.a.a) || ((this.j == d.a.c) && ((this.p <= 0) || (this.p < this.o))))
    {
      ArrayList localArrayList = new ArrayList();
      localArrayList.addAll(this.c);
      this.p += 1;
      this.j = d.a.c;
      if ((this.l != null) && (this.k != -1))
      {
        this.k = -1;
        this.l.onChanged(this.k);
        this.n = true;
        Log.c(b, this.a.oid + "  call new tips changed " + this.k);
      }
      Log.c(b, this.a.oid + "  EXIST preload data  " + localArrayList.size());
      this.a.sessionId = this.e;
      this.a.psid = this.f;
      this.a.opensize = this.g;
      this.a.resType = this.h;
      this.a.template = this.i;
      return localArrayList;
    }
    return null;
  }
  
  protected void a(int paramInt)
  {
    Log.c(b, this.a.oid + "  PreloadData set tips " + paramInt);
    int i1 = this.k;
    this.k = paramInt;
    if ((this.l != null) && (!this.n) && (this.k != i1))
    {
      this.l.onChanged(this.k);
      Log.c(b, this.a.oid + "  call new tips changed " + this.k);
    }
  }
  
  public void a(XpListenersCenter.NTipsChangedListener paramNTipsChangedListener)
  {
    Log.a(b, this.a.oid + " PreloadData reset ");
    this.l = paramNTipsChangedListener;
    this.j = d.a.b;
    this.c.clear();
    this.p = 0;
  }
  
  public void a(Class<? extends Promoter> paramClass)
  {
    try
    {
      Log.a(b, "PreloadData do init without data.");
      if (!TextUtils.isEmpty(this.a.sessionId)) {
        this.a.sessionId = "";
      }
      if (paramClass != null) {
        this.a.setSpecificPromoterClz(paramClass);
      }
      this.a.requestExternalData(this.d, new d.1(this));
      return;
    }
    finally {}
  }
  
  public void a(Collection<Promoter> paramCollection)
  {
    if ((paramCollection != null) && (paramCollection.size() > 0)) {
      this.c.addAll(paramCollection);
    }
  }
  
  public void a(List<Promoter> paramList)
  {
    try
    {
      a(paramList, 0);
      return;
    }
    finally
    {
      paramList = finally;
      throw paramList;
    }
  }
  
  /* Error */
  public void a(List<Promoter> paramList, int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new 83	java/lang/StringBuilder
    //   5: dup
    //   6: ldc -3
    //   8: invokespecial 256	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   11: astore 4
    //   13: aload_1
    //   14: ifnonnull +40 -> 54
    //   17: iconst_0
    //   18: istore_3
    //   19: aload 4
    //   21: iload_3
    //   22: invokevirtual 108	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   25: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   28: invokestatic 258	com/umeng/common/ufp/Log:a	(Ljava/lang/String;)V
    //   31: aload_1
    //   32: ifnull +12 -> 44
    //   35: aload_1
    //   36: invokeinterface 105 1 0
    //   41: ifgt +23 -> 64
    //   44: aload_0
    //   45: getstatic 55	com/umeng/newxp/controller/d$a:b	Lcom/umeng/newxp/controller/d$a;
    //   48: putfield 57	com/umeng/newxp/controller/d:j	Lcom/umeng/newxp/controller/d$a;
    //   51: aload_0
    //   52: monitorexit
    //   53: return
    //   54: aload_1
    //   55: invokeinterface 105 1 0
    //   60: istore_3
    //   61: goto -42 -> 19
    //   64: aload_0
    //   65: iconst_m1
    //   66: putfield 59	com/umeng/newxp/controller/d:k	I
    //   69: aload_0
    //   70: aload_1
    //   71: iconst_1
    //   72: iload_2
    //   73: invokespecial 81	com/umeng/newxp/controller/d:a	(Ljava/util/List;ZI)V
    //   76: aload_0
    //   77: aload_0
    //   78: getfield 67	com/umeng/newxp/controller/d:a	Lcom/umeng/newxp/controller/ExchangeDataService;
    //   81: getfield 261	com/umeng/newxp/controller/ExchangeDataService:newTips	I
    //   84: invokevirtual 263	com/umeng/newxp/controller/d:a	(I)V
    //   87: getstatic 41	com/umeng/newxp/controller/d:b	Ljava/lang/String;
    //   90: new 83	java/lang/StringBuilder
    //   93: dup
    //   94: invokespecial 84	java/lang/StringBuilder:<init>	()V
    //   97: aload_0
    //   98: getfield 67	com/umeng/newxp/controller/d:a	Lcom/umeng/newxp/controller/ExchangeDataService;
    //   101: getfield 90	com/umeng/newxp/controller/ExchangeDataService:oid	J
    //   104: invokevirtual 94	java/lang/StringBuilder:append	(J)Ljava/lang/StringBuilder;
    //   107: ldc_w 265
    //   110: invokevirtual 99	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   113: invokevirtual 111	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   116: invokestatic 205	com/umeng/common/ufp/Log:c	(Ljava/lang/String;Ljava/lang/String;)V
    //   119: goto -68 -> 51
    //   122: astore_1
    //   123: aload_0
    //   124: monitorexit
    //   125: aload_1
    //   126: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	127	0	this	d
    //   0	127	1	paramList	List<Promoter>
    //   0	127	2	paramInt	int
    //   18	43	3	i1	int
    //   11	9	4	localStringBuilder	StringBuilder
    // Exception table:
    //   from	to	target	type
    //   2	13	122	finally
    //   19	31	122	finally
    //   35	44	122	finally
    //   44	51	122	finally
    //   54	61	122	finally
    //   64	119	122	finally
  }
  
  public void b(int paramInt)
  {
    if (b())
    {
      this.o += paramInt;
      return;
    }
    this.p = this.o;
    this.o += paramInt;
  }
  
  public boolean b()
  {
    return (d.a.b != this.j) && ((this.p <= 0) || (this.p < this.o));
  }
  
  public void c()
  {
    this.p = this.o;
  }
  
  public void c(int paramInt)
  {
    if (paramInt > 0) {}
    for (;;)
    {
      this.o = paramInt;
      return;
      paramInt = 1;
    }
  }
  
  public d d()
  {
    this.c.clear();
    this.e = null;
    this.g = null;
    this.h = null;
    this.j = d.a.b;
    this.k = -1;
    this.p = 0;
    if (ExchangeConstants.PRELOAD_REPEAT_COUNT > 0) {}
    for (int i1 = ExchangeConstants.PRELOAD_REPEAT_COUNT;; i1 = 1)
    {
      this.o = i1;
      return this;
    }
  }
  
  public int e()
  {
    return this.o;
  }
  
  public String toString()
  {
    Object localObject = new StringBuilder("PreloadData [cacheData=");
    int i1;
    StringBuilder localStringBuilder;
    if (this.c == null)
    {
      i1 = 0;
      localStringBuilder = ((StringBuilder)localObject).append(i1).append(", status=").append(this.j).append(", used=").append(this.p).append(", repeatcount=").append(this.o).append(" ,NTipsChangedListener=");
      if (this.l != null) {
        break label110;
      }
    }
    label110:
    for (localObject = "null";; localObject = "existed")
    {
      return (String)localObject + "]";
      i1 = this.c.size();
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */