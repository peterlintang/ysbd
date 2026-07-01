package com.umeng.newxp.view;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.EntryOnClickListener;
import com.umeng.newxp.controller.f;
import com.umeng.newxp.view.common.g;
import com.umeng.newxp.view.handler.b;
import com.umeng.newxp.view.handler.umwall.d.a;
import java.util.ArrayList;
import java.util.List;

class ExchangeViewManager$11$1
  implements View.OnClickListener
{
  List<com.umeng.newxp.common.a> a = new ArrayList();
  
  ExchangeViewManager$11$1(ExchangeViewManager.11 param11) {}
  
  public void onClick(View paramView)
  {
    if (this.a.size() == 0)
    {
      Context localContext = this.b.b.a;
      if (TextUtils.isEmpty(ExchangeViewManager.a(this.b.b).slot_id))
      {
        paramView = c.a(this.b.b.a, ExchangeViewManager.a(this.b.b));
        paramView = f.a(localContext, paramView);
        this.a.addAll(paramView.a(new com.umeng.newxp.common.a[] { f.a }));
      }
    }
    else
    {
      if (ExchangeViewManager.a(this.b.b).module != com.umeng.newxp.a.b) {
        break label238;
      }
    }
    for (;;)
    {
      try
      {
        b.a(this.b.b.a, ExchangeViewManager.a(this.b.b));
        ExchangeViewManager.c(this.b.b);
        if (this.b.b.c != null) {
          this.b.b.c.onClick(ExchangeViewManager.d(this.b.b));
        }
        return;
        paramView = ExchangeViewManager.a(this.b.b).slot_id;
      }
      catch (ActivityNotFoundException paramView)
      {
        b.a(this.b.b.a, ExchangeViewManager.a(this.b.b), this.a, d.a.b);
        continue;
      }
      label238:
      if ((com.umeng.newxp.a.c == ExchangeViewManager.a(this.b.b).module) && (!TextUtils.isEmpty(ExchangeViewManager.a(this.b.b).landingUrl))) {
        new g(this.b.b.a, ExchangeViewManager.a(this.b.b).landingUrl, false).b(false).c(false).a(true).show();
      } else {
        b.a(this.b.b.a, ExchangeViewManager.a(this.b.b), this.a);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$11$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */