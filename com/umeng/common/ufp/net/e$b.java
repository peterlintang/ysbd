package com.umeng.common.ufp.net;

import android.os.AsyncTask;

class e$b
  extends AsyncTask<Integer, Integer, ReportResponse.STATUS>
{
  private f b;
  private e.a c;
  
  public e$b(e parame, f paramf, e.a parama)
  {
    this.b = paramf;
    this.c = parama;
  }
  
  protected ReportResponse.STATUS a(Integer... paramVarArgs)
  {
    return this.a.send(this.b);
  }
  
  protected void a(ReportResponse.STATUS paramSTATUS)
  {
    if (this.c != null) {
      this.c.a(paramSTATUS);
    }
  }
  
  protected void onPreExecute()
  {
    if (this.c != null) {
      this.c.a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\e$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */