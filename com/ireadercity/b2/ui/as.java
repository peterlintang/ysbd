package com.ireadercity.b2.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

final class as
  implements View.OnClickListener
{
  as(BookCommentActivity paramBookCommentActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = new Intent(this.a, BookRatingActivity.class);
    paramView.putExtra("storeBookId", BookCommentActivity.a(this.a));
    this.a.startActivityForResult(paramView, 1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */