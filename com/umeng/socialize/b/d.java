package com.umeng.socialize.b;

import android.app.Activity;
import android.content.Context;
import android.location.Criteria;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import com.umeng.socom.b;

public class d
{
  LocationManager a = null;
  
  public Location a(String paramString)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.getLastKnownLocation(paramString);
  }
  
  public String a(Criteria paramCriteria, boolean paramBoolean)
  {
    if (this.a == null) {
      return null;
    }
    return this.a.getBestProvider(paramCriteria, paramBoolean);
  }
  
  public void a(Activity paramActivity, String paramString, long paramLong, float paramFloat, LocationListener paramLocationListener)
  {
    if (this.a != null) {
      paramActivity.runOnUiThread(new e(this, paramString, paramLong, paramFloat, paramLocationListener));
    }
  }
  
  public void a(Context paramContext)
  {
    if ((b.a(paramContext, "android.permission.ACCESS_FINE_LOCATION")) || (b.a(paramContext, "android.permission.ACCESS_COARSE_LOCATION"))) {
      this.a = ((LocationManager)paramContext.getSystemService("location"));
    }
  }
  
  public void a(LocationListener paramLocationListener)
  {
    if (this.a != null) {
      this.a.removeUpdates(paramLocationListener);
    }
  }
  
  public boolean b(String paramString)
  {
    if (this.a == null) {
      return false;
    }
    return this.a.isProviderEnabled(paramString);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\b\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */