package com.umeng.newxp.common.a;

import java.util.Comparator;

public class j
  implements Comparator
{
  private final i a;
  
  public j()
  {
    this.a = null;
  }
  
  public j(i parami)
  {
    this.a = parami;
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    try
    {
      int i = ((Comparable)this.a.b(paramObject1)).compareTo((Comparable)this.a.b(paramObject2));
      return i;
    }
    catch (g paramObject1) {}
    return 0;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */