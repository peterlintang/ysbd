package com.ireadercity.b2.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import com.ireadercity.b2.a;

final class gi
  extends BroadcastReceiver
{
  gi(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void onReceive(Context paramContext, Intent paramIntent)
  {
    int j = 2130837525;
    if (!a.Y) {}
    while (!paramIntent.getAction().equals("android.intent.action.BATTERY_CHANGED")) {
      return;
    }
    int k = paramIntent.getIntExtra("level", 0);
    int m = paramIntent.getIntExtra("scale", 100);
    new StringBuilder("battery_info   ").append(k).append(m).toString();
    int i = j;
    switch (Math.round(k * 100 / m / 20.0F))
    {
    default: 
      i = j;
    }
    for (;;)
    {
      ShowContentScrollUpAndDown.a(this.a).setImageResource(i);
      return;
      i = 2130837522;
      continue;
      i = 2130837523;
      continue;
      i = 2130837524;
      continue;
      i = 2130837526;
      continue;
      i = 2130837527;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\gi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */