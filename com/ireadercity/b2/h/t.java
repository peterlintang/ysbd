package com.ireadercity.b2.h;

import android.app.Activity;
import android.content.ContentResolver;
import android.os.Build.VERSION;
import android.provider.Settings.SettingNotFoundException;
import android.provider.Settings.System;

public final class t
{
  public static void a(Activity paramActivity)
  {
    if (Build.VERSION.SDK_INT < 8) {
      return;
    }
    Settings.System.putInt(paramActivity.getContentResolver(), "screen_brightness_mode", 0);
  }
  
  public static boolean a(ContentResolver paramContentResolver)
  {
    boolean bool = true;
    if (Build.VERSION.SDK_INT < 8) {
      return false;
    }
    try
    {
      int i = Settings.System.getInt(paramContentResolver, "screen_brightness_mode");
      if (i == 1) {}
      for (;;)
      {
        return bool;
        bool = false;
      }
      return false;
    }
    catch (Settings.SettingNotFoundException paramContentResolver)
    {
      paramContentResolver.printStackTrace();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */