package com.ireadercity.b2.store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

final class b
  implements View.OnClickListener
{
  b(CloudStoreActivity paramCloudStoreActivity, String paramString) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent(this.b, CloudStoreResultListActivity.class);
    Bundle localBundle = new Bundle();
    localBundle.putString("keywords", this.a);
    paramView.putExtras(localBundle);
    this.b.startActivityForResult(paramView, 0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */