package com.umeng.socialize.view;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.exception.SocializeException;

class ap
  implements SocializeListeners.OauthCallbackListener
{
  ap(ao paramao, SHARE_MEDIA paramSHARE_MEDIA) {}
  
  public void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (!TextUtils.isEmpty(paramBundle.getString("uid")))
    {
      aj.a(ao.a(this.a), this.b);
      return;
    }
    Toast.makeText(aj.c(ao.a(this.a)), "授权失败,请重试！", 1).show();
  }
  
  public void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */