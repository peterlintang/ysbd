package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.i;

public abstract class a
  implements i
{
  public boolean a(String paramString1, String paramString2)
  {
    return b(paramString1).equals(b(paramString2));
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new g("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }
    return b((String)paramObject);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */