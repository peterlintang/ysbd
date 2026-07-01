package com.umeng.xp.view;

import com.umeng.xp.Promoter;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class W
  implements XpListenersCenter.ExchangeDataRequestListener
{
  W(V paramV) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramInt != 0) && (paramList != null))
    {
      GridTemplate.f(this.a.a).addAll(paramList);
      if (paramList.size() > 0) {
        this.a.a.requestNextPage();
      }
    }
    this.a.a.notifyTotalDataChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\W.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */