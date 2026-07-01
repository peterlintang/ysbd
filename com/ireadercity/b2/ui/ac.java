package com.ireadercity.b2.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.ireadercity.b2.a.r;
import com.ireadercity.b2.bean.b;
import com.ireadercity.b2.bean.f;
import com.ireadercity.b2.c.a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

final class ac
  implements DialogInterface.OnClickListener
{
  ac(AIReaderActivity paramAIReaderActivity, List paramList1, List paramList2, f paramf) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (paramInt == -1)
    {
      AIReaderActivity.w(this.d).cancel();
      return;
    }
    b localb;
    if (((this.a == null) || (this.a.size() <= 0)) && (paramInt == 0))
    {
      paramDialogInterface = a.a(this.d);
      localIterator = this.b.iterator();
      while (localIterator.hasNext())
      {
        localb = (b)localIterator.next();
        if (this.c != null) {
          paramDialogInterface.d(localb.j(), this.c.b());
        }
      }
      this.d.b();
      AIReaderActivity.w(this.d).cancel();
      return;
    }
    paramDialogInterface = a.a(this.d);
    Iterator localIterator = this.b.iterator();
    label253:
    while (localIterator.hasNext())
    {
      localb = (b)localIterator.next();
      if (paramInt < this.a.size()) {
        paramDialogInterface.c(localb.j(), ((f)this.a.get(paramInt)).b());
      }
      for (;;)
      {
        if (this.c == null) {
          break label253;
        }
        paramDialogInterface.d(localb.j(), this.c.b());
        break;
        if (paramInt == this.a.size()) {
          paramDialogInterface.d(localb.j(), this.c.b());
        }
      }
    }
    AIReaderActivity.f(this.d).a().clear();
    this.d.b();
    AIReaderActivity.w(this.d).cancel();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */