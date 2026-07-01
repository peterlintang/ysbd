package com.umeng.socialize.view;

import com.umeng.socialize.a.c;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.listener.SocializeListeners.LoginListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.view.a.y;

class ar
  implements SocializeListeners.SocializeClientListener
{
  ar(aj paramaj) {}
  
  public void onComplete(int paramInt, SocializeEntity paramSocializeEntity)
  {
    aj.a(this.a).c();
    if (paramInt == 200)
    {
      c.a(aj.c(this.a), true);
      this.a.b();
      if (aj.b(this.a) != null) {
        aj.b(this.a).loginSuccessed(null, false);
      }
    }
    while (aj.b(this.a) == null) {
      return;
    }
    aj.b(this.a).loginFailed(paramInt);
  }
  
  public void onStart()
  {
    aj.a(this.a).b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */