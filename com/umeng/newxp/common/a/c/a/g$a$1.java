package com.umeng.newxp.common.a.c.a;

import java.util.Comparator;

final class g$a$1
  implements Comparator<g.a>
{
  public final int a(g.a parama1, g.a parama2)
  {
    int j = 0;
    int i = 0;
    if (i < g.a.b(parama1).length()) {
      if (i >= g.a.b(parama2).length()) {
        i = 1;
      }
    }
    do
    {
      return i;
      int k = g.a.b(parama1).charAt(i) - g.a.b(parama2).charAt(i);
      if (k != 0) {
        return k;
      }
      i += 1;
      break;
      i = j;
    } while (g.a.b(parama1).length() >= g.a.b(parama2).length());
    return -1;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\g$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */