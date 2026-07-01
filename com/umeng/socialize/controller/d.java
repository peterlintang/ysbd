package com.umeng.socialize.controller;

import android.content.Context;
import android.widget.Toast;
import com.umeng.socialize.bean.APP_PLATFORM;
import com.umeng.socialize.bean.CustomPlatform;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.listener.SocializeListeners.OnCustomPlatformClickListener;
import com.umeng.socialize.media.UMediaObject;

class d
  implements SocializeListeners.OnCustomPlatformClickListener
{
  d(Context paramContext, String paramString) {}
  
  public void onClick(CustomPlatform paramCustomPlatform, String paramString, UMediaObject paramUMediaObject)
  {
    paramCustomPlatform = a.a(this.a, paramString, paramUMediaObject);
    paramCustomPlatform = a.a(this.a, APP_PLATFORM.FACEBOOK, paramCustomPlatform);
    if (paramCustomPlatform != null)
    {
      this.a.startActivity(paramCustomPlatform);
      m.a(this.a, this.b, paramString, paramUMediaObject, "facebook");
      return;
    }
    Toast.makeText(this.a, "啊哦，找不到Facebook客户端。", 0).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\controller\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */