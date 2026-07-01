package com.umeng.socialize.c.b;

import android.app.ProgressDialog;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.widget.Toast;
import com.umeng.socialize.common.m;
import com.umeng.socom.Log;

public class a
  implements LocationListener
{
  private static final String e = a.class.getName();
  ProgressDialog a = null;
  public double b = 0.0D;
  public double c = 0.0D;
  public LocationManager d;
  private Context f;
  
  public a(Context paramContext)
  {
    this.f = paramContext;
    Log.LOG = true;
    Log.c(e, "Start...................");
    this.d = ((LocationManager)paramContext.getSystemService("location"));
    if (this.d.isProviderEnabled("gps")) {
      this.d.requestLocationUpdates("gps", 1000L, 0.0F, this);
    }
    for (;;)
    {
      this.a = new ProgressDialog(paramContext);
      this.a.setMessage("Loading...");
      this.a.setIndeterminate(true);
      this.a.setCancelable(true);
      m.a(this.a, false);
      return;
      Toast.makeText(paramContext, "Gps电源关闭，无法通过Gps获取位置。", 0).show();
    }
  }
  
  protected void a(String paramString)
  {
    m.a(this.a);
    Toast.makeText(this.f, "LATITUDE :" + this.b + " LONGITUDE :" + this.c, 1).show();
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    Log.c(e, "lati:" + paramLocation.getLatitude() + "   longi:" + paramLocation.getLongitude());
  }
  
  public void onProviderDisabled(String paramString)
  {
    Log.a(e, "OnProviderDisabled");
  }
  
  public void onProviderEnabled(String paramString)
  {
    Log.a(e, "onProviderEnabled");
  }
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle)
  {
    Log.a(e, "onStatusChanged");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\c\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */