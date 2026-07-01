package com.umeng.common.net;

import android.os.AsyncTask;

class f$b
  extends AsyncTask<Integer, Integer, h.a>
{
  private g b;
  private f.a c;
  
  public f$b(f paramf, g paramg, f.a parama)
  {
    this.b = paramg;
    this.c = parama;
  }
  
  protected h.a a(Integer... paramVarArgs)
  {
    return this.a.send(this.b);
  }
  
  protected void a(h.a parama)
  {
    if (this.c != null) {
      this.c.a(parama);
    }
  }
  
  protected void onPreExecute()
  {
    if (this.c != null) {
      this.c.a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\f$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */