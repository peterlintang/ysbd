package com.umeng.socialize.controller.a;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.exception.SocializeException;

class au
  implements SocializeListeners.OauthCallbackListener
{
  au(aa paramaa, Context paramContext, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (!TextUtils.isEmpty(paramBundle.getString("uid")))
    {
      aa.a(this.a, this.b, paramSHARE_MEDIA, this.c);
      return;
    }
    Toast.makeText(this.b, "授权失败,请重试！", 1).show();
  }
  
  public void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */