package com.umeng.socialize.controller.listener;

import com.umeng.socialize.bean.SHARE_MEDIA;

public abstract interface SocializeListeners$DirectShareListener
{
  public abstract void onAuthenticated(SHARE_MEDIA paramSHARE_MEDIA);
  
  public abstract void onOauthComplete(String paramString, SHARE_MEDIA paramSHARE_MEDIA);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\listener\SocializeListeners$DirectShareListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */