package com.umeng.newxp.view.common;

import android.text.TextUtils;
import android.webkit.WebView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class WapActivity$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  WapActivity$1(WapActivity paramWapActivity) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramList == null) {
      this.a.finish();
    }
    WapActivity.a(this.a, "http://developer.android.com");
    if (!TextUtils.isEmpty(WapActivity.a(this.a)))
    {
      WapActivity.b(this.a).loadUrl(WapActivity.a(this.a));
      return;
    }
    this.a.finish();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\WapActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */