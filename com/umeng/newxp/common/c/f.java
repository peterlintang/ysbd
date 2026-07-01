package com.umeng.newxp.common.c;

import android.content.Context;
import android.telephony.TelephonyManager;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class f
{
  private static final Pattern a = Pattern.compile("[\\s0-]{0,15}");
  
  public static final String a()
  {
    int i = (int)(System.currentTimeMillis() / 1000L);
    int j = (int)System.nanoTime();
    int k = new Random().nextInt();
    int m = new Random().nextInt();
    byte[] arrayOfByte1 = d.a(i);
    byte[] arrayOfByte2 = d.a(j);
    byte[] arrayOfByte3 = d.a(k);
    byte[] arrayOfByte4 = d.a(m);
    byte[] arrayOfByte5 = new byte[16];
    System.arraycopy(arrayOfByte1, 0, arrayOfByte5, 0, 4);
    System.arraycopy(arrayOfByte2, 0, arrayOfByte5, 4, 4);
    System.arraycopy(arrayOfByte3, 0, arrayOfByte5, 8, 4);
    System.arraycopy(arrayOfByte4, 0, arrayOfByte5, 12, 4);
    return com.umeng.newxp.common.a.a.d.f(arrayOfByte5);
  }
  
  public static String a(Context paramContext)
  {
    localObject2 = null;
    localObject1 = localObject2;
    if (paramContext != null) {}
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null) {
        break label72;
      }
      paramContext = paramContext.getDeviceId();
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        localObject1 = localObject2;
        continue;
        paramContext = null;
      }
    }
    localObject1 = paramContext;
    if ((!i.a((String)localObject1)) && (!a.matcher((CharSequence)localObject1).matches()))
    {
      paramContext = (Context)localObject1;
      if (!((String)localObject1).contains("|")) {}
    }
    else
    {
      paramContext = a();
    }
    return paramContext;
  }
  
  public static String b(Context paramContext)
  {
    localObject2 = null;
    localObject1 = localObject2;
    if (paramContext != null) {}
    try
    {
      paramContext = (TelephonyManager)paramContext.getSystemService("phone");
      if (paramContext == null) {
        break label72;
      }
      paramContext = paramContext.getSubscriberId();
    }
    catch (Exception paramContext)
    {
      for (;;)
      {
        localObject1 = localObject2;
        continue;
        paramContext = null;
      }
    }
    localObject1 = paramContext;
    if ((!i.a((String)localObject1)) && (!a.matcher((CharSequence)localObject1).matches()))
    {
      paramContext = (Context)localObject1;
      if (!((String)localObject1).contains("|")) {}
    }
    else
    {
      paramContext = a();
    }
    return paramContext;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\common\c\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */