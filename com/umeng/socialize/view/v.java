package com.umeng.socialize.view;

import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.o;
import com.umeng.socialize.controller.listener.SocializeListeners.LoginListener;

class v
  extends SocializeListeners.LoginListener
{
  v(u paramu) {}
  
  public void loginFailed(int paramInt)
  {
    super.loginFailed(paramInt);
    o.a(q.g(u.a(this.a)), paramInt, "绑定失败，请重试。");
  }
  
  public void loginSuccessed(SHARE_MEDIA paramSHARE_MEDIA, boolean paramBoolean)
  {
    super.loginSuccessed(paramSHARE_MEDIA, paramBoolean);
    if ((paramSHARE_MEDIA != null) && (!paramBoolean))
    {
      q.a(u.a(this.a), d.b(q.g(u.a(this.a)), paramSHARE_MEDIA), paramSHARE_MEDIA);
      q.a(u.a(this.a), paramSHARE_MEDIA);
    }
    q.j(u.a(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */