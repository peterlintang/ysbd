package com.umeng.newxp.view.handler.umwall.holder;

import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.a.a;
import com.umeng.newxp.controller.b;
import com.umeng.newxp.view.handler.UMTuanPromoter;

class d$1
  implements View.OnClickListener
{
  d$1(d paramd, UMTuanPromoter paramUMTuanPromoter, int paramInt, ExchangeDataService paramExchangeDataService) {}
  
  public void onClick(View paramView)
  {
    com.taobao.munion.p4p.statistics.a.a().a(new com.taobao.munion.p4p.statistics.model.a(this.a.promoter));
    b.a(new a.a(this.a, this.b), this.d.b, this.c, true, this.b);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\holder\d$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */