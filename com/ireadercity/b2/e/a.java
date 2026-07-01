package com.ireadercity.b2.e;

import android.content.Context;
import android.os.AsyncTask.Status;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.store.DownloadListActivity;
import com.ireadercity.b2.ui.AIReaderActivity;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class a
{
  public static ConcurrentLinkedQueue<e> a;
  public static ConcurrentHashMap<String, e> b;
  public static ConcurrentHashMap<String, Integer> c;
  public static ConcurrentHashMap<String, com.ireadercity.b2.bean.d> d;
  private static a e;
  private static String f = "BookDownloadManager";
  private static float g = 0.1F;
  private static float h = 0.7F;
  private static float i = 0.2F;
  private static Context k;
  private List<com.ireadercity.b2.bean.d> j;
  
  static
  {
    if (a == null) {
      a = new ConcurrentLinkedQueue();
    }
    if (b == null) {
      b = new ConcurrentHashMap();
    }
    if (d == null) {
      d = new ConcurrentHashMap();
    }
    if (c == null) {
      c = new ConcurrentHashMap();
    }
  }
  
  public static com.ireadercity.b2.bean.d a(String paramString)
  {
    Iterator localIterator = a(k).b().iterator();
    while (localIterator.hasNext())
    {
      com.ireadercity.b2.bean.d locald = (com.ireadercity.b2.bean.d)localIterator.next();
      if (paramString.equals(locald.g())) {
        return locald;
      }
    }
    return null;
  }
  
  public static a a(Context paramContext)
  {
    if (paramContext != null) {}
    try
    {
      k = paramContext;
      if (e == null) {
        e = new a();
      }
      paramContext = e;
      return paramContext;
    }
    finally {}
  }
  
  public static List<com.ireadercity.b2.bean.b> a(List<com.ireadercity.b2.bean.d> paramList)
  {
    if (paramList == null) {
      paramList = null;
    }
    for (;;)
    {
      return paramList;
      try
      {
        ArrayList localArrayList = new ArrayList();
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          com.ireadercity.b2.bean.d locald = (com.ireadercity.b2.bean.d)paramList.next();
          Object localObject = f;
          new StringBuilder("convertToFakeBook ").append(locald.e()).toString();
          localObject = new com.ireadercity.b2.bean.b();
          ((com.ireadercity.b2.bean.b)localObject).g(locald.j());
          ((com.ireadercity.b2.bean.b)localObject).d(locald.g());
          ((com.ireadercity.b2.bean.b)localObject).e(locald.g());
          ((com.ireadercity.b2.bean.b)localObject).d();
          ((com.ireadercity.b2.bean.b)localObject).c(locald.h());
          ((com.ireadercity.b2.bean.b)localObject).f(locald.e());
          ((com.ireadercity.b2.bean.b)localObject).a(d(locald));
          localArrayList.add(localObject);
        }
        paramList = localArrayList;
      }
      finally {}
    }
  }
  
  public static void a(d paramd)
  {
    Object localObject;
    try
    {
      localObject = b.elements();
      while (((Enumeration)localObject).hasMoreElements())
      {
        ((e)((Enumeration)localObject).nextElement()).a(paramd);
        continue;
        return;
      }
    }
    catch (Exception paramd)
    {
      paramd.printStackTrace();
    }
    for (;;)
    {
      localObject = a.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((e)((Iterator)localObject).next()).a(paramd);
      }
    }
  }
  
  private static void a(e parame)
  {
    try
    {
      a.add(parame);
      h();
      return;
    }
    finally
    {
      parame = finally;
      throw parame;
    }
  }
  
  public static boolean a(com.ireadercity.b2.bean.d paramd)
  {
    return com.ireadercity.b2.c.a.a(k).a(paramd);
  }
  
  public static int d(com.ireadercity.b2.bean.d paramd)
  {
    int m = 10;
    switch (paramd.i())
    {
    default: 
      m = 0;
    }
    int n;
    do
    {
      do
      {
        do
        {
          return m;
          n = Math.round(g * 0.0F);
        } while (n > 10);
        return n;
        n = Math.round(h * 0.0F) + 10;
        m = n;
      } while (n <= 80);
      return 80;
      n = Math.round(i * 0.0F) + 80;
      m = n;
    } while (n <= 100);
    return 100;
  }
  
  /* Error */
  private void g()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual 69	com/ireadercity/b2/e/a:b	()Ljava/util/List;
    //   6: invokeinterface 75 1 0
    //   11: astore_1
    //   12: aload_1
    //   13: invokeinterface 81 1 0
    //   18: ifeq +28 -> 46
    //   21: aload_0
    //   22: aload_1
    //   23: invokeinterface 85 1 0
    //   28: checkcast 87	com/ireadercity/b2/bean/d
    //   31: invokevirtual 90	com/ireadercity/b2/bean/d:g	()Ljava/lang/String;
    //   34: iconst_0
    //   35: invokevirtual 196	com/ireadercity/b2/e/a:a	(Ljava/lang/String;Z)V
    //   38: goto -26 -> 12
    //   41: astore_1
    //   42: aload_1
    //   43: invokevirtual 171	java/lang/Exception:printStackTrace	()V
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: astore_1
    //   50: aload_0
    //   51: monitorexit
    //   52: aload_1
    //   53: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	54	0	this	a
    //   11	12	1	localIterator	Iterator
    //   41	2	1	localException	Exception
    //   49	4	1	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	12	41	java/lang/Exception
    //   12	38	41	java/lang/Exception
    //   2	12	49	finally
    //   12	38	49	finally
    //   42	46	49	finally
  }
  
  private static void h()
  {
    int m = 0;
    try
    {
      Object localObject1 = a.iterator();
      for (;;)
      {
        if (((Iterator)localObject1).hasNext())
        {
          if (((e)((Iterator)localObject1).next()).getStatus().equals(AsyncTask.Status.RUNNING)) {
            m += 1;
          }
        }
        else
        {
          if (m < 3)
          {
            localObject1 = (e)a.poll();
            if (localObject1 == null) {
              break label81;
            }
            ((e)localObject1).execute(new Object[0]);
          }
          for (;;)
          {
            return;
            label81:
            if (a.size() > 0) {
              h();
            }
          }
        }
      }
    }
    finally {}
  }
  
  public final void a(String paramString, boolean paramBoolean)
  {
    if (paramBoolean) {
      b(a(paramString));
    }
    while (b.get(paramString) == null) {
      return;
    }
    ((e)b.get(paramString)).a();
    ((e)b.get(paramString)).cancel(true);
    b.remove(paramString);
  }
  
  public final boolean a()
  {
    try
    {
      g();
      com.ireadercity.b2.c.a.a(k).e();
      if (this.j == null)
      {
        ??? = f;
        return false;
      }
      synchronized (this.j)
      {
        Iterator localIterator = this.j.iterator();
        if (localIterator.hasNext())
        {
          com.ireadercity.b2.bean.d locald = (com.ireadercity.b2.bean.d)localIterator.next();
          String str = f;
          new StringBuilder("============  persistenceDownloadInfos ").append(locald.e()).toString();
          a(locald);
        }
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      return false;
    }
    return true;
  }
  
  public final List<com.ireadercity.b2.bean.d> b()
  {
    try
    {
      if (this.j == null)
      {
        localObject1 = f;
        this.j = com.ireadercity.b2.c.a.a(k).d();
      }
      Object localObject1 = f;
      new StringBuilder("getDownloadInfos ============= >").append(this.j.size()).toString();
      localObject1 = this.j;
      return (List<com.ireadercity.b2.bean.d>)localObject1;
    }
    finally {}
  }
  
  public final void b(com.ireadercity.b2.bean.d paramd)
  {
    if (paramd == null) {
      return;
    }
    int m = 0;
    for (;;)
    {
      try
      {
        Object localObject;
        if (m < b().size())
        {
          localObject = (com.ireadercity.b2.bean.d)b().get(m);
          if (paramd.g().equals(((com.ireadercity.b2.bean.d)localObject).g())) {
            b().remove(localObject);
          }
        }
        else
        {
          b().add(0, paramd);
          localObject = new e(paramd);
          ((e)localObject).a(k);
          ((e)localObject).a(AIReaderActivity.a);
          ((e)localObject).a(DownloadListActivity.a);
          if (b.get(paramd.g()) != null) {
            ((e)b.get(paramd.g())).a();
          }
          b.put(paramd.g(), localObject);
          a((e)localObject);
          break;
        }
      }
      finally {}
      m += 1;
    }
  }
  
  public final void c()
  {
    String str = f;
    if (this.j != null) {
      this.j.clear();
    }
    k = null;
  }
  
  public final void c(com.ireadercity.b2.bean.d paramd)
  {
    if (b.get(paramd.g()) != null)
    {
      ((e)b.get(paramd.g())).a();
      ((e)b.get(paramd.g())).cancel(true);
      b.remove(paramd.g());
      String str2 = paramd.h();
      String str1 = v.a(str2, paramd.a());
      String str3 = f;
      new StringBuilder("bookURL").append(str2).toString();
      str2 = f;
      new StringBuilder("bookFileName").append(str1).toString();
      com.ireadercity.b2.c.a.a(k).m(paramd.g());
      new Thread(new b(this, str1)).start();
    }
  }
  
  public final void d()
  {
    int m = 0;
    for (;;)
    {
      e locale;
      if (m < a.size())
      {
        locale = (e)a.peek();
        if ((locale != null) && (!locale.getStatus().equals(AsyncTask.Status.FINISHED)))
        {
          locale.a();
          locale.cancel(true);
        }
      }
      try
      {
        com.ireadercity.b2.c.a.a(k).q(locale.b().g());
        m += 1;
        continue;
        b.clear();
        a.clear();
        b().clear();
        new Thread(new c(this)).start();
        return;
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  public final void e()
  {
    this.j = null;
    a.clear();
    b.clear();
    d.clear();
    c.clear();
    String str = f;
  }
  
  public final void e(com.ireadercity.b2.bean.d paramd)
  {
    for (;;)
    {
      int m;
      try
      {
        if (b() != null)
        {
          Object localObject = f;
          new StringBuilder("removeDownInfo :").append(paramd.e()).append(paramd.g()).toString();
          localObject = f;
          new StringBuilder("removeDownInfo before:").append(this.j.size()).toString();
          m = 0;
          if (m < this.j.size())
          {
            localObject = (com.ireadercity.b2.bean.d)this.j.get(m);
            if (paramd.g().equals(((com.ireadercity.b2.bean.d)localObject).g())) {
              this.j.remove(localObject);
            }
          }
          else
          {
            paramd = f;
            new StringBuilder("removeDownInfo after:").append(this.j.size()).toString();
          }
        }
        else
        {
          return;
        }
      }
      finally {}
      m += 1;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\e\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */