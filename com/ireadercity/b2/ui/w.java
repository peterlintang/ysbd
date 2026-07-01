package com.ireadercity.b2.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;
import com.ireadercity.b2.c.a;

final class w
  implements DialogInterface.OnClickListener
{
  w(AIReaderActivity paramAIReaderActivity, String paramString, EditText paramEditText, AlertDialog paramAlertDialog, int paramInt) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      if (this.a == null)
      {
        paramDialogInterface = this.b.getText().toString();
        if ((paramDialogInterface != null) && (paramDialogInterface.length() <= 0))
        {
          this.e.a("分类名称不能为空！");
          return;
        }
        if (AIReaderActivity.s(this.e).o(paramDialogInterface))
        {
          this.e.a("[" + paramDialogInterface + "]已经存在！");
          return;
        }
        AIReaderActivity.s(this.e).p(paramDialogInterface);
        this.e.b();
        this.c.dismiss();
        return;
      }
      paramDialogInterface = this.b.getText().toString();
      if ((paramDialogInterface != null) && (paramDialogInterface.length() <= 0))
      {
        this.e.a("分类名称不能为空！");
        return;
      }
      AIReaderActivity.s(this.e).a(this.d, paramDialogInterface);
      this.e.b();
      this.c.dismiss();
      return;
    }
    this.c.cancel();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */