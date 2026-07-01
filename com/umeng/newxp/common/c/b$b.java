package com.umeng.newxp.common.c;

import android.os.Handler;
import android.os.Message;

class b$b
  extends Handler
{
  public void handleMessage(Message paramMessage)
  {
    b.a locala = (b.a)paramMessage.obj;
    switch (paramMessage.what)
    {
    default: 
      return;
    case 1: 
      b.c(locala.a, locala.b[0]);
      return;
    }
    locala.a.b(locala.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\b$b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */