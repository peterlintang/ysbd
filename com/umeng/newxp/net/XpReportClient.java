package com.umeng.newxp.net;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.umeng.common.ufp.Log;
import com.umeng.common.ufp.net.ReportResponse.STATUS;
import com.umeng.common.ufp.net.f;
import com.umeng.common.ufp.util.g;
import com.umeng.newxp.controller.XpListenersCenter.ReportListener;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class XpReportClient
  extends b
{
  public static final String REPORT_CACHE_NAME = "EXCHANGE_REPORT_CACHE";
  private static final String a = XpReportClient.class.getName();
  private static XpListenersCenter.ReportListener b;
  private static List<XpListenersCenter.ReportListener> c;
  private Context d;
  
  public XpReportClient(Context paramContext)
  {
    this.d = paramContext;
  }
  
  private void a(SharedPreferences.Editor paramEditor, f paramf)
  {
    paramf = paramf.b().substring(paramf.d().length());
    paramEditor.putString(g.a(), paramf);
    paramEditor.commit();
    Log.a(a, "add failed report : " + paramf);
  }
  
  private void a(SharedPreferences paramSharedPreferences, SharedPreferences.Editor paramEditor, int paramInt)
  {
    paramSharedPreferences = paramSharedPreferences.getAll();
    Iterator localIterator;
    if (paramSharedPreferences.size() > 0) {
      localIterator = paramSharedPreferences.keySet().iterator();
    }
    int j;
    for (int i = 0;; i = j)
    {
      String str1;
      String str2;
      HashMap localHashMap;
      String[] arrayOfString1;
      if (localIterator.hasNext())
      {
        str1 = (String)localIterator.next();
        j = i + 1;
        if (j < paramInt)
        {
          str2 = (String)paramSharedPreferences.get(str1);
          localHashMap = new HashMap();
          arrayOfString1 = str2.split("&");
          if (arrayOfString1.length > 0) {
            break label104;
          }
        }
      }
      return;
      label104:
      int k = arrayOfString1.length;
      i = 0;
      while (i < k)
      {
        String[] arrayOfString2 = arrayOfString1[i].split("=");
        if (arrayOfString2.length == 2) {
          localHashMap.put(URLDecoder.decode(arrayOfString2[0]), URLDecoder.decode(arrayOfString2[1]));
        }
        i += 1;
      }
      super.send(new m(localHashMap));
      paramEditor.remove(str1);
      paramEditor.commit();
      Log.a(a, "clear failed report : " + str2);
    }
  }
  
  public static void registerReportListener(XpListenersCenter.ReportListener paramReportListener)
  {
    if (c == null) {
      c = new ArrayList();
    }
    if (b == null) {
      b = new XpReportClient.1();
    }
    c.add(paramReportListener);
  }
  
  public static void unregisterReportListener(XpListenersCenter.ReportListener paramReportListener)
  {
    if ((c != null) && (c.contains(paramReportListener))) {
      c.remove(paramReportListener);
    }
    if ((c != null) && (c.size() == 0))
    {
      c = null;
      b = null;
    }
  }
  
  public ReportResponse.STATUS send(f paramf)
  {
    if (b != null) {
      b.onReportStart(((m)paramf).d);
    }
    ReportResponse.STATUS localSTATUS = super.send(paramf);
    synchronized (this.d.getSharedPreferences("EXCHANGE_REPORT_CACHE", 0))
    {
      SharedPreferences.Editor localEditor = ???.edit();
      if (localSTATUS == ReportResponse.STATUS.SUCCESS)
      {
        a(???, localEditor, 5);
        if (b != null) {
          b.onReportEnd(localSTATUS);
        }
        return localSTATUS;
      }
      a(localEditor, paramf);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\newxp\net\XpReportClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */