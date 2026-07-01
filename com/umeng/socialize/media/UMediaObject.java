package com.umeng.socialize.media;

import android.os.Parcelable;
import java.util.Map;

public abstract interface UMediaObject
  extends Parcelable
{
  public abstract UMediaObject.MediaType getMediaType();
  
  public abstract boolean isUrlMedia();
  
  public abstract void toByte(UMediaObject.a parama);
  
  public abstract byte[] toByte();
  
  public abstract String toUrl();
  
  public abstract Map<String, Object> toUrlExtraParams();
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\UMediaObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */