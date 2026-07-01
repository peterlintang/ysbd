package com.iflytek.speech;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class RecognizerResult$1
  implements Parcelable.Creator<RecognizerResult>
{
  public final RecognizerResult createFromParcel(Parcel paramParcel)
  {
    return new RecognizerResult(paramParcel);
  }
  
  public final RecognizerResult[] newArray(int paramInt)
  {
    return new RecognizerResult[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\iflytek\speech\RecognizerResult$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */