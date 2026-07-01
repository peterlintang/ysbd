package com.ireadercity.b2.share;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.exception.SocializeException;

final class a
  implements SocializeListeners.OauthCallbackListener
{
  a(MeachilShareActivity paramMeachilShareActivity, String paramString) {}
  
  public final void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if ((paramBundle != null) && (!TextUtils.isEmpty(paramBundle.getString("uid"))))
    {
      Toast.makeText(this.b.n, "授权成功.", 0).show();
      MeachilShareActivity.a(this.b, this.a, this.b.m);
      return;
    }
    Toast.makeText(this.b.n, "授权失败", 0).show();
  }
  
  public final void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\share\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */