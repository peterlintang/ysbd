package com.umeng.newxp.net;

import com.umeng.common.ufp.net.ReportResponse.STATUS;
import com.umeng.newxp.common.c;
import com.umeng.newxp.controller.XpListenersCenter.ReportListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class XpReportClient$1
  implements XpListenersCenter.ReportListener
{
  public final void onReportEnd(ReportResponse.STATUS paramSTATUS)
  {
    if ((XpReportClient.b() != null) && (XpReportClient.b().size() > 0))
    {
      Iterator localIterator = c.a(XpReportClient.b()).iterator();
      while (localIterator.hasNext()) {
        ((XpListenersCenter.ReportListener)localIterator.next()).onReportEnd(paramSTATUS);
      }
    }
  }
  
  public final void onReportStart(Map<String, Object> paramMap)
  {
    if ((XpReportClient.b() != null) && (XpReportClient.b().size() > 0))
    {
      HashMap localHashMap = new HashMap();
      if (paramMap != null)
      {
        if (paramMap.containsKey("action_type")) {
          localHashMap.put("action_type", Integer.valueOf(((Integer)paramMap.get("action_type")).intValue()));
        }
        if (paramMap.containsKey("promoter")) {
          localHashMap.put("promoter", paramMap.get("promoter").toString());
        }
      }
      paramMap = c.a(XpReportClient.b()).iterator();
      while (paramMap.hasNext()) {
        ((XpListenersCenter.ReportListener)paramMap.next()).onReportStart(localHashMap);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\XpReportClient$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */