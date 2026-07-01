package com.umeng.common.ufp.net;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.widget.Toast;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.a.c;
import java.util.Map;

class DownloadingService$c
  extends Handler
{
  DownloadingService$c(DownloadingService paramDownloadingService) {}
  
  public void handleMessage(Message paramMessage)
  {
    Log.c(DownloadingService.a(), "IncomingHandler(msg.what:" + paramMessage.what + " msg.arg1:" + paramMessage.arg1 + " msg.arg2:" + paramMessage.arg2 + " msg.replyTo:" + paramMessage.replyTo);
    switch (paramMessage.what)
    {
    default: 
      super.handleMessage(paramMessage);
      return;
    }
    Object localObject = paramMessage.getData();
    Log.c(DownloadingService.a(), "IncomingHandler(msg.getData():" + localObject);
    localObject = a.a.a((Bundle)localObject);
    if (DownloadingService.b((a.a)localObject))
    {
      Log.a(DownloadingService.a(), ((a.a)localObject).b + " is already in downloading list. ");
      Toast.makeText(DownloadingService.a(this.a), c.b(DownloadingService.a(this.a)), 0).show();
      localObject = Message.obtain();
      ((Message)localObject).what = 5;
      ((Message)localObject).arg1 = 2;
      ((Message)localObject).arg2 = 0;
      try
      {
        paramMessage.replyTo.send((Message)localObject);
        return;
      }
      catch (RemoteException paramMessage)
      {
        paramMessage.printStackTrace();
        return;
      }
    }
    DownloadingService.b().put(localObject, paramMessage.replyTo);
    DownloadingService.a(this.a, (a.a)localObject);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\ufp\net\DownloadingService$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */