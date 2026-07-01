package com.umeng.socialize.view.controller;

import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.bean.n;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socom.net.o.a;

class g
  implements SocializeListeners.SocializeClientListener
{
  g(d paramd, d.a parama, n paramn) {}
  
  public void onComplete(int paramInt, SocializeEntity paramSocializeEntity)
  {
    if (this.b != null)
    {
      if (paramInt != 200) {
        break label45;
      }
      this.c.e = false;
      this.b.a(o.a.a);
    }
    for (;;)
    {
      this.a.a(d.c.b);
      return;
      label45:
      this.b.a(o.a.b);
    }
  }
  
  public void onStart()
  {
    this.a.a(d.c.a);
    if (this.b != null) {
      this.b.a();
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\controller\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */