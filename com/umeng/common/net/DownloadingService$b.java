package com.umeng.common.net;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.Log;
import java.util.Map;

class DownloadingService$b
  extends Handler
{
  DownloadingService$b(DownloadingService paramDownloadingService) {}
  
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
    if (DownloadingService.a((a.a)localObject))
    {
      Log.a(DownloadingService.a(), ((a.a)localObject).b + " is already in downloading list. ");
      return;
    }
    DownloadingService.b().put(localObject, paramMessage.replyTo);
    DownloadingService.a(this.a, (a.a)localObject);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\common\net\DownloadingService$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */