package com.umeng.socialize.b;

import android.location.LocationListener;
import android.location.LocationManager;

class e
  implements Runnable
{
  e(d paramd, String paramString, long paramLong, float paramFloat, LocationListener paramLocationListener) {}
  
  public void run()
  {
    this.a.a.requestLocationUpdates(this.b, this.c, this.d, this.e);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */