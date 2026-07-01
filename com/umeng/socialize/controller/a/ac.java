package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.bean.UMComment;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;

class ac
  extends AsyncTask<Void, Void, Integer>
{
  ac(aa paramaa, SocializeListeners.MulStatusListener paramMulStatusListener, z paramz, Context paramContext, UMComment paramUMComment, m[] paramArrayOfm) {}
  
  protected Integer a(Void... paramVarArgs)
  {
    return Integer.valueOf(this.c.a(this.d, this.e, this.f));
  }
  
  protected void a(Integer paramInteger)
  {
    super.onPostExecute(paramInteger);
    if (200 != paramInteger.intValue()) {
      aa.a(this.a, null, paramInteger);
    }
    if (this.b != null) {
      this.b.onComplete(null, paramInteger.intValue(), this.a.a);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */