package com.umeng.newxp.view.templates;

import com.umeng.newxp.controller.ExchangeDataService;

class GridTemplate$4
  implements Runnable
{
  GridTemplate$4(GridTemplate paramGridTemplate) {}
  
  public void run()
  {
    GridTemplate.4.1 local1 = new GridTemplate.4.1(this);
    GridTemplate.d(this.a).pagination = true;
    if (GridTemplate.d(this.a).page_index <= 0) {
      GridTemplate.d(this.a).page_index = 1;
    }
    ExchangeDataService localExchangeDataService = GridTemplate.d(this.a);
    localExchangeDataService.page_index += 1;
    GridTemplate.d(this.a).requestDataAsyn(GridTemplate.c(this.a), local1);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\templates\GridTemplate$4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */