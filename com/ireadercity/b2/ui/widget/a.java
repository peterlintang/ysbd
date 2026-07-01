package com.ireadercity.b2.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.text.ClipboardManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import android.widget.Toast;

final class a
  implements View.OnClickListener
{
  a(CustomerWebView paramCustomerWebView) {}
  
  public final void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    }
    for (;;)
    {
      CustomerWebView.d(this.a).dismiss();
      return;
      CustomerWebView.b(this.a).a(CustomerWebView.a(this.a));
      continue;
      Toast.makeText(this.a.getContext(), "成功拷贝到剪切板", 0).show();
      CustomerWebView.c(this.a).setText(CustomerWebView.a(this.a));
      continue;
      paramView = new Intent("android.intent.action.WEB_SEARCH");
      paramView.putExtra("query", CustomerWebView.a(this.a));
      this.a.getContext().startActivity(paramView);
      continue;
      paramView = new Intent("android.intent.action.SEND");
      paramView.setType("text/plain");
      paramView.putExtra("android.intent.extra.TEXT", CustomerWebView.a(this.a));
      this.a.getContext().startActivity(Intent.createChooser(paramView, this.a.getContext().getText(2131230934)));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */