package com.taobao.munion.threadpool2;

import java.util.concurrent.PriorityBlockingQueue;

public class f
  extends e
  implements b
{
  private int e;
  private PriorityBlockingQueue<a> f;
  private boolean g = false;
  private boolean h = false;
  private int i = 1;
  private int j = 0;
  private boolean k = false;
  private h l;
  
  public f(int paramInt)
  {
    this(paramInt, h.b());
  }
  
  public f(int paramInt, h paramh)
  {
    this.e = paramInt;
    this.f = new PriorityBlockingQueue(200, new c());
    this.l = paramh;
    paramh.a(this);
  }
  
  public int a()
  {
    return this.e;
  }
  
  public void a(int paramInt)
  {
    this.i = paramInt;
  }
  
  protected void a(a parama)
  {
    this.j += 1;
    this.f.remove(parama);
  }
  
  public void a(Runnable paramRunnable, int paramInt)
  {
    if ((paramRunnable != null) && (!this.k)) {}
    try
    {
      paramRunnable = new a(paramInt, paramRunnable, this);
      if (this.f != null) {
        this.f.add(paramRunnable);
      }
      if (!this.l.b(this))
      {
        this.l = h.b();
        this.l.a(this);
      }
      this.l.f();
      return;
    }
    finally {}
  }
  
  public void a(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void b()
  {
    g();
    this.l.c(this);
  }
  
  protected void b(a parama) {}
  
  /* Error */
  protected a c()
  {
    // Byte code:
    //   0: aconst_null
    //   1: astore_2
    //   2: aload_0
    //   3: monitorenter
    //   4: aload_0
    //   5: getfield 56	com/taobao/munion/threadpool2/f:f	Ljava/util/concurrent/PriorityBlockingQueue;
    //   8: astore_1
    //   9: aload_1
    //   10: ifnonnull +9 -> 19
    //   13: aload_2
    //   14: astore_1
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_1
    //   18: areturn
    //   19: aload_2
    //   20: astore_1
    //   21: aload_0
    //   22: getfield 56	com/taobao/munion/threadpool2/f:f	Ljava/util/concurrent/PriorityBlockingQueue;
    //   25: invokevirtual 92	java/util/concurrent/PriorityBlockingQueue:size	()I
    //   28: ifle -13 -> 15
    //   31: aload_2
    //   32: astore_1
    //   33: aload_0
    //   34: getfield 38	com/taobao/munion/threadpool2/f:h	Z
    //   37: ifne -22 -> 15
    //   40: aload_2
    //   41: astore_1
    //   42: aload_0
    //   43: getfield 42	com/taobao/munion/threadpool2/f:j	I
    //   46: aload_0
    //   47: getfield 40	com/taobao/munion/threadpool2/f:i	I
    //   50: if_icmpge -35 -> 15
    //   53: aload_0
    //   54: getfield 56	com/taobao/munion/threadpool2/f:f	Ljava/util/concurrent/PriorityBlockingQueue;
    //   57: invokevirtual 96	java/util/concurrent/PriorityBlockingQueue:peek	()Ljava/lang/Object;
    //   60: checkcast 71	com/taobao/munion/threadpool2/a
    //   63: astore_1
    //   64: goto -49 -> 15
    //   67: astore_1
    //   68: aload_0
    //   69: monitorexit
    //   70: aload_1
    //   71: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	72	0	this	f
    //   8	56	1	localObject1	Object
    //   67	4	1	localObject2	Object
    //   1	40	2	localObject3	Object
    // Exception table:
    //   from	to	target	type
    //   4	9	67	finally
    //   21	31	67	finally
    //   33	40	67	finally
    //   42	64	67	finally
  }
  
  protected void c(a parama)
  {
    this.j -= 1;
    if (this.f.size() > 0) {
      this.l.f();
    }
  }
  
  protected boolean d()
  {
    return this.f.size() > 0;
  }
  
  protected boolean e()
  {
    return this.g;
  }
  
  protected void f()
  {
    this.k = true;
  }
  
  public void g()
  {
    try
    {
      if (this.f != null) {
        this.f.clear();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void h()
  {
    this.h = true;
  }
  
  public void i()
  {
    if (this.f.size() > 0) {
      this.l.f();
    }
    this.h = false;
  }
  
  public int j()
  {
    return this.i;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\threadpool2\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */