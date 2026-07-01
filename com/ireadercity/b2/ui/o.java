package com.ireadercity.b2.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.ireadercity.b2.a.r;
import com.ireadercity.b2.bean.f;

final class o
  implements DialogInterface.OnClickListener
{
  o(AIReaderActivity paramAIReaderActivity, f paramf) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((paramInt == -1) && (this.a != null)) {}
    try
    {
      AIReaderActivity.f(this.b).a(this.a.b(), false);
      AIReaderActivity.a.b();
      return;
    }
    catch (Exception paramDialogInterface)
    {
      paramDialogInterface.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */