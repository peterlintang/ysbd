package com.umeng.socialize.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class g
  implements Parcelable.Creator<UMRichMedia>
{
  public UMRichMedia a(Parcel paramParcel)
  {
    return new UMRichMedia(paramParcel);
  }
  
  public UMRichMedia[] a(int paramInt)
  {
    return new UMRichMedia[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */