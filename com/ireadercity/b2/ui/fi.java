package com.ireadercity.b2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.TextView;
import com.ireadercity.b2.b.s;
import com.ireadercity.b2.bean.i;

final class fi
  implements AdapterView.OnItemSelectedListener
{
  fi(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    SetReaderActivity.c().n(paramInt);
    paramAdapterView.setVisibility(0);
    if (paramInt == 1) {
      SetReaderActivity.b(this.a).setText(s.a(SetReaderActivity.b(this.a).getText().toString()));
    }
    for (;;)
    {
      if (SetReaderActivity.c(this.a) <= 1) {
        SetReaderActivity.a(this.a, 1);
      }
      return;
      if (paramInt == 2) {
        SetReaderActivity.b(this.a).setText(s.b(SetReaderActivity.b(this.a).getText().toString()));
      }
    }
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */