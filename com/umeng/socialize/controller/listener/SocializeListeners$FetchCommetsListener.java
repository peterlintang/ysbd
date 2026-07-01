package com.umeng.socialize.controller.listener;

import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.UMComment;
import java.util.List;

public abstract interface SocializeListeners$FetchCommetsListener
{
  public abstract void onComplete(int paramInt, List<UMComment> paramList, SocializeEntity paramSocializeEntity);
  
  public abstract void onStart();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\listener\SocializeListeners$FetchCommetsListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */