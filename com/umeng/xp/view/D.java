package com.umeng.xp.view;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import com.umeng.common.b.g;
import com.umeng.common.net.i;
import com.umeng.xp.Promoter;
import com.umeng.xp.a.b;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.controller.XpListenersCenter.ExchangeDataRequestListener;
import java.util.List;

class D
  implements XpListenersCenter.ExchangeDataRequestListener
{
  D(ExchangeViewManager paramExchangeViewManager, ViewGroup paramViewGroup) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    paramList = new ImageView(this.b.c);
    paramList.setImageResource(b.t(this.b.c));
    paramList.setOnClickListener(new E(this));
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-2, -2);
    localLayoutParams.addRule(12);
    this.a.addView(paramList, localLayoutParams);
    if (!g.c(ExchangeViewManager.a(this.b).landing_image)) {
      i.a(this.b.c, paramList, ExchangeViewManager.a(this.b).landing_image, false);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\D.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */