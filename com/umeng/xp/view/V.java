package com.umeng.xp.view;

import com.umeng.xp.controller.ExchangeDataService;

class V
  implements Runnable
{
  V(GridTemplate paramGridTemplate) {}
  
  public void run()
  {
    W localW = new W(this);
    GridTemplate.d(this.a).pagination = true;
    if (GridTemplate.d(this.a).page_index <= 0) {
      GridTemplate.d(this.a).page_index = 1;
    }
    ExchangeDataService localExchangeDataService = GridTemplate.d(this.a);
    localExchangeDataService.page_index += 1;
    GridTemplate.d(this.a).requestDataAsyn(GridTemplate.c(this.a), localW);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\view\V.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */