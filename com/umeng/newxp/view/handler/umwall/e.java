package com.umeng.newxp.view.handler.umwall;

import android.content.Context;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.d;
import java.util.List;

public class e
{
  ExchangeDataService b;
  a c;
  Context d;
  
  public e(Context paramContext, ExchangeDataService paramExchangeDataService, a parama)
  {
    this.b = paramExchangeDataService;
    this.d = paramContext;
    this.c = parama;
  }
  
  public ExchangeDataService a()
  {
    return this.b;
  }
  
  public void a(int paramInt, List<Promoter> paramList) {}
  
  public void a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {
      this.b.sessionId = "";
    }
    if ((paramBoolean2) && (this.b.getPreloadData() != null)) {
      this.b.getPreloadData().c();
    }
    this.b.requestDataAsyn(this.d, new e.1(this, paramBoolean1), paramBoolean1);
  }
  
  public a b()
  {
    return this.c;
  }
  
  public void b(int paramInt, List<Promoter> paramList) {}
  
  public Context c()
  {
    return this.d;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */