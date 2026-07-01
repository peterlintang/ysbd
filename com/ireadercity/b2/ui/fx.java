package com.ireadercity.b2.ui;

import android.os.Handler;
import android.os.Message;
import com.ireadercity.b2.ui.widget.CustomerWebView;

final class fx
  implements Runnable
{
  fx(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void run()
  {
    if (ShowContentScrollUpAndDown.e(this.a) != null)
    {
      Message localMessage = ShowContentScrollUpAndDown.f(this.a).obtainMessage();
      localMessage.what = ShowContentScrollUpAndDown.e(this.a).getContentHeight();
      new StringBuilder("run ################# to check height is ready ?????").append(localMessage.what).toString();
      ShowContentScrollUpAndDown.f(this.a).dispatchMessage(localMessage);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */