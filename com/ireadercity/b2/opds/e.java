package com.ireadercity.b2.opds;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;

final class e
  implements DialogInterface.OnClickListener
{
  e(OnlineBookStore paramOnlineBookStore, View paramView, String paramString) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    Object localObject = (EditText)this.a.findViewById(2131361896);
    EditText localEditText = (EditText)this.a.findViewById(2131361899);
    paramDialogInterface.dismiss();
    paramDialogInterface = this.c;
    paramDialogInterface = OnlineBookStore.a(this.b, ((EditText)localObject).getText().toString(), localEditText.getText().toString());
    localObject = this.c;
    new j();
    ((OnlineBookStore)localObject).r = j.a(paramDialogInterface);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\opds\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */