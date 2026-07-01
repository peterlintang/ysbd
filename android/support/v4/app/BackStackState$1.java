package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable.Creator;

final class BackStackState$1
  implements Parcelable.Creator<BackStackState>
{
  public final BackStackState createFromParcel(Parcel paramParcel)
  {
    return new BackStackState(paramParcel);
  }
  
  public final BackStackState[] newArray(int paramInt)
  {
    return new BackStackState[paramInt];
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\app\BackStackState$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */