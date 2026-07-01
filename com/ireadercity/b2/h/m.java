package com.ireadercity.b2.h;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.provider.Settings.Secure;
import android.telephony.TelephonyManager;
import java.security.MessageDigest;
import java.util.UUID;

public final class m
{
  private static String a = "DeviceUtils";
  
  public static String a(Context paramContext)
  {
    Object localObject = null;
    try
    {
      String str1 = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
      localObject = str1;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        localException1.printStackTrace();
      }
    }
    catch (Error localError1)
    {
      for (;;)
      {
        localError1.printStackTrace();
      }
      try
      {
        String str2 = ((WifiManager)paramContext.getSystemService("wifi")).getConnectionInfo().getMacAddress();
        localObject = str2;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          localException2.printStackTrace();
        }
      }
      catch (Error localError2)
      {
        for (;;)
        {
          localError2.printStackTrace();
        }
        try
        {
          paramContext = Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
          if (paramContext == null) {
            break label124;
          }
          return a(paramContext);
        }
        catch (Exception paramContext)
        {
          for (;;)
          {
            paramContext.printStackTrace();
            paramContext = (Context)localObject;
          }
        }
        catch (Error paramContext)
        {
          for (;;)
          {
            paramContext.printStackTrace();
            paramContext = (Context)localObject;
          }
          localObject = paramContext;
          if (paramContext != null) {
            break label147;
          }
          localObject = UUID.randomUUID();
        }
      }
      if (localObject == null) {
        break label85;
      }
      return a((String)localObject);
    }
    if (localObject != null) {
      return a((String)localObject);
    }
    label85:
    label124:
    label147:
    return a((String)localObject);
  }
  
  private static String a(String paramString)
  {
    int i = 0;
    char[] arrayOfChar = new char[16];
    char[] tmp10_8 = arrayOfChar;
    tmp10_8[0] = 48;
    char[] tmp15_10 = tmp10_8;
    tmp15_10[1] = 49;
    char[] tmp20_15 = tmp15_10;
    tmp20_15[2] = 50;
    char[] tmp25_20 = tmp20_15;
    tmp25_20[3] = 51;
    char[] tmp30_25 = tmp25_20;
    tmp30_25[4] = 52;
    char[] tmp35_30 = tmp30_25;
    tmp35_30[5] = 53;
    char[] tmp40_35 = tmp35_30;
    tmp40_35[6] = 54;
    char[] tmp46_40 = tmp40_35;
    tmp46_40[7] = 55;
    char[] tmp52_46 = tmp46_40;
    tmp52_46[8] = 56;
    char[] tmp58_52 = tmp52_46;
    tmp58_52[9] = 57;
    char[] tmp64_58 = tmp58_52;
    tmp64_58[10] = 97;
    char[] tmp70_64 = tmp64_58;
    tmp70_64[11] = 98;
    char[] tmp76_70 = tmp70_64;
    tmp76_70[12] = 99;
    char[] tmp82_76 = tmp76_70;
    tmp82_76[13] = 100;
    char[] tmp88_82 = tmp82_76;
    tmp88_82[14] = 101;
    char[] tmp94_88 = tmp88_82;
    tmp94_88[15] = 102;
    tmp94_88;
    for (;;)
    {
      Object localObject;
      int k;
      int j;
      try
      {
        paramString = paramString.getBytes();
        localObject = MessageDigest.getInstance("MD5");
        ((MessageDigest)localObject).update(paramString);
        paramString = ((MessageDigest)localObject).digest();
        k = paramString.length;
        localObject = new char[k * 2];
        j = 0;
      }
      catch (Exception paramString)
      {
        return null;
      }
      paramString = new String((char[])localObject);
      return paramString;
      while (i < k)
      {
        int m = paramString[i];
        int n = j + 1;
        localObject[j] = arrayOfChar[(m >>> 4 & 0xF)];
        j = n + 1;
        localObject[n] = arrayOfChar[(m & 0xF)];
        i += 1;
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */