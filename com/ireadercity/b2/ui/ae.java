package com.ireadercity.b2.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.f;
import com.ireadercity.b2.c.a;
import java.util.List;

final class ae
  implements DialogInterface.OnClickListener
{
  ae(AIReaderActivity paramAIReaderActivity, b paramb, List paramList, f paramf) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      AIReaderActivity.w(this.d).cancel();
      return;
    }
    paramDialogInterface = a.a(this.d);
    paramDialogInterface.c(this.a.j(), ((f)this.b.get(paramInt)).b());
    if (this.c != null) {
      paramDialogInterface.d(this.a.j(), this.c.b());
    }
    this.d.b();
    AIReaderActivity.w(this.d).cancel();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */