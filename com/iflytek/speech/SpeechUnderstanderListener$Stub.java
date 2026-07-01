package com.iflytek.speech;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

public abstract class SpeechUnderstanderListener$Stub
  extends Binder
  implements SpeechUnderstanderListener
{
  private static final String DESCRIPTOR = "com.iflytek.speech.SpeechUnderstanderListener";
  static final int TRANSACTION_onBeginOfSpeech = 2;
  static final int TRANSACTION_onEndOfSpeech = 3;
  static final int TRANSACTION_onError = 5;
  static final int TRANSACTION_onResult = 4;
  static final int TRANSACTION_onVolumeChanged = 1;
  
  public SpeechUnderstanderListener$Stub()
  {
    attachInterface(this, "com.iflytek.speech.SpeechUnderstanderListener");
  }
  
  public static SpeechUnderstanderListener asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.SpeechUnderstanderListener");
    if ((localIInterface != null) && ((localIInterface instanceof SpeechUnderstanderListener))) {
      return (SpeechUnderstanderListener)localIInterface;
    }
    return new SpeechUnderstanderListener.Stub.Proxy(paramIBinder);
  }
  
  public IBinder asBinder()
  {
    return this;
  }
  
  public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2)
  {
    switch (paramInt1)
    {
    default: 
      return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
    case 1598968902: 
      paramParcel2.writeString("com.iflytek.speech.SpeechUnderstanderListener");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.SpeechUnderstanderListener");
      onVolumeChanged(paramParcel1.readInt());
      return true;
    case 2: 
      paramParcel1.enforceInterface("com.iflytek.speech.SpeechUnderstanderListener");
      onBeginOfSpeech();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.iflytek.speech.SpeechUnderstanderListener");
      onEndOfSpeech();
      return true;
    case 4: 
      paramParcel1.enforceInterface("com.iflytek.speech.SpeechUnderstanderListener");
      if (paramParcel1.readInt() != 0) {}
      for (paramParcel1 = (UnderstanderResult)UnderstanderResult.CREATOR.createFromParcel(paramParcel1);; paramParcel1 = null)
      {
        onResult(paramParcel1);
        return true;
      }
    }
    paramParcel1.enforceInterface("com.iflytek.speech.SpeechUnderstanderListener");
    onError(paramParcel1.readInt());
    return true;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SpeechUnderstanderListener$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */