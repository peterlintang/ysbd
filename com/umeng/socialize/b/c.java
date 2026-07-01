package com.umeng.socialize.b;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class c
  implements LocationListener
{
  private a a;
  
  public void a(a parama)
  {
    this.a = parama;
  }
  
  public void onLocationChanged(Location paramLocation)
  {
    if (this.a != null)
    {
      this.a.a(paramLocation);
      this.a.c().a(this);
    }
  }
  
  public void onProviderDisabled(String paramString) {}
  
  public void onProviderEnabled(String paramString) {}
  
  public void onStatusChanged(String paramString, int paramInt, Bundle paramBundle) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\b\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */