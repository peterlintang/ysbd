package com.ireadercity.b2.ui;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.h.v;

final class fm
  extends Handler
{
  fm(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void handleMessage(Message paramMessage)
  {
    ShowContentScrollUpAndDown.b(this.a).setText(v.a());
    if ((!ShowContentScrollUpAndDown.c(this.a)) && (a.Y)) {
      ShowContentScrollUpAndDown.d(this.a).sendMessageDelayed(ShowContentScrollUpAndDown.d(this.a).obtainMessage(), 60000L);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */