package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import com.ireadercity.b2.ui.widget.RecycleableImageView;

final class bb
  implements View.OnClickListener
{
  bb(BookInfoActivity paramBookInfoActivity) {}
  
  public final void onClick(View paramView)
  {
    if (BookInfoActivity.e(this.a).getVisibility() != 0)
    {
      BookInfoActivity.e(this.a).setVisibility(0);
      BookInfoActivity.f(this.a).setVisibility(0);
    }
    if (BookInfoActivity.d(this.a).getVisibility() == 0)
    {
      BookInfoActivity.h(this.a).setImageResource(2130837761);
      BookInfoActivity.d(this.a).setVisibility(8);
      return;
    }
    BookInfoActivity.h(this.a).setImageResource(2130837761);
    BookInfoActivity.d(this.a).setLayoutParams(new LinearLayout.LayoutParams(-1, BookInfoActivity.g(this.a)));
    BookInfoActivity.d(this.a).setVisibility(0);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */