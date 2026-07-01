package com.ireadercity.b2.ui;

import com.ireadercity.b2.a.ao;
import com.ireadercity.b2.bean.i;
import com.ireadercity.b2.bean.k;
import com.ireadercity.b2.bean.l;
import java.util.List;

final class cr
  implements ao
{
  cr(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void a(int paramInt)
  {
    k localk = (k)l.a().get(paramInt);
    BookReadingActivityNew.B(this.a).c(localk.e());
    BookReadingActivityNew.B(this.a).a(localk.d());
    BookReadingActivityNew.B(this.a).a(localk.b());
    BookReadingActivityNew.B(this.a).b(this.a.getApplicationContext());
    new dl(this.a).execute(new Void[0]);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */