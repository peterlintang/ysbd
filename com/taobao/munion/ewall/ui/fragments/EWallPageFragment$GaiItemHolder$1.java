package com.taobao.munion.ewall.ui.fragments;

import android.view.View;
import android.view.View.OnClickListener;
import com.taobao.munion.common.MunionConfigManager;
import com.taobao.munion.model.b;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.common.g;
import com.umeng.newxp.view.handler.UMEWallPromoter;

class EWallPageFragment$GaiItemHolder$1
  implements View.OnClickListener
{
  EWallPageFragment$GaiItemHolder$1(EWallPageFragment.GaiItemHolder paramGaiItemHolder, UMEWallPromoter paramUMEWallPromoter, int paramInt, b paramb, com.taobao.munion.model.a parama) {}
  
  public void onClick(View paramView)
  {
    com.taobao.munion.p4p.statistics.a.a().a(new com.taobao.munion.p4p.statistics.model.a(this.val$promoter.promoter));
    paramView = new m.a(this.this$1.mContext).a(2).b(this.val$position).d(3).c(this.this$1.this$0.mParent.sEWallMainBean.f()).a(new Promoter[] { this.val$promoter }).c(this.this$1.this$0.mEWallTabBean.g()).g(this.val$eWallMainBean.c()).f(com.umeng.newxp.common.c.a(MunionConfigManager.getInstance().getContext(), null)).a(this.val$eWallMainBean.a()).a(this.this$1.this$0.mEWallTabBean.h(), this.val$eWallMainBean.e).a();
    new XpReportClient(this.this$1.this$0.getActivity()).sendAsync(paramView, null);
    paramView = new g(this.this$1.mContext, this.val$prom.q, true);
    paramView.a(true);
    paramView.show();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\taobao\munion\ewall\ui\fragments\EWallPageFragment$GaiItemHolder$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */