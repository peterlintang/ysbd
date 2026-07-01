package com.ireadercity.b2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.Toast;
import com.ireadercity.b2.bean.i;

final class fh
  implements AdapterView.OnItemSelectedListener
{
  fh(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SetReaderActivity.c().l(paramInt + 1);
    paramAdapterView.setVisibility(0);
    Toast.makeText(this.a, "重新打开书籍生效", 0).show();
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */