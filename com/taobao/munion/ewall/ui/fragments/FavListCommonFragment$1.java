package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.taobao.munion.model.d;

class FavListCommonFragment$1
  implements AdapterView.OnItemClickListener
{
  FavListCommonFragment$1(FavListCommonFragment paramFavListCommonFragment) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (d)paramAdapterView.getAdapter().getItem(paramInt);
    if (paramAdapterView != null) {
      FavListCommonFragment.access$000(this.this$0, paramAdapterView.c(), paramAdapterView.b());
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\FavListCommonFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */