package com.umeng.xp.view;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.umeng.common.Log;

class O
  extends WebChromeClient
{
  O(N paramN) {}
  
  public void onProgressChanged(WebView arg1, int paramInt)
  {
    super.onProgressChanged(???, paramInt);
    synchronized (N.a(this.a))
    {
      if ((!N.a(this.a).booleanValue()) && (N.b(this.a).isDelay()) && (paramInt >= N.b(this.a).getDelayProgress()))
      {
        this.a.show();
        N.a(this.a, Boolean.valueOf(true));
        Log.c(N.a(), "show dialog on web progress = " + N.b(this.a).getDelayProgress());
      }
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\O.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */