package com.taobao.munion.ewall.actorframework;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.taobao.munion.net.k;
import com.taobao.munion.net.l;

public class HttpActor
  extends AbstractActor
{
  protected static HttpActor.HttpActorStateListener mActorStateListener;
  protected static Handler sCallBackHandler = new HttpActor.1(Looper.getMainLooper());
  protected k mRequest;
  
  public HttpActor(k paramk, HttpActor.HttpActorStateListener paramHttpActorStateListener)
  {
    this.mRequest = paramk;
    mActorStateListener = paramHttpActorStateListener;
  }
  
  public void run()
  {
    mActorStateListener.onStart();
    runBody();
  }
  
  public void runBody()
  {
    l locall = this.mRequest.e();
    Message localMessage = Message.obtain();
    localMessage.obj = locall;
    if (mActorStateListener != null) {
      mActorStateListener.onMessage(localMessage);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\actorframework\HttpActor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */