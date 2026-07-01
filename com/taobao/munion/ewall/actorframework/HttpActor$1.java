package com.taobao.munion.ewall.actorframework;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.taobao.munion.net.l;
import com.taobao.munion.net.t;

final class HttpActor$1
  extends Handler
{
  HttpActor$1(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.obj == null)
    {
      HttpActor.mActorStateListener.onFailed(new t(null));
      return;
    }
    paramMessage = (l)paramMessage.obj;
    if (paramMessage.a())
    {
      HttpActor.mActorStateListener.onSucceed(paramMessage);
      return;
    }
    HttpActor.mActorStateListener.onFailed(new t(paramMessage.c()));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\HttpActor$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */