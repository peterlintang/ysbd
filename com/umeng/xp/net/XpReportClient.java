package com.umeng.xp.net;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import com.umeng.common.net.h.a;
import com.umeng.xp.controller.XpListenersCenter.ReportListener;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class XpReportClient
  extends a
{
  private static final String a = XpReportClient.class.getName();
  private static final String b = "EXCHANGE_REPORT_CACHE";
  private static XpListenersCenter.ReportListener c;
  private static List<XpListenersCenter.ReportListener> d;
  private Context e;
  
  public XpReportClient(Context paramContext)
  {
    this.e = paramContext;
  }
  
  private void a(SharedPreferences.Editor paramEditor, com.umeng.common.net.g paramg)
  {
    paramg = paramg.b().substring(paramg.d().length());
    paramEditor.putString(com.umeng.common.b.g.a(), paramg);
    paramEditor.commit();
    paramEditor = a;
    new StringBuilder("add failed report : ").append(paramg).toString();
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
      String str2;
      String str1;
      HashMap localHashMap;
      String[] arrayOfString1;
      if (localIterator.hasNext())
      {
        str2 = (String)localIterator.next();
        j = i + 1;
        if (j < paramInt)
        {
          str1 = (String)paramSharedPreferences.get(str2);
          localHashMap = new HashMap();
          arrayOfString1 = str1.split("&");
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
      if (super.send(new e(localHashMap)) == h.a.a)
      {
        paramEditor.remove(str2);
        paramEditor.commit();
        str2 = a;
        new StringBuilder("clear failed report : ").append(str1).toString();
      }
    }
  }
  
  public static void registerReportListener(XpListenersCenter.ReportListener paramReportListener)
  {
    if (d == null) {
      d = new ArrayList();
    }
    if (c == null) {
      c = new d();
    }
    d.add(paramReportListener);
  }
  
  public static void unregisterReportListener(XpListenersCenter.ReportListener paramReportListener)
  {
    if ((d != null) && (d.contains(paramReportListener))) {
      d.remove(paramReportListener);
    }
    if (d.size() == 0)
    {
      d = null;
      c = null;
    }
  }
  
  public h.a send(com.umeng.common.net.g paramg)
  {
    if (c != null) {
      c.onReportStart(((e)paramg).d);
    }
    h.a locala = super.send(paramg);
    synchronized (this.e.getSharedPreferences("EXCHANGE_REPORT_CACHE", 0))
    {
      SharedPreferences.Editor localEditor = ???.edit();
      if (locala == h.a.a)
      {
        a(???, localEditor, 5);
        if (c != null) {
          c.onReportEnd(locala);
        }
        return locala;
      }
      a(localEditor, paramg);
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\XpReportClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */