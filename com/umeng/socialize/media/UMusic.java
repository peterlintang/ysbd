package com.umeng.socialize.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.umeng.socialize.c.b.c;
import java.util.HashMap;
import java.util.Map;

public class UMusic
  extends BaseMediaObject
{
  public static final Parcelable.Creator<UMusic> CREATOR = new m();
  private String d = "未知";
  private String e = "未知";
  
  protected UMusic(Parcel paramParcel)
  {
    super(paramParcel);
    this.d = paramParcel.readString();
    this.e = paramParcel.readString();
  }
  
  public UMusic(String paramString)
  {
    super(paramString);
  }
  
  public String getAuthor()
  {
    return this.e;
  }
  
  public UMediaObject.MediaType getMediaType()
  {
    return UMediaObject.MediaType.MUSIC;
  }
  
  public String getTitle()
  {
    return this.d;
  }
  
  public void setAuthor(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.e = paramString;
    }
  }
  
  public void setTitle(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.d = paramString;
    }
  }
  
  public void toByte(UMediaObject.a parama) {}
  
  public byte[] toByte()
  {
    return null;
  }
  
  public final Map<String, Object> toUrlExtraParams()
  {
    HashMap localHashMap = new HashMap();
    if (isUrlMedia())
    {
      localHashMap.put(c.y, this.a);
      localHashMap.put(c.z, getMediaType());
      localHashMap.put(c.A, this.d);
      localHashMap.put(c.C, this.e);
    }
    return localHashMap;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.d);
    paramParcel.writeString(this.e);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\UMusic.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */