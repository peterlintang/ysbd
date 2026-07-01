package com.iflytek.speech;

import android.os.IBinder;
import android.os.Parcel;

class RecognizerListener$Stub$Proxy
  implements RecognizerListener
{
  private IBinder mRemote;
  
  RecognizerListener$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.RecognizerListener";
  }
  
  public void onBeginOfSpeech()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.RecognizerListener");
      this.mRemote.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onEndOfSpeech()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.RecognizerListener");
      this.mRemote.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onError(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.RecognizerListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onResult(RecognizerResult paramRecognizerResult, boolean paramBoolean)
  {
    int i = 1;
    Parcel localParcel = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel.writeInterfaceToken("com.iflytek.speech.RecognizerListener");
        if (paramRecognizerResult != null)
        {
          localParcel.writeInt(1);
          paramRecognizerResult.writeToParcel(localParcel, 0);
          break label83;
          localParcel.writeInt(i);
          this.mRemote.transact(4, localParcel, null, 1);
        }
        else
        {
          localParcel.writeInt(0);
        }
      }
      finally
      {
        localParcel.recycle();
      }
      label83:
      do
      {
        i = 0;
        break;
      } while (!paramBoolean);
    }
  }
  
  public void onVolumeChanged(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.RecognizerListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\RecognizerListener$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */