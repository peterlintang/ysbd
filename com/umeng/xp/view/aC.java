package com.umeng.xp.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.umeng.xp.Promoter;
import com.umeng.xp.controller.ExchangeDataService;
import com.umeng.xp.net.c;
import com.umeng.xp.net.e.a;

class aC
  implements DialogInterface.OnClickListener
{
  aC(aB paramaB, ExchangeDataService paramExchangeDataService) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = new e.a(aB.d(this.b)).a(3).c(this.a.getTimeConsuming()).b(aB.c(this.b)).d(1).c(aB.b(this.b)).a(new Promoter[] { aB.a(this.b) }).a(this.a.slot_id).b(this.a.sessionId);
    new c(aB.d(this.b), aB.a(this.b), paramDialogInterface).a();
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\aC.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */