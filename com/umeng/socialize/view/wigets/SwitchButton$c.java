package com.umeng.socialize.view.wigets;

import android.os.Handler;
import android.os.Message;
import android.widget.CompoundButton.OnCheckedChangeListener;

class SwitchButton$c
  extends Handler
{
  private SwitchButton$c(SwitchButton paramSwitchButton) {}
  
  public void handleMessage(Message paramMessage)
  {
    boolean bool;
    if (paramMessage.what == 1) {
      bool = true;
    }
    while (SwitchButton.a(this.a) != bool)
    {
      SwitchButton.a(this.a, bool);
      if (SwitchButton.b(this.a))
      {
        return;
        bool = false;
      }
      else
      {
        SwitchButton.b(this.a, true);
        if (SwitchButton.c(this.a) != null) {
          SwitchButton.c(this.a).onCheckedChanged(this.a, SwitchButton.a(this.a));
        }
        if (SwitchButton.d(this.a) != null) {
          SwitchButton.d(this.a).onCheckedChanged(this.a, SwitchButton.a(this.a));
        }
        SwitchButton.b(this.a, false);
      }
    }
    super.handleMessage(paramMessage);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\SwitchButton$c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */