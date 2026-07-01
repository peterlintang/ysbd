package com.ireadercity.b2.a;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.ireadercity.b2.bean.e;

final class n
  implements DialogInterface.OnClickListener
{
  n(m paramm, e parame) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    l.a(this.b.a, this.a.a);
    l.b(this.b.a);
    this.b.a.notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */