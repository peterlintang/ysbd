package com.umeng.xp.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.Toast;
import com.umeng.common.b.g;
import com.umeng.xp.Promoter;
import com.umeng.xp.Promoter.a;
import com.umeng.xp.common.ExchangeConstants;
import com.umeng.xp.net.XpReportClient;
import com.umeng.xp.net.e;
import com.umeng.xp.net.e.a;
import com.umeng.xp.view.LandingWebViewDialog;
import com.umeng.xp.view.aB;
import com.umeng.xp.view.ao;
import com.umeng.xp.view.o;
import com.umeng.xp.view.o.a;

public class b
{
  private static void a(Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt1, Promoter paramPromoter, int paramInt2)
  {
    new com.umeng.xp.net.c(paramContext, paramPromoter, new e.a(paramContext).a(7).b(paramInt2).d(3).c(paramInt1).a(new Promoter[] { paramPromoter }).c(paramExchangeDataService.getTimeConsuming()).a(paramExchangeDataService.slot_id).b(paramExchangeDataService.sessionId)).a();
  }
  
  public static void a(Promoter paramPromoter, Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt, boolean paramBoolean)
  {
    a(new a.a(paramPromoter, 0), paramContext, paramExchangeDataService, paramInt, paramBoolean, 0);
  }
  
  private static void a(a.a parama, Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt1, Promoter paramPromoter, int paramInt2)
  {
    e locale = new e.a(paramContext).a(2).b(paramInt2).d(3).c(paramInt1).a(new Promoter[] { paramPromoter }).c(paramExchangeDataService.getTimeConsuming()).a(paramExchangeDataService.slot_id).b(paramExchangeDataService.sessionId).a();
    new XpReportClient(paramContext).sendAsync(locale, null);
    paramInt2 = paramContext.getResources().getIdentifier("umeng_xp_dialog_download_window", "style", paramContext.getPackageName());
    new o(paramContext, paramPromoter, paramInt1, parama.b, paramExchangeDataService, paramInt2, o.a.b).show();
  }
  
  public static void a(a.a parama, Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt1, boolean paramBoolean, int paramInt2)
  {
    Promoter localPromoter = parama.a;
    if (com.umeng.common.b.a(localPromoter.app_package_name, paramContext))
    {
      d(paramContext, paramExchangeDataService, paramInt1, localPromoter, paramInt2);
      return;
    }
    Uri localUri = Uri.parse(localPromoter.url);
    String str = localUri.getScheme();
    if ((str != null) && (str.equalsIgnoreCase(Promoter.a.a.toString())))
    {
      parama = new ExchangeDataService(localUri.getAuthority());
      parama.layoutType = 7;
      ao.a(paramContext, parama, null);
      return;
    }
    if ((str != null) && (str.equalsIgnoreCase(Promoter.a.b.toString())))
    {
      a(parama, paramContext, paramExchangeDataService, paramInt1, localPromoter, paramInt2);
      return;
    }
    int j = localPromoter.landing_type;
    int i = j;
    if (paramBoolean)
    {
      i = j;
      if (j == 0) {
        i = 1;
      }
    }
    switch (i)
    {
    default: 
      return;
    case 0: 
      b(parama, paramContext, paramExchangeDataService, paramInt1, localPromoter, paramInt2);
      return;
    case 2: 
    case 4: 
      c(paramContext, paramExchangeDataService, paramInt1, localPromoter, paramInt2);
      return;
    case 3: 
      b(paramContext, paramExchangeDataService, paramInt1, localPromoter, paramInt2);
      return;
    }
    a(paramContext, paramExchangeDataService, paramInt1, localPromoter, paramInt2);
  }
  
  private static void b(Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt1, Promoter paramPromoter, int paramInt2)
  {
    paramExchangeDataService = new e.a(paramContext).a(2).b(paramInt2).d(3).c(paramInt1).a(new Promoter[] { paramPromoter }).c(paramExchangeDataService.getTimeConsuming()).a(paramExchangeDataService.slot_id).b(paramExchangeDataService.sessionId).a();
    new XpReportClient(paramContext).sendAsync(paramExchangeDataService, null);
    try
    {
      paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramPromoter.url)));
      return;
    }
    catch (ActivityNotFoundException paramExchangeDataService)
    {
      paramPromoter = ExchangeConstants.LOG_TAG;
      paramExchangeDataService.toString();
      Toast.makeText(paramContext, paramContext.getString(com.umeng.common.c.a(paramContext).f("umeng_xp_no_browser_tips")), 0).show();
    }
  }
  
  private static void b(a.a parama, Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt1, Promoter paramPromoter, int paramInt2)
  {
    e locale = new e.a(paramContext).a(2).b(paramInt2).d(3).c(paramInt1).a(new Promoter[] { paramPromoter }).c(paramExchangeDataService.getTimeConsuming()).a(paramExchangeDataService.slot_id).b(paramExchangeDataService.sessionId).a();
    new XpReportClient(paramContext).sendAsync(locale, null);
    if (ExchangeConstants.USE_SIMPLE_DIALOG == true)
    {
      new aB(paramContext, paramPromoter, paramInt1, parama.b, paramExchangeDataService).show();
      return;
    }
    paramInt2 = paramContext.getResources().getIdentifier("umeng_xp_dialog_download_window", "style", paramContext.getPackageName());
    new o(paramContext, paramPromoter, paramInt1, parama.b, paramExchangeDataService, paramInt2, o.a.a).show();
  }
  
  private static void c(Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt1, Promoter paramPromoter, int paramInt2)
  {
    paramExchangeDataService = new e.a(paramContext).a(2).b(paramInt2).d(3).c(paramInt1).a(new Promoter[] { paramPromoter }).c(paramExchangeDataService.getTimeConsuming()).a(paramExchangeDataService.slot_id).b(paramExchangeDataService.sessionId).a();
    new XpReportClient(paramContext).sendAsync(paramExchangeDataService, null);
    new LandingWebViewDialog(paramContext, paramPromoter.url).show();
  }
  
  private static void d(Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt1, Promoter paramPromoter, int paramInt2)
  {
    paramExchangeDataService = new e.a(paramContext).a(5).b(paramInt2).d(0).c(paramInt1).a(new Promoter[] { paramPromoter }).c(paramExchangeDataService.getTimeConsuming()).a(paramExchangeDataService.slot_id).b(paramExchangeDataService.sessionId).a();
    new XpReportClient(paramContext).sendAsync(paramExchangeDataService, null);
    if (!g.c(paramPromoter.url_in_app))
    {
      g.b(paramContext, paramPromoter.url_in_app);
      return;
    }
    g.a(paramContext, paramPromoter.app_package_name);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\controller\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */