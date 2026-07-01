package com.iflytek.speech;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

class SpeechModule$1
  implements ServiceConnection
{
  SpeechModule$1(SpeechModule paramSpeechModule) {}
  
  public void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    synchronized (this.this$0.mSynLock)
    {
      this.this$0.getTag();
      this.this$0.mService = SpeechModule.access$000(this.this$0, paramIBinder);
      this.this$0.getTag();
      new StringBuilder("mService :").append(this.this$0.mService).toString();
      if (SpeechModule.access$100(this.this$0) != null) {
        SpeechModule.access$100(this.this$0).onInit(this.this$0, 0);
      }
      return;
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechModule$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */