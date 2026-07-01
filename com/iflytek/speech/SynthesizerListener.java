package com.iflytek.speech;

import android.os.IInterface;

public abstract interface SynthesizerListener
  extends IInterface
{
  public abstract void onBufferProgress(int paramInt);
  
  public abstract void onCompleted(int paramInt);
  
  public abstract void onSpeakBegin();
  
  public abstract void onSpeakPaused();
  
  public abstract void onSpeakProgress(int paramInt);
  
  public abstract void onSpeakResumed();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SynthesizerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */