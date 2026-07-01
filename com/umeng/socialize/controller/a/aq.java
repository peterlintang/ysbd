package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.c.w;
import com.umeng.socialize.controller.listener.SocializeListeners.PlatformInfoListener;

class aq
  extends AsyncTask<Void, Void, w>
{
  aq(aa paramaa, SocializeListeners.PlatformInfoListener paramPlatformInfoListener, z paramz, Context paramContext, m paramm) {}
  
  protected w a(Void... paramVarArgs)
  {
    return this.c.a(this.d, this.e);
  }
  
  protected void a(w paramw)
  {
    super.onPostExecute(paramw);
    if (this.b != null)
    {
      if (paramw != null) {
        this.b.onComplete(paramw.n, paramw.a);
      }
    }
    else {
      return;
    }
    this.b.onComplete(-103, null);
  }
  
  protected void onPreExecute()
  {
    super.onPreExecute();
    if (this.b != null) {
      this.b.onStart();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */