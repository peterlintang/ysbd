package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.speech.aidl.ITextUnderstander;

public class TextUnderstander
  extends SpeechModule<ITextUnderstander>
{
  public static final String SCENE = "scene";
  private static final String TEXT = "text";
  
  public TextUnderstander(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.component.textunderstander", "nlu");
  }
  
  public int cancel(TextUnderstanderListener paramTextUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramTextUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      ((ITextUnderstander)this.mService).cancel(paramTextUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramTextUnderstanderListener)
    {
      paramTextUnderstanderListener.printStackTrace();
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
      boolean bool = ((ITextUnderstander)this.mService).isUnderstanding();
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
  
  public int understandText(String paramString, TextUnderstanderListener paramTextUnderstanderListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramTextUnderstanderListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("text", paramString);
      ((ITextUnderstander)this.mService).understandText(localIntent, paramTextUnderstanderListener);
      return 0;
    }
    catch (RemoteException paramString)
    {
      paramString.printStackTrace();
    }
    return 21004;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\TextUnderstander.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */