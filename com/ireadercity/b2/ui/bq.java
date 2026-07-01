package com.ireadercity.b2.ui;

import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.TextView;
import com.ireadercity.b2.b.r;
import com.ireadercity.b2.curlview.CurlView;
import com.ireadercity.b2.g.a;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.ui.widget.SimpleReadingView;
import java.util.ArrayList;

final class bq
  implements SeekBar.OnSeekBarChangeListener
{
  bq(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onProgressChanged(SeekBar paramSeekBar, int paramInt, boolean paramBoolean)
  {
    BookReadingActivityNew.u(this.a).setText(paramInt + 1);
  }
  
  public final void onStartTrackingTouch(SeekBar paramSeekBar) {}
  
  public final void onStopTrackingTouch(SeekBar paramSeekBar)
  {
    new StringBuilder("onStopTrackingTouch").append(paramSeekBar.getProgress()).toString();
    int i = BookReadingActivityNew.p(this.a).c();
    BookReadingActivityNew.a(this.a, (paramSeekBar.getProgress() + 1) * 100.0F / i);
    i = BookReadingActivityNew.p(this.a).c();
    BookReadingActivityNew.a(this.a, (paramSeekBar.getProgress() + 1) * 100.0F / i);
    BookReadingActivityNew.J(this.a).setText(v.a(BookReadingActivityNew.w(this.a).size(), BookReadingActivityNew.k(), BookReadingActivityNew.s(this.a) / 100.0F));
    BookReadingActivityNew.a(this.a, paramSeekBar.getProgress());
    if (BookReadingActivityNew.g(this.a).booleanValue()) {
      BookReadingActivityNew.h(this.a).a(BookReadingActivityNew.e(this.a));
    }
    for (;;)
    {
      if ((BookReadingActivityNew.K(this.a) != null) && (BookReadingActivityNew.K(this.a).h())) {
        BookReadingActivityNew.K(this.a).a(BookReadingActivityNew.p(this.a).a(BookReadingActivityNew.e(this.a)), BookReadingActivityNew.k() * 100 + BookReadingActivityNew.e(this.a), BookReadingActivityNew.k() * 100 + BookReadingActivityNew.e(this.a));
      }
      return;
      BookReadingActivityNew.i(this.a).a(BookReadingActivityNew.e(this.a));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */