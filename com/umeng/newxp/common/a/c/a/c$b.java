package com.umeng.newxp.common.a.c.a;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class c$b
  extends c.a
{
  private final Set<String> a;
  
  private c$b(Set<String> paramSet)
  {
    this.a = Collections.unmodifiableSet(paramSet);
  }
  
  public final c.a a(c.a parama)
  {
    if (parama == c.b) {
      localObject = parama;
    }
    do
    {
      do
      {
        return (c.a)localObject;
        localObject = this;
      } while (parama == c.c);
      parama = (b)parama;
      localObject = this;
    } while (parama.a.containsAll(this.a));
    Object localObject = new HashSet(this.a);
    ((Set)localObject).retainAll(parama.a);
    return a((Set)localObject);
  }
  
  public final String a()
  {
    return (String)this.a.iterator().next();
  }
  
  public final boolean a(String paramString)
  {
    return this.a.contains(paramString);
  }
  
  public final boolean b()
  {
    return this.a.isEmpty();
  }
  
  public final boolean c()
  {
    return this.a.size() == 1;
  }
  
  public final Set<String> d()
  {
    return this.a;
  }
  
  public final String toString()
  {
    return "Languages(" + this.a.toString() + ")";
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\c$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */