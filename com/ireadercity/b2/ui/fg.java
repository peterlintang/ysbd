package com.ireadercity.b2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.ireadercity.b2.bean.i;

final class fg
  implements AdapterView.OnItemSelectedListener
{
  fg(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SetReaderActivity.c().d(SetReaderActivity.a(this.a)[paramInt]);
    this.a.a();
    paramAdapterView.setVisibility(0);
    SetReaderActivity.a(this.a, 2);
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */