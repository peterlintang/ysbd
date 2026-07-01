package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.a.c;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class y
  extends ay<Integer>
{
  y(b paramb, SocializeListeners.SocializeClientListener paramSocializeClientListener, z paramz, Context paramContext, SHARE_MEDIA paramSHARE_MEDIA) {}
  
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
    if (paramInteger.intValue() == 200) {
      c.a(this.d, this.e.toString());
    }
    for (;;)
    {
      if (this.b != null) {
        this.b.onComplete(paramInteger.intValue(), this.a.a);
      }
      return;
      b.a(this.a, null, paramInteger);
    }
  }
  
  protected Integer b()
  {
    return Integer.valueOf(this.c.a(this.d, this.e));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */