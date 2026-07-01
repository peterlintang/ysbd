package com.iflytek.speech.aidl;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import com.iflytek.speech.SynthesizeToUrlListener;
import com.iflytek.speech.SynthesizerListener;

class ISpeechSynthesizer$Stub$Proxy
  implements ISpeechSynthesizer
{
  private IBinder mRemote;
  
  ISpeechSynthesizer$Stub$Proxy(IBinder paramIBinder)
  {
    this.mRemote = paramIBinder;
  }
  
  public IBinder asBinder()
  {
    return this.mRemote;
  }
  
  public String getInterfaceDescriptor()
  {
    return "com.iflytek.speech.aidl.ISpeechSynthesizer";
  }
  
  public String getLocalSpeakerList()
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
      this.mRemote.transact(7, localParcel1, localParcel2, 0);
      localParcel2.readException();
      String str = localParcel2.readString();
      return str;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  public boolean isSpeaking()
  {
    boolean bool = false;
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    try
    {
      localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
      this.mRemote.transact(6, localParcel1, localParcel2, 0);
      localParcel2.readException();
      int i = localParcel2.readInt();
      if (i != 0) {
        bool = true;
      }
      return bool;
    }
    finally
    {
      localParcel2.recycle();
      localParcel1.recycle();
    }
  }
  
  /* Error */
  public int pauseSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 22
    //   12: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +52 -> 68
    //   19: aload_1
    //   20: invokeinterface 60 1 0
    //   25: astore_1
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_0
    //   32: getfield 15	com/iflytek/speech/aidl/ISpeechSynthesizer$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   35: iconst_3
    //   36: aload_3
    //   37: aload 4
    //   39: iconst_0
    //   40: invokeinterface 39 5 0
    //   45: pop
    //   46: aload 4
    //   48: invokevirtual 42	android/os/Parcel:readException	()V
    //   51: aload 4
    //   53: invokevirtual 54	android/os/Parcel:readInt	()I
    //   56: istore_2
    //   57: aload 4
    //   59: invokevirtual 48	android/os/Parcel:recycle	()V
    //   62: aload_3
    //   63: invokevirtual 48	android/os/Parcel:recycle	()V
    //   66: iload_2
    //   67: ireturn
    //   68: aconst_null
    //   69: astore_1
    //   70: goto -44 -> 26
    //   73: astore_1
    //   74: aload 4
    //   76: invokevirtual 48	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: invokevirtual 48	android/os/Parcel:recycle	()V
    //   83: aload_1
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	Proxy
    //   0	85	1	paramSynthesizerListener	SynthesizerListener
    //   56	11	2	i	int
    //   3	77	3	localParcel1	Parcel
    //   7	68	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	73	finally
    //   19	26	73	finally
    //   26	57	73	finally
  }
  
  /* Error */
  public int resumeSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 22
    //   12: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +52 -> 68
    //   19: aload_1
    //   20: invokeinterface 60 1 0
    //   25: astore_1
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_0
    //   32: getfield 15	com/iflytek/speech/aidl/ISpeechSynthesizer$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   35: iconst_4
    //   36: aload_3
    //   37: aload 4
    //   39: iconst_0
    //   40: invokeinterface 39 5 0
    //   45: pop
    //   46: aload 4
    //   48: invokevirtual 42	android/os/Parcel:readException	()V
    //   51: aload 4
    //   53: invokevirtual 54	android/os/Parcel:readInt	()I
    //   56: istore_2
    //   57: aload 4
    //   59: invokevirtual 48	android/os/Parcel:recycle	()V
    //   62: aload_3
    //   63: invokevirtual 48	android/os/Parcel:recycle	()V
    //   66: iload_2
    //   67: ireturn
    //   68: aconst_null
    //   69: astore_1
    //   70: goto -44 -> 26
    //   73: astore_1
    //   74: aload 4
    //   76: invokevirtual 48	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: invokevirtual 48	android/os/Parcel:recycle	()V
    //   83: aload_1
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	Proxy
    //   0	85	1	paramSynthesizerListener	SynthesizerListener
    //   56	11	2	i	int
    //   3	77	3	localParcel1	Parcel
    //   7	68	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	73	finally
    //   19	26	73	finally
    //   26	57	73	finally
  }
  
  public int startSpeaking(Intent paramIntent, SynthesizerListener paramSynthesizerListener)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
        if (paramIntent != null)
        {
          localParcel1.writeInt(1);
          paramIntent.writeToParcel(localParcel1, 0);
          if (paramSynthesizerListener != null)
          {
            paramIntent = paramSynthesizerListener.asBinder();
            localParcel1.writeStrongBinder(paramIntent);
            this.mRemote.transact(2, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            return i;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramIntent = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
  
  /* Error */
  public int stopSpeaking(SynthesizerListener paramSynthesizerListener)
  {
    // Byte code:
    //   0: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   3: astore_3
    //   4: invokestatic 29	android/os/Parcel:obtain	()Landroid/os/Parcel;
    //   7: astore 4
    //   9: aload_3
    //   10: ldc 22
    //   12: invokevirtual 33	android/os/Parcel:writeInterfaceToken	(Ljava/lang/String;)V
    //   15: aload_1
    //   16: ifnull +52 -> 68
    //   19: aload_1
    //   20: invokeinterface 60 1 0
    //   25: astore_1
    //   26: aload_3
    //   27: aload_1
    //   28: invokevirtual 63	android/os/Parcel:writeStrongBinder	(Landroid/os/IBinder;)V
    //   31: aload_0
    //   32: getfield 15	com/iflytek/speech/aidl/ISpeechSynthesizer$Stub$Proxy:mRemote	Landroid/os/IBinder;
    //   35: iconst_5
    //   36: aload_3
    //   37: aload 4
    //   39: iconst_0
    //   40: invokeinterface 39 5 0
    //   45: pop
    //   46: aload 4
    //   48: invokevirtual 42	android/os/Parcel:readException	()V
    //   51: aload 4
    //   53: invokevirtual 54	android/os/Parcel:readInt	()I
    //   56: istore_2
    //   57: aload 4
    //   59: invokevirtual 48	android/os/Parcel:recycle	()V
    //   62: aload_3
    //   63: invokevirtual 48	android/os/Parcel:recycle	()V
    //   66: iload_2
    //   67: ireturn
    //   68: aconst_null
    //   69: astore_1
    //   70: goto -44 -> 26
    //   73: astore_1
    //   74: aload 4
    //   76: invokevirtual 48	android/os/Parcel:recycle	()V
    //   79: aload_3
    //   80: invokevirtual 48	android/os/Parcel:recycle	()V
    //   83: aload_1
    //   84: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	85	0	this	Proxy
    //   0	85	1	paramSynthesizerListener	SynthesizerListener
    //   56	11	2	i	int
    //   3	77	3	localParcel1	Parcel
    //   7	68	4	localParcel2	Parcel
    // Exception table:
    //   from	to	target	type
    //   9	15	73	finally
    //   19	26	73	finally
    //   26	57	73	finally
  }
  
  public int synthesizeToUrl(Intent paramIntent, SynthesizeToUrlListener paramSynthesizeToUrlListener)
  {
    Parcel localParcel1 = Parcel.obtain();
    Parcel localParcel2 = Parcel.obtain();
    for (;;)
    {
      try
      {
        localParcel1.writeInterfaceToken("com.iflytek.speech.aidl.ISpeechSynthesizer");
        if (paramIntent != null)
        {
          localParcel1.writeInt(1);
          paramIntent.writeToParcel(localParcel1, 0);
          if (paramSynthesizeToUrlListener != null)
          {
            paramIntent = paramSynthesizeToUrlListener.asBinder();
            localParcel1.writeStrongBinder(paramIntent);
            this.mRemote.transact(1, localParcel1, localParcel2, 0);
            localParcel2.readException();
            int i = localParcel2.readInt();
            return i;
          }
        }
        else
        {
          localParcel1.writeInt(0);
          continue;
        }
        paramIntent = null;
      }
      finally
      {
        localParcel2.recycle();
        localParcel1.recycle();
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\aidl\ISpeechSynthesizer$Stub$Proxy.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */