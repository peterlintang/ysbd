package com.umeng.common.net;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

class a$b
  extends Handler
{
  a$b(a parama) {}
  
  public void handleMessage(Message paramMessage)
  {
    for (;;)
    {
      try
      {
        a.b();
        new StringBuilder("DownloadAgent.handleMessage(").append(paramMessage.what).append("): ").toString();
        switch (paramMessage.what)
        {
        case 4: 
          super.handleMessage(paramMessage);
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        a.b();
        new StringBuilder("DownloadAgent.handleMessage(").append(paramMessage.what).append("): ").append(localException.getMessage()).toString();
        return;
      }
      if (a.a(this.a) == null) {
        break;
      }
      a.a(this.a).a(paramMessage.arg1);
      return;
      a.c(this.a).unbindService(a.b(this.a));
      if (a.a(this.a) == null) {
        break;
      }
      if (paramMessage.arg1 == 1)
      {
        a.a(this.a).a(paramMessage.arg1, paramMessage.getData().getString("filename"));
        return;
      }
      a.a(this.a).a(0, null);
      a.b();
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */