package com.umeng.newxp.net;

import com.umeng.common.ufp.net.ReportResponse.STATUS;
import com.umeng.common.ufp.net.e;
import com.umeng.common.ufp.net.f;
import com.umeng.newxp.common.c;

public class b
  extends e
{
  public static final String[] getReprotList()
  {
    return h.f;
  }
  
  public ReportResponse.STATUS send(f paramf)
  {
    int i = 0;
    while (i < h.f.length)
    {
      paramf.a(h.f[i]);
      setHeader(c.i());
      ReportResponse.STATUS localSTATUS = super.send(paramf);
      if (localSTATUS == ReportResponse.STATUS.SUCCESS) {
        return localSTATUS;
      }
      i += 1;
    }
    return ReportResponse.STATUS.FAIL;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */