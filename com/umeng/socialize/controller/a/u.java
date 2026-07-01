package com.umeng.socialize.controller.a;

import android.content.Context;
import com.umeng.socialize.c.e;
import com.umeng.socialize.controller.listener.SocializeListeners.FetchCommetsListener;
import com.umeng.socialize.exception.SocializeException;

class u
  extends ay<e>
{
  u(b paramb, SocializeListeners.FetchCommetsListener paramFetchCommetsListener, z paramz, Context paramContext, long paramLong) {}
  
  protected void a()
  {
    super.a();
    if (this.b != null) {
      this.b.onStart();
    }
  }
  
  protected void a(e parame)
  {
    if (this.b != null)
    {
      if (parame != null) {
        this.b.onComplete(parame.n, parame.a, this.a.a);
      }
    }
    else {
      return;
    }
    this.b.onComplete(-102, null, this.a.a);
  }
  
  protected e b()
  {
    try
    {
      e locale = this.c.a(this.d, this.e);
      return locale;
    }
    catch (SocializeException localSocializeException)
    {
      b.a();
      localSocializeException.toString();
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */