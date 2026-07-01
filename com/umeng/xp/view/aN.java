package com.umeng.xp.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class aN
  implements Parcelable
{
  public static final Parcelable.Creator<aN> f = new aO();
  public boolean a = false;
  public boolean b = false;
  public boolean c = false;
  public boolean d = false;
  public int e = -1;
  
  public aN() {}
  
  public aN(Parcel paramParcel)
  {
    boolean[] arrayOfBoolean = new boolean[4];
    paramParcel.readBooleanArray(arrayOfBoolean);
    this.a = arrayOfBoolean[0];
    this.b = arrayOfBoolean[1];
    this.c = arrayOfBoolean[2];
    this.d = arrayOfBoolean[3];
    this.e = paramParcel.readInt();
  }
  
  public aN a(int paramInt)
  {
    this.e = paramInt;
    return this;
  }
  
  public aN a(boolean paramBoolean)
  {
    this.a = paramBoolean;
    return this;
  }
  
  public aN b(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }
  
  public aN c(boolean paramBoolean)
  {
    this.c = paramBoolean;
    return this;
  }
  
  public aN d(boolean paramBoolean)
  {
    this.d = paramBoolean;
    return this;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeBooleanArray(new boolean[] { this.a, this.b, this.c, this.d });
    paramParcel.writeInt(this.e);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aN.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */