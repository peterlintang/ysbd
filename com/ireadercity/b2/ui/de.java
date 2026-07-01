package com.ireadercity.b2.ui;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import java.io.PrintStream;
import java.util.ArrayList;

final class de
  implements View.OnClickListener
{
  de(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onClick(View paramView)
  {
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(BookReadingActivityNew.E(this.a).getWindowToken(), 0);
    if (BookReadingActivityNew.E(this.a).getText() == null)
    {
      this.a.c("请输入要查找的内容");
      return;
    }
    if (BookReadingActivityNew.E(this.a).getText().length() < 2)
    {
      this.a.c("请输入2个以上内容以方便查找");
      return;
    }
    System.err.print("----11-----");
    BookReadingActivityNew.H(this.a).clear();
    new Thread(new df(this)).start();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\de.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */