package com.umeng.socialize.controller.a;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.controller.listener.SocializeListeners.DirectShareListener;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.exception.SocializeException;

class an
  implements SocializeListeners.OauthCallbackListener
{
  an(aa paramaa, SocializeListeners.DirectShareListener paramDirectShareListener, Context paramContext, Intent paramIntent) {}
  
  public void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA)
  {
    paramBundle = paramBundle.getString("uid");
    if (this.b != null) {
      this.b.onOauthComplete(paramBundle, paramSHARE_MEDIA);
    }
    if (!TextUtils.isEmpty(paramBundle))
    {
      d.a(this.c, paramSHARE_MEDIA, paramBundle);
      aa.a();
      new StringBuilder("do oauth successed ").append(paramSHARE_MEDIA).toString();
      this.c.startActivity(this.d);
    }
  }
  
  public void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (this.b != null) {
      this.b.onOauthComplete(null, paramSHARE_MEDIA);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */