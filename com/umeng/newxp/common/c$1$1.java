package com.umeng.newxp.common;

import com.umeng.common.ufp.net.ReportResponse.STATUS;
import com.umeng.common.ufp.net.g.a;
import com.umeng.common.ufp.net.g.b;
import java.util.List;

class c$1$1
  implements g.a
{
  c$1$1(c.1 param1, List paramList) {}
  
  public void a(ReportResponse.STATUS paramSTATUS)
  {
    if (paramSTATUS == ReportResponse.STATUS.SUCCESS)
    {
      this.b.a.a(1, this.a);
      return;
    }
    this.b.a.a(0, this.a);
  }
  
  public void a(g.b paramb) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c$1$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */