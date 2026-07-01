package com.tencent.mm.sdk.platformtools;

import android.content.Context;
import android.telephony.NeighboringCellInfo;
import android.telephony.PhoneStateListener;
import android.telephony.TelephonyManager;
import android.telephony.gsm.GsmCellLocation;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

final class j
{
  private static int a = 10000;
  private static int b = 10000;
  private TelephonyManager c;
  private PhoneStateListener d = new k(this);
  
  public static List<h> a(Context paramContext)
  {
    LinkedList localLinkedList = new LinkedList();
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    Object localObject3 = localTelephonyManager.getNetworkOperator();
    if ((localObject3 == null) || (((String)localObject3).equals(""))) {
      return localLinkedList;
    }
    paramContext = "460";
    Object localObject1 = "";
    for (;;)
    {
      try
      {
        localObject2 = ((String)localObject3).substring(0, 3);
        paramContext = (Context)localObject2;
        localObject3 = ((String)localObject3).substring(3);
        localObject1 = localObject3;
        paramContext = (Context)localObject2;
      }
      catch (Exception localException1)
      {
        Object localObject2;
        localException1.printStackTrace();
        continue;
        String str = b;
        continue;
      }
      try
      {
        localObject2 = (GsmCellLocation)localTelephonyManager.getCellLocation();
        if (localObject2 != null)
        {
          int i = ((GsmCellLocation)localObject2).getCid();
          int j = ((GsmCellLocation)localObject2).getLac();
          if ((j < 65535) && (j != -1) && (i != -1))
          {
            if (b != a) {
              continue;
            }
            localObject2 = "";
            localLinkedList.add(new h(paramContext, (String)localObject1, String.valueOf(j), String.valueOf(i), (String)localObject2, "gsm", "", "", ""));
          }
        }
      }
      catch (Exception localException2)
      {
        localException2.printStackTrace();
      }
    }
    localObject2 = localTelephonyManager.getNeighboringCellInfo();
    if ((localObject2 != null) && (((List)localObject2).size() > 0))
    {
      localObject2 = ((List)localObject2).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        localObject3 = (NeighboringCellInfo)((Iterator)localObject2).next();
        if (((NeighboringCellInfo)localObject3).getCid() != -1) {
          localLinkedList.add(new h(paramContext, (String)localObject1, "", ((NeighboringCellInfo)localObject3).getCid(), "", "gsm", "", "", ""));
        }
      }
    }
    return localLinkedList;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\platformtools\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */