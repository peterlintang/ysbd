package com.taobao.munion.pattern;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.view.View.BaseSavedState;

class LockPatternView$d
  extends View.BaseSavedState
{
  public static final Parcelable.Creator<d> a = new LockPatternView.d.1();
  private final String b;
  private final int c;
  private final boolean d;
  private final boolean e;
  private final boolean f;
  
  private LockPatternView$d(Parcel paramParcel)
  {
    super(paramParcel);
    this.b = paramParcel.readString();
    this.c = paramParcel.readInt();
    this.d = ((Boolean)paramParcel.readValue(null)).booleanValue();
    this.e = ((Boolean)paramParcel.readValue(null)).booleanValue();
    this.f = ((Boolean)paramParcel.readValue(null)).booleanValue();
  }
  
  private LockPatternView$d(Parcelable paramParcelable, String paramString, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    super(paramParcelable);
    this.b = paramString;
    this.c = paramInt;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramBoolean3;
  }
  
  public String a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return this.e;
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeString(this.b);
    paramParcel.writeInt(this.c);
    paramParcel.writeValue(Boolean.valueOf(this.d));
    paramParcel.writeValue(Boolean.valueOf(this.e));
    paramParcel.writeValue(Boolean.valueOf(this.f));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\pattern\LockPatternView$d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */