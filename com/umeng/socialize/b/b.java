package com.umeng.socialize.b;

import android.location.Location;
import android.os.AsyncTask;
import com.umeng.socom.Log;

public class b
  extends AsyncTask<Void, Void, Location>
{
  private static final String b = "Location";
  private a a;
  
  public b(a parama)
  {
    this.a = parama;
  }
  
  private Location a()
  {
    Location localLocation2 = this.a.b();
    Location localLocation1 = localLocation2;
    if (localLocation2 == null)
    {
      Log.c("Location", "Fetch gps info from default failed,then fetch form network..");
      this.a.a("network");
      localLocation1 = this.a.b();
      this.a.a(null);
    }
    return localLocation1;
  }
  
  protected Location a(Void... paramVarArgs)
  {
    int i = 0;
    if (i >= 10) {}
    for (;;)
    {
      paramVarArgs = null;
      label10:
      return paramVarArgs;
      try
      {
        Location localLocation = a();
        paramVarArgs = localLocation;
        if (localLocation != null) {
          break label10;
        }
        Thread.sleep(500L);
        i += 1;
      }
      catch (InterruptedException paramVarArgs) {}
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */