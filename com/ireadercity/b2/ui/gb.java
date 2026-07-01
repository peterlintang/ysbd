package com.ireadercity.b2.ui;

import android.os.Handler;
import android.os.Message;
import com.ireadercity.b2.h.w;

final class gb
  extends Handler
{
  gb(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what > 0)
    {
      ShowContentScrollUpAndDown.g(this.a);
      return;
    }
    if (ShowContentScrollUpAndDown.h(this.a) < 30)
    {
      ShowContentScrollUpAndDown.f(this.a).postDelayed(ShowContentScrollUpAndDown.i(this.a), 400L);
      ShowContentScrollUpAndDown.j(this.a);
      return;
    }
    w.b();
    ShowContentScrollUpAndDown.k(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */