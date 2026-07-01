package com.umeng.socialize.view;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.umeng.socialize.bean.UMFriend;
import com.umeng.socialize.view.wigets.a;

class cd
  implements AdapterView.OnItemClickListener
{
  cd(cb paramcb) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = (UMFriend)cb.a(this.a).getItem(paramInt);
    cb.a(this.a, paramAdapterView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */