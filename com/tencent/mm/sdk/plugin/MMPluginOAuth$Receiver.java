package com.tencent.mm.sdk.plugin;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.tencent.mm.sdk.platformtools.c;
import java.util.HashMap;
import java.util.Map;

public class MMPluginOAuth$Receiver
  extends BroadcastReceiver
{
  private static final Map<String, MMPluginOAuth> a = new HashMap();
  private final MMPluginOAuth b = null;
  
  public MMPluginOAuth$Receiver()
  {
    this((byte)0);
  }
  
  private MMPluginOAuth$Receiver(byte paramByte) {}
  
  public static void a(String paramString)
  {
    a.remove(paramString);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    c.c("MicroMsg.SDK.MMPluginOAuth", "receive oauth result");
    String str = paramIntent.getStringExtra("com.tencent.mm.sdk.plugin.Intent.REQUEST_TOKEN");
    paramIntent = paramIntent.getStringExtra("com.tencent.mm.sdk.plugin.Intent.ACCESS_TOKEN");
    if (this.b != null) {
      paramContext = this.b;
    }
    for (;;)
    {
      new Handler().post(new b(this, paramContext, paramIntent));
      return;
      paramContext = (MMPluginOAuth)a.get(str);
      if (paramContext == null)
      {
        c.a("MicroMsg.SDK.MMPluginOAuth", "oauth unregistered, request token = " + str);
        return;
      }
      a(MMPluginOAuth.a(paramContext));
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\plugin\MMPluginOAuth$Receiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */