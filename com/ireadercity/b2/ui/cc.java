package com.ireadercity.b2.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.ireadercity.b2.bean.i;

final class cc
  implements View.OnClickListener
{
  cc(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    if (BookReadingActivityNew.B(this.a).k() == 1)
    {
      BookReadingActivityNew.B(this.a).g(0);
      BookReadingActivityNew.S(this.a).setTextColor(this.a.getResources().getColor(2131099673));
    }
    for (;;)
    {
      BookReadingActivityNew.B(this.a).b(this.a.getApplicationContext());
      new dl(this.a).execute(new Void[0]);
      return;
      BookReadingActivityNew.B(this.a).g(1);
      BookReadingActivityNew.S(this.a).setTextColor(this.a.getResources().getColor(2131099672));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */