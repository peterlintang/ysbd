package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.bean.m;
import com.umeng.socialize.c.w;
import com.umeng.socialize.controller.listener.SocializeListeners.PlatformInfoListener;

class r
  extends ay<w>
{
  r(b paramb, SocializeListeners.PlatformInfoListener paramPlatformInfoListener, z paramz, Context paramContext, m paramm) {}
  
  protected void a()
  {
    super.a();
    if (this.b != null) {
      this.b.onStart();
    }
  }
  
  protected void a(w paramw)
  {
    super.a(paramw);
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
  
  protected w b()
  {
    return this.c.a(this.d, this.e);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */