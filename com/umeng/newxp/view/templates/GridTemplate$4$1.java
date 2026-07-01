package com.umeng.newxp.view.templates;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class GridTemplate$4$1
  implements XpListenersCenter.ExchangeDataRequestListener
{
  GridTemplate$4$1(GridTemplate.4 param4) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramInt != 0) && (paramList != null))
    {
      GridTemplate.e(this.a.a).addAll(paramList);
      if (paramList.size() > 0) {
        this.a.a.requestNextPage();
      }
    }
    this.a.a.notifyTotalDataChanged();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\GridTemplate$4$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */