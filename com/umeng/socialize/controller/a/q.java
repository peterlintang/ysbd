package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.MulStatusListener;

class q
  extends ay<MultiStatus>
{
  q(b paramb, SocializeListeners.MulStatusListener paramMulStatusListener, z paramz, Context paramContext, m paramm, String[] paramArrayOfString, SHARE_MEDIA paramSHARE_MEDIA) {}
  
  protected void a()
  {
    super.a();
    if (this.b != null) {
      this.b.onStart();
    }
  }
  
  protected void a(MultiStatus paramMultiStatus)
  {
    super.a(paramMultiStatus);
    if (200 != paramMultiStatus.getStCode()) {
      b.a(this.a, this.g, Integer.valueOf(paramMultiStatus.getStCode()));
    }
    if (this.b != null) {
      this.b.onComplete(paramMultiStatus, paramMultiStatus.getStCode(), this.a.a);
    }
  }
  
  protected MultiStatus b()
  {
    return this.c.a(this.d, this.e, this.f);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */