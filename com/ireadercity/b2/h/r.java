package com.ireadercity.b2.h;

import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class r
{
  public static Map<String, Map<String, ArrayList<String>>> a;
  public static long b;
  public static String c;
  
  public static void a(String paramString)
  {
    if (paramString == null) {
      return;
    }
    b = System.currentTimeMillis();
  }
  
  public static void b(String paramString)
  {
    if (paramString == null) {}
    long l;
    do
    {
      return;
      l = (System.currentTimeMillis() - b) / 1000L;
    } while (l < 30L);
    String str1 = DateFormat.format("yyyy-MM-dd", System.currentTimeMillis()).toString();
    String str2 = DateFormat.format("hh:mm:ss", b).toString();
    if (a == null) {
      a = new HashMap();
    }
    Object localObject = (Map)a.get(str1);
    if (localObject == null) {
      localObject = new HashMap();
    }
    for (;;)
    {
      ArrayList localArrayList2 = (ArrayList)((Map)localObject).get(paramString);
      ArrayList localArrayList1 = localArrayList2;
      if (localArrayList2 == null) {
        localArrayList1 = new ArrayList();
      }
      localArrayList1.add(str2 + "," + l);
      ((Map)localObject).put(paramString, localArrayList1);
      a.put(str1, localObject);
      return;
    }
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\ireadercity\b2\h\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */