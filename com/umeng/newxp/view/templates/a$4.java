package com.umeng.newxp.view.templates;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.a.e;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.b;
import java.util.List;

class a$4
  implements XpListenersCenter.ExchangeDataRequestListener
{
  a$4(a parama) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt != 0) {}
    for (paramList = c.a(a.i(this.a), paramList);; paramList = null)
    {
      if ((paramList != null) && (paramList.size() > 0))
      {
        a.i(this.a).addAll(paramList);
        a.j(this.a).a(paramList);
        paramList = new m.a(a.a(this.a)).a(0).g(a.k(this.a).getTimeConsuming()).b(a.i(this.a).size() - paramList.size()).d(a.l(this.a)).c(7).a((Promoter[])paramList.toArray(new Promoter[0])).f(c.a(a.a(this.a), a.k(this.a))).a(a.k(this.a).slot_id).a(a.k(this.a).sessionId, a.k(this.a).psid).a();
        new XpReportClient(a.a(this.a)).sendAsync(paramList, null);
        paramInt = a.c(this.a).getLastVisiblePosition();
        int i = a.c(this.a).getHeaderViewsCount();
        new Handler().postDelayed(new a.4.1(this, paramInt - i), 150L);
        return;
      }
      Log.c(ExchangeConstants.LOG_TAG, "Failed to request next page.");
      a.c(this.a).setOnScrollListener(null);
      a.f(this.a).clearAnimation();
      a.f(this.a).setVisibility(8);
      if ((a.h(this.a) != null) && ((a.c(this.a).getFirstVisiblePosition() > 0) || (a.c(this.a).getLastVisiblePosition() < a.c(this.a).getCount() - 1)))
      {
        a.h(this.a).setText(e.g(a.a(this.a)));
        a.e(this.a).setClickable(true);
        a.e(this.a).setOnClickListener(new a.4.2(this));
        return;
      }
      a.c(this.a).removeFooterView(a.e(this.a));
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\a$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */