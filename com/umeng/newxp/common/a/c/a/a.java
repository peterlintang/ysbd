package com.umeng.newxp.common.a.c.a;

import com.umeng.newxp.common.a.g;
import com.umeng.newxp.common.a.i;

public class a
  implements i
{
  private e a = new e(d.b, h.a, true);
  
  public d a()
  {
    return this.a.b();
  }
  
  public void a(d paramd)
  {
    this.a = new e(paramd, this.a.c(), this.a.d());
  }
  
  public void a(h paramh)
  {
    this.a = new e(this.a.b(), paramh, this.a.d());
  }
  
  public void a(boolean paramBoolean)
  {
    this.a = new e(this.a.b(), this.a.c(), paramBoolean);
  }
  
  public h b()
  {
    return this.a.c();
  }
  
  public Object b(Object paramObject)
  {
    if (!(paramObject instanceof String)) {
      throw new g("BeiderMorseEncoder encode parameter is not of type String");
    }
    return b((String)paramObject);
  }
  
  public String b(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    return this.a.a(paramString);
  }
  
  public boolean c()
  {
    return this.a.d();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\a\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */