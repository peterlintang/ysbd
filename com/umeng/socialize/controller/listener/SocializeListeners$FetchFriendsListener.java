package com.umeng.socialize.controller.listener;

import com.umeng.socialize.bean.UMFriend;
import java.util.List;

public abstract interface SocializeListeners$FetchFriendsListener
{
  public abstract void onComplete(int paramInt, List<UMFriend> paramList);
  
  public abstract void onStart();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\listener\SocializeListeners$FetchFriendsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */