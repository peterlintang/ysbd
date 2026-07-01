package com.umeng.xp.controller;

import android.os.Handler;
import android.os.Message;
import com.umeng.common.Log;
import com.umeng.xp.common.ExchangeConstants;
import java.util.List;

class e
  extends Handler
{
  e(ExchangeDataService.a parama) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i;
    int j;
    ExchangeDataService localExchangeDataService;
    if (ExchangeDataService.a.a(this.a) != null)
    {
      if ((paramMessage == null) || (paramMessage.obj == null)) {
        break label174;
      }
      paramMessage = (List)paramMessage.obj;
      if (ExchangeDataService.e(this.a.a))
      {
        i = ExchangeDataService.a(this.a.a, paramMessage);
        if ((i > 0) && (this.a.a.newTips > 0))
        {
          j = this.a.a.newTips;
          i = this.a.a.newTips - i;
          localExchangeDataService = this.a.a;
          if (i <= 0) {
            break label169;
          }
        }
      }
    }
    for (;;)
    {
      localExchangeDataService.newTips = i;
      Log.c(ExchangeConstants.LOG_TAG, "new tips has changed " + j + " ===> " + this.a.a.newTips);
      ExchangeDataService.a.a(this.a).dataReceived(1, paramMessage);
      return;
      label169:
      i = -1;
    }
    label174:
    ExchangeDataService.a.a(this.a).dataReceived(0, null);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\controller\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */