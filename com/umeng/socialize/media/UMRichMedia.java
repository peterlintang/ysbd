package com.umeng.socialize.media;

import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.umeng.socialize.c.b.c;
import java.util.HashMap;
import java.util.Map;

public class UMRichMedia
  extends BaseMediaObject
{
  public static final Parcelable.Creator<UMRichMedia> CREATOR = new g();
  private UMediaObject.MediaType d;
  private byte[] e;
  private String f = "未知";
  private String g = "未知";
  
  protected UMRichMedia(Parcel paramParcel)
  {
    super(paramParcel);
    Object localObject = paramParcel.readString();
    if (!TextUtils.isEmpty((CharSequence)localObject)) {
      this.d = UMediaObject.MediaType.convertToEmun((String)localObject);
    }
    this.f = paramParcel.readString();
    this.g = paramParcel.readString();
    int i = paramParcel.readInt();
    if (i > 0)
    {
      localObject = new byte[i];
      paramParcel.readByteArray((byte[])localObject);
      this.e = ((byte[])localObject);
    }
  }
  
  public UMRichMedia(String paramString, UMediaObject.MediaType paramMediaType)
  {
    super(paramString);
    this.d = paramMediaType;
  }
  
  public UMRichMedia(String paramString, Class<? extends BaseMediaObject> paramClass)
  {
    super(paramString);
    if (paramClass == UMImage.class) {
      this.d = UMediaObject.MediaType.IMAGE;
    }
    do
    {
      return;
      if (paramClass == UMVedio.class)
      {
        this.d = UMediaObject.MediaType.VEDIO;
        return;
      }
    } while (paramClass != UMusic.class);
    this.d = UMediaObject.MediaType.MUSIC;
  }
  
  public UMRichMedia(byte[] paramArrayOfByte, UMediaObject.MediaType paramMediaType)
  {
    super("");
    this.e = paramArrayOfByte;
    this.d = paramMediaType;
  }
  
  public UMRichMedia(byte[] paramArrayOfByte, Class<? extends BaseMediaObject> paramClass)
  {
    super("");
    this.e = paramArrayOfByte;
    if (paramClass == UMImage.class) {
      this.d = UMediaObject.MediaType.IMAGE;
    }
    do
    {
      return;
      if (paramClass == UMVedio.class)
      {
        this.d = UMediaObject.MediaType.VEDIO;
        return;
      }
    } while (paramClass != UMusic.class);
    this.d = UMediaObject.MediaType.MUSIC;
  }
  
  public static UMRichMedia toUMRichMedia(UMediaObject paramUMediaObject)
  {
    Object localObject2 = null;
    Object localObject1;
    if ((paramUMediaObject != null) && (paramUMediaObject.isUrlMedia()))
    {
      localObject1 = new UMRichMedia(paramUMediaObject.toUrl(), paramUMediaObject.getMediaType());
      if (paramUMediaObject.getMediaType() != UMediaObject.MediaType.MUSIC) {
        break label158;
      }
      localObject2 = (UMusic)paramUMediaObject;
      ((UMRichMedia)localObject1).setAuthor(((UMusic)localObject2).getAuthor());
      ((UMRichMedia)localObject1).setTitle(((UMusic)localObject2).getTitle());
    }
    label158:
    for (;;)
    {
      if ((localObject1 != null) && (paramUMediaObject != null) && ((paramUMediaObject instanceof BaseMediaObject)))
      {
        localObject2 = (BaseMediaObject)paramUMediaObject;
        paramUMediaObject = ((BaseMediaObject)localObject2).getQzone_title();
        localObject2 = ((BaseMediaObject)localObject2).getQzone_thumb();
        ((UMRichMedia)localObject1).setQzone_title(paramUMediaObject);
        ((UMRichMedia)localObject1).setQzone_thumb((String)localObject2);
      }
      return (UMRichMedia)localObject1;
      localObject1 = localObject2;
      if (paramUMediaObject != null)
      {
        localObject1 = localObject2;
        if (paramUMediaObject.getMediaType() == UMediaObject.MediaType.IMAGE)
        {
          byte[] arrayOfByte = paramUMediaObject.toByte();
          localObject1 = localObject2;
          if (arrayOfByte != null) {
            localObject1 = new UMRichMedia(arrayOfByte, UMediaObject.MediaType.IMAGE);
          }
        }
      }
    }
  }
  
  public String getAuthor()
  {
    return this.g;
  }
  
  public UMediaObject.MediaType getMediaType()
  {
    return this.d;
  }
  
  public String getTitle()
  {
    return this.f;
  }
  
  public boolean isUrlMedia()
  {
    return !TextUtils.isEmpty(this.a);
  }
  
  public void setAuthor(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.g = paramString;
    }
  }
  
  public void setTitle(String paramString)
  {
    if (!TextUtils.isEmpty(paramString)) {
      this.f = paramString;
    }
  }
  
  public void toByte(UMediaObject.a parama)
  {
    if (parama == null) {
      return;
    }
    parama.a();
    if (this.e != null)
    {
      parama.a(this.e);
      return;
    }
    if (!TextUtils.isEmpty(this.a))
    {
      if (Looper.myLooper() == Looper.getMainLooper())
      {
        new h(this, parama).execute(new Void[0]);
        return;
      }
      parama.a(null);
      return;
    }
    parama.a(null);
  }
  
  public byte[] toByte()
  {
    return this.e;
  }
  
  public String toUrl()
  {
    return this.a;
  }
  
  public final Map<String, Object> toUrlExtraParams()
  {
    HashMap localHashMap = new HashMap();
    if (isUrlMedia())
    {
      localHashMap.put(c.y, this.a);
      localHashMap.put(c.z, getMediaType());
      if (this.d == UMediaObject.MediaType.MUSIC)
      {
        localHashMap.put(c.A, this.f);
        localHashMap.put(c.C, this.g);
      }
    }
    return localHashMap;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    String str;
    if (this.d == null)
    {
      str = "";
      paramParcel.writeString(str);
      paramParcel.writeString(this.f);
      paramParcel.writeString(this.g);
      if (this.e != null) {
        break label71;
      }
    }
    label71:
    for (paramInt = 0;; paramInt = this.e.length)
    {
      paramParcel.writeInt(paramInt);
      paramParcel.writeByteArray(this.e);
      return;
      str = this.d.toString();
      break;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\UMRichMedia.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */