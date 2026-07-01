package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.ireadercity.b2.bean.i;

final class cd
  implements View.OnClickListener
{
  cd(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    if (BookReadingActivityNew.B(this.a).o() >= 105)
    {
      BookReadingActivityNew.B(this.a).k(BookReadingActivityNew.B(this.a).o() - 5);
      BookReadingActivityNew.B(this.a).b(this.a.getApplicationContext());
      new dl(this.a).execute(new Void[0]);
      return;
    }
    Toast.makeText(this.a, "当前已经是最小行间距", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */