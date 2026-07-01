package com.umeng.newxp.common.c;

import android.os.Build.VERSION;
import android.os.Message;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

public abstract class b<Params, Progress, Result>
{
  public static final Executor a;
  public static final Executor b;
  public static final Executor c;
  public static final Executor d;
  private static final String e = "AsyncTask";
  private static final int f = 5;
  private static final int g = 128;
  private static final int h = 1;
  private static final ThreadFactory i = new b.1();
  private static final BlockingQueue<Runnable> j = new LinkedBlockingQueue(10);
  private static final int k = 1;
  private static final int l = 2;
  private static final b.b m;
  private static volatile Executor n;
  private final b.e<Params, Result> o = new b.2(this);
  private final FutureTask<Result> p = new b.3(this, this.o);
  private volatile b.d q = b.d.a;
  private final AtomicBoolean r = new AtomicBoolean();
  private final AtomicBoolean s = new AtomicBoolean();
  
  static
  {
    a = new ThreadPoolExecutor(5, 128, 1L, TimeUnit.SECONDS, j, i, new ThreadPoolExecutor.DiscardOldestPolicy());
    if (g())
    {
      localObject = new b.c(null);
      b = (Executor)localObject;
      if (!g()) {
        break label125;
      }
    }
    label125:
    for (Object localObject = new b.c(null);; localObject = Executors.newSingleThreadExecutor(i))
    {
      c = (Executor)localObject;
      d = b;
      m = new b.b(null);
      n = b;
      return;
      localObject = Executors.newSingleThreadExecutor(i);
      break;
    }
  }
  
  public static void a()
  {
    m.getLooper();
  }
  
  public static void a(Runnable paramRunnable)
  {
    n.execute(paramRunnable);
  }
  
  public static void a(Executor paramExecutor)
  {
    n = paramExecutor;
  }
  
  private void c(Result paramResult)
  {
    if (!this.s.get()) {
      d(paramResult);
    }
  }
  
  private Result d(Result paramResult)
  {
    m.obtainMessage(1, new b.a(this, new Object[] { paramResult })).sendToTarget();
    return paramResult;
  }
  
  private void e(Result paramResult)
  {
    if (e()) {
      b(paramResult);
    }
    for (;;)
    {
      this.q = b.d.c;
      return;
      a(paramResult);
    }
  }
  
  public static boolean g()
  {
    return Build.VERSION.SDK_INT >= 11;
  }
  
  public final b<Params, Progress, Result> a(Executor paramExecutor, Params... paramVarArgs)
  {
    if (this.q != b.d.a) {}
    switch (b.4.a[this.q.ordinal()])
    {
    default: 
      this.q = b.d.b;
      c();
      this.o.b = paramVarArgs;
      paramExecutor.execute(this.p);
      return this;
    case 1: 
      throw new IllegalStateException("Cannot execute task: the task is already running.");
    }
    throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
  }
  
  public final Result a(long paramLong, TimeUnit paramTimeUnit)
  {
    return (Result)this.p.get(paramLong, paramTimeUnit);
  }
  
  protected abstract Result a(Params... paramVarArgs);
  
  protected void a(Result paramResult) {}
  
  public final boolean a(boolean paramBoolean)
  {
    this.r.set(true);
    return this.p.cancel(paramBoolean);
  }
  
  public final b.d b()
  {
    return this.q;
  }
  
  protected void b(Result paramResult)
  {
    d();
  }
  
  protected void b(Progress... paramVarArgs) {}
  
  public final b<Params, Progress, Result> c(Params... paramVarArgs)
  {
    return a(n, paramVarArgs);
  }
  
  protected void c() {}
  
  protected void d() {}
  
  protected final void d(Progress... paramVarArgs)
  {
    if (!e()) {
      m.obtainMessage(2, new b.a(this, paramVarArgs)).sendToTarget();
    }
  }
  
  public final boolean e()
  {
    return this.r.get();
  }
  
  public final Result f()
  {
    return (Result)this.p.get();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */