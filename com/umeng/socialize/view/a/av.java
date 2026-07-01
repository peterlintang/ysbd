package com.umeng.socialize.view.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class av
  implements DialogInterface.OnClickListener
{
  av(at.b paramb) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    at.b.a(this.a, true);
    paramDialogInterface.cancel();
    switch (at.b.a(this.a))
    {
    default: 
      return;
    case 1: 
      this.a.a(at.b.b(this.a));
      return;
    case 2: 
      this.a.b(at.b.b(this.a));
      return;
    }
    this.a.c(at.b.b(this.a));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */