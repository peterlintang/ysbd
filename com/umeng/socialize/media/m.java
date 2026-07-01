package com.umeng.socialize.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class m
  implements Parcelable.Creator<UMusic>
{
  public UMusic a(Parcel paramParcel)
  {
    return new UMusic(paramParcel);
  }
  
  public UMusic[] a(int paramInt)
  {
    return new UMusic[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */