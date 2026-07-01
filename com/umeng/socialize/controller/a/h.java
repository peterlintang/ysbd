package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.UMShareMsg;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.controller.listener.SocializeListeners.SnsPostListener;

class h
  extends ay<Integer>
{
  h(b paramb, SocializeListeners.SnsPostListener paramSnsPostListener, SHARE_MEDIA paramSHARE_MEDIA, String paramString1, String paramString2, z paramz, Context paramContext) {}
  
  protected void a()
  {
    super.a();
    if (this.b != null) {
      this.b.onStart();
    }
  }
  
  protected void a(Integer paramInteger)
  {
    super.a(paramInteger);
    if (200 != paramInteger.intValue()) {
      b.a(this.a, null, paramInteger);
    }
    if (this.b != null) {
      this.b.onComplete(this.c, paramInteger.intValue(), this.a.a);
    }
  }
  
  protected Integer b()
  {
    m localm = new m(this.c.toString(), this.d);
    UMShareMsg localUMShareMsg = new UMShareMsg();
    localUMShareMsg.wid = this.e;
    return Integer.valueOf(this.f.a(this.g, new m[] { localm }, localUMShareMsg).getStCode());
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */