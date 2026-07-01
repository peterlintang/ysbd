package com.umeng.newxp.common.a.c.a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

final class e$a
{
  private final Set<g.a> a;
  
  private e$a(Set<g.a> paramSet)
  {
    this.a = paramSet;
  }
  
  public static a a(c.a parama)
  {
    return new a(Collections.singleton(new g.a("", parama)));
  }
  
  public final a a(g.b paramb)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator1 = this.a.iterator();
    while (localIterator1.hasNext())
    {
      g.a locala1 = (g.a)localIterator1.next();
      Iterator localIterator2 = paramb.b().iterator();
      while (localIterator2.hasNext())
      {
        g.a locala2 = locala1.a((g.a)localIterator2.next());
        if (!locala2.a().b()) {
          localHashSet.add(locala2);
        }
      }
    }
    return new a(localHashSet);
  }
  
  public final a a(CharSequence paramCharSequence)
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext()) {
      localHashSet.add(((g.a)localIterator.next()).a(paramCharSequence));
    }
    return new a(localHashSet);
  }
  
  public final Set<g.a> a()
  {
    return this.a;
  }
  
  public final String b()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = this.a.iterator();
    while (localIterator.hasNext())
    {
      g.a locala = (g.a)localIterator.next();
      if (localStringBuilder.length() > 0) {
        localStringBuilder.append("|");
      }
      localStringBuilder.append(locala.c());
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\e$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */