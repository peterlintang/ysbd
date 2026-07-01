package com.umeng.socialize.view.a;

import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socom.Log;

class ad
  implements SocializeListeners.SocializeClientListener
{
  ad(ab paramab, ab.a parama) {}
  
  public void onComplete(int paramInt, SocializeEntity paramSocializeEntity)
  {
    if ((paramSocializeEntity != null) && (this.a.b != null) && (paramSocializeEntity == this.a.b.getEntity()))
    {
      if (paramInt == 200)
      {
        this.b.a(this.a.getActivity(), this.a.b);
        return;
      }
      this.b.a(new SocializeException(paramInt, ""));
      return;
    }
    Log.c(this.a.a, "actionbar descriptor has changed.no resp");
  }
  
  public void onStart() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */