package com.umeng.socialize.view.a;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.view.controller.d;
import com.umeng.socialize.view.wigets.SwitchButton;

class aj
  implements CompoundButton.OnCheckedChangeListener
{
  aj(ag paramag, SwitchButton paramSwitchButton, n paramn) {}
  
  private void a(n paramn, SwitchButton paramSwitchButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      paramSwitchButton.a = true;
      ag.a(this.a).b(paramn, new ak(this, paramSwitchButton));
      return;
    }
    paramSwitchButton.a = true;
    ag.g(this.a).a(paramn, 3);
  }
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (!this.b.a) {
      a(this.c, this.b, paramBoolean);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */