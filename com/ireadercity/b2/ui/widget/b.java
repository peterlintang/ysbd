package com.ireadercity.b2.ui.widget;

import android.os.Handler;
import android.os.Message;
import android.text.ClipboardManager;

final class b
  extends Handler
{
  b(CustomerWebView paramCustomerWebView) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if ((paramMessage.obj == null) || ("".equals(paramMessage.obj)))
    {
      paramMessage = CustomerWebView.e(this.a).obtainMessage();
      paramMessage.obj = CustomerWebView.c(this.a).getText();
      CustomerWebView.e(this.a).sendMessageDelayed(paramMessage, 100L);
      return;
    }
    this.a.a(paramMessage.obj, (int)CustomerWebView.f(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */