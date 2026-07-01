package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.AsyncTask;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;

class ap
  extends AsyncTask<Void, Void, MultiStatus>
{
  ap(aa paramaa, SocializeListeners.MulStatusListener paramMulStatusListener, z paramz, Context paramContext, m paramm, String[] paramArrayOfString, SHARE_MEDIA paramSHARE_MEDIA) {}
  
  protected MultiStatus a(Void... paramVarArgs)
  {
    return this.c.a(this.d, this.e, this.f);
  }
  
  protected void a(MultiStatus paramMultiStatus)
  {
    super.onPostExecute(paramMultiStatus);
    if (200 != paramMultiStatus.getStCode()) {
      aa.a(this.a, this.g, Integer.valueOf(paramMultiStatus.getStCode()));
    }
    if (this.b != null) {
      this.b.onComplete(paramMultiStatus, paramMultiStatus.getStCode(), this.a.a);
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */