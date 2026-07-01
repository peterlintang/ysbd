package com.taobao.munion.ewall.ui.fragments;

import com.taobao.munion.oauth.a;
import com.taobao.munion.webview.b;

class OauthFragment$1
  implements b
{
  OauthFragment$1(OauthFragment paramOauthFragment) {}
  
  public boolean doFilter(String paramString)
  {
    if (OauthFragment.access$000(this.this$0).c(paramString))
    {
      OauthFragment.access$100(this.this$0, paramString);
      return true;
    }
    return false;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\OauthFragment$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */