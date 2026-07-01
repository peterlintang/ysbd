package com.ireadercity.b2.ui;

import android.os.Handler;
import android.os.Message;

final class fw
  extends Handler
{
  fw(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    ShowContentScrollUpAndDown.a(this.a, Boolean.valueOf(false));
    this.a.f = Boolean.valueOf(false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */