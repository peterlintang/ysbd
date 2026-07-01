package com.umeng.newxp.view.handler.ewall;

import android.content.Context;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.UMEWallPromoter;
import java.util.List;

public class d
{
  ExchangeDataService a;
  Context b;
  
  public d(Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    this.a = paramExchangeDataService;
    this.b = paramContext;
  }
  
  public void a(int paramInt, List<UMEWallPromoter> paramList) {}
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean) {
      this.a.sessionId = "";
    }
    this.a.requestDataAsyn(this.b, new d.1(this, paramBoolean), paramBoolean);
  }
  
  public void b(int paramInt, List<UMEWallPromoter> paramList) {}
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */