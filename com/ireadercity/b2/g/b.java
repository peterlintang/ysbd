package com.ireadercity.b2.g;

import android.os.Handler;
import com.iflytek.speech.SynthesizerListener.Stub;

final class b
  extends SynthesizerListener.Stub
{
  b(a parama) {}
  
  public final void onBufferProgress(int paramInt)
  {
    a.a(this.a);
    new StringBuilder("onBufferProgress :").append(paramInt).toString();
    a locala = this.a;
    new StringBuilder("onBufferProgress :").append(paramInt).toString();
  }
  
  public final void onCompleted(int paramInt)
  {
    a.a(this.a);
    new StringBuilder("onCompleted code =").append(paramInt).toString();
    if (22002 == paramInt)
    {
      a.b(this.a).sendEmptyMessage(2);
      this.a.d = false;
      return;
    }
    a.c(this.a);
  }
  
  public final void onSpeakBegin()
  {
    a.a(this.a);
    a locala = this.a;
  }
  
  public final void onSpeakPaused()
  {
    a.a(this.a);
    a locala = this.a;
  }
  
  public final void onSpeakProgress(int paramInt)
  {
    a.a(this.a);
    new StringBuilder("onSpeakProgress :").append(paramInt).toString();
    a locala = this.a;
    new StringBuilder("onSpeakProgress :").append(paramInt).toString();
  }
  
  public final void onSpeakResumed()
  {
    a.a(this.a);
    a locala = this.a;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\g\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */