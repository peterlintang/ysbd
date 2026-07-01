package com.ireadercity.b2.ui;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.h.v;

final class bj
  extends Handler
{
  bj(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void handleMessage(Message paramMessage)
  {
    BookReadingActivityNew.a(this.a).setText(v.a());
    if ((!BookReadingActivityNew.b(this.a)) && (a.Y)) {
      BookReadingActivityNew.c(this.a).sendMessageDelayed(BookReadingActivityNew.c(this.a).obtainMessage(), 60000L);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */