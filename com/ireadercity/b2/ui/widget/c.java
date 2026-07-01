package com.ireadercity.b2.ui.widget;

import android.os.Handler;
import android.os.Message;

final class c
  extends Handler
{
  c(CustomerWebView paramCustomerWebView) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if ((CustomerWebView.g(this.a)) && (!CustomerWebView.h(this.a)) && (Math.abs(CustomerWebView.i(this.a)) < 6.0F) && (Math.abs(CustomerWebView.j(this.a)) < 6.0F)) {
      this.a.c();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */