package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.speech.aidl.ISpeechSynthesizer;

public class SpeechSynthesizer
  extends SpeechModule<ISpeechSynthesizer>
{
  public static final String AUDIO_FORMAT = "audio_format";
  public static final String CLOUD_TTS_AUDIO_FORMAT_L16_16000 = "audio/L16;rate=16000";
  public static final String CLOUD_TTS_AUDIO_FORMAT_L16_8000 = "audio/L16;rate=8000";
  public static final String CLOUD_TTS_ROLE_CATHERINE = "Catherine";
  public static final String CLOUD_TTS_ROLE_HENRY = "henry";
  public static final String CLOUD_TTS_ROLE_VIMRJIA = "vimrjia";
  public static final String CLOUD_TTS_ROLE_VIXL = "vixl";
  public static final String CLOUD_TTS_ROLE_VIXM = "vixm";
  public static final String CLOUD_TTS_ROLE_VIXR = "vixr";
  public static final String CLOUD_TTS_ROLE_VIXYUN = "vixyun";
  public static final String CLOUD_TTS_ROLE_XIAOYAN = "xiaoyan";
  public static final String CLOUD_TTS_ROLE_XIAOYU = "xiaoyu";
  public static final String KEY_TTS_ENGINE_TYPE = "com.iflytek.speech.EXTRA_TTS_ENGINE_TYPE";
  public static final String LOCAL_SPEAKERS = "local_speakers";
  public static final String LOCAL_TTS_ROLE_XIAOYAN = "xiaoyan";
  public static final String PITCH = "pitch";
  public static final String SPEED = "speed";
  public static final String STREAM_TYPE = "stream_type";
  public static final String TEXT = "text";
  public static final String TTS_ENGINE_TYPE_AUTO = "auto";
  public static final String TTS_ENGINE_TYPE_CLOUD = "cloud";
  public static final String TTS_ENGINE_TYPE_LOCAL = "local";
  public static final String VOICE_NAME = "voice_name";
  public static final String VOLUME = "volume";
  
  public SpeechSynthesizer(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.component.speechsynthesizer", "tts");
  }
  
  public boolean destory()
  {
    this.mService = null;
    return super.destory();
  }
  
  public String getParameter(String paramString)
  {
    if (paramString.equals("local_speakers")) {
      try
      {
        if (SpeechUtility.getUtility(this.mContext).getVersionCode() < 44) {
          return "22005";
        }
        paramString = ((ISpeechSynthesizer)this.mService).getLocalSpeakerList();
        return paramString;
      }
      catch (RemoteException paramString)
      {
        paramString.printStackTrace();
        return "20999";
      }
    }
    return super.getParameter(paramString);
  }
  
  public boolean isSpeaking()
  {
    try
    {
      boolean bool = ((ISpeechSynthesizer)this.mService).isSpeaking();
      return bool;
    }
    catch (RemoteException localRemoteException)
    {
      localRemoteException.printStackTrace();
    }
    return false;
  }
  
  public int pauseSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      int i = ((ISpeechSynthesizer)this.mService).pauseSpeaking(paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramSynthesizerListener)
    {
      paramSynthesizerListener.printStackTrace();
    }
    return 21004;
  }
  
  public int resumeSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      int i = ((ISpeechSynthesizer)this.mService).resumeSpeaking(paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramSynthesizerListener)
    {
      paramSynthesizerListener.printStackTrace();
    }
    return 21004;
  }
  
  public int setParameter(String paramString1, String paramString2)
  {
    return super.setParameter(paramString1, paramString2);
  }
  
  public int startSpeaking(String paramString, SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("text", paramString);
      int i = ((ISpeechSynthesizer)this.mService).startSpeaking(localIntent, paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramString)
    {
      paramString.printStackTrace();
    }
    return 21004;
  }
  
  public int stopSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizerListener == null) {
      return 20012;
    }
    try
    {
      int i = ((ISpeechSynthesizer)this.mService).stopSpeaking(paramSynthesizerListener);
      return i;
    }
    catch (RemoteException paramSynthesizerListener)
    {
      paramSynthesizerListener.printStackTrace();
    }
    return 21004;
  }
  
  public int synthesizeToUrl(String paramString, SynthesizeToUrlListener paramSynthesizeToUrlListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramSynthesizeToUrlListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("text", paramString);
      int i = ((ISpeechSynthesizer)this.mService).synthesizeToUrl(localIntent, paramSynthesizeToUrlListener);
      return i;
    }
    catch (RemoteException paramString)
    {
      paramString.printStackTrace();
    }
    return 21004;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechSynthesizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */