package com.umeng.socialize.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

public class UMShareMsg
  extends BaseMsg
  implements Parcelable
{
  public static final Parcelable.Creator<UMShareMsg> CREATOR = new r();
  public String wid;
  
  public UMShareMsg() {}
  
  private UMShareMsg(Parcel paramParcel)
  {
    super(paramParcel);
    this.wid = paramParcel.readString();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.wid);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\UMShareMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */