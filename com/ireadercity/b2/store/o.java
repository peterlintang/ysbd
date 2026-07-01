package com.ireadercity.b2.store;

import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ireadercity.b2.ui.widget.ToolSlider;
import com.ireadercity.b2.ui.widget.e;

final class o
  implements e
{
  o(CloudStoreActivity paramCloudStoreActivity) {}
  
  public final void a(int paramInt)
  {
    if (paramInt == CloudStoreActivity.d(this.a))
    {
      new StringBuilder(" whichScreen == lastScreen =============doAction=== equals lastScreen  return ").append(paramInt).toString();
      return;
    }
    CloudStoreActivity.a(this.a, paramInt);
    CloudStoreActivity.f(this.a).a(paramInt, CloudStoreActivity.e(this.a));
    switch (paramInt)
    {
    default: 
      return;
    case 2: 
      ListView localListView = (ListView)CloudStoreActivity.g(this.a).findViewById(2131362324);
      if (localListView.getAdapter().getCount() == 0) {
        ((ak)localListView.getTag()).c();
      }
      localListView.setEmptyView(CloudStoreActivity.g(this.a).findViewById(2131362325));
      return;
    }
    this.a.a(false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */