package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout.LayoutParams;
import com.ireadercity.b2.ui.widget.RecycleableImageView;

final class ba
  implements View.OnClickListener
{
  ba(BookInfoActivity paramBookInfoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (BookInfoActivity.d(this.a).getVisibility() != 0) {
      BookInfoActivity.d(this.a).setVisibility(0);
    }
    if (BookInfoActivity.e(this.a).getVisibility() == 0)
    {
      BookInfoActivity.d(this.a).setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
      this.a.findViewById(2131361876);
      BookInfoActivity.e(this.a).setVisibility(8);
      BookInfoActivity.f(this.a).setVisibility(8);
      return;
    }
    BookInfoActivity.d(this.a).setLayoutParams(new LinearLayout.LayoutParams(-1, BookInfoActivity.g(this.a)));
    BookInfoActivity.e(this.a).setVisibility(0);
    BookInfoActivity.f(this.a).setVisibility(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */