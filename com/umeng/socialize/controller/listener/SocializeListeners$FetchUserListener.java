package com.umeng.socialize.controller.listener;

import com.umeng.socialize.bean.SocializeUser;

public abstract interface SocializeListeners$FetchUserListener
{
  public abstract void onComplete(int paramInt, SocializeUser paramSocializeUser);
  
  public abstract void onStart();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\listener\SocializeListeners$FetchUserListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */