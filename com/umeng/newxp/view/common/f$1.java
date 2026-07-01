package com.umeng.newxp.view.common;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.net.l;
import com.umeng.newxp.net.m.a;

class f$1
  implements DialogInterface.OnClickListener
{
  f$1(f paramf, ExchangeDataService paramExchangeDataService) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new m.a(f.a(this.b)).a(3).g(this.a.getTimeConsuming()).b(f.d(this.b)).d(1).c(f.c(this.b)).a(new Promoter[] { f.b(this.b) }).f(c.a(f.a(this.b), this.a)).a(this.a.slot_id).a(this.a.sessionId, this.a.psid);
    new l(f.a(this.b), f.b(this.b), paramDialogInterface).a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\common\f$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */