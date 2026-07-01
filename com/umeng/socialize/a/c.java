package com.umeng.socialize.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.umeng.socialize.bean.SHARE_MEDIA;

public class c
{
  private static final String a = "socialize_identity_info";
  private static final String b = "socialize_identity_unshow";
  
  public static void a(Context paramContext)
  {
    try
    {
      paramContext = paramContext.getSharedPreferences("umeng_socialize", 2).edit();
      paramContext.remove("socialize_identity_info");
      paramContext.commit();
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static void a(Context paramContext, String paramString)
  {
    try
    {
      SharedPreferences.Editor localEditor = paramContext.getSharedPreferences("umeng_socialize", 2).edit();
      localEditor.putString("socialize_identity_info", paramString);
      localEditor.commit();
      if ((e(paramContext)) && (!TextUtils.isEmpty(paramString))) {
        a(paramContext, false);
      }
      return;
    }
    finally
    {
      paramContext = finally;
      throw paramContext;
    }
  }
  
  public static void a(Context arg0, boolean paramBoolean)
  {
    synchronized (???.getSharedPreferences("umeng_socialize", 1))
    {
      SharedPreferences.Editor localEditor = ???.edit();
      localEditor.putBoolean("socialize_identity_unshow", paramBoolean);
      localEditor.commit();
      return;
    }
  }
  
  public static SHARE_MEDIA b(Context paramContext)
  {
    return SHARE_MEDIA.convertToEmun(paramContext.getSharedPreferences("umeng_socialize", 1).getString("socialize_identity_info", ""));
  }
  
  public static boolean c(Context paramContext)
  {
    return b(paramContext) != null;
  }
  
  public static boolean d(Context paramContext)
  {
    return "custom".equals(paramContext.getSharedPreferences("umeng_socialize", 1).getString("socialize_identity_info", ""));
  }
  
  public static boolean e(Context paramContext)
  {
    boolean bool2 = c(paramContext);
    boolean bool1 = bool2;
    if (!bool2) {
      bool1 = paramContext.getSharedPreferences("umeng_socialize", 1).getBoolean("socialize_identity_unshow", false);
    }
    return bool1;
  }
  
  public static boolean f(Context paramContext)
  {
    boolean bool = c(paramContext);
    if (bool) {}
    while (bool)
    {
      return bool;
      bool = e(paramContext);
    }
    return d(paramContext);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */