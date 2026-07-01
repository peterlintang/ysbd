package com.umeng.newxp.view.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

class h
  implements Parcelable
{
  public static final Parcelable.Creator<h> f = new h.1();
  public boolean a = false;
  public boolean b = false;
  public boolean c = false;
  public boolean d = false;
  public int e = -1;
  
  public h() {}
  
  public h(Parcel paramParcel)
  {
    boolean[] arrayOfBoolean = new boolean[4];
    paramParcel.readBooleanArray(arrayOfBoolean);
    this.a = arrayOfBoolean[0];
    this.b = arrayOfBoolean[1];
    this.c = arrayOfBoolean[2];
    this.d = arrayOfBoolean[3];
    this.e = paramParcel.readInt();
  }
  
  public h a(int paramInt)
  {
    this.e = paramInt;
    return this;
  }
  
  public h a(boolean paramBoolean)
  {
    this.a = paramBoolean;
    return this;
  }
  
  public h b(boolean paramBoolean)
  {
    this.b = paramBoolean;
    return this;
  }
  
  public h c(boolean paramBoolean)
  {
    this.c = paramBoolean;
    return this;
  }
  
  public h d(boolean paramBoolean)
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


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */