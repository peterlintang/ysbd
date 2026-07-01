package com.ireadercity.b2.ui;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.bean.k;
import com.ireadercity.b2.bean.l;
import java.util.List;

final class ff
  implements AdapterView.OnItemSelectedListener
{
  ff(SetReaderActivity paramSetReaderActivity) {}
  
  public final void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    new StringBuilder("onItemSelected index=").append(paramInt).toString();
    paramView = (k)l.b().get(paramInt);
    SetReaderActivity.c().d(paramView.e());
    SetReaderActivity.a(paramView.d());
    SetReaderActivity.c().b(paramView.d());
    SetReaderActivity.c().e(paramView.e());
    SetReaderActivity.c().c(paramView.d());
    SetReaderActivity.b(paramView.b());
    this.a.a();
    SetReaderActivity.a(this.a, 2);
    paramAdapterView.setVisibility(0);
  }
  
  public final void onNothingSelected(AdapterView<?> paramAdapterView) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */