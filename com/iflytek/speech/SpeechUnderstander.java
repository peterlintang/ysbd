package com.iflytek.speech;

import android.content.Context;
import android.os.RemoteException;
import com.iflytek.speech.aidl.ISpeechUnderstander;

public class SpeechUnderstander
  extends SpeechModule<ISpeechUnderstander>
{
  public static final String SCENE = "scene";
  
  public SpeechUnderstander(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.component.speechunderstander", "nlu");
  }
  
  public int cancel(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSpeechUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechUnderstander)this.mService).cancel(paramSpeechUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramSpeechUnderstanderListener)
    {
      paramSpeechUnderstanderListener.printStackTrace();
    }
    return 21004;
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isUnderstanding()
  {
    try
    {
      boolean bool = ((ISpeechUnderstander)this.mService).isUnderstanding();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
    return false;
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startUnderstanding(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSpeechUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechUnderstander)this.mService).startUnderstanding(getIntent(), paramSpeechUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramSpeechUnderstanderListener)
    {
      paramSpeechUnderstanderListener.printStackTrace();
    }
    return 21004;
  }
  
  public int stopUnderstanding(SpeechUnderstanderListener paramSpeechUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSpeechUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechUnderstander)this.mService).stopUnderstanding(paramSpeechUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramSpeechUnderstanderListener)
    {
      paramSpeechUnderstanderListener.printStackTrace();
    }
    return 21004;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechUnderstander.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */