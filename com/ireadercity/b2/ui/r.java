package com.ireadercity.b2.ui;

import android.content.Intent;
import com.ireadercity.b2.opds.OnlineBookStore;

final class r
  extends Thread
{
  r(AIReaderActivity paramAIReaderActivity) {}
  
  public final void run()
  {
    try
    {
      Intent localIntent = new Intent(this.a, OnlineBookStore.class);
      this.a.startActivity(localIntent);
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */