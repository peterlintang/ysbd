package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.RelativeLayout;

final class dd
  implements View.OnClickListener
{
  dd(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(BookReadingActivityNew.E(this.a).getWindowToken(), 0);
    BookReadingActivityNew.F(this.a).setVisibility(8);
    this.a.t = false;
    BookReadingActivityNew.G(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */