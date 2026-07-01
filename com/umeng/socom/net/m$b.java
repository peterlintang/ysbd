package com.umeng.socom.net;

import android.os.AsyncTask;

class m$b
  extends AsyncTask<Integer, Integer, o.a>
{
  private n b;
  private m.a c;
  
  public m$b(m paramm, n paramn, m.a parama)
  {
    this.b = paramn;
    this.c = parama;
  }
  
  protected o.a a(Integer... paramVarArgs)
  {
    return this.a.a(this.b);
  }
  
  protected void a(o.a parama)
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socom\net\m$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */