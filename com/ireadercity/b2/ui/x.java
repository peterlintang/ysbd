package com.ireadercity.b2.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;

final class x
  implements DialogInterface.OnKeyListener
{
  x(AIReaderActivity paramAIReaderActivity, AlertDialog paramAlertDialog) {}
  
  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramInt == 4) {
      this.a.dismiss();
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */