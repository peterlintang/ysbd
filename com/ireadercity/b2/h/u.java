package com.ireadercity.b2.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;

public final class u
{
  public static void a(Context paramContext, boolean paramBoolean)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putBoolean("txtselectionenable", paramBoolean).commit();
  }
  
  public static boolean a(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("txtselectionenable", false);
  }
  
  public static void b(Context paramContext, boolean paramBoolean)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putBoolean("statusinfo", paramBoolean).commit();
  }
  
  public static boolean b(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getBoolean("statusinfo", false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */