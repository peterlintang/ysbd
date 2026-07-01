package com.umeng.socialize.controller.listener;

import com.umeng.socialize.bean.MultiStatus;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.e.a;

public abstract interface SocializeListeners$MulStatusListener
  extends e.a
{
  public abstract void onComplete(MultiStatus paramMultiStatus, int paramInt, SocializeEntity paramSocializeEntity);
  
  public abstract void onStart();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\listener\SocializeListeners$MulStatusListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */