package com.ireadercity.b2.ui;

import android.os.Environment;

final class gu
  extends Thread
{
  gu(SynchronizeLocalBooksActivity paramSynchronizeLocalBooksActivity) {}
  
  public final void run()
  {
    try
    {
      String str = Environment.getExternalStorageDirectory();
      this.a.a(str);
      return;
    }
    catch (Exception localException)
    {
      localException.toString();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */