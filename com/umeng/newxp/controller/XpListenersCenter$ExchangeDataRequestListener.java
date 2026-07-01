package com.umeng.newxp.controller;

import com.umeng.newxp.Promoter;
import java.util.List;

public abstract interface XpListenersCenter$ExchangeDataRequestListener
{
  public static final int STATUS_FAIL = 0;
  public static final int STATUS_SUCCESS = 1;
  
  public abstract void dataReceived(int paramInt, List<Promoter> paramList);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\XpListenersCenter$ExchangeDataRequestListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */