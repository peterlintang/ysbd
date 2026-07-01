package com.ireadercity.b2.e;

import java.util.ArrayList;

public final class f
{
  private static f c;
  private ArrayList<Runnable> a = new ArrayList();
  private ArrayList<Runnable> b = new ArrayList();
  
  public static f a()
  {
    try
    {
      if (c == null) {
        c = new f();
      }
      f localf = c;
      return localf;
    }
    finally {}
  }
  
  private void b()
  {
    try
    {
      if (!this.b.isEmpty())
      {
        new StringBuilder().append(this.b.size()).append("startNext() --begin").toString();
        Runnable localRunnable = (Runnable)this.b.get(0);
        this.b.remove(0);
        this.a.add(localRunnable);
        new Thread(localRunnable).start();
        new StringBuilder().append(this.b.size()).append("startNext() --end").toString();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final void a(Runnable paramRunnable)
  {
    try
    {
      this.b.add(paramRunnable);
      new StringBuilder().append(this.b.size()).append("push").toString();
      if (this.a.size() < 5)
      {
        b();
        new StringBuilder().append(this.b.size()).append("start next").toString();
      }
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
  
  public final void b(Runnable paramRunnable)
  {
    try
    {
      this.a.remove(paramRunnable);
      new StringBuilder().append(this.b.size()).append("didComplete").toString();
      b();
      return;
    }
    finally
    {
      paramRunnable = finally;
      throw paramRunnable;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\e\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */