package com.ireadercity.b2.ui;

import com.ireadercity.b2.curlview.CurlView;
import com.ireadercity.b2.ui.widget.SimpleReadingView;

final class cv
  implements Runnable
{
  cv(BookReadingActivityNew paramBookReadingActivityNew, int paramInt) {}
  
  public final void run()
  {
    if (BookReadingActivityNew.X(this.b)) {
      return;
    }
    if (BookReadingActivityNew.Y(this.b) == null)
    {
      BookReadingActivityNew.a(this.b, new do(this.b, (byte)0));
      if (BookReadingActivityNew.g(this.b).booleanValue()) {
        BookReadingActivityNew.h(this.b).a(BookReadingActivityNew.Y(this.b));
      }
    }
    else
    {
      BookReadingActivityNew.a(this.b, this.a);
      if (!BookReadingActivityNew.g(this.b).booleanValue()) {
        break label141;
      }
      BookReadingActivityNew.h(this.b).a(BookReadingActivityNew.e(this.b));
    }
    for (;;)
    {
      this.b.j();
      return;
      BookReadingActivityNew.i(this.b).a(BookReadingActivityNew.Y(this.b));
      break;
      label141:
      BookReadingActivityNew.i(this.b).a(BookReadingActivityNew.e(this.b));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */