package com.ireadercity.b2.ui;

import com.ireadercity.b2.g.a;

final class cj
  implements Runnable
{
  cj(ci paramci) {}
  
  public final void run()
  {
    if (BookReadingActivityNew.K(this.a.a) != null)
    {
      BookReadingActivityNew.K(this.a.a).d();
      BookReadingActivityNew.T(this.a.a);
    }
    this.a.a.g();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */