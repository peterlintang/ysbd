package com.tencent.mm.sdk.platformtools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import java.util.LinkedList;
import java.util.List;

public class LBSManager
  extends BroadcastReceiver
{
  private static a e;
  boolean a;
  boolean b;
  boolean c;
  int d;
  private b f;
  private Context g;
  private e h;
  
  private String a()
  {
    Object localObject = (WifiManager)this.g.getSystemService("wifi");
    if (localObject == null)
    {
      c.a("MicroMsg.LBSManager", "no wifi service");
      return "";
    }
    if (((WifiManager)localObject).getConnectionInfo() == null)
    {
      c.a("MicroMsg.LBSManager", "WIFILocation wifi info null");
      return "";
    }
    LinkedList localLinkedList = new LinkedList();
    localObject = ((WifiManager)localObject).getScanResults();
    if (localObject != null)
    {
      int i = 0;
      while (i < ((List)localObject).size())
      {
        localLinkedList.add(new i(((ScanResult)((List)localObject).get(i)).BSSID, ((ScanResult)((List)localObject).get(i)).level));
        i += 1;
      }
    }
    return g.a(localLinkedList);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    paramContext = (Location)paramIntent.getExtras().get("location");
    this.d += 1;
    boolean bool;
    int i;
    if (paramContext != null)
    {
      bool = "gps".equals(paramContext.getProvider());
      if (((bool) && (paramContext.getAccuracy() <= 200.0F)) || ((!bool) && (paramContext.getAccuracy() <= 1000.0F) && (paramContext.getAccuracy() > 0.0F)))
      {
        if (!bool) {
          break label382;
        }
        i = 0;
        float f1 = (float)paramContext.getLatitude();
        float f2 = (float)paramContext.getLongitude();
        int j = (int)paramContext.getAccuracy();
        if (j != 0)
        {
          c.d("MicroMsg.LBSManager", "setLocationCache [" + f1 + "," + f2 + "] acc:" + j + " source:" + i);
          if (e == null) {
            e = new a();
          }
          e.a = f1;
          e.b = f2;
          e.c = j;
          e.d = System.currentTimeMillis();
          e.e = i;
        }
        if ((this.f != null) && ((!this.a) || (!this.b) || (!this.c)))
        {
          o.a(a());
          o.a(g.b(g.a(this.g)));
          if (this.a) {
            break label388;
          }
          this.h.a();
          this.a = true;
          this.a = true;
          c.d("MicroMsg.LBSManager", "location by provider ok:[" + paramContext.getLatitude() + " , " + paramContext.getLongitude() + "]  accuracy:" + paramContext.getAccuracy() + "  retry count:" + this.d + " isGpsProvider:" + bool);
          paramIntent = this.f;
          paramContext.getLatitude();
          paramContext.getLongitude();
          paramContext.getAccuracy();
        }
      }
    }
    label382:
    label388:
    do
    {
      return;
      i = 1;
      break;
      if ((!this.b) && (i == 0))
      {
        this.b = true;
        c.d("MicroMsg.LBSManager", "report location by GPS ok:[" + paramContext.getLatitude() + " , " + paramContext.getLongitude() + "]  accuracy:" + paramContext.getAccuracy() + "  retry count:" + this.d + " isGpsProvider:" + bool);
        paramIntent = this.f;
        paramContext.getLatitude();
        paramContext.getLongitude();
        paramContext.getAccuracy();
        return;
      }
    } while ((this.c) || (i != 1));
    this.c = true;
    c.d("MicroMsg.LBSManager", "report location by Network ok:[" + paramContext.getLatitude() + " , " + paramContext.getLongitude() + "]  accuracy:" + paramContext.getAccuracy() + "  retry count:" + this.d + " isGpsProvider:" + bool);
    paramIntent = this.f;
    paramContext.getLatitude();
    paramContext.getLongitude();
    paramContext.getAccuracy();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\LBSManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */