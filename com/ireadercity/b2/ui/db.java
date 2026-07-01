package com.ireadercity.b2.ui;

import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.Button;

final class db
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  db(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onGlobalLayout()
  {
    this.a.c.getViewTreeObserver().removeGlobalOnLayoutListener(this);
    this.a.b = (this.a.c.getHeight() + 5);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\db.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */