package com.umeng.common.ufp.net;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.ufp.Log;

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
        Log.c(a.b(), "DownloadAgent.handleMessage(" + paramMessage.what + "): ");
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
        Log.c(a.b(), "DownloadAgent.handleMessage(" + paramMessage.what + "): " + localException.getMessage());
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
      if ((paramMessage.arg1 == 1) || (paramMessage.arg1 == 3))
      {
        a.a(this.a).a(paramMessage.arg1, paramMessage.arg2, paramMessage.getData().getString("filename"));
        return;
      }
      if (paramMessage.arg1 == 2)
      {
        a.a(this.a).a(paramMessage.arg1, paramMessage.arg2, "");
        return;
      }
      a.a(this.a).a(0, 0, null);
      Log.c(a.b(), "DownloadAgent.handleMessage(DownloadingService.DOWNLOAD_COMPLETE_FAIL): ");
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\a$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */