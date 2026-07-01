package com.ireadercity.b2.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.EditText;

final class gq
  implements DialogInterface.OnClickListener
{
  gq(SyncCloudInfoActivity paramSyncCloudInfoActivity, View paramView) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    EditText localEditText1 = (EditText)this.a.findViewById(2131361896);
    EditText localEditText2 = (EditText)this.a.findViewById(2131361899);
    new gs(this.b).execute(new String[] { localEditText1.getText(), localEditText2.getText() });
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */