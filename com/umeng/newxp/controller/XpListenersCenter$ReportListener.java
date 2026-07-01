package com.umeng.newxp.controller;

import com.umeng.common.ufp.net.ReportResponse.STATUS;
import java.util.Map;

public abstract interface XpListenersCenter$ReportListener
{
  public abstract void onReportEnd(ReportResponse.STATUS paramSTATUS);
  
  public abstract void onReportStart(Map<String, Object> paramMap);
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\controller\XpListenersCenter$ReportListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */