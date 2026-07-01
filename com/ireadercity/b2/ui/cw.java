package com.ireadercity.b2.ui;

import android.widget.TextView;
import com.ireadercity.b2.b.r;
import com.ireadercity.b2.h.v;
import java.util.ArrayList;

final class cw
  implements Runnable
{
  cw(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void run()
  {
    int i = BookReadingActivityNew.p(this.a).c();
    BookReadingActivityNew.a(this.a, (BookReadingActivityNew.e(this.a) + 1) * 100.0F / i);
    BookReadingActivityNew.J(this.a).setText(v.a(BookReadingActivityNew.w(this.a).size(), BookReadingActivityNew.k(), BookReadingActivityNew.s(this.a) / 100.0F));
    BookReadingActivityNew.Z(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */