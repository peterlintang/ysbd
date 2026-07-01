package com.ireadercity.b2.ui;

import android.os.PowerManager.WakeLock;
import android.widget.TextView;
import com.ireadercity.b2.a;
import com.ireadercity.b2.h.v;
import com.ireadercity.b2.h.w;
import com.ireadercity.b2.ui.widget.d;
import java.util.ArrayList;

final class ft
  implements d
{
  ft(ShowContentScrollUpAndDown paramShowContentScrollUpAndDown) {}
  
  public final void a()
  {
    ShowContentScrollUpAndDown.r(this.a);
  }
  
  public final void a(String paramString)
  {
    this.a.b(paramString);
  }
  
  public final void b()
  {
    ShowContentScrollUpAndDown.b(this.a, 100.0F);
    if (!w.a()) {
      this.a.c("back");
    }
  }
  
  public final void c()
  {
    ShowContentScrollUpAndDown.b(this.a, 0.0F);
    if (!w.a()) {
      this.a.c("next");
    }
  }
  
  public final void d()
  {
    ShowContentScrollUpAndDown.q(this.a);
    if (a.Y) {
      ShowContentScrollUpAndDown.t(this.a).setText(v.a(ShowContentScrollUpAndDown.s(this.a).size(), ShowContentScrollUpAndDown.c(), ShowContentScrollUpAndDown.o(this.a) / 100.0F));
    }
  }
  
  public final void e()
  {
    if ((this.a.n != null) && (!this.a.n.isHeld())) {
      this.a.n.acquire(a.j);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\ui\ft.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */