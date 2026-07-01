package com.taobao.munion.net;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

class g
{
  public static final int a = 4;
  ExecutorService b = null;
  ExecutorService c = null;
  boolean d = false;
  boolean e = false;
  int f = 4;
  boolean g;
  
  /* Error */
  private void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 25	com/taobao/munion/net/g:d	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 25	com/taobao/munion/net/g:d	Z
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield 27	com/taobao/munion/net/g:e	Z
    //   24: aload_0
    //   25: getfield 21	com/taobao/munion/net/g:b	Ljava/util/concurrent/ExecutorService;
    //   28: ifnonnull +37 -> 65
    //   31: aload_0
    //   32: new 32	java/util/concurrent/ThreadPoolExecutor
    //   35: dup
    //   36: aload_0
    //   37: getfield 29	com/taobao/munion/net/g:f	I
    //   40: sipush 1000
    //   43: lconst_0
    //   44: getstatic 38	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   47: new 40	java/util/concurrent/LinkedBlockingQueue
    //   50: dup
    //   51: invokespecial 41	java/util/concurrent/LinkedBlockingQueue:<init>	()V
    //   54: invokespecial 44	java/util/concurrent/ThreadPoolExecutor:<init>	(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V
    //   57: putfield 21	com/taobao/munion/net/g:b	Ljava/util/concurrent/ExecutorService;
    //   60: aload_0
    //   61: iconst_1
    //   62: putfield 46	com/taobao/munion/net/g:g	Z
    //   65: aload_0
    //   66: getfield 23	com/taobao/munion/net/g:c	Ljava/util/concurrent/ExecutorService;
    //   69: ifnonnull -58 -> 11
    //   72: aload_0
    //   73: new 32	java/util/concurrent/ThreadPoolExecutor
    //   76: dup
    //   77: iconst_1
    //   78: sipush 1000
    //   81: lconst_0
    //   82: getstatic 38	java/util/concurrent/TimeUnit:MILLISECONDS	Ljava/util/concurrent/TimeUnit;
    //   85: new 40	java/util/concurrent/LinkedBlockingQueue
    //   88: dup
    //   89: invokespecial 41	java/util/concurrent/LinkedBlockingQueue:<init>	()V
    //   92: invokespecial 44	java/util/concurrent/ThreadPoolExecutor:<init>	(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;)V
    //   95: putfield 23	com/taobao/munion/net/g:c	Ljava/util/concurrent/ExecutorService;
    //   98: goto -87 -> 11
    //   101: astore_2
    //   102: aload_0
    //   103: monitorexit
    //   104: aload_2
    //   105: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	106	0	this	g
    //   6	2	1	bool	boolean
    //   101	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	101	finally
    //   14	65	101	finally
    //   65	98	101	finally
  }
  
  Future<h> a(b paramb, e parame)
  {
    b();
    if (this.g) {
      return this.b.submit(new g.a(this, paramb, parame));
    }
    return this.c.submit(new g.a(this, paramb, parame));
  }
  
  /* Error */
  void a()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 27	com/taobao/munion/net/g:e	Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield 27	com/taobao/munion/net/g:e	Z
    //   19: aload_0
    //   20: iconst_0
    //   21: putfield 25	com/taobao/munion/net/g:d	Z
    //   24: aload_0
    //   25: getfield 21	com/taobao/munion/net/g:b	Ljava/util/concurrent/ExecutorService;
    //   28: ifnull +17 -> 45
    //   31: aload_0
    //   32: getfield 21	com/taobao/munion/net/g:b	Ljava/util/concurrent/ExecutorService;
    //   35: invokeinterface 67 1 0
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 21	com/taobao/munion/net/g:b	Ljava/util/concurrent/ExecutorService;
    //   45: aload_0
    //   46: getfield 23	com/taobao/munion/net/g:c	Ljava/util/concurrent/ExecutorService;
    //   49: ifnull -38 -> 11
    //   52: aload_0
    //   53: getfield 23	com/taobao/munion/net/g:c	Ljava/util/concurrent/ExecutorService;
    //   56: invokeinterface 67 1 0
    //   61: aload_0
    //   62: aconst_null
    //   63: putfield 23	com/taobao/munion/net/g:c	Ljava/util/concurrent/ExecutorService;
    //   66: goto -55 -> 11
    //   69: astore_2
    //   70: aload_2
    //   71: invokevirtual 70	java/lang/Exception:printStackTrace	()V
    //   74: goto -63 -> 11
    //   77: astore_2
    //   78: aload_0
    //   79: monitorexit
    //   80: aload_2
    //   81: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	82	0	this	g
    //   6	2	1	bool	boolean
    //   69	2	2	localException	Exception
    //   77	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   24	45	69	java/lang/Exception
    //   45	66	69	java/lang/Exception
    //   2	7	77	finally
    //   14	24	77	finally
    //   24	45	77	finally
    //   45	66	77	finally
    //   70	74	77	finally
  }
  
  void a(int paramInt)
  {
    if (this.b != null) {
      this.f = paramInt;
    }
  }
  
  void a(boolean paramBoolean)
  {
    if (paramBoolean == this.g) {
      return;
    }
    this.g = paramBoolean;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */