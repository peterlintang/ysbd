package com.ireadercity.b2.ui;

import android.view.Display;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.WindowManager;
import android.widget.Toast;
import com.ireadercity.b2.bean.i;

final class ch
  implements View.OnClickListener
{
  ch(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    if (BookReadingActivityNew.B(this.a).n() < this.a.getWindowManager().getDefaultDisplay().getWidth() / 6 - 8)
    {
      BookReadingActivityNew.B(this.a).j(BookReadingActivityNew.B(this.a).n() + 8);
      BookReadingActivityNew.B(this.a).b(this.a.getApplicationContext());
      new dl(this.a).execute(new Void[0]);
      return;
    }
    Toast.makeText(this.a, "当前已经是最大页间距", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */