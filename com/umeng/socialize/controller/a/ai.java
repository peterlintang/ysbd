package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class ai
  extends AsyncTask<Void, Void, Integer>
{
  ai(aa paramaa, SocializeListeners.SocializeClientListener paramSocializeClientListener, z paramz, Context paramContext, SHARE_MEDIA paramSHARE_MEDIA) {}
  
  protected Integer a(Void... paramVarArgs)
  {
    return Integer.valueOf(this.c.b(this.d, this.e));
  }
  
  protected void a(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    if (paramInteger.intValue() == 200) {
      d.d(this.d, this.e);
    }
    for (;;)
    {
      if (this.b != null) {
        this.b.onComplete(paramInteger.intValue(), this.a.a);
      }
      return;
      aa.a(this.a, this.e, paramInteger);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */