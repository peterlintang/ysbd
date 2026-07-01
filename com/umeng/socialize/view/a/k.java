package com.umeng.socialize.view.a;

import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class k
  implements Runnable
{
  k(j paramj, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void run()
  {
    j.a(this.a).b.likeChange(j.a(this.a).getContext(), this.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */