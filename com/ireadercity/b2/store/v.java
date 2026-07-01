package com.ireadercity.b2.store;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.Toast;

final class v
  implements DialogInterface.OnClickListener
{
  v(CloudStoreBookDetailActivity paramCloudStoreBookDetailActivity) {}
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case -1: 
      CloudStoreBookDetailActivity.e(this.a);
      return;
    }
    CloudStoreBookDetailActivity.c(this.a).setText("已取消下载！");
    CloudStoreBookDetailActivity.c(this.a).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */