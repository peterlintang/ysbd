package com.umeng.socialize.media;

import android.os.Parcel;
import android.text.TextUtils;

public abstract class BaseMediaObject
  implements UMediaObject
{
  protected String a = "";
  protected String b = "";
  protected String c = "";
  
  protected BaseMediaObject(Parcel paramParcel)
  {
    if (paramParcel != null)
    {
      this.a = paramParcel.readString();
      this.b = paramParcel.readString();
      this.c = paramParcel.readString();
    }
  }
  
  public BaseMediaObject(String paramString)
  {
    this.a = paramString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public String getQzone_thumb()
  {
    return this.c;
  }
  
  public String getQzone_title()
  {
    return this.b;
  }
  
  public boolean isUrlMedia()
  {
    return !TextUtils.isEmpty(this.a);
  }
  
  public void setQzone_thumb(String paramString)
  {
    this.c = paramString;
  }
  
  public void setQzone_title(String paramString)
  {
    this.b = paramString;
  }
  
  public String toUrl()
  {
    return this.a;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeString(this.a);
    paramParcel.writeString(this.b);
    paramParcel.writeString(this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\BaseMediaObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */