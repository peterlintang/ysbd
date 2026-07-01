package com.umeng.newxp.view.handler.utils;

import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.VmPolicy.Builder;
import com.umeng.newxp.view.handler.umwall.UMWallFragment;

public class f
{
  public static void a()
  {
    if (c())
    {
      StrictMode.ThreadPolicy.Builder localBuilder = new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog();
      StrictMode.VmPolicy.Builder localBuilder1 = new StrictMode.VmPolicy.Builder().detectAll().penaltyLog();
      if (d())
      {
        localBuilder.penaltyFlashScreen();
        localBuilder1.setClassInstanceLimit(UMWallFragment.class, 1);
      }
      StrictMode.setThreadPolicy(localBuilder.build());
      StrictMode.setVmPolicy(localBuilder1.build());
    }
  }
  
  public static boolean b()
  {
    return Build.VERSION.SDK_INT >= 8;
  }
  
  public static boolean c()
  {
    return Build.VERSION.SDK_INT >= 9;
  }
  
  public static boolean d()
  {
    return Build.VERSION.SDK_INT >= 11;
  }
  
  public static boolean e()
  {
    return Build.VERSION.SDK_INT >= 12;
  }
  
  public static boolean f()
  {
    return Build.VERSION.SDK_INT >= 16;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\utils\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */