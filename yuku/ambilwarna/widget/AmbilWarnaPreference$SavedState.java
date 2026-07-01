package yuku.ambilwarna.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.preference.Preference.BaseSavedState;

class AmbilWarnaPreference$SavedState
  extends Preference.BaseSavedState
{
  public static final Parcelable.Creator<SavedState> CREATOR = new b();
  int a;
  
  public AmbilWarnaPreference$SavedState(Parcel paramParcel)
  {
    super(paramParcel);
    this.a = paramParcel.readInt();
  }
  
  public AmbilWarnaPreference$SavedState(Parcelable paramParcelable)
  {
    super(paramParcelable);
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    super.writeToParcel(paramParcel, paramInt);
    paramParcel.writeInt(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\yuku\ambilwarna\widget\AmbilWarnaPreference$SavedState.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */