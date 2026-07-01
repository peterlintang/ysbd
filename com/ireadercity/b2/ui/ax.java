package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

final class ax
  implements View.OnClickListener
{
  ax(BookInfoActivity paramBookInfoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (BookInfoActivity.b(this.a).size() > 0)
    {
      this.a.a();
      return;
    }
    this.a.a("本书未添加书签");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */