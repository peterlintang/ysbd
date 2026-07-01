package com.iflytek.speech;

import android.os.IInterface;

public abstract interface TextUnderstanderListener
  extends IInterface
{
  public abstract void onError(int paramInt);
  
  public abstract void onResult(UnderstanderResult paramUnderstanderResult);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\TextUnderstanderListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */