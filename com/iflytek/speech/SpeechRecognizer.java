package com.iflytek.speech;

import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.iflytek.speech.aidl.ISpeechRecognizer;

public class SpeechRecognizer
  extends SpeechModule<ISpeechRecognizer>
{
  public static final String CLOUD_GRAMMAR = "local_grammar";
  public static final String GRAMMAR_CONTENT = "grammar_content";
  public static final String GRAMMAR_ENCODEING = "grammar_encoding";
  public static final String GRAMMAR_ID = "grammar_id";
  public static final String GRAMMAR_LIST = "grammar_list";
  public static final String GRAMMAR_TYPE = "grammar_type";
  public static final String LEXICON_CONTACTS = "<contact>";
  public static final String LEXICON_CONTENT = "lexicon_content";
  public static final String LEXICON_FLUSH = "lexicon_flush";
  public static final String LEXICON_NAME = "lexicon_name";
  public static final String LOCAL_GRAMMAR = "local_grammar";
  
  public SpeechRecognizer(Context paramContext, InitListener paramInitListener)
  {
    super(paramContext, paramInitListener, "com.iflytek.component.speechrecognizer", "asr");
  }
  
  public int buildGrammar(String paramString1, String paramString2, GrammarListener paramGrammarListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramGrammarListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("grammar_type", paramString1);
      localIntent.putExtra("grammar_content", paramString2);
      ((ISpeechRecognizer)this.mService).buildGrammar(localIntent, paramGrammarListener);
      return 0;
    }
    catch (RemoteException paramString1)
    {
      paramString1.printStackTrace();
    }
    return 21004;
  }
  
  public int cancel(RecognizerListener paramRecognizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramRecognizerListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechRecognizer)this.mService).cancel(paramRecognizerListener);
      return 0;
    }
    catch (RemoteException paramRecognizerListener)
    {
      paramRecognizerListener.printStackTrace();
    }
    return 21004;
  }
  
  public boolean destory()
  {
    this.mService = null;
    return super.destory();
  }
  
  public String getParameter(String paramString)
  {
    return super.getParameter(paramString);
  }
  
  public boolean isListening()
  {
    try
    {
      boolean bool = ((ISpeechRecognizer)this.mService).isListening();
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
  
  public int startListening(RecognizerListener paramRecognizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramRecognizerListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechRecognizer)this.mService).startListening(getIntent(), paramRecognizerListener);
      return 0;
    }
    catch (RemoteException paramRecognizerListener)
    {
      paramRecognizerListener.printStackTrace();
    }
    return 21004;
  }
  
  public int stopListening(RecognizerListener paramRecognizerListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramRecognizerListener == null) {
      return 20012;
    }
    try
    {
      ((ISpeechRecognizer)this.mService).stopListening(paramRecognizerListener);
      return 0;
    }
    catch (RemoteException paramRecognizerListener)
    {
      paramRecognizerListener.printStackTrace();
    }
    return 21004;
  }
  
  public int updateLexicon(String paramString1, String paramString2, LexiconListener paramLexiconListener)
  {
    if (this.mService == null) {
      return 21003;
    }
    if (paramLexiconListener == null) {
      return 20012;
    }
    try
    {
      Intent localIntent = getIntent();
      localIntent.putExtra("lexicon_name", paramString1);
      localIntent.putExtra("lexicon_content", paramString2);
      ((ISpeechRecognizer)this.mService).updateLexicon(localIntent, paramLexiconListener);
      return 0;
    }
    catch (RemoteException paramString1)
    {
      paramString1.printStackTrace();
    }
    return 21004;
  }
  
  public int writeAudio(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (SpeechUtility.getUtility(this.mContext).getVersionCode() < 44) {
      return 22005;
    }
    if (this.mService == null) {
      return 21003;
    }
    try
    {
      Intent localIntent = getIntent();
      ((ISpeechRecognizer)this.mService).writeAudio(localIntent, paramArrayOfByte, paramInt1, paramInt2);
      return 0;
    }
    catch (RemoteException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return 0;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechRecognizer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */