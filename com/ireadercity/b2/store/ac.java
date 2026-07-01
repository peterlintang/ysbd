package com.ireadercity.b2.store;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class ac
  implements View.OnClickListener
{
  ac(CloudStoreBookDetailActivity paramCloudStoreBookDetailActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent(this.a, DownloadListActivity.class);
    this.a.startActivityForResult(paramView, 0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */