package com.umeng.socialize.controller.a;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.controller.listener.SocializeListeners.LoginListener;
import com.umeng.socialize.view.cl;

class m
  extends SocializeListeners.LoginListener
{
  m(b paramb, cl paramcl, Context paramContext) {}
  
  public void loginFailed(int paramInt)
  {
    String str = this.c.getResources().getString(com.umeng.socialize.common.b.a(this.c, b.a.e, "umeng_socialize_tip_loginfailed"));
    Toast.makeText(this.c, str, 0).show();
  }
  
  public void loginSuccessed(SHARE_MEDIA paramSHARE_MEDIA, boolean paramBoolean)
  {
    this.b.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */