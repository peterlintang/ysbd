package com.umeng.socialize.bean;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class q
  implements Parcelable.Creator<UMLocation>
{
  public UMLocation a(Parcel paramParcel)
  {
    return new UMLocation(paramParcel, null);
  }
  
  public UMLocation[] a(int paramInt)
  {
    return new UMLocation[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */