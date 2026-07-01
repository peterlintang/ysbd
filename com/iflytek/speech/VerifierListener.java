package com.iflytek.speech;

public abstract interface VerifierListener
{
  public abstract void onBeginOfSpeech();
  
  public abstract void onCancel();
  
  public abstract void onEnd(VerifierResult paramVerifierResult, int paramInt);
  
  public abstract void onEndOfSpeech();
  
  public abstract void onRegister(VerifierResult paramVerifierResult);
  
  public abstract void onVolumeChanged(int paramInt);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\VerifierListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */