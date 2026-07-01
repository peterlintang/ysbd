package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.iflytek.speech.SpeechUnderstanderListener.Stub;

public abstract class ISpeechUnderstander$Stub
  extends Binder
  implements ISpeechUnderstander
{
  private static final String DESCRIPTOR = "com.iflytek.speech.aidl.ISpeechUnderstander";
  static final int TRANSACTION_cancel = 3;
  static final int TRANSACTION_isUnderstanding = 4;
  static final int TRANSACTION_startUnderstanding = 1;
  static final int TRANSACTION_stopUnderstanding = 2;
  
  public ISpeechUnderstander$Stub()
  {
    attachInterface(this, "com.iflytek.speech.aidl.ISpeechUnderstander");
  }
  
  public static ISpeechUnderstander asInterface(IBinder paramIBinder)
  {
    if (paramIBinder == null) {
      return null;
    }
    IInterface localIInterface = paramIBinder.queryLocalInterface("com.iflytek.speech.aidl.ISpeechUnderstander");
    if ((localIInterface != null) && ((localIInterface instanceof ISpeechUnderstander))) {
      return (ISpeechUnderstander)localIInterface;
    }
    return new ISpeechUnderstander.Stub.Proxy(paramIBinder);
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
      paramParcel2.writeString("com.iflytek.speech.aidl.ISpeechUnderstander");
      return true;
    case 1: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechUnderstander");
      if (paramParcel1.readInt() != 0) {}
      for (Intent localIntent = (Intent)Intent.CREATOR.createFromParcel(paramParcel1);; localIntent = null)
      {
        startUnderstanding(localIntent, SpeechUnderstanderListener.Stub.asInterface(paramParcel1.readStrongBinder()));
        paramParcel2.writeNoException();
        return true;
      }
    case 2: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechUnderstander");
      stopUnderstanding(SpeechUnderstanderListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    case 3: 
      paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechUnderstander");
      cancel(SpeechUnderstanderListener.Stub.asInterface(paramParcel1.readStrongBinder()));
      paramParcel2.writeNoException();
      return true;
    }
    paramParcel1.enforceInterface("com.iflytek.speech.aidl.ISpeechUnderstander");
    boolean bool = isUnderstanding();
    paramParcel2.writeNoException();
    if (bool) {}
    for (paramInt1 = 1;; paramInt1 = 0)
    {
      paramParcel2.writeInt(paramInt1);
      return true;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechUnderstander$Stub.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */