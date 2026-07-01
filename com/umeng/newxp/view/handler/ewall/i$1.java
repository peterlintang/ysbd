package com.umeng.newxp.view.handler.ewall;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.common.fragment.FragmentPageManager;
import com.taobao.munion.ewall.ui.fragments.GoodsDetailFragment;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.handler.UMEWallPromoter;

class i$1
  implements View.OnClickListener
{
  i$1(i parami, UMEWallPromoter paramUMEWallPromoter, int paramInt, ExchangeDataService paramExchangeDataService) {}
  
  public void onClick(View paramView)
  {
    com.taobao.munion.p4p.statistics.a.a().a(new com.taobao.munion.p4p.statistics.model.a(this.a.promoter));
    paramView = new m.a(this.d.e).a(2).b(this.b).d(3).c(this.c.layoutType).a(new Promoter[] { this.a }).g(this.c.getTimeConsuming()).f(c.a(this.d.e, this.c)).a(this.c.slot_id).a(this.c.sessionId, this.c.psid).a();
    new XpReportClient(this.d.e).sendAsync(paramView, null);
    paramView = new Bundle();
    paramView.putString("goods_url", this.a.url);
    paramView.putString("goods_id", this.a.promoter);
    FragmentPageManager.getInstance().pushPage(GoodsDetailFragment.class.getName(), paramView);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\i$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */