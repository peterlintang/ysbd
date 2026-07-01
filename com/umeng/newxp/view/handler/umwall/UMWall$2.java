package com.umeng.newxp.view.handler.umwall;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import com.umeng.newxp.Promoter;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.XpListenersCenter.ExchangeDataRequestListener;
import com.umeng.newxp.controller.f;
import java.util.ArrayList;
import java.util.List;

class UMWall$2
  implements XpListenersCenter.ExchangeDataRequestListener
{
  UMWall$2(UMWall paramUMWall, ExchangeDataService paramExchangeDataService) {}
  
  public void dataReceived(int paramInt, List<Promoter> paramList)
  {
    if (paramInt == 1)
    {
      paramList = new UMWall.ServiceZygote();
      UMWall.b = paramList;
      paramList.a = this.a.appkey;
      UMWall.b.b = this.a.slot_id;
      paramList = this.a.getPreloadData();
      if (paramList != null) {
        paramList.b(1);
      }
      UMWall.b.d = paramList;
      UMWall.b.c = this.a.psid;
      UMWall.b.h = this.a.slot_act_params;
      UMWall.b.e = this.a.layoutType;
      UMWall.b.f = this.a.getCreditUID();
      this.b.d.a(UMWall.b);
      Object localObject = this.b;
      if (TextUtils.isEmpty(this.a.slot_id))
      {
        paramList = this.a.appkey;
        paramList = f.a((Context)localObject, paramList).a(new a[] { f.b });
        UMWall.b(this.b).add(((a)paramList.get(0)).d);
        localObject = new ArrayList();
        UMWall.c = (List)localObject;
        ((List)localObject).addAll(paramList);
        UMWall.a(this.b, paramList);
      }
    }
    for (;;)
    {
      this.b.f.setVisibility(8);
      return;
      paramList = this.a.slot_id;
      break;
      this.b.g.setVisibility(0);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWall$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */