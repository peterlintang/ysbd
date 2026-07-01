package com.umeng.update;

import android.os.Handler;
import android.os.Message;

final class b
  extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (UmengUpdateAgent.b() != null) {
      UmengUpdateAgent.b().onUpdateReturned(paramMessage.what, (UpdateResponse)paramMessage.obj);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\update\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */