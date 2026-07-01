package com.umeng.newxp.view.handler.ewall;

import android.text.TextUtils;
import com.umeng.newxp.b;
import com.umeng.newxp.c;
import com.umeng.newxp.common.a;
import com.umeng.newxp.controller.ExchangeDataService;
import com.umeng.newxp.controller.d;

public class b$a
{
  public String a;
  public String b;
  public String c;
  public d d;
  public String e;
  
  public ExchangeDataService a(int paramInt, a parama)
  {
    Object localObject = parama.e;
    c localc = parama.f;
    if (!TextUtils.isEmpty(this.b))
    {
      localObject = new b.a.1(this, this.b, (b)localObject, localc);
      if (paramInt != 0) {
        break label96;
      }
      ((ExchangeDataService)localObject).setPreloadData(this.d);
      ((ExchangeDataService)localObject).urlParams = parama.a;
    }
    for (;;)
    {
      ((ExchangeDataService)localObject).layoutType = 7;
      ((ExchangeDataService)localObject).slot_act_params = this.e;
      return (ExchangeDataService)localObject;
      localObject = new b.a.2(this, (b)localObject, localc);
      ((ExchangeDataService)localObject).appkey = this.a;
      break;
      label96:
      if (paramInt == 1) {
        ((ExchangeDataService)localObject).urlParams = parama.a;
      } else if (paramInt == 2) {
        ((ExchangeDataService)localObject).setKeywords(parama.a);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\handler\ewall\b$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */