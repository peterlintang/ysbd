package com.umeng.newxp.view.handler;

import android.content.Context;
import com.taobao.munion.ewall.EWallContainerActivity;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.view.handler.umwall.UMWall;
import com.umeng.newxp.view.handler.umwall.UMWall.ServiceZygote;
import com.umeng.newxp.view.handler.umwall.d.a;
import java.util.List;

public class b
{
  public static void a(Context paramContext, ExchangeDataService paramExchangeDataService)
  {
    EWallContainerActivity.start(paramContext, paramExchangeDataService);
  }
  
  public static void a(Context paramContext, ExchangeDataService paramExchangeDataService, List<a> paramList)
  {
    a(paramContext, paramExchangeDataService, paramList, d.a.a);
  }
  
  public static void a(Context paramContext, ExchangeDataService paramExchangeDataService, List<a> paramList, d.a parama)
  {
    UMWall.ServiceZygote localServiceZygote = new UMWall.ServiceZygote();
    localServiceZygote.a = paramExchangeDataService.appkey;
    localServiceZygote.b = paramExchangeDataService.slot_id;
    localServiceZygote.d = paramExchangeDataService.getPreloadData();
    localServiceZygote.c = paramExchangeDataService.psid;
    localServiceZygote.h = paramExchangeDataService.slot_act_params;
    localServiceZygote.e = paramExchangeDataService.layoutType;
    localServiceZygote.f = paramExchangeDataService.getCreditUID();
    localServiceZygote.g = paramExchangeDataService.getLandingType();
    UMWall.start(paramContext, localServiceZygote, paramList, parama);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */