package com.umeng.socialize.view;

import android.webkit.WebView;
import com.umeng.socialize.bean.SocializeEntity;
import com.umeng.socialize.controller.listener.SocializeListeners.OauthCallbackListener;
import com.umeng.socialize.controller.listener.SocializeListeners.SocializeClientListener;
import com.umeng.socialize.exception.SocializeException;

class bb
  implements SocializeListeners.SocializeClientListener
{
  bb(at paramat) {}
  
  public void onComplete(int paramInt, SocializeEntity paramSocializeEntity)
  {
    if (paramInt == 200)
    {
      paramSocializeEntity = at.a(this.a, paramSocializeEntity, at.h(this.a));
      at.i(this.a).loadUrl(paramSocializeEntity);
      return;
    }
    if (at.j(this.a) != null) {
      at.j(this.a).onError(new SocializeException("can`t initlized entity.."), at.h(this.a));
    }
    at.i(this.a).loadData("对不起，出错啦！请重试.....", "text/html", "UTF-8");
  }
  
  public void onStart() {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\socialize\view\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */