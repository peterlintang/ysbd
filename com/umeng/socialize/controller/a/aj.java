package com.umeng.socialize.controller.a;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.b;
import com.umeng.socialize.common.b.a;
import com.umeng.socialize.controller.listener.SocializeListeners.LoginListener;

class aj
  extends SocializeListeners.LoginListener
{
  aj(aa paramaa, Context paramContext, Intent paramIntent) {}
  
  public void loginFailed(int paramInt)
  {
    String str = this.b.getResources().getString(b.a(this.b, b.a.e, "umeng_socialize_tip_loginfailed"));
    Toast.makeText(this.b, str, 0).show();
  }
  
  public void loginSuccessed(SHARE_MEDIA paramSHARE_MEDIA, boolean paramBoolean)
  {
    this.b.startActivity(this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\a\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */