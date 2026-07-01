package com.ireadercity.b2.g;

import com.iflytek.speech.ISpeechModule;
import com.iflytek.speech.InitListener;

final class c
  implements InitListener
{
  c(a parama) {}
  
  public final void onInit(ISpeechModule paramISpeechModule, int paramInt)
  {
    a.a(this.a);
    new StringBuilder("InitListener init() code = ").append(paramInt).toString();
    if (paramInt == 0)
    {
      a.d(this.a);
      a.c(this.a);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\g\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */