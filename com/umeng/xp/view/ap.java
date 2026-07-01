package com.umeng.xp.view;

import com.umeng.xp.Promoter;
import com.umeng.xp.common.g;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class ap
  implements XpListenersCenter.ExchangeDataRequestListener
{
  ap(ao paramao) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (this.a.b != null) {
      this.a.b.b();
    }
    if (paramInt == 0) {
      return;
    }
    ao.a(this.a, g.a(null, paramList));
    ao.a(this.a);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */