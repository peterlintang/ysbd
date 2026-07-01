package com.umeng.update;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class d
  implements DialogInterface.OnClickListener
{
  d(Context paramContext, UpdateResponse paramUpdateResponse) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    UmengUpdateAgent.c().a(this.a, this.b.path);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\update\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */