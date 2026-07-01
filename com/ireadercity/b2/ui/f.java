package com.ireadercity.b2.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

final class f
  implements DialogInterface.OnClickListener
{
  f(d paramd) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new Intent("android.settings.WIRELESS_SETTINGS");
    this.a.a.startActivity(paramDialogInterface);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */