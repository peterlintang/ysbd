package com.umeng.newxp.view;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.net.Uri;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.Promoter.a;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.FloatDialogListener;
import com.umeng.newxp.controller.b;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.m.a;

class ExchangeViewManager$13
  implements DialogInterface.OnClickListener
{
  ExchangeViewManager$13(ExchangeViewManager paramExchangeViewManager, Promoter paramPromoter, XpListenersCenter.FloatDialogListener paramFloatDialogListener) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    String str = Uri.parse(this.a.url).getScheme();
    paramDialogInterface.dismiss();
    if ((this.b != null) && (str.equalsIgnoreCase(Promoter.a.c.toString())))
    {
      this.b.onConfirmClickWithCallBackUrl(this.a.url);
      paramDialogInterface = new m.a(this.c.a).a(2).b(0).d(3).c(this.c.b).a(new Promoter[] { this.a }).g(ExchangeViewManager.a(this.c).getTimeConsuming()).f(c.a(this.c.a, ExchangeViewManager.a(this.c))).a(ExchangeViewManager.a(this.c).slot_id).a(ExchangeViewManager.a(this.c).sessionId, ExchangeViewManager.a(this.c).psid).a();
      new XpReportClient(this.c.a).sendAsync(paramDialogInterface, null);
      return;
    }
    b.a(this.a, this.c.a, ExchangeViewManager.a(this.c), false);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\ExchangeViewManager$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */