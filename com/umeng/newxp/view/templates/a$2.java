package com.umeng.newxp.view.templates;

import com.umeng.newxp.Promoter;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class a$2
  implements XpListenersCenter.ExchangeDataRequestListener
{
  a$2(a parama) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if ((paramList != null) && (paramList.size() > 0))
    {
      a.a(this.a, paramList);
      a.b(this.a);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\a$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */