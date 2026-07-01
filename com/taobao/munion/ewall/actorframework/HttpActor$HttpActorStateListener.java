package com.taobao.munion.ewall.actorframework;

import android.os.Handler;
import android.os.Message;
import com.taobao.munion.net.l;
import com.taobao.munion.net.t;

public abstract class HttpActor$HttpActorStateListener
{
  public void onCancel() {}
  
  public void onFailed(t paramt) {}
  
  public void onMessage(Message paramMessage)
  {
    HttpActor.sCallBackHandler.sendMessage(paramMessage);
  }
  
  public void onStart() {}
  
  public void onSucceed(l paraml) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\HttpActor$HttpActorStateListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */