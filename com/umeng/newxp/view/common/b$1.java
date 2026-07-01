package com.umeng.newxp.view.common;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.net.l;
import com.umeng.newxp.net.m.a;

class b$1
  implements View.OnClickListener
{
  b$1(b paramb, Promoter paramPromoter, int paramInt, ExchangeDataService paramExchangeDataService) {}
  
  private void a(Promoter paramPromoter, int paramInt, ExchangeDataService paramExchangeDataService)
  {
    paramPromoter = Uri.parse(paramPromoter.url);
    if (!com.umeng.common.ufp.b.a(b.b(this.d), "android.permission.CALL_PHONE"))
    {
      Toast.makeText(b.b(this.d), "This App has no call_phone permission!", 0).show();
      return;
    }
    paramPromoter = paramPromoter.getAuthority();
    paramPromoter = new Intent("android.intent.action.CALL", Uri.parse("tel:" + paramPromoter));
    b.b(this.d).startActivity(paramPromoter);
  }
  
  private void b(Promoter paramPromoter, int paramInt, ExchangeDataService paramExchangeDataService)
  {
    int i = b.a(b.b(this.d), b.c(this.d));
    paramExchangeDataService = new m.a(b.b(this.d)).a(3).g(paramExchangeDataService.getTimeConsuming()).b(paramInt).d(i).c(b.c(this.d)).a(new Promoter[] { paramPromoter }).f(c.a(b.b(this.d), paramExchangeDataService)).a(paramExchangeDataService.slot_id).a(paramExchangeDataService.sessionId, paramExchangeDataService.psid);
    new l(b.b(this.d), paramPromoter, paramExchangeDataService).a();
  }
  
  public void onClick(View paramView)
  {
    this.d.dismiss();
    if (b.a(this.d) == b.a.b)
    {
      a(this.a, this.b, this.c);
      return;
    }
    b(this.a, this.b, this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\b$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */