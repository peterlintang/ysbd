package com.umeng.socialize.bean;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.umeng.socialize.media.UMRichMedia;

public class BaseMsg
  implements Parcelable
{
  public static final Parcelable.Creator<BaseMsg> CREATOR = new d();
  protected UMRichMedia a = null;
  public UMLocation location;
  public String text = "";
  
  public BaseMsg() {}
  
  protected BaseMsg(Parcel paramParcel)
  {
    this.text = paramParcel.readString();
    this.location = ((UMLocation)paramParcel.readParcelable(UMLocation.class.getClassLoader()));
    this.a = ((UMRichMedia)paramParcel.readParcelable(UMRichMedia.class.getClassLoader()));
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public UMRichMedia getMedia()
  {
    return this.a;
  }
  
  public void setMediaData(UMRichMedia paramUMRichMedia)
  {
    this.a = paramUMRichMedia;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.text);
    paramParcel.writeParcelable(this.location, 1);
    paramParcel.writeParcelable(this.a, 1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\bean\BaseMsg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */