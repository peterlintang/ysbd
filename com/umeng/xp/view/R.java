package com.umeng.xp.view;

import com.umeng.xp.Promoter;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class R
  implements XpListenersCenter.ExchangeDataRequestListener
{
  R(GridTemplate paramGridTemplate) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      GridTemplate.a(this.a, paramList);
      GridTemplate.a(this.a);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\R.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */