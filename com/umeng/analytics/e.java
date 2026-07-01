package com.umeng.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.umeng.common.Log;

class e
{
  public static String a(Context paramContext)
  {
    if (paramContext.getPackageManager().checkPermission("android.permission.ACCESS_NETWORK_STATE", paramContext.getPackageName()) != 0) {
      return null;
    }
    try
    {
      paramContext = ((ConnectivityManager)paramContext.getSystemService("connectivity")).getActiveNetworkInfo();
      if (paramContext == null) {
        return null;
      }
      if (paramContext.getType() == 1) {
        return null;
      }
      paramContext = paramContext.getExtraInfo();
      Log.a("TAG", "net type:" + paramContext);
      if (paramContext == null) {
        return null;
      }
      if ((paramContext.equals("cmwap")) || (paramContext.equals("3gwap")) || (paramContext.equals("uniwap"))) {
        return "10.0.0.172";
      }
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\analytics\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */