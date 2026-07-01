package com.tencent.mm.sdk.channel;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.tencent.mm.sdk.platformtools.c;
import java.util.HashMap;
import java.util.Map;

public final class MMessage$Receiver
  extends BroadcastReceiver
{
  public static final Map<String, a> a = new HashMap();
  private final a b = null;
  
  public MMessage$Receiver()
  {
    this((byte)0);
  }
  
  private MMessage$Receiver(byte paramByte) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    c.c("MicroMsg.SDK.MMessage", "receive intent=" + paramIntent);
    if (this.b != null)
    {
      paramContext = this.b;
      c.c("MicroMsg.SDK.MMessage", "mm message self-handled");
    }
    while ((a)a.get(paramIntent.getAction()) == null) {
      return;
    }
    c.c("MicroMsg.SDK.MMessage", "mm message handled");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\tencent\mm\sdk\channel\MMessage$Receiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */