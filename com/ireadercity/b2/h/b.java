package com.ireadercity.b2.h;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import java.util.Collections;
import java.util.List;

public final class b
{
  public static int a(Context paramContext)
  {
    return PreferenceManager.getDefaultSharedPreferences(paramContext).getInt("shelfsortmethod", 10011);
  }
  
  public static void a(int paramInt, Context paramContext)
  {
    PreferenceManager.getDefaultSharedPreferences(paramContext).edit().putInt("shelfsortmethod", paramInt).commit();
  }
  
  public static void a(List<com.ireadercity.b2.bean.b> paramList, int paramInt)
  {
    Collections.sort(paramList, new a(paramInt));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */