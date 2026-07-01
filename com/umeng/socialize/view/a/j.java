package com.umeng.socialize.view.a;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;

class j
  implements View.OnClickListener
{
  j(h paramh, Handler paramHandler, SocializeListeners.SocializeClientListener paramSocializeClientListener) {}
  
  public void onClick(View paramView)
  {
    if ((com.umeng.socom.b.a(this.a.getContext(), "android.permission.ACCESS_NETWORK_STATE")) && (!com.umeng.socom.b.m(this.a.getContext())))
    {
      Toast.makeText(this.a.getContext(), this.a.getContext().getResources().getString(com.umeng.socialize.common.b.a(this.a.getContext(), b.a.e, "umeng_socialize_network_break_alert")), 1).show();
      return;
    }
    this.b.post(new k(this, this.c));
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\a\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */