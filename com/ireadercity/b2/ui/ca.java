package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.ireadercity.b2.bean.i;

final class ca
  implements View.OnClickListener
{
  ca(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    BookReadingActivityNew.b(this.a, Math.round(BookReadingActivityNew.B(this.a).i() / BookReadingActivityNew.M(this.a)) - 8);
    BookReadingActivityNew.P(this.a);
    if (BookReadingActivityNew.O(this.a) >= 8)
    {
      BookReadingActivityNew.b(this.a, Math.round((BookReadingActivityNew.O(this.a) + 8) * BookReadingActivityNew.M(this.a)));
      BookReadingActivityNew.B(this.a).f(BookReadingActivityNew.O(this.a));
      BookReadingActivityNew.B(this.a).b(this.a.getApplicationContext());
      new dl(this.a).execute(new Void[0]);
      return;
    }
    Toast.makeText(this.a, "当前已经是最小字体", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */