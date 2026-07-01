package com.ireadercity.b2.ui;

import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import java.util.ArrayList;

final class gt
  extends Handler
{
  gt(SynchronizeLocalBooksActivity paramSynchronizeLocalBooksActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default: 
    case 1: 
      do
      {
        return;
        this.a.l.b.add((String)paramMessage.obj);
        this.a.a();
      } while (!this.a.k.a());
      this.a.k.b();
      return;
    }
    this.a.g.setVisibility(4);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */