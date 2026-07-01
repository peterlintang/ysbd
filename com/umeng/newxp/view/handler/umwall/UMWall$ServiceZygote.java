package com.umeng.newxp.view.handler.umwall;

import android.text.TextUtils;
import com.umeng.newxp.b;
import com.umeng.newxp.c;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.d;

public class UMWall$ServiceZygote
{
  public String a;
  public String b;
  public String c;
  public d d;
  public int e;
  public String f;
  public int g;
  public String h;
  
  public ExchangeDataService fork()
  {
    ExchangeDataService localExchangeDataService = new ExchangeDataService();
    if (TextUtils.isEmpty(this.b))
    {
      localExchangeDataService.appkey = this.a;
      if (this.e != 0) {
        break label80;
      }
    }
    label80:
    for (int i = 7;; i = this.e)
    {
      localExchangeDataService.layoutType = i;
      localExchangeDataService.setLandingType(this.g);
      if (!TextUtils.isEmpty(this.f)) {
        localExchangeDataService.setCreditUID(this.f);
      }
      return localExchangeDataService;
      localExchangeDataService.slot_id = this.b;
      break;
    }
  }
  
  public ExchangeDataService fork(int paramInt, a parama)
  {
    Object localObject = parama.e;
    c localc = parama.f;
    if (!TextUtils.isEmpty(this.b))
    {
      localObject = new UMWall.ServiceZygote.1(this, this.b, (b)localObject, localc);
      if (paramInt != 0) {
        break label131;
      }
      ((ExchangeDataService)localObject).setPreloadData(this.d);
      ((ExchangeDataService)localObject).urlParams = parama.a;
      label57:
      if (this.e != 0) {
        break label147;
      }
    }
    label131:
    label147:
    for (paramInt = 7;; paramInt = this.e)
    {
      ((ExchangeDataService)localObject).layoutType = paramInt;
      ((ExchangeDataService)localObject).setTemplateAttrs(parama.b());
      ((ExchangeDataService)localObject).slot_act_params = this.h;
      if (!TextUtils.isEmpty(this.f)) {
        ((ExchangeDataService)localObject).setCreditUID(this.f);
      }
      return (ExchangeDataService)localObject;
      localObject = new UMWall.ServiceZygote.2(this, (b)localObject, localc);
      ((ExchangeDataService)localObject).appkey = this.a;
      break;
      if (paramInt != 1) {
        break label57;
      }
      ((ExchangeDataService)localObject).urlParams = parama.a;
      break label57;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\umwall\UMWall$ServiceZygote.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */