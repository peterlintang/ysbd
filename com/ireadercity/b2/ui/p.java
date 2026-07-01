package com.ireadercity.b2.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.ireadercity.b2.a.r;
import com.ireadercity.b2.bean.f;

final class p
  implements DialogInterface.OnClickListener
{
  p(AIReaderActivity paramAIReaderActivity, f paramf1, f paramf2) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((paramInt == -1) && (this.a != null)) {}
    try
    {
      AIReaderActivity.f(this.c).a(this.b.b(), true);
      try
      {
        this.c.a(true);
        AIReaderActivity.f(this.c).notifyDataSetChanged();
        return;
      }
      catch (Exception paramDialogInterface)
      {
        paramDialogInterface.printStackTrace();
        return;
      }
      return;
    }
    catch (Exception paramDialogInterface)
    {
      paramDialogInterface.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */