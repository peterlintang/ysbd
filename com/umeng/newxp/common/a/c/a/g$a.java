package com.umeng.newxp.common.a.c.a;

import java.util.Collections;
import java.util.Comparator;

public final class g$a
  implements g.b
{
  public static final Comparator<a> a = new g.a.1();
  private final CharSequence b;
  private final c.a c;
  
  public g$a(CharSequence paramCharSequence, c.a parama)
  {
    this.b = paramCharSequence;
    this.c = parama;
  }
  
  public final c.a a()
  {
    return this.c;
  }
  
  public final a a(a parama)
  {
    return new a(this.b.toString() + parama.b.toString(), this.c.a(parama.c));
  }
  
  public final a a(CharSequence paramCharSequence)
  {
    return new a(this.b.toString() + paramCharSequence.toString(), this.c);
  }
  
  public final Iterable<a> b()
  {
    return Collections.singleton(this);
  }
  
  public final CharSequence c()
  {
    return this.b;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\g$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */