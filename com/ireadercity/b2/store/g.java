package com.ireadercity.b2.store;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

final class g
  implements DialogInterface.OnClickListener
{
  g(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    CloudStoreActivity.l(this.a);
    paramDialogInterface.dismiss();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */