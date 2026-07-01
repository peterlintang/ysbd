package com.ireadercity.b2.store;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import java.util.Map;

final class c
  implements AdapterView.OnItemClickListener
{
  c(CloudStoreActivity paramCloudStoreActivity, GridView paramGridView) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (Map)this.a.getAdapter().getItem(paramInt);
    if (paramAdapterView != null)
    {
      paramView = (String)paramAdapterView.get("code");
      Intent localIntent = new Intent(this.b, CloudStoreResultListActivity.class);
      Bundle localBundle = new Bundle();
      localBundle.putString("categoryCode", paramView);
      localBundle.putString("categoryTitle", (String)paramAdapterView.get("title"));
      localIntent.putExtras(localBundle);
      this.b.startActivityForResult(localIntent, 0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */