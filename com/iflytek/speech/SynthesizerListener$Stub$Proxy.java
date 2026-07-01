package com.iflytek.speech;

import android.os.IBinder;
import android.os.Parcel;

class SynthesizerListener$Stub$Proxy
  implements SynthesizerListener
{
  private IBinder mRemote;
  
  SynthesizerListener$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.SynthesizerListener";
  }
  
  public void onBufferProgress(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(6, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onCompleted(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(4, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSpeakBegin()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      this.mRemote.transact(1, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSpeakPaused()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      this.mRemote.transact(2, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSpeakProgress(int paramInt)
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      localParcel.writeInt(paramInt);
      this.mRemote.transact(5, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
  
  public void onSpeakResumed()
  {
    Parcel localParcel = Parcel.obtain();
    try
    {
      localParcel.writeInterfaceToken("com.iflytek.speech.SynthesizerListener");
      this.mRemote.transact(3, localParcel, null, 1);
      return;
    }
    finally
    {
      localParcel.recycle();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\SynthesizerListener$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */