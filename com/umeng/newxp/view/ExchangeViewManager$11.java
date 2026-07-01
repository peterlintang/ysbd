package com.umeng.newxp.view;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a;
import com.umeng.newxp.common.c;
import com.umeng.newxp.common.c.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.NTipsChangedListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.net.m.b;
import java.util.List;

class ExchangeViewManager$11
  implements c.a
{
  ExchangeViewManager$11(ExchangeViewManager paramExchangeViewManager, XpListenersCenter.NTipsChangedListener paramNTipsChangedListener) {}
  
  private View.OnClickListener a()
  {
    return new ExchangeViewManager.11.1(this);
  }
  
  private void b()
  {
    m localm = new m.b(this.b.a).a(14).b(0).d(3).c(ExchangeViewManager.a(this.b).layoutType).g(ExchangeViewManager.a(this.b).getTimeConsuming()).f(c.a(this.b.a, ExchangeViewManager.a(this.b))).a(ExchangeViewManager.a(this.b).slot_id).b(ExchangeViewManager.a(this.b).module.toString()).a(ExchangeViewManager.a(this.b).sessionId, ExchangeViewManager.a(this.b).psid).a();
    new XpReportClient(this.b.a).sendAsync(localm, null);
  }
  
  public void a(int paramInt, List<Promoter> paramList)
  {
    if ((a.c != ExchangeViewManager.a(this.b).module) || (TextUtils.isEmpty(ExchangeViewManager.a(this.b).landingUrl)))
    {
      ExchangeViewManager.a(this.b).preloadData(this.b.a, paramList, this.a, 7);
      if ((paramInt == 1) && (paramList != null) && (paramList.size() > 0))
      {
        ExchangeViewManager.h(this.b).setVisibility(0);
        ExchangeViewManager.h(this.b).setClickable(true);
      }
    }
    for (;;)
    {
      if (ExchangeViewManager.i(this.b) != null) {
        ExchangeViewManager.i(this.b).setText(ExchangeViewManager.a(this.b).entryStr);
      }
      ExchangeViewManager.h(this.b).setOnClickListener(a());
      if ((ExchangeViewManager.d(this.b).getDrawable() != null) && (ExchangeViewManager.h(this.b).getVisibility() == 0) && (7 == ExchangeViewManager.a(this.b).layoutType)) {
        b();
      }
      return;
      ExchangeViewManager.h(this.b).setVisibility(4);
      ExchangeViewManager.h(this.b).setClickable(false);
      continue;
      if (paramInt == 1)
      {
        ExchangeViewManager.h(this.b).setVisibility(0);
        ExchangeViewManager.h(this.b).setClickable(true);
      }
      else
      {
        ExchangeViewManager.h(this.b).setVisibility(4);
        ExchangeViewManager.h(this.b).setClickable(false);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */