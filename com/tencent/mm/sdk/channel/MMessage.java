package com.tencent.mm.sdk.channel;

import android.content.Context;
import android.content.Intent;

public final class MMessage
{
  public static void a(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    paramString1 = paramString1 + ".permission.MM_MESSAGE";
    paramString2 = new Intent(paramString2);
    String str = paramContext.getPackageName();
    paramString2.putExtra("_mmessage_sdkVersion", 553910273);
    paramString2.putExtra("_mmessage_appPackage", str);
    paramString2.putExtra("_mmessage_content", paramString3);
    paramString2.putExtra("_mmessage_checksum", c.a(paramString3, str));
    paramContext.sendBroadcast(paramString2, paramString1);
    com.tencent.mm.sdk.platformtools.c.c("MicroMsg.SDK.MMessage", "send mm message, intent=" + paramString2 + ", perm=" + paramString1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\channel\MMessage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */