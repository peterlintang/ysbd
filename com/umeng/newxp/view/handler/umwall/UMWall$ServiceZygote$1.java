package com.umeng.newxp.view.handler.umwall;

import android.text.TextUtils;
import com.umeng.newxp.b;
import com.umeng.newxp.c;
import com.umeng.newxp.controller.ExchangeDataService;

class UMWall$ServiceZygote$1
  extends ExchangeDataService
{
  UMWall$ServiceZygote$1(UMWall.ServiceZygote paramServiceZygote, String paramString, b paramb, c paramc)
  {
    super(paramString);
  }
  
  protected void preparedAsync()
  {
    this.resType = this.g;
    this.template = this.h;
    if (TextUtils.isEmpty(this.psid)) {}
    for (String str = this.i.c;; str = this.psid)
    {
      this.psid = str;
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWall$ServiceZygote$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */