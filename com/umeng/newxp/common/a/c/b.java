package com.umeng.newxp.common.a.c;

import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.i;

public class b
  implements i
{
  private final d a = new d();
  
  public String a(String paramString)
  {
    return this.a.b(paramString);
  }
  
  public boolean a(String paramString1, String paramString2)
  {
    return a(paramString1).equals(a(paramString2));
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new g("Parameter supplied to Caverphone encode is not of type java.lang.String");
    }
    return a((String)paramObject);
  }
  
  public String b(String paramString)
  {
    return a(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */