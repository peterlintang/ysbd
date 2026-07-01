package com.ireadercity.b2.store;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.ireadercity.b2.bean.NetBookInfo;

final class x
  implements AdapterView.OnItemClickListener
{
  x(CloudStoreBookDetailActivity paramCloudStoreBookDetailActivity) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (NetBookInfo)paramAdapterView.getAdapter().getItem(paramInt);
    CloudStoreBookDetailActivity.a(this.a, paramAdapterView);
    this.a.b();
    new StringBuilder().append(paramAdapterView.g()).append(paramAdapterView.h()).toString();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */