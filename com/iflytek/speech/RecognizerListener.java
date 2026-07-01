package com.iflytek.speech;

import android.os.IInterface;

public abstract interface RecognizerListener
  extends IInterface
{
  public abstract void onBeginOfSpeech();
  
  public abstract void onEndOfSpeech();
  
  public abstract void onError(int paramInt);
  
  public abstract void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean);
  
  public abstract void onVolumeChanged(int paramInt);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\RecognizerListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */