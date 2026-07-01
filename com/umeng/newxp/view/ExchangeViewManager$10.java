package com.umeng.newxp.view;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.TextView;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.c.a;
import com.umeng.newxp.controller.ExchangeDataService;
import java.util.List;

class ExchangeViewManager$10
  implements c.a
{
  ExchangeViewManager$10(ExchangeViewManager paramExchangeViewManager, View.OnClickListener paramOnClickListener) {}
  
  public void a(int paramInt, List<Promoter> paramList)
  {
    if ((paramInt == 1) && (paramList != null) && (paramList.size() > 0))
    {
      ExchangeViewManager.h(this.b).setVisibility(0);
      ExchangeViewManager.h(this.b).setClickable(true);
    }
    for (;;)
    {
      ExchangeViewManager.h(this.b).setOnClickListener(this.a);
      if (ExchangeViewManager.i(this.b) != null) {
        ExchangeViewManager.i(this.b).setText(ExchangeViewManager.a(this.b).entryStr);
      }
      return;
      ExchangeViewManager.h(this.b).setVisibility(4);
      ExchangeViewManager.h(this.b).setClickable(false);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */