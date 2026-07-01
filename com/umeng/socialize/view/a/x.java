package com.umeng.socialize.view.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;

class x
  implements DialogInterface.OnClickListener
{
  x(t paramt) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramDialogInterface = new Intent("android.intent.action.GET_CONTENT");
      paramDialogInterface.setType("image/*");
      this.a.startActivityForResult(paramDialogInterface, 267390721);
      return;
    }
    paramDialogInterface = new Intent("android.media.action.IMAGE_CAPTURE");
    this.a.startActivityForResult(paramDialogInterface, 267390722);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */