package com.umeng.newxp.view.templates;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class GridTemplate$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  GridTemplate$1(GridTemplate paramGridTemplate) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      GridTemplate.a(this.a, paramList);
      GridTemplate.a(this.a);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\GridTemplate$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */