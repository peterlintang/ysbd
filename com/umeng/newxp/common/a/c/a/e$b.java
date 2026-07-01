package com.umeng.newxp.common.a.c.a;

import java.util.Iterator;
import java.util.List;

final class e$b
{
  private final List<g> a;
  private final CharSequence b;
  private e.a c;
  private int d;
  private boolean e;
  
  public e$b(List<g> paramList, CharSequence paramCharSequence, e.a parama, int paramInt)
  {
    if (paramList == null) {
      throw new NullPointerException("The finalRules argument must not be null");
    }
    this.a = paramList;
    this.c = parama;
    this.b = paramCharSequence;
    this.d = paramInt;
  }
  
  public final int a()
  {
    return this.d;
  }
  
  public final e.a b()
  {
    return this.c;
  }
  
  public final b c()
  {
    int i = 0;
    this.e = false;
    Iterator localIterator = this.a.iterator();
    if (localIterator.hasNext())
    {
      g localg = (g)localIterator.next();
      i = localg.b().length();
      if (localg.a(this.b, this.d))
      {
        this.c = this.c.a(localg.c());
        this.e = true;
      }
    }
    for (;;)
    {
      if (!this.e) {
        i = 1;
      }
      this.d += i;
      return this;
      break;
    }
  }
  
  public final boolean d()
  {
    return this.e;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\e$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */