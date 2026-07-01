package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.ireadercity.b2.bean.i;

final class aw
  implements View.OnClickListener
{
  aw(BookInfoActivity paramBookInfoActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new i();
    paramView.a(this.a.getApplicationContext());
    if (paramView.p() == 1)
    {
      this.a.c();
      return;
    }
    BookInfoActivity.a(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */