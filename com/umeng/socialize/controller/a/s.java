package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class s
  extends ay<Integer>
{
  s(b paramb, SocializeListeners.SocializeClientListener paramSocializeClientListener, z paramz, Context paramContext) {}
  
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
      this.b.onComplete(paramInteger.intValue(), this.a.a);
    }
  }
  
  protected Integer b()
  {
    return Integer.valueOf(this.c.c(this.d));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */