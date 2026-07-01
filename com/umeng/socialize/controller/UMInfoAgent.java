package com.umeng.socialize.controller;

import android.content.Context;
import com.umeng.socialize.a.c;
import com.umeng.socialize.a.d;
import com.umeng.socialize.bean.SHARE_MEDIA;

public class UMInfoAgent
{
  public static boolean isLogin(Context paramContext)
  {
    return c.c(paramContext);
  }
  
  public static boolean isOauthed(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    return d.a(paramContext, paramSHARE_MEDIA);
  }
  
  public static void removeOauth(Context paramContext, SHARE_MEDIA paramSHARE_MEDIA)
  {
    d.d(paramContext, paramSHARE_MEDIA);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\UMInfoAgent.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */