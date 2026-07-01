package com.taobao.munion.utils;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.Message;

public class p
  extends Handler
{
  static boolean a = false;
  private boolean b = true;
  
  public p() {}
  
  public p(Handler.Callback paramCallback)
  {
    super(paramCallback);
  }
  
  public p(Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public p(Looper paramLooper, Handler.Callback paramCallback)
  {
    super(paramLooper, paramCallback);
  }
  
  public static void a(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public void a()
  {
    this.b = false;
  }
  
  public void a(Message paramMessage)
  {
    paramMessage.what = 0;
    paramMessage.arg1 = 0;
    paramMessage.arg2 = 0;
    paramMessage.obj = null;
    paramMessage.replyTo = null;
    paramMessage.setTarget(null);
  }
  
  public void dispatchMessage(Message paramMessage)
  {
    if (!this.b) {
      return;
    }
    if (a) {
      super.dispatchMessage(paramMessage);
    }
    for (;;)
    {
      a(paramMessage);
      return;
      try
      {
        super.dispatchMessage(paramMessage);
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
      }
    }
  }
  
  public boolean sendMessageAtTime(Message paramMessage, long paramLong)
  {
    if (!this.b) {
      return false;
    }
    return super.sendMessageAtTime(paramMessage, paramLong);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\utils\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */