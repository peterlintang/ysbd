package com.umeng.socialize.controller.listener;

import android.os.Bundle;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.bean.e.a;
import com.umeng.socialize.exception.SocializeException;

public abstract interface SocializeListeners$OauthCallbackListener
  extends e.a
{
  public abstract void onComplete(Bundle paramBundle, SHARE_MEDIA paramSHARE_MEDIA);
  
  public abstract void onError(SocializeException paramSocializeException, SHARE_MEDIA paramSHARE_MEDIA);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\listener\SocializeListeners$OauthCallbackListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */