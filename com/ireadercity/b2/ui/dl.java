package com.ireadercity.b2.ui;

import android.os.AsyncTask;
import android.widget.RelativeLayout;

final class dl
  extends AsyncTask<Void, Void, Integer>
{
  dl(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  protected final void onPreExecute()
  {
    BookReadingActivityNew.k(this.a).setVisibility(0);
    BookReadingActivityNew.k(this.a).requestFocus();
    BookReadingActivityNew.a(this.a, true);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */