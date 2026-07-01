package com.ireadercity.b2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.bean.k;
import com.ireadercity.b2.bean.l;
import java.util.List;

final class fd
  implements AdapterView.OnItemSelectedListener
{
  fd(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    new StringBuilder("onItemSelected index=").append(paramInt).toString();
    paramView = (k)l.a().get(paramInt);
    SetReaderActivity.c().c(paramView.e());
    SetReaderActivity.a(paramView.d());
    SetReaderActivity.c().a(paramView.d());
    SetReaderActivity.c().e(paramView.e());
    SetReaderActivity.c().c(paramView.d());
    SetReaderActivity.a(paramView.b());
    this.a.a();
    paramAdapterView.setVisibility(0);
    SetReaderActivity.a(this.a, 2);
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\fd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */