package android.support.v4.net;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;

class ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl
  implements ConnectivityManagerCompat.ConnectivityManagerCompatImpl
{
  public boolean isActiveNetworkMetered(ConnectivityManager paramConnectivityManager)
  {
    paramConnectivityManager = paramConnectivityManager.getActiveNetworkInfo();
    if (paramConnectivityManager == null) {
      return true;
    }
    switch (paramConnectivityManager.getType())
    {
    case 0: 
    default: 
      return true;
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\android\support\v4\net\ConnectivityManagerCompat$BaseConnectivityManagerCompatImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */