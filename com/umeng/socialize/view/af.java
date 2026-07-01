package com.umeng.socialize.view;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.view.wigets.a;

class af
  implements AdapterView.OnItemClickListener
{
  af(ab paramab) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (UMFriend)ab.b(this.a).getItem(paramInt);
    ab.a(this.a, paramAdapterView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */