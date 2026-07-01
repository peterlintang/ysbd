package com.umeng.socialize.media;

import android.os.Parcel;
import android.os.Parcelable.Creator;

class a
  implements Parcelable.Creator<UMImage>
{
  public UMImage a(Parcel paramParcel)
  {
    return new UMImage(paramParcel);
  }
  
  public UMImage[] a(int paramInt)
  {
    return new UMImage[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\media\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */