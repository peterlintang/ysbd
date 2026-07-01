package com.umeng.xp.net;

import com.umeng.common.net.h.a;
import com.umeng.xp.controller.XpListenersCenter.ReportListener;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class d
  implements XpListenersCenter.ReportListener
{
  public final void onReportEnd(h.a parama)
  {
    if ((XpReportClient.a() != null) && (XpReportClient.a().size() > 0))
    {
      Iterator localIterator = XpReportClient.a().iterator();
      while (localIterator.hasNext()) {
        ((XpListenersCenter.ReportListener)localIterator.next()).onReportEnd(parama);
      }
    }
  }
  
  public final void onReportStart(Map<String, Object> paramMap)
  {
    if ((XpReportClient.a() != null) && (XpReportClient.a().size() > 0))
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
      paramMap = XpReportClient.a().iterator();
      while (paramMap.hasNext()) {
        ((XpListenersCenter.ReportListener)paramMap.next()).onReportStart(localHashMap);
      }
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */