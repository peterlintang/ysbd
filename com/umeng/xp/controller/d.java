package com.umeng.xp.controller;

import com.umeng.xp.Promoter;
import java.util.List;

class d
  implements XpListenersCenter.ExchangeDataRequestListener
{
  d(c paramc) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    this.a.a.dataReceived(paramInt, paramList);
    if (paramInt == 1) {
      c.a(this.a, this.a.b);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\controller\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */