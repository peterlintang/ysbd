package com.ireadercity.b2.ui;

import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.ireadercity.b2.bean.i;

final class cb
  implements View.OnClickListener
{
  cb(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    if (BookReadingActivityNew.B(this.a).r() != 1)
    {
      BookReadingActivityNew.B(this.a).n(1);
      BookReadingActivityNew.Q(this.a).setTextColor(this.a.getResources().getColor(2131099673));
      BookReadingActivityNew.R(this.a).setTextColor(this.a.getResources().getColor(2131099672));
    }
    for (;;)
    {
      BookReadingActivityNew.B(this.a).b(this.a.getApplicationContext());
      new dl(this.a).execute(new Void[0]);
      return;
      BookReadingActivityNew.B(this.a).n(2);
      BookReadingActivityNew.Q(this.a).setTextColor(this.a.getResources().getColor(2131099672));
      BookReadingActivityNew.R(this.a).setTextColor(this.a.getResources().getColor(2131099673));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */