package com.umeng.socialize.view.controller;

import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.LoginListener;
import com.umeng.socom.net.o.a;

class k
  extends SocializeListeners.LoginListener
{
  k(d paramd, d.a parama) {}
  
  public void loginFailed(int paramInt)
  {
    super.loginFailed(paramInt);
    if (this.b != null) {
      this.b.a(o.a.b);
    }
  }
  
  public void loginSuccessed(SHARE_MEDIA paramSHARE_MEDIA, boolean paramBoolean)
  {
    super.loginSuccessed(paramSHARE_MEDIA, paramBoolean);
    if (this.b != null) {
      this.b.a(o.a.a);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */