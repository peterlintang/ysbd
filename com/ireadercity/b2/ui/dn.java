package com.ireadercity.b2.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.ireadercity.b2.a;

final class dn
  extends BroadcastReceiver
{
  dn(BookReadingActivityNew paramBookReadingActivityNew) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    if (!a.Y) {}
    while (!paramIntent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
      return;
    }
    int i = paramIntent.getIntExtra("level", 0);
    int j = paramIntent.getIntExtra("scale", 100);
    new StringBuilder("*******battery_info*******").append(i).append(j).toString();
    float f = i * 100 / j / 20.0F;
    this.a.i = Math.round(f);
    this.a.a(this.a.i);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\dn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */