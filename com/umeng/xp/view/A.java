package com.umeng.xp.view;

import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.umeng.common.Log;
import com.umeng.xp.Promoter;
import com.umeng.xp.a.e;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.common.g;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.xp.net.XpReportClient;
import com.umeng.xp.net.e.a;
import java.util.List;

class A
  implements XpListenersCenter.ExchangeDataRequestListener
{
  A(w paramw) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt != 0) {}
    for (paramList = g.a(w.i(this.a), paramList);; paramList = null)
    {
      if ((paramList != null) && (paramList.size() > 0))
      {
        w.i(this.a).addAll(paramList);
        w.j(this.a).a(paramList);
        paramList = new e.a(w.a(this.a)).a(0).c(w.k(this.a).getTimeConsuming()).b(w.i(this.a).size() - paramList.size()).d(w.l(this.a)).c(7).a((Promoter[])paramList.toArray(new Promoter[0])).a(w.k(this.a).slot_id).b(w.k(this.a).sessionId).a();
        new XpReportClient(w.a(this.a)).sendAsync(paramList, null);
        paramInt = w.c(this.a).getLastVisiblePosition();
        int i = w.c(this.a).getHeaderViewsCount();
        new Handler().postDelayed(new B(this, paramInt - i), 150L);
        return;
      }
      Log.c(ExchangeConstants.LOG_TAG, "Failed to request next page.");
      w.c(this.a).setOnScrollListener(null);
      w.f(this.a).clearAnimation();
      w.f(this.a).setVisibility(8);
      if ((w.h(this.a) != null) && ((w.c(this.a).getFirstVisiblePosition() > 0) || (w.c(this.a).getLastVisiblePosition() < w.c(this.a).getCount() - 1)))
      {
        w.h(this.a).setText(e.g(w.a(this.a)));
        w.e(this.a).setClickable(true);
        w.e(this.a).setOnClickListener(new C(this));
        return;
      }
      w.c(this.a).removeFooterView(w.e(this.a));
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\A.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */