package com.umeng.newxp.controller;

import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import java.util.List;

class d$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  d$1(d paramd) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    String str = d.f();
    StringBuilder localStringBuilder = new StringBuilder("PreloadData do init without data end..");
    if (paramList == null) {}
    for (paramInt = 0;; paramInt = paramList.size())
    {
      Log.a(str, paramInt);
      if ((paramList != null) && (paramList.size() > 0)) {
        break;
      }
      d.a(this.a, d.a.b);
      return;
    }
    this.a.a(this.a.a.newTips);
    d.a(this.a, paramList, true, 0);
    Log.c(d.f(), this.a.a.oid + "  : init preload data from server...");
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\d$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */