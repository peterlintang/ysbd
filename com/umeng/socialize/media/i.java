package com.umeng.socialize.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class i
  implements Parcelable.Creator<UMVedio>
{
  public UMVedio a(Parcel paramParcel)
  {
    return new UMVedio(paramParcel);
  }
  
  public UMVedio[] a(int paramInt)
  {
    return new UMVedio[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */