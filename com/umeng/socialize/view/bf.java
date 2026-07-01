package com.umeng.socialize.view;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.umeng.socialize.bean.CustomPlatform;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.UMSocialService;
import com.umeng.socialize.controller.listener.SocializeListeners.OnCustomPlatformClickListener;
import com.umeng.socom.Log;

class bf
  implements View.OnClickListener
{
  bf(bc parambc, CustomPlatform paramCustomPlatform) {}
  
  private void a()
  {
    bc.c(this.a).shareEmail(bc.a(this.a));
  }
  
  private void b()
  {
    try
    {
      Object localObject = m.b(bc.a(this.a));
      if ((localObject != null) && (!Boolean.parseBoolean(localObject[0].toString())))
      {
        localObject = new String(localObject[1].toString());
        Toast.makeText(bc.a(this.a), (CharSequence)localObject, 0).show();
        return;
      }
      bc.c(this.a).shareSms(bc.a(this.a));
      m.a(bc.b(this.a));
      return;
    }
    catch (Exception localException)
    {
      Log.b(bc.d(), "check sim error.....", localException);
    }
  }
  
  public void onClick(View paramView)
  {
    if (this.b.clickListener != null)
    {
      paramView = bc.c(this.a).getEntity();
      this.b.clickListener.onClick(this.b, paramView.getShareContent(), paramView.getMedia());
      m.a(bc.b(this.a));
      return;
    }
    if ((!TextUtils.isEmpty(this.b.tag)) && ("com.umeng.socialize.sms".equals(this.b.tag)))
    {
      b();
      return;
    }
    if ((!TextUtils.isEmpty(this.b.tag)) && ("com.umeng.socialize.mail".equals(this.b.tag)))
    {
      a();
      return;
    }
    Log.b(bc.d(), "custom item click but no listener...[" + this.b.showWord + "]");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */