package com.ireadercity.b2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Toast;
import java.util.ArrayList;

final class gv
  implements AdapterView.OnItemClickListener
{
  gv(SynchronizeLocalBooksActivity paramSynchronizeLocalBooksActivity) {}
  
  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    if (this.a.d.indexOf(Integer.valueOf(paramInt)) != -1)
    {
      this.a.d.remove(this.a.d.indexOf(Integer.valueOf(paramInt)));
      Toast.makeText(this.a.a, "你放弃了选择" + (String)this.a.l.b.get(paramInt), 0).show();
    }
    do
    {
      return;
      Toast.makeText(this.a.a, "你选择了" + (String)this.a.l.b.get(paramInt), 0).show();
      SynchronizeLocalBooksActivity.b();
      new StringBuilder("你选择了").append((String)this.a.l.b.get(paramInt)).toString();
    } while (this.a.d.indexOf(Integer.valueOf(paramInt)) != -1);
    this.a.d.add(Integer.valueOf(paramInt));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */