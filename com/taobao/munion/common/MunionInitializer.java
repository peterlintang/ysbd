package com.taobao.munion.common;

import android.app.Application;
import android.content.Context;
import com.taobao.munion.restool.a;
import com.taobao.munion.utils.k;

public class MunionInitializer
{
  private static final int DURATION = 50;
  private static boolean initialized;
  
  public static void existApp() {}
  
  private static void init(Application paramApplication)
  {
    try
    {
      Context localContext = paramApplication.getApplicationContext();
      for (;;)
      {
        if (localContext == null) {
          try
          {
            Thread.sleep(50L);
            localContext = paramApplication.getApplicationContext();
          }
          catch (InterruptedException localInterruptedException)
          {
            for (;;)
            {
              k.b("Wait preparing context");
            }
          }
        }
      }
      MunionConfigManager.getInstance().init(localInterruptedException);
    }
    finally {}
  }
  
  public static void initialize(Application paramApplication)
  {
    if (!initialized)
    {
      a.a(paramApplication);
      init(paramApplication);
      initialized = true;
    }
  }
  
  public static boolean isInitialized()
  {
    return initialized;
  }
  
  public static boolean waitInitTimeOut(long paramLong1, long paramLong2)
  {
    return Math.abs(paramLong2 - paramLong1) > 4000L;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\common\MunionInitializer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */