package com.ireadercity.b2.ui;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

final class bh
  implements View.OnClickListener
{
  bh(BookRatingActivity paramBookRatingActivity) {}
  
  public final void onClick(View paramView)
  {
    paramView = BookRatingActivity.a(this.a).getText().toString();
    int i = (int)(BookRatingActivity.b(this.a).getRating() * 2.0F);
    new bi(this.a).execute(new String[] { BookRatingActivity.c(this.a), paramView, i });
    Toast.makeText(this.a.getApplicationContext(), this.a.getApplicationContext().getResources().getString(2131230931), 1).show();
    this.a.setResult(-1);
    this.a.finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */