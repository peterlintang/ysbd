package com.ireadercity.b2.store;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.ireadercity.b2.bean.NetBookInfo;

final class al
  implements AdapterView.OnItemClickListener
{
  al(ak paramak) {}
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (NetBookInfo)ak.a(this.a).getAdapter().getItem(paramInt);
    if (paramAdapterView != null) {
      ak.a(this.a, paramAdapterView);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\store\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */