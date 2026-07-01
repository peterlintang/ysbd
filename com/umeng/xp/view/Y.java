package com.umeng.xp.view;

import com.umeng.common.Log;
import com.umeng.xp.Promoter;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.xp.controller.a;
import java.util.List;

class Y
  implements XpListenersCenter.ExchangeDataRequestListener
{
  Y(X paramX) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt == 0) {
      Log.a(ExchangeConstants.LOG_TAG, "failed to get request data");
    }
    do
    {
      return;
      X.a(this.a, this.a.a(paramList));
      X.a(this.a, new a(X.a(this.a)));
    } while ((X.a(this.a) == null) || (X.a(this.a).size() == 0));
    this.a.a(this.a.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\Y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */