package com.ireadercity.b2.ui;

import android.widget.SimpleAdapter;
import java.util.ArrayList;

final class cz
  implements Runnable
{
  cz(BookReadingActivityNew paramBookReadingActivityNew, ArrayList paramArrayList) {}
  
  public final void run()
  {
    BookReadingActivityNew.H(this.b).addAll(this.a);
    BookReadingActivityNew.ae(this.b).notifyDataSetChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */