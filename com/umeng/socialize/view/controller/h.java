package com.umeng.socialize.view.controller;

import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.exception.SocializeException;
import com.umeng.socom.net.o.a;

class h
  implements SocializeListeners.OauthCallbackListener
{
  h(d paramd, d.a parama, n paramn) {}
  
  public void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (this.b != null)
    {
      if (!TextUtils.isEmpty(paramBundle.getString("uid")))
      {
        this.c.e = true;
        this.b.a(o.a.a);
      }
    }
    else {
      return;
    }
    this.b.a(o.a.b);
  }
  
  public void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (this.b != null) {
      this.b.a(o.a.b);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */