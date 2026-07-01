package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

final class bk
  implements View.OnClickListener
{
  bk(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    if (BookReadingActivityNew.I(this.a).getVisibility() == 0)
    {
      this.a.e(BookReadingActivityNew.g[1]);
      return;
    }
    this.a.e(BookReadingActivityNew.g[2]);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */