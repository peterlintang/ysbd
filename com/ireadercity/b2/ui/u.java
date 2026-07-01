package com.ireadercity.b2.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

final class u
  implements DialogInterface.OnClickListener
{
  u(AIReaderActivity paramAIReaderActivity, EditText paramEditText, AlertDialog paramAlertDialog) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      this.c.f = this.a.getText().toString();
      if ((this.c.f != null) && (this.c.f.length() <= 0))
      {
        this.c.f = null;
        this.c.a("你没入录入筛选条件（书名或作者名），无任何效果！");
      }
      this.c.b();
      this.b.dismiss();
      return;
    case -2: 
      this.c.f = null;
      this.c.b();
      this.b.dismiss();
      return;
    }
    this.b.cancel();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */