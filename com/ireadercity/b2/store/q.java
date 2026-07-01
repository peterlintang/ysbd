package com.ireadercity.b2.store;

import android.os.Handler;
import android.os.Message;

final class q
  extends Handler
{
  q(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    new StringBuilder("message.what=").append(paramMessage.what).toString();
    switch (paramMessage.what)
    {
    case 0: 
    case 1: 
    default: 
      return;
    }
    paramMessage = (String)paramMessage.obj;
    new StringBuilder("getHotKeysHandler output=").append(paramMessage).toString();
    this.a.b(paramMessage);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */