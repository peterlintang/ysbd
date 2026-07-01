package com.umeng.xp.view;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.umeng.xp.controller.a.a;

class ay
  implements AdapterView.OnItemClickListener
{
  ay(aw paramaw) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    try
    {
      paramAdapterView = (a.a)((GridView)paramAdapterView).getAdapter().getItem(paramInt);
      aw.a(this.a, paramAdapterView, paramView);
      return;
    }
    catch (Exception paramAdapterView) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */