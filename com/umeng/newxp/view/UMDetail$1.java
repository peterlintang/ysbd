package com.umeng.newxp.view;

import com.umeng.newxp.controller.ExchangeDataService;

class UMDetail$1
  extends ExchangeDataService
{
  UMDetail$1(UMDetail paramUMDetail, String paramString)
  {
    super(paramString);
  }
  
  protected void preparedAsync()
  {
    super.preparedAsync();
    this.g.p.psid = this.g.l;
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\view\UMDetail$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */