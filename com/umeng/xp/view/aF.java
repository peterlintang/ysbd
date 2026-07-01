package com.umeng.xp.view;

import android.text.TextUtils;
import android.webkit.WebView;
import com.umeng.xp.Promoter;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class aF
  implements XpListenersCenter.ExchangeDataRequestListener
{
  aF(aE paramaE) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramList == null) {
      this.a.finish();
    }
    aE.a(this.a, "http://developer.android.com");
    if (!TextUtils.isEmpty(aE.a(this.a)))
    {
      aE.b(this.a).loadUrl(aE.a(this.a));
      return;
    }
    this.a.finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aF.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */