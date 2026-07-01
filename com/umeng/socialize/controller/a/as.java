package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class as
  extends AsyncTask<Void, Void, Integer>
{
  as(aa paramaa, SocializeListeners.SocializeClientListener paramSocializeClientListener, z paramz, Context paramContext) {}
  
  protected Integer a(Void... paramVarArgs)
  {
    return Integer.valueOf(this.c.d(this.d));
  }
  
  protected void a(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    if (200 != paramInteger.intValue()) {
      aa.a(this.a, null, paramInteger);
    }
    if (this.b != null) {
      this.b.onComplete(paramInteger.intValue(), this.a.a);
    }
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.b != null) {
      this.b.onStart();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */