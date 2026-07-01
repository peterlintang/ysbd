package com.umeng.socialize.view;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import com.umeng.socom.Log;

class au
  extends Handler
{
  au(at paramat) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    if (paramMessage.what == 1) {
      at.b(this.a).setVisibility(8);
    }
    if (paramMessage.what == 2) {}
    try
    {
      at.e(this.a);
      return;
    }
    catch (Exception paramMessage)
    {
      Log.b(at.a(), "follow error", paramMessage);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\au.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */