package com.taobao.munion.threadpool2;

import java.util.Stack;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

public final class h
  implements i, Runnable
{
  private static final int a = 0;
  private static final int b = 1;
  private static final int c = 2;
  private static final int d = 1;
  private static final int e = 3;
  private static final int f = 5;
  private static final int g = 30;
  private static h i = null;
  private int h = 1;
  private g j;
  private g k;
  private Stack<e> l;
  private Stack<e> m;
  private i n;
  private boolean o;
  private int p;
  private boolean q;
  private Thread r;
  
  protected h()
  {
    this(1, 3, 5, 30);
  }
  
  protected h(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.j = new g(paramInt1, paramInt2, 20000L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(this.h));
    this.k = new g(paramInt3, paramInt4, 20000L, TimeUnit.MICROSECONDS, new ArrayBlockingQueue(this.h));
    this.l = new Stack();
    this.m = new Stack();
    if (this.k != null) {
      this.k.a(this);
    }
    if (this.j != null) {
      this.j.a(this);
    }
    this.r = new Thread(this, "TBThreadPoolMgr");
    this.r.setDaemon(true);
    this.r.start();
    this.p = 0;
    this.o = true;
    this.q = true;
  }
  
  private boolean a(g paramg, Stack<e> paramStack)
  {
    if (paramStack != null)
    {
      int i2 = paramStack.size();
      int i1 = 0;
      while (i1 < i2)
      {
        e locale = (e)paramStack.elementAt(i2 - i1 - 1);
        if (locale.d())
        {
          a locala = locale.c();
          if (locala == null) {
            break label136;
          }
          if (paramg != null) {}
          try
          {
            if (paramg.getActiveCount() < paramg.getMaximumPoolSize())
            {
              paramg.execute(locala);
              locale.a(locala);
              if (paramg.getActiveCount() >= paramg.getCorePoolSize())
              {
                paramStack = new h.a(this);
                paramg.execute(paramStack);
                paramg.remove(paramStack);
              }
            }
            return true;
          }
          catch (RejectedExecutionException paramg)
          {
            paramg.printStackTrace();
            return true;
          }
        }
        if (locale.e()) {
          paramStack.remove(locale);
        }
        label136:
        i1 += 1;
      }
    }
    return false;
  }
  
  public static h b()
  {
    try
    {
      if (i == null) {
        i = new h();
      }
      h localh = i;
      return localh;
    }
    finally {}
  }
  
  public static void c()
  {
    int i2 = 0;
    if (i != null)
    {
      i.p = 1;
      i.f();
    }
    synchronized (i.l)
    {
      int i3 = i.m.size();
      int i1 = 0;
      while (i1 < i3)
      {
        ((e)i.m.elementAt(i3 - i1 - 1)).f();
        i1 += 1;
      }
      i3 = i.l.size();
      i1 = i2;
      while (i1 < i3)
      {
        ((e)i.l.elementAt(i3 - i1 - 1)).f();
        i1 += 1;
      }
      return;
    }
  }
  
  public static void d()
  {
    if (i != null) {
      i.p = 2;
    }
    synchronized (i.l)
    {
      i.m.clear();
      i.l.clear();
      i.o = false;
      i.f();
      i.k.shutdownNow();
      i.j.shutdownNow();
      i = null;
      return;
    }
  }
  
  public final int a()
  {
    return this.p;
  }
  
  public final void a(e parame)
  {
    Stack localStack = this.l;
    if (parame != null) {}
    for (;;)
    {
      try
      {
        if ((this.p == 1) || (this.p == 2)) {
          return;
        }
        switch (parame.a())
        {
        case 0: 
          return;
        }
      }
      finally {}
      if ((this.l != null) && (!this.l.contains(parame)))
      {
        this.l.push(parame);
        continue;
        if ((this.m != null) && (!this.m.contains(parame))) {
          this.m.push(parame);
        }
      }
    }
  }
  
  public final void a(i parami)
  {
    this.n = parami;
  }
  
  public final boolean b(e parame)
  {
    Stack localStack = this.l;
    if (parame != null) {}
    boolean bool;
    try
    {
      if ((this.p == 1) || (this.p == 2)) {
        return false;
      }
      int i1 = parame.a();
      switch (i1)
      {
      default: 
        return false;
      }
    }
    finally {}
    if (this.l != null)
    {
      bool = this.l.contains(parame);
      return bool;
    }
    return false;
    if (this.m != null)
    {
      bool = this.m.contains(parame);
      return bool;
    }
    return false;
  }
  
  public final void c(e parame)
  {
    Stack localStack = this.l;
    if (parame == null) {
      return;
    }
    for (;;)
    {
      try
      {
        switch (parame.a())
        {
        case 0: 
          return;
        }
      }
      finally {}
      if (this.l != null)
      {
        this.l.remove(parame);
        continue;
        if (this.m != null) {
          this.m.remove(parame);
        }
      }
    }
  }
  
  public final void e()
  {
    if ((this.j.isTerminated()) && (this.k.isTerminated()) && (this.n != null)) {
      this.n.e();
    }
  }
  
  public final void f()
  {
    synchronized (this.r)
    {
      this.q = true;
      this.r.notify();
    }
  }
  
  /* Error */
  public final void run()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 105	com/taobao/munion/threadpool2/h:o	Z
    //   4: ifeq +165 -> 169
    //   7: aload_0
    //   8: getfield 80	com/taobao/munion/threadpool2/h:l	Ljava/util/Stack;
    //   11: astore_2
    //   12: aload_2
    //   13: monitorenter
    //   14: aload_0
    //   15: aload_0
    //   16: getfield 75	com/taobao/munion/threadpool2/h:k	Lcom/taobao/munion/threadpool2/g;
    //   19: aload_0
    //   20: getfield 80	com/taobao/munion/threadpool2/h:l	Ljava/util/Stack;
    //   23: invokespecial 204	com/taobao/munion/threadpool2/h:a	(Lcom/taobao/munion/threadpool2/g;Ljava/util/Stack;)Z
    //   26: ifne +144 -> 170
    //   29: aload_0
    //   30: aload_0
    //   31: getfield 73	com/taobao/munion/threadpool2/h:j	Lcom/taobao/munion/threadpool2/g;
    //   34: aload_0
    //   35: getfield 82	com/taobao/munion/threadpool2/h:m	Ljava/util/Stack;
    //   38: invokespecial 204	com/taobao/munion/threadpool2/h:a	(Lcom/taobao/munion/threadpool2/g;Ljava/util/Stack;)Z
    //   41: ifeq +59 -> 100
    //   44: goto +126 -> 170
    //   47: aload_2
    //   48: monitorexit
    //   49: iload_1
    //   50: ifne +107 -> 157
    //   53: aload_0
    //   54: getfield 103	com/taobao/munion/threadpool2/h:p	I
    //   57: iconst_1
    //   58: if_icmpne +52 -> 110
    //   61: aload_0
    //   62: getfield 75	com/taobao/munion/threadpool2/h:k	Lcom/taobao/munion/threadpool2/g;
    //   65: invokevirtual 207	com/taobao/munion/threadpool2/g:shutdown	()V
    //   68: aload_0
    //   69: getfield 73	com/taobao/munion/threadpool2/h:j	Lcom/taobao/munion/threadpool2/g;
    //   72: invokevirtual 207	com/taobao/munion/threadpool2/g:shutdown	()V
    //   75: aload_0
    //   76: iconst_0
    //   77: putfield 105	com/taobao/munion/threadpool2/h:o	Z
    //   80: aconst_null
    //   81: putstatic 44	com/taobao/munion/threadpool2/h:i	Lcom/taobao/munion/threadpool2/h;
    //   84: aload_0
    //   85: iconst_2
    //   86: putfield 103	com/taobao/munion/threadpool2/h:p	I
    //   89: goto -89 -> 0
    //   92: astore_2
    //   93: aload_2
    //   94: invokevirtual 208	java/lang/Exception:printStackTrace	()V
    //   97: goto -97 -> 0
    //   100: iconst_0
    //   101: istore_1
    //   102: goto -55 -> 47
    //   105: astore_3
    //   106: aload_2
    //   107: monitorexit
    //   108: aload_3
    //   109: athrow
    //   110: aload_0
    //   111: getfield 107	com/taobao/munion/threadpool2/h:q	Z
    //   114: ifeq +7 -> 121
    //   117: lconst_1
    //   118: invokestatic 212	java/lang/Thread:sleep	(J)V
    //   121: aload_0
    //   122: getfield 94	com/taobao/munion/threadpool2/h:r	Ljava/lang/Thread;
    //   125: astore_2
    //   126: aload_2
    //   127: monitorenter
    //   128: aload_0
    //   129: getfield 107	com/taobao/munion/threadpool2/h:q	Z
    //   132: ifne +10 -> 142
    //   135: aload_0
    //   136: getfield 94	com/taobao/munion/threadpool2/h:r	Ljava/lang/Thread;
    //   139: invokevirtual 215	java/lang/Object:wait	()V
    //   142: aload_2
    //   143: monitorexit
    //   144: aload_0
    //   145: iconst_0
    //   146: putfield 107	com/taobao/munion/threadpool2/h:q	Z
    //   149: goto -149 -> 0
    //   152: astore_3
    //   153: aload_2
    //   154: monitorexit
    //   155: aload_3
    //   156: athrow
    //   157: aload_0
    //   158: iconst_0
    //   159: putfield 107	com/taobao/munion/threadpool2/h:q	Z
    //   162: lconst_1
    //   163: invokestatic 212	java/lang/Thread:sleep	(J)V
    //   166: goto -166 -> 0
    //   169: return
    //   170: iconst_1
    //   171: istore_1
    //   172: goto -125 -> 47
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	175	0	this	h
    //   49	123	1	i1	int
    //   92	15	2	localException	Exception
    //   105	4	3	localObject1	Object
    //   152	4	3	localObject2	Object
    // Exception table:
    //   from	to	target	type
    //   7	14	92	java/lang/Exception
    //   53	89	92	java/lang/Exception
    //   106	110	92	java/lang/Exception
    //   110	121	92	java/lang/Exception
    //   121	128	92	java/lang/Exception
    //   144	149	92	java/lang/Exception
    //   153	157	92	java/lang/Exception
    //   157	166	92	java/lang/Exception
    //   14	44	105	finally
    //   47	49	105	finally
    //   128	142	152	finally
    //   142	144	152	finally
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\threadpool2\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */