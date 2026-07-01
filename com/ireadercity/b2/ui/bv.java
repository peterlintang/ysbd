package com.ireadercity.b2.ui;

import android.widget.SeekBar;
import com.ireadercity.b2.curlview.CurlView;
import com.ireadercity.b2.ui.widget.SimpleReadingView;

final class bv
  implements Runnable
{
  bv(bu parambu) {}
  
  public final void run()
  {
    BookReadingActivityNew.d(this.a.a);
    if (BookReadingActivityNew.e(this.a.a) <= BookReadingActivityNew.f(this.a.a).getMax())
    {
      if (BookReadingActivityNew.g(this.a.a).booleanValue()) {
        BookReadingActivityNew.h(this.a.a).a(BookReadingActivityNew.e(this.a.a));
      }
      for (;;)
      {
        this.a.a.j();
        return;
        BookReadingActivityNew.i(this.a.a).a(BookReadingActivityNew.e(this.a.a));
      }
    }
    this.a.a.b("next");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */