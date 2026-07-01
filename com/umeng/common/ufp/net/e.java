package com.umeng.common.ufp.net;

import com.umeng.common.ufp.Log;

public class e
  extends h
{
  private static final String a = e.class.getName();
  
  public ReportResponse.STATUS send(f paramf)
  {
    paramf = (ReportResponse)execute(paramf, ReportResponse.class);
    if (paramf == null) {
      return ReportResponse.STATUS.FAIL;
    }
    return paramf.a;
  }
  
  public void sendAsync(f paramf, e.a parama)
  {
    try
    {
      new e.b(this, paramf, parama).execute(new Integer[0]);
      return;
    }
    catch (Exception paramf)
    {
      do
      {
        Log.b(a, "", paramf);
      } while (parama == null);
      parama.a(ReportResponse.STATUS.FAIL);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */