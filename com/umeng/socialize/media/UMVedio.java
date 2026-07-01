package com.umeng.socialize.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.umeng.socialize.c.b.c;
import java.util.HashMap;
import java.util.Map;

public class UMVedio
  extends BaseMediaObject
{
  public static final Parcelable.Creator<UMVedio> CREATOR = new i();
  
  protected UMVedio(Parcel paramParcel)
  {
    super(paramParcel);
  }
  
  public UMVedio(String paramString)
  {
    super(paramString);
  }
  
  public UMediaObject.MediaType getMediaType()
  {
    return UMediaObject.MediaType.VEDIO;
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
    }
    return localHashMap;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\UMVedio.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */