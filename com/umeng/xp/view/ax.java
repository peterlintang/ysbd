package com.umeng.xp.view;

import com.umeng.xp.Promoter;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.xp.controller.a;
import com.umeng.xp.controller.g;
import java.util.List;

class ax
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ax(aw paramaw) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt == 0) {
      paramList = ExchangeConstants.LOG_TAG;
    }
    do
    {
      do
      {
        return;
        aw.a(this.a, new a(paramList));
        aw.a(this.a, paramList);
      } while ((aw.a(this.a) == null) || (aw.a(this.a).size() == 0));
      this.a.b();
    } while (paramList.size() <= 1);
    new g(this.a).start();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */