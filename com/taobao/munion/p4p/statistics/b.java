package com.taobao.munion.p4p.statistics;

import android.content.Context;
import com.taobao.munion.p4p.statistics.model.f;
import com.taobao.munion.p4p.statistics.model.k;
import java.util.Timer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class b
{
  private static final long a = 10000L;
  private static final String b = "http://gm.mmstat.com/af.2.1?gokey=";
  private static final String c = b.class.getName();
  private static b h = new b();
  private int d = 0;
  private Timer e;
  private Context f;
  private ExecutorService g = Executors.newSingleThreadExecutor();
  
  public static b a()
  {
    return h;
  }
  
  private void c()
  {
    g();
    e();
  }
  
  private void d()
  {
    f();
    g();
  }
  
  private void e()
  {
    b.1 local1 = new b.1(this);
    this.e = new Timer();
    this.e.schedule(local1, 10000L);
  }
  
  private void f()
  {
    if (this.e != null)
    {
      this.e.cancel();
      this.e = null;
    }
  }
  
  private void g()
  {
    Object localObject = null;
    try
    {
      String str = "http://gm.mmstat.com/af.2.1?gokey=" + f.a(null).a(this.f, this.d);
      localObject = str;
      new StringBuilder("Pingback data: ").append(str).toString();
      localObject = str;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException.printStackTrace();
      }
    }
    if ((localObject != null) && (((String)localObject).trim().length() > 0))
    {
      localObject = new b.a(this, (String)localObject);
      this.g.execute((Runnable)localObject);
    }
  }
  
  public void a(Context paramContext, k paramk)
  {
    if ((paramContext != null) && (paramk != null)) {}
    for (;;)
    {
      try
      {
        this.f = paramContext;
        int i = paramk.b;
        switch (i)
        {
        default: 
          return;
        }
      }
      finally {}
      this.d = 1;
      c();
      continue;
      if (this.d != 3)
      {
        this.d = 2;
        d();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\p4p\statistics\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */