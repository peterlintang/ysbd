package com.ireadercity.b2.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

final class dg
  implements View.OnClickListener
{
  dg(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(BookReadingActivityNew.E(this.a).getWindowToken(), 0);
    BookReadingActivityNew.G(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */