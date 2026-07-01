package com.tencent.mm.sdk.channel;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public final class b
{
  public static boolean a(Context paramContext, String paramString1, String paramString2, String paramString3, Bundle paramBundle)
  {
    if ((paramContext == null) || (paramString1 == null) || (paramString1.length() == 0) || (paramString2 == null) || (paramString2.length() == 0))
    {
      com.tencent.mm.sdk.platformtools.c.a("MicroMsg.SDK.MMessageAct", "send fail, invalid arguments");
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(paramString1, paramString2);
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    paramString1 = paramContext.getPackageName();
    localIntent.putExtra("_mmessage_sdkVersion", 553910273);
    localIntent.putExtra("_mmessage_appPackage", paramString1);
    localIntent.putExtra("_mmessage_content", paramString3);
    localIntent.putExtra("_mmessage_checksum", c.a(paramString3, paramString1));
    localIntent.addFlags(268435456).addFlags(134217728);
    try
    {
      paramContext.startActivity(localIntent);
      com.tencent.mm.sdk.platformtools.c.c("MicroMsg.SDK.MMessageAct", "send mm message, intent=" + localIntent);
      return true;
    }
    catch (ActivityNotFoundException paramContext)
    {
      com.tencent.mm.sdk.platformtools.c.a("MicroMsg.SDK.MMessageAct", "send fail, target ActivityNotFound");
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\channel\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */