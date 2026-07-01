package com.umeng.newxp.view.handler;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.view.common.e;
import java.util.List;

class c$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  c$1(c paramc) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt == 0) {}
    do
    {
      return;
      c.a(this.a, com.umeng.newxp.common.c.a(null, paramList));
      c.a(this.a);
    } while (this.a.a == null);
    this.a.a.b();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\c$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */