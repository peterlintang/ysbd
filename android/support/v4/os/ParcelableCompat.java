package android.support.v4.os;

import android.os.Build.VERSION;
import android.os.Parcelable.Creator;

public class ParcelableCompat
{
  public static <T> Parcelable.Creator<T> newCreator(ParcelableCompatCreatorCallbacks<T> paramParcelableCompatCreatorCallbacks)
  {
    if (Build.VERSION.SDK_INT >= 13) {
      ParcelableCompatCreatorHoneycombMR2Stub.instantiate(paramParcelableCompatCreatorCallbacks);
    }
    return new ParcelableCompat.CompatCreator(paramParcelableCompatCreatorCallbacks);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\os\ParcelableCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */