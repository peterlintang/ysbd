package com.umeng.newxp.controller;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import android.widget.Toast;
import com.taobao.munion.utils.k;
import com.umeng.common.ufp.Log;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.Promoter.a;
import com.umeng.newxp.a.d;
import com.umeng.newxp.a.e;
import com.umeng.newxp.common.ExchangeConstants;
import com.umeng.newxp.common.a;
import com.umeng.newxp.net.XpReportClient;
import com.umeng.newxp.net.l;
import com.umeng.newxp.net.m;
import com.umeng.newxp.net.m.a;
import com.umeng.newxp.view.UMDetail;
import com.umeng.newxp.view.common.b.a;
import com.umeng.newxp.view.handler.umwall.d.a;
import java.util.ArrayList;
import java.util.List;

public class b
{
  private static final String a = b.class.getName();
  private static List<a> b = new ArrayList();
  
  private static void a(Context paramContext, ExchangeDataService paramExchangeDataService, Promoter paramPromoter)
  {
    if (!TextUtils.isEmpty(paramPromoter.url))
    {
      d(paramContext, paramExchangeDataService, paramPromoter, 0);
      return;
    }
    Toast.makeText(paramContext, "抱歉，开打页面失败了！", 0).show();
  }
  
  private static void a(Context paramContext, ExchangeDataService paramExchangeDataService, Promoter paramPromoter, int paramInt)
  {
    ExchangeDataService localExchangeDataService = null;
    try
    {
      if (!TextUtils.isEmpty(paramExchangeDataService.slot_id)) {
        localExchangeDataService = new ExchangeDataService(paramExchangeDataService.slot_id);
      }
      for (;;)
      {
        localExchangeDataService.layoutType = 17;
        localExchangeDataService.setLandingType(paramInt);
        com.umeng.newxp.view.handler.b.a(paramContext, localExchangeDataService, null);
        return;
        com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService);
      }
      String str;
      return;
    }
    catch (Exception localException)
    {
      str = a;
      a(paramContext, paramExchangeDataService, paramPromoter);
    }
  }
  
  public static void a(Promoter paramPromoter, Context paramContext, ExchangeDataService paramExchangeDataService, boolean paramBoolean)
  {
    a(new a.a(paramPromoter, 0), paramContext, paramExchangeDataService, paramBoolean, 0);
  }
  
  private static void a(a.a parama, Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    int i = paramContext.getResources().getIdentifier("umeng_xp_dialog_download_window", "style", paramContext.getPackageName());
    new com.umeng.newxp.view.common.b(paramContext, parama.a, paramExchangeDataService.layoutType, parama.b, paramExchangeDataService, i, b.a.a).show();
  }
  
  private static void a(a.a parama, Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt)
  {
    m localm = new m.a(paramContext).a(2).b(paramInt).d(3).c(paramExchangeDataService.layoutType).a(new Promoter[] { parama.a }).g(paramExchangeDataService.getTimeConsuming()).f(com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService)).a(paramExchangeDataService.slot_id).a(paramExchangeDataService.sessionId, paramExchangeDataService.psid).a();
    new XpReportClient(paramContext).sendAsync(localm, null);
    paramInt = paramContext.getResources().getIdentifier("umeng_xp_dialog_download_window", "style", paramContext.getPackageName());
    new com.umeng.newxp.view.common.b(paramContext, parama.a, paramExchangeDataService.layoutType, parama.b, paramExchangeDataService, paramInt, b.a.b).show();
  }
  
  public static void a(a.a parama, Context paramContext, ExchangeDataService paramExchangeDataService, boolean paramBoolean, int paramInt)
  {
    Promoter localPromoter = parama.a;
    if (com.umeng.common.ufp.b.a(localPromoter.app_package_name, paramContext))
    {
      e(paramContext, paramExchangeDataService, localPromoter, paramInt);
      return;
    }
    Object localObject = Uri.parse(localPromoter.url);
    String str = ((Uri)localObject).getScheme();
    if ((str != null) && (str.equalsIgnoreCase(Promoter.a.a.toString())))
    {
      parama = new ExchangeDataService(((Uri)localObject).getAuthority());
      parama.layoutType = 7;
      com.umeng.newxp.view.handler.c.a(paramContext, parama, null, null, null);
      return;
    }
    if ((str != null) && (str.equalsIgnoreCase(Promoter.a.b.toString())))
    {
      a(parama, paramContext, paramExchangeDataService, paramInt);
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
    k.a("landing_type = " + i);
    switch (i)
    {
    default: 
      return;
    case 0: 
      b(parama, paramContext, paramExchangeDataService, paramInt);
      return;
    case 2: 
    case 4: 
      d(paramContext, paramExchangeDataService, localPromoter, paramInt);
      return;
    case 3: 
      c(paramContext, paramExchangeDataService, localPromoter, paramInt);
      return;
    case 1: 
      b(paramContext, paramExchangeDataService, localPromoter, paramInt);
      return;
    case 5: 
      try
      {
        parama = new ExchangeDataService();
        parama.slot_id = paramExchangeDataService.slot_id;
        parama.layoutType = 17;
        parama.setLandingType(i);
        com.umeng.newxp.view.handler.b.a(paramContext, parama);
        return;
      }
      catch (ActivityNotFoundException parama)
      {
        localObject = a;
        new StringBuilder("can`t open with ewall style[").append(parama.toString()).append("].").toString();
        try
        {
          com.umeng.newxp.view.handler.b.a(paramContext, paramExchangeDataService, b, d.a.b);
          return;
        }
        catch (ActivityNotFoundException parama)
        {
          a(paramContext, paramExchangeDataService, localPromoter);
          return;
        }
      }
    }
    a(paramContext, paramExchangeDataService, localPromoter, i);
  }
  
  private static void b(Context paramContext, ExchangeDataService paramExchangeDataService, Promoter paramPromoter, int paramInt)
  {
    new l(paramContext, paramPromoter, new m.a(paramContext).a(7).b(paramInt).d(3).c(paramExchangeDataService.layoutType).a(new Promoter[] { paramPromoter }).g(paramExchangeDataService.getTimeConsuming()).f(com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService)).a(paramExchangeDataService.slot_id).c(paramExchangeDataService.tabId).a(paramExchangeDataService.sessionId, paramExchangeDataService.psid)).a();
  }
  
  private static void b(a.a parama, Context paramContext, ExchangeDataService paramExchangeDataService, int paramInt)
  {
    Promoter localPromoter = parama.a;
    if (1 > d.d(paramContext))
    {
      Log.e(ExchangeConstants.LOG_TAG, "no resource open download dialog.");
      b(paramContext, paramExchangeDataService, localPromoter, paramInt);
      return;
    }
    int i = paramExchangeDataService.layoutType;
    Object localObject = new m.a(paramContext).a(2).b(paramInt).d(3).c(i).a(new Promoter[] { localPromoter }).g(paramExchangeDataService.getTimeConsuming()).f(com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService)).a(paramExchangeDataService.slot_id).a(paramExchangeDataService.sessionId, paramExchangeDataService.psid).a();
    new XpReportClient(paramContext).sendAsync((com.umeng.common.ufp.net.f)localObject, null);
    if (ExchangeConstants.USE_SIMPLE_DIALOG == true)
    {
      new com.umeng.newxp.view.common.f(paramContext, localPromoter, i, parama.b, paramExchangeDataService).show();
      return;
    }
    if (ExchangeConstants.DETAIL_PAGE) {
      try
      {
        localObject = new Intent(paramContext, UMDetail.class);
        ((Intent)localObject).putExtra("promoter", localPromoter);
        ((Intent)localObject).setFlags(268435456);
        ((Intent)localObject).putExtra("layout_type", paramExchangeDataService.layoutType);
        ((Intent)localObject).putExtra("action_index", parama.b);
        ((Intent)localObject).putExtra("tcost", paramExchangeDataService.getTimeConsuming());
        ((Intent)localObject).putExtra("app_key", com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService));
        ((Intent)localObject).putExtra("slot_id", paramExchangeDataService.slot_id);
        ((Intent)localObject).putExtra("sid", paramExchangeDataService.sessionId);
        ((Intent)localObject).putExtra("psid", paramExchangeDataService.psid);
        paramContext.startActivity((Intent)localObject);
        return;
      }
      catch (ActivityNotFoundException localActivityNotFoundException)
      {
        Log.b(ExchangeConstants.LOG_TAG, "", localActivityNotFoundException);
      }
    }
    a(parama, paramContext, paramExchangeDataService);
  }
  
  private static void c(Context paramContext, ExchangeDataService paramExchangeDataService, Promoter paramPromoter, int paramInt)
  {
    paramExchangeDataService = new m.a(paramContext).a(2).b(paramInt).d(3).c(paramExchangeDataService.layoutType).a(new Promoter[] { paramPromoter }).g(paramExchangeDataService.getTimeConsuming()).f(com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService)).a(paramExchangeDataService.slot_id).c(paramExchangeDataService.tabId).a(paramExchangeDataService.sessionId, paramExchangeDataService.psid).a();
    new XpReportClient(paramContext).sendAsync(paramExchangeDataService, null);
    try
    {
      paramContext.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramPromoter.url)));
      return;
    }
    catch (ActivityNotFoundException paramExchangeDataService)
    {
      Log.b(ExchangeConstants.LOG_TAG, paramExchangeDataService.toString());
      Toast.makeText(paramContext, paramContext.getString(e.k(paramContext)), 0).show();
    }
  }
  
  private static void d(Context paramContext, ExchangeDataService paramExchangeDataService, Promoter paramPromoter, int paramInt)
  {
    if (1 > d.c(paramContext))
    {
      Log.e(ExchangeConstants.LOG_TAG, "no resource open native webview,and then open with system browser.");
      c(paramContext, paramExchangeDataService, paramPromoter, paramInt);
      return;
    }
    paramExchangeDataService = new m.a(paramContext).a(2).b(paramInt).d(3).c(paramExchangeDataService.layoutType).a(new Promoter[] { paramPromoter }).g(paramExchangeDataService.getTimeConsuming()).f(com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService)).a(paramExchangeDataService.slot_id).c(paramExchangeDataService.tabId).a(paramExchangeDataService.sessionId, paramExchangeDataService.psid).a();
    new XpReportClient(paramContext).sendAsync(paramExchangeDataService, null);
    new com.umeng.newxp.view.common.g(paramContext, paramPromoter.url, false, paramPromoter).a(true).show();
  }
  
  private static void e(Context paramContext, ExchangeDataService paramExchangeDataService, Promoter paramPromoter, int paramInt)
  {
    paramExchangeDataService = new m.a(paramContext).a(5).b(paramInt).d(0).c(paramExchangeDataService.layoutType).a(new Promoter[] { paramPromoter }).g(paramExchangeDataService.getTimeConsuming()).f(com.umeng.newxp.common.c.a(paramContext, paramExchangeDataService)).a(paramExchangeDataService.slot_id).c(paramExchangeDataService.tabId).a(paramExchangeDataService.sessionId, paramExchangeDataService.psid).a();
    new XpReportClient(paramContext).sendAsync(paramExchangeDataService, null);
    if (!com.umeng.common.ufp.util.g.d(paramPromoter.url_in_app))
    {
      com.umeng.common.ufp.util.g.b(paramContext, paramPromoter.url_in_app);
      return;
    }
    com.umeng.common.ufp.util.g.a(paramContext, paramPromoter.app_package_name);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */