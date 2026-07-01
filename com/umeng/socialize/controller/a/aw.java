package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.a.c;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class aw
  extends AsyncTask<Void, Void, Integer>
{
  aw(aa paramaa, SocializeListeners.SocializeClientListener paramSocializeClientListener, z paramz, Context paramContext) {}
  
  protected Integer a(Void... paramVarArgs)
  {
    return Integer.valueOf(this.c.f(this.d));
  }
  
  protected void a(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    if (paramInteger.intValue() == 200) {
      c.a(this.d);
    }
    for (;;)
    {
      if (this.b != null) {
        this.b.onComplete(paramInteger.intValue(), this.a.a);
      }
      return;
      aa.a(this.a, null, paramInteger);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */