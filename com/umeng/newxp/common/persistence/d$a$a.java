package com.umeng.newxp.common.persistence;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.WeakHashMap;

public final class d$a$a
  implements b.a
{
  private final Map<String, Object> b = new HashMap();
  private boolean c = false;
  
  public d$a$a(d.a parama) {}
  
  public final b.a a()
  {
    try
    {
      this.c = true;
      return this;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public final b.a a(String paramString)
  {
    try
    {
      this.b.put(paramString, this);
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final b.a a(String paramString, float paramFloat)
  {
    try
    {
      this.b.put(paramString, Float.valueOf(paramFloat));
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final b.a a(String paramString, int paramInt)
  {
    try
    {
      this.b.put(paramString, Integer.valueOf(paramInt));
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final b.a a(String paramString, long paramLong)
  {
    try
    {
      this.b.put(paramString, Long.valueOf(paramLong));
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final b.a a(String paramString1, String paramString2)
  {
    try
    {
      this.b.put(paramString1, paramString2);
      return this;
    }
    finally
    {
      paramString1 = finally;
      throw paramString1;
    }
  }
  
  public final b.a a(String paramString, boolean paramBoolean)
  {
    try
    {
      this.b.put(paramString, Boolean.valueOf(paramBoolean));
      return this;
    }
    finally
    {
      paramString = finally;
      throw paramString;
    }
  }
  
  public final boolean b()
  {
    int i = 0;
    for (;;)
    {
      Iterator localIterator;
      Object localObject6;
      Object localObject5;
      synchronized (d.a())
      {
        if (d.a.a(this.a).size() > 0) {
          i = 1;
        }
        if (i == 0) {
          break label335;
        }
        localArrayList = new ArrayList();
        HashSet localHashSet = new HashSet(d.a.a(this.a).keySet());
        try
        {
          if (this.c)
          {
            d.a.b(this.a).clear();
            this.c = false;
          }
          localIterator = this.b.entrySet().iterator();
          if (!localIterator.hasNext()) {
            break label210;
          }
          localObject6 = (Map.Entry)localIterator.next();
          localObject5 = (String)((Map.Entry)localObject6).getKey();
          localObject6 = ((Map.Entry)localObject6).getValue();
          if (localObject6 == this)
          {
            d.a.b(this.a).remove(localObject5);
            if (i == 0) {
              continue;
            }
            localArrayList.add(localObject5);
            continue;
            localObject2 = finally;
          }
        }
        finally {}
      }
      d.a.b(this.a).put(localObject5, localObject6);
      continue;
      label210:
      this.b.clear();
      boolean bool = d.a.c(this.a);
      if (bool) {
        this.a.a(true);
      }
      if (i != 0)
      {
        i = localArrayList.size() - 1;
        while (i >= 0)
        {
          ??? = (String)localArrayList.get(i);
          localIterator = ((Set)localObject2).iterator();
          while (localIterator.hasNext())
          {
            localObject5 = (b.b)localIterator.next();
            if (localObject5 != null) {
              ((b.b)localObject5).a(this.a, (String)???);
            }
          }
          i -= 1;
        }
      }
      return bool;
      label335:
      Object localObject3 = null;
      ArrayList localArrayList = null;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\persistence\d$a$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */