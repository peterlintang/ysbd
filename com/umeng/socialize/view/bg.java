package com.umeng.socialize.view;

import android.text.TextUtils;
import android.widget.Toast;
import com.umeng.socialize.bean.SHARE_MEDIA;
import com.umeng.socialize.common.m;
import com.umeng.socialize.controller.listener.SocializeListeners.DirectShareListener;

class bg
  implements SocializeListeners.DirectShareListener
{
  bg(bc parambc) {}
  
  public void onAuthenticated(SHARE_MEDIA paramSHARE_MEDIA)
  {
    m.a(bc.b(this.a));
  }
  
  public void onOauthComplete(String paramString, SHARE_MEDIA paramSHARE_MEDIA)
  {
    if (!TextUtils.isEmpty(paramString))
    {
      m.a(bc.b(this.a));
      return;
    }
    Toast.makeText(bc.a(this.a), "授权失败,请重试！", 1).show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */