package com.umeng.socialize.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class bn
  implements DialogInterface.OnClickListener
{
  bn(ShareActivity paramShareActivity) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ShareActivity.a(this.a, null);
    ShareActivity.b(this.a, false);
    paramDialogInterface.cancel();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */