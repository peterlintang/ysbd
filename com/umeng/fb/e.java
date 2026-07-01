package com.umeng.fb;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;

final class e
  extends Handler
{
  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    UMFeedbackService.a(paramMessage.getData().getString("newReplyContent"));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\fb\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */