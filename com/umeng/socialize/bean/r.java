package com.umeng.socialize.bean;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class r
  implements Parcelable.Creator<UMShareMsg>
{
  public UMShareMsg a(Parcel paramParcel)
  {
    return new UMShareMsg(paramParcel, null);
  }
  
  public UMShareMsg[] a(int paramInt)
  {
    return new UMShareMsg[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */