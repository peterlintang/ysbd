package com.taobao.munion.net;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class k$1
  implements Parcelable.Creator<k>
{
  public final k a(Parcel paramParcel)
  {
    k localk = new k();
    k.a(localk, paramParcel.readHashMap(null));
    return localk;
  }
  
  public final k[] a(int paramInt)
  {
    return new k[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\net\k$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */