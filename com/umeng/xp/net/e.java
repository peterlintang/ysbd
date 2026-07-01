package com.umeng.xp.net;

import com.umeng.common.b.h;
import com.umeng.common.net.g;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

public class e
  extends g
{
  public static String[] e;
  public Map<String, Object> d;
  
  public e(Map<String, Object> paramMap)
  {
    this.d = paramMap;
  }
  
  public static e a(JSONObject paramJSONObject)
  {
    Iterator localIterator = paramJSONObject.keys();
    HashMap localHashMap = new HashMap();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, paramJSONObject.get(str));
    }
    return new e(localHashMap);
  }
  
  public JSONObject a()
  {
    return new JSONObject(this.d);
  }
  
  public String b()
  {
    return h.a(this.d, this.c).toString();
  }
  
  public String c()
  {
    return b;
  }
  
  public String e()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = this.d.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if ((!str.equals("date")) && (!str.equals("time"))) {
        localHashMap.put(str, this.d.get(str));
      }
    }
    return h.a(localHashMap, this.c);
  }
}


/* Location:              E:\project\angent\dex2jar-2.0\classes-dex2jar.jar!\com\umeng\xp\net\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */