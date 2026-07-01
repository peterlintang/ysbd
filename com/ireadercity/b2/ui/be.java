package com.ireadercity.b2.ui;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.ireadercity.b2.c.a;
import java.util.ArrayList;

final class be
  implements DialogInterface.OnClickListener
{
  be(BookInfoActivity paramBookInfoActivity, AlertDialog paramAlertDialog) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    BookInfoActivity.b(this.b).clear();
    a.a(this.b).n(BookInfoActivity.k(this.b));
    this.a.dismiss();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */