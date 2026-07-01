package com.iflytek.speech;

import android.os.IInterface;

public abstract interface SpeechUnderstanderListener
  extends IInterface
{
  public abstract void onBeginOfSpeech();
  
  public abstract void onEndOfSpeech();
  
  public abstract void onError(int paramInt);
  
  public abstract void onResult(UnderstanderResult paramUnderstanderResult);
  
  public abstract void onVolumeChanged(int paramInt);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechUnderstanderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */