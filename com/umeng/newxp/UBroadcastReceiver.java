package com.umeng.newxp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

public class UBroadcastReceiver
  extends BroadcastReceiver
{
  public void onDismiss() {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    switch (paramIntent.getExtras().getInt("boradcast_action_key", -1))
    {
    default: 
      return;
    case 17: 
      onShow();
      return;
    }
    onDismiss();
  }
  
  public void onShow() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\UBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */