package com.ireadercity.b2.ui;

import android.widget.Button;
import android.widget.SimpleAdapter;
import java.util.ArrayList;

final class cx
  implements Runnable
{
  cx(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void run()
  {
    try
    {
      BookReadingActivityNew.ad(this.a).setText("搜索中..");
      BookReadingActivityNew.ad(this.a).setEnabled(false);
      BookReadingActivityNew.H(this.a).clear();
      BookReadingActivityNew.ae(this.a).notifyDataSetChanged();
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\cx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */