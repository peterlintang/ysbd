package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IInterface;
import com.iflytek.speech.SpeechUnderstanderListener;

public abstract interface ISpeechUnderstander
  extends IInterface
{
  public abstract void cancel(SpeechUnderstanderListener paramSpeechUnderstanderListener);
  
  public abstract boolean isUnderstanding();
  
  public abstract void startUnderstanding(Intent paramIntent, SpeechUnderstanderListener paramSpeechUnderstanderListener);
  
  public abstract void stopUnderstanding(SpeechUnderstanderListener paramSpeechUnderstanderListener);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechUnderstander.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */