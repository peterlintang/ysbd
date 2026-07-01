package com.umeng.socialize.bean;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class p
  implements Parcelable.Creator<UMComment>
{
  public UMComment a(Parcel paramParcel)
  {
    return new UMComment(paramParcel, null);
  }
  
  public UMComment[] a(int paramInt)
  {
    return new UMComment[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */