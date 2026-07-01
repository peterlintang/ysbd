package com.umeng.socialize.view.controller;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.umeng.socom.b;

public class UMBroadcastManager
{
  private static final String a = "entity_changed";
  
  public static String getEntityChangeAction(Context paramContext, String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      return null;
    }
    return b.u(paramContext) + "." + paramString + ".entity_changed";
  }
  
  public static void sendEntityChange(Context paramContext, String paramString)
  {
    paramString = getEntityChangeAction(paramContext, paramString);
    if (!TextUtils.isEmpty(paramString))
    {
      paramContext.sendBroadcast(new Intent(paramString));
      new StringBuilder("send broadcast ").append(paramString).toString();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\UMBroadcastManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */