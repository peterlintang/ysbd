package com.umeng.socialize.bean;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class d
  implements Parcelable.Creator<BaseMsg>
{
  public BaseMsg a(Parcel paramParcel)
  {
    return new BaseMsg(paramParcel);
  }
  
  public BaseMsg[] a(int paramInt)
  {
    return new BaseMsg[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */