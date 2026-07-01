package com.umeng.socialize.view.wigets;

import android.os.Handler;
import android.os.SystemClock;

class SwitchButton$a
  extends c
{
  private final float k = 400.0F;
  
  private SwitchButton$a(SwitchButton paramSwitchButton) {}
  
  protected void a(float paramFloat)
  {
    SwitchButton.a(this.j, paramFloat);
    SwitchButton.c(this.j, SwitchButton.b(this.j, SwitchButton.e(this.j)));
    this.j.invalidate();
  }
  
  protected void b()
  {
    if (this.c)
    {
      c();
      if (this.f > SwitchButton.f(this.j)) {
        break label59;
      }
      this.c = false;
      this.f = SwitchButton.f(this.j);
      SwitchButton.c(this.j, true);
    }
    for (;;)
    {
      a(this.f);
      return;
      label59:
      if (this.f >= SwitchButton.g(this.j))
      {
        this.c = false;
        this.f = SwitchButton.g(this.j);
        SwitchButton.c(this.j, false);
      }
      else
      {
        this.i += 16L;
        this.d.sendMessageAtTime(this.d.obtainMessage(1000), this.i);
      }
    }
  }
  
  public void b(boolean paramBoolean)
  {
    long l = SystemClock.uptimeMillis();
    this.e = ((float)l);
    if (paramBoolean) {}
    for (float f = -400.0F;; f = 400.0F)
    {
      this.g = f;
      this.f = SwitchButton.e(this.j);
      this.i = (l + 16L);
      this.c = true;
      this.d.removeMessages(1000);
      this.d.sendMessageAtTime(this.d.obtainMessage(1000), this.i);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\wigets\SwitchButton$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */